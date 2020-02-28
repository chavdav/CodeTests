import java.util.Base64

object HexToBase64 {
    def main(args: Array[String]) = {
      println(hexToBase64("45766964696e74"))
    }

  def hexToBase64(hexInput: String):  String = {
    var hex: BigInt = null
    try {
      hex = BigInt(hexInput, 16)
    } catch {
      case nfe: NumberFormatException => throw new RuntimeException("Invalid hex string input!", nfe);
    }
    Base64.getEncoder.encodeToString(hex.toByteArray)
  }
}
