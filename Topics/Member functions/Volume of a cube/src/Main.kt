class Box(private var height: Double, private var width: Double, private var length: Double) {

    // write the getVolume method here
    fun getVolume(): Double = height * width * length
}

fun main() {
    val iceCube = Box(1.0, 2.0, 3.0)
    println(iceCube.getVolume())
}