fun main(){

    var benzy= Car("Toyota", "Prado", "Black", 5)
    benzy.carry(45)
    benzy.identity()
    println(benzy.calculateParkingFees(6))

    var z = Bus("Mitsubishi","Doubledeca", "yellow", 50 )
    println(z.maxTripFare(100.00))

    println(z.calculateParkingFees(5))


}

open class Car(var make: String, var model: String, var color: String, var capacity:Int){

    fun carry(people:Int){
        var y = people -capacity
        if (people<=capacity){
            println("Carrying $ people passengers")
        }
        else{
            println("Over capacity by $y people")
        }
    }

    fun identity(){
        println("I am $color $make $model")
    }

    open fun calculateParkingFees(hour:Int):Int{
        var fee = 50
        var tot1 = fee * hour
        return tot1
    }

}

class Bus(make: String, model: String, color: String ,capacity: Int): Car(make,model,color,capacity){

    fun maxTripFare(fare:Double): Double{
        var max = 100
        var tot2 = max * fare

        return tot2

    }

    override fun calculateParkingFees(hour: Int):Int {

        var fee = hour*capacity
        return fee
    }



}


