// the summation of every number from 1 to num.

object GrassHopper {
    fun summation(n: Int): Int {
      var output = 0
      for (i in 1..n) {
          output += i
      }
      return output
    }
  }
