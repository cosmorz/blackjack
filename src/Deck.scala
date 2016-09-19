import scala.util.Random

/**
  * Created by kota on 2016/09/19.
  */
class Deck {
  val cardList = (1 to 13).map(new Card(_, "S")).toList ::: (1 to 13).map(new Card(_, "C")).toList ::: (1 to 13).map(new Card(_, "H")).toList ::: (1 to 13).map(new Card(_, "D")).toList

  var deck = Random.shuffle(cardList)

  def draw: (Card) = {
    val (card, tDeck) = (deck.head, deck.tail)

    deck = tDeck
    return card
  }
}
