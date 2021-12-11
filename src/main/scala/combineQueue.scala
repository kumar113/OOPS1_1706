
import scala.collection.mutable.ListBuffer
object combineQueue extends App{
  val list = ListBuffer(31, 53, 64, 75, 86, 97, 108, 119, 130)
  println("Originally the Queue is: ")
  for (i <- list.indices){
    print(list(i) + " ")
  }
  var doubledList = new doubleQueue(list) //Doubled the elements in the queue.
  println("\nAfter doubling the elements the Queue is: ")
  for (i <- list.indices){
    print(list(i) + " ")
  }
  var squareQueue = new squareQueue(list) //Squaring the elements in queue.
  println("\nAfter squaring the elements the Queue is: ")
  for (i <- list.indices){
    print(list(i) + " ")
  }
  squareQueue.dequeue(list)
  println("\nThe Queue After dequeue an element : ")
  for (i <- list.indices){
    print(list(i) + " ")
  }
  squareQueue.enqueue(list)
  println("\nAfter adding a element the Queue is: ")
  for (i <- list.indices){
    print(list(i) + " ")
  }
}
