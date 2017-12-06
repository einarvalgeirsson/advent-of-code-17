


fun main(args: Array<String>){
    println(part_1())
    println(part_2())
}


private fun part_1(): Int {
    val data = dec05input
            .split("\n")
            .map { it.toInt() }
            .toMutableList()

    var activeIndex = 0
    var steps = 0

    while (true) {
        try {
            // collect current value at index
            val value = data[activeIndex]
            // increment value at index
            data[activeIndex] = value.inc()
            // next we will move index + value steps
            activeIndex = activeIndex.plus(value)
            // increase step counter
            steps = steps.inc()
        } catch (e: IndexOutOfBoundsException) {
            return steps
        }
    }
}

private fun part_2(): Int {
    val data = dec05input
            .split("\n")
            .map { it.toInt() }
            .toMutableList()

    var activeIndex = 0
    var steps = 0

    while (true) {
        try {
            // collect current value at index
            val value = data[activeIndex]
            // increment value at index if smaller than 3 else decrement
            data[activeIndex] = if (value >= 3) value.dec() else value.inc()
            // next we will move index + value steps
            activeIndex = activeIndex.plus(value)
            // increase step counter
            steps = steps.inc()
        } catch (e: IndexOutOfBoundsException) {
            return steps
        }
    }
}