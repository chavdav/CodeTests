object SpecialMath {

  def main(args: Array[String]) = {
    if(args.length != 1) {
      System.out.println("Must pass one and only one argument")
      System.exit(-1);
    }

    try {
      val n = Integer.parseInt(args(0))

      System.out.println(specialMathImproved(n))
    } catch {
      case nfe: NumberFormatException =>
        System.out.println(s"""Unable to convert input "${args(0)}" to integer""")
        System.exit(-1)
    }

  }

  def specialMath(n: Int): BigInt = {
    if(n==0) return 0
    if(n==1) return 1
    return n + specialMath(n-1) + specialMath(n-2)
  }

  def specialMathImproved(n: Int): BigInt = {
    if(n==0) return 0
    if(n==1) return 1

    var result: BigInt = 0
    var current: BigInt = 1
    var previous: BigInt = 0

    for(i <- 2 to n) {
      result += i + current + previous
      previous = current
      current = result
    }
    return result
  }
}
