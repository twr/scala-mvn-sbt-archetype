import org.junit.Assert._
import org.junit.Test
import org.hamcrest.CoreMatchers._

class FooJUnitTest {

  @Test
  def testFoo() {
    assertThat(Foo.Bar, is("bar"))
  }

}