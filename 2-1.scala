def fib(n: Int): Int = {
  def rec(i: Int, prev: Int, cur: Int): Int = {
    if (i == n) {
      cur
    } else if (i == 0) {
      rec(i+1, cur, prev + 1)
    } else {
      rec(i+1, cur, prev + cur)
    }
  }

  rec(0, 0, 0)
}