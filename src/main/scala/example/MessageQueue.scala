package example

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

/**
 * Created by Larry on 9/13/15.
 */
class MessageQueue {
  val messages = new mutable.Queue[Int]()

  def send(code: Int): Unit ={
    messages.enqueue(code)
  }

  def process(f: Int => Unit): Unit ={
    while(messages.nonEmpty){
      val message = messages.dequeue()
      f(message)
    }
  }

  def read(): Int = messages.dequeue()

  def isEmpty: Boolean = messages.isEmpty
}

object MessageQueue{



  val PLAY = 0
  val STOP = 1
  val PAUSE = 2
  val TOOL_SELECT = 3
  val TOOL_PENCIL = 4
  val HELP = 5

  val PIANO = 6
  val VIOLIN = 7
  val BRASS = 8
  val FLUTE = 9
  val BASS = 10

//  //@hack this is really, really bad.
//  def instrumentMsgToIndex(msg: Int) ={
//    msg - 6
//  }
//  //@hack index to instrument msg
//  def indexToInstrumentMsg(index: Int) = {
//    index + 6
//  }

}