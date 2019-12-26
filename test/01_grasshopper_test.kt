import java.util.Random
import org.junit.Assert.assertEquals
import org.junit.Test

// the summation of every number from 1 to num.

class GrassHopperTest {
  @Test
  fun test1() {
    assertEquals(1, GrassHopper.summation(1))
  }
  @Test
  fun test2() {
    assertEquals(36, GrassHopper.summation(8))
  }
}