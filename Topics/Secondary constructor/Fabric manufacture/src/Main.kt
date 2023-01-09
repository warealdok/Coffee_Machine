data class Fabric(var color: String) {
    var pattern: String = "none"
    var patternColor: String = "none"
    init {
        println("$color fabric is created")
    }

    constructor(color: String, pattern: String, patternColor: String) : this(color) {
        this.pattern = pattern
        this.patternColor = patternColor
        println("${this.patternColor} ${this.pattern} pattern is printed on the fabric")
    }
}
