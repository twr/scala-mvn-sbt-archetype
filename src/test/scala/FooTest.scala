import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
import org.scalatest.matchers.ShouldMatchers

@RunWith(classOf[JUnitRunner])
class FooTest extends FunSuite with ShouldMatchers {

  test("bar") {
    Foo.Bar should be("bar")
  }

}