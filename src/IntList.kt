class IntList {

    private var list: Array<Int> = Array(0, {0})

    fun add(element: Int) {
        val newList: Array<Int> =  Array(list.size + 1, {0})
        for(index in list.indices) {
            newList[index] = list[index]
        }
        newList[newList.lastIndex] = element
        list = newList
    }

    fun remove(element: Int) {

        val newList: Array<Int> = Array(list.size - 1, {0})
        var isRemove: Boolean = false
        var index: Int = 0

        for(temp in list){
            if (temp != element || isRemove){

                newList[index] = temp
                index++
            } else {
                isRemove = true
            }
        }
        list = newList
    }

    override fun toString(): String {
        var result: String = "["
        for (index in list.indices) {

            if (index != list.lastIndex) {
                result += "${list[index]}, "
            } else  {
                result += "${list[index]}]"
            }
        }
        return result
    }

    operator fun get(index: Int): Int {
        return list[index]
    }
}