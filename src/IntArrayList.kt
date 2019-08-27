

class IntArrayList {

    private var arrayList: Array<Int> = Array(0, {0})

    val indices: Array<Int>
        get() {
            val resultList: Array<Int> = Array(arrayList.size, {0})
            for(index in arrayList.indices) {
                resultList[index] = index
            }
            return resultList
        }

    val size: Int
        get() {
            return arrayList.size
        }

    fun add(element: Int) {
        val newArrayList: Array<Int> = Array(arrayList.size + 1, {0})
        for(index in arrayList.indices) {
            newArrayList[index] = arrayList[index]
        }
        newArrayList[newArrayList.lastIndex] = element
        arrayList = newArrayList
    }


    fun remove(element: Int) {

        val newArrayList: Array<Int> = Array(arrayList.size - 1, {0})
        var index: Int = 0
        var isRemove: Boolean = false

        for (temp in arrayList) {

            if(temp != element) {
                newArrayList[index] = temp
                index++
            } else if(isRemove) {
                newArrayList[index] = temp
                index++
            } else {
                isRemove = true
            }
        }
        arrayList = newArrayList
    }

    fun removeAt(index: Int) {
        val newArrayList: Array<Int> = Array(arrayList.size - 1, {0})
        var newIndex: Int = 0


        for (oldIndex in arrayList.indices) {

            if(oldIndex != index) {
                newArrayList[newIndex] = arrayList[oldIndex]
                newIndex++
            }
        }
        arrayList = newArrayList
    }



    operator fun get(index: Int): Int {
        return arrayList[index]
    }

    operator fun set(index: Int, value: Int) {
        arrayList[index] = value
    }

    override fun toString(): String {
        var result: String = "["
        for(index in arrayList.indices) {
            if (index != arrayList.lastIndex) {
                result += "${arrayList[index]}, "
            } else {
                result += "${arrayList[index]}]"
            }
        }
        return result
    }
}
