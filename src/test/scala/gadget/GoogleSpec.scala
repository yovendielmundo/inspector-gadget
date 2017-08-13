package gadget

import org.openqa.selenium.htmlunit.HtmlUnitDriver
import org.scalatest.selenium.WebBrowser
import org.openqa.selenium._
import org.scalatest.{FlatSpec, Matchers}
import org.scalatest.concurrent.Eventually.eventually

class GoogleSpec extends FlatSpec with Matchers with WebBrowser {

  implicit val webDriver: WebDriver = new HtmlUnitDriver

  val host = "http://www.google.com/?hl=en"

  "The google search" should "have the correct title" in {
    go to host
    click on "q"
    enter("Cheese!")
    submit()
    // Google's search is rendered dynamically with JavaScript.
    eventually { pageTitle should be("Cheese! - Google Search") }
  }

}
