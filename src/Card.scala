/**
  * Created by kota on 2016/09/19.
  */
class Card(number: Int, suit: String) {
  def get: Int = {
    number match {
      case number if number > 9 => 10
      case _ => number
    }
  }

  def isA:Boolean = number == 1

  override def toString:String = suit + number.toString
}
