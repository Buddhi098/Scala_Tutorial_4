def main(args: Array[String]):Unit = {
    val number = args(0).toInt
    var result = patternMaching(number)
    println(result)
}
def patternMaching(number: Int)=number match{
        case num if num < 0 => "Negative/Zero"
        case num if num%2==0 => "Even Number"
        case num if num%2==1 => "Odd Number"
}