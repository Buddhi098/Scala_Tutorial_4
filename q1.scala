import scala.io.StdIn
object Interest{
    def main(args: Array[String]):Unit={
        println("Enter deposit amount: ")
        var amount = StdIn.readDouble()
        var interest = getInterest(amount)
        println(s"Interest for deposit: $interest")
    }

    def getInterest(amount : Double): Double = {
        var interest: Double = 0
        if(amount <= 20000){
            interest = amount * 0.02
        }else if(amount <= 200000){
            interest= amount * 0.04
        }else if(amount <= 2000000){
            interest = amount * 0.035
        }else if (amount > 2000000){
            interest = amount * 0.065
        }
        return interest
    }
}
