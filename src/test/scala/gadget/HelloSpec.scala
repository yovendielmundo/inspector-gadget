package gadget

import org.scalatest.{FlatSpec, Matchers}

class HelloSpec extends FlatSpec with Matchers {

  // Stack has been deprecated in 2.12, but this is just for demonstration purposes

  "A List" should "have correct head and last values" in {
    val list = List(1, 2)
    list.last should be(2)
    list.head should be(1)
  }

  it should "throw NoSuchElementException if an empty stack is popped" in {
    val emptyList = List()
    a[NoSuchElementException] should be thrownBy {
      emptyList.head
    }
  }

}
