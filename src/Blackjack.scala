import java.util

import scala.util.Random

/**
  * Created by kota on 2016/09/19.
  */
object Blackjack {
  def main(args: Array[String]): Unit = {
    val deck = new Deck

    val hand = deck.draw :: deck.draw :: deck.draw :: deck.draw :: Nil

    println(hand)
    println(eval(hand))
  }

  def eval(hand: Seq[Card], hCount: Int = 0): Int = {
    val count = hand.map(_.get("soft")).sum - hCount * 10

    count match {
      case count if (count > 21 && hCount < countA(hand)) => return eval(hand, hCount + 1)
      case _ => return count
    }
  }

  def countA(hand: Seq[Card]): Int = {
    hand.count(_.isA)
  }
}
