/**
 * Denis Inyang
 * 10.4.21
 * Kotlin program 1
 * 
 */

fun main() {
    println("Hello, world!!!")
    println("4.20.2031")
    val cat : Float = 5F
    println(cat)
    
    val myARRAY = arrayOfNulls<String>(4)
    myARRAY[0] = "2"
    myARRAY[1] = "44"
    myARRAY[2] = "32323"
    myARRAY[3] = "777"
    myARRAY[4] = "12155"
    
    
    println(myARRAY[4])
    
    val myNUMARRAY = intArrayOf(11,222,3444,331)
    println(myNUMARRAY.size)
    println(myNUMARRAY.get(0))
    
    var item = 4
    println(item::class.java)
    
    var items:Long = 5534444444
    println(items)
    println(items::class.java)
    
    val hisName: String? = null
    println(hisName)
    
    
    println("myfx() " + myfx())
    helloMJ()
    
}


fun myfx():Int
{
    return 4
}

// Unit = void
fun helloMJ():Unit
{
 	println("MJ, Elvis, and Biden")   
}
