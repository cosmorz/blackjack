/**
  * Created by kota on 2016/09/19.
  */
class Card(number: Int, suit: String) {
  def get(hand: String): Int = {
    (number, hand) match {
      case (1, "soft") => 11
      case (1, "hard") => 1
      case (10, _) | (11, _) | (12, _) | (13, _) => 10
      case _ => number
    }
  }

  def isA:Boolean = number == 1

  override def toString:String = suit + number.toString
}
