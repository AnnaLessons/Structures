

fun main() {

    val array: IntArrayList = IntArrayList()
    array.add(5)
    array.add(1)
    array.add(2)
    array.add(5)
    println(array.toString())

    array.removeAt(1)
    println(array.toString())

    for (index in array.indices) {
        array[index] = index * index
    }
    println(array)
}