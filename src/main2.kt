

fun main() {


    val list: IntList = IntList()
    list.add(5)
    list.add(1)
    list.add(2)
    list.add(5)
    println(list.toString())

    list.remove(5)
    println(list.toString())


    println(list[2])
}
