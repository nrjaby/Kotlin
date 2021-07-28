
// In kotlin, by default every type is non-nullable and there are two variants are available for each type
// 1- Nullable  (String? is nullable type)
// 2- non-Nullable (String is non-nullable type)



fun main() {

    var s1: String = "test"

    val s2 : String? = null

    // ? , it insure that value can hold null
    // safe call operator insure that there will be no crash due to NullPointer exception.

    println(s1.length)
    // println(s2.length)  --  it give compile time error

    // we can not use (.) directly on nullable type, either we have to use safe call operator (?.) or (!!.)

    println(s2?.length)
    // o/p- null

    // println(s2!!.length)
    //o/p-- it gives NullPointer exception
    // (!!.) we need to avoid , if we are sure that we will not get any null excep, then we can go for this.


  //  ElvisOperator ---  it is like ternary operator in java , it is to assign default value to an opration whenever there
  // is null returning from that operation.   ( ?: )


    println(s2?.length ?: 0)
   // if left side is null then it will return right side.


    // s2.length will give compile time error
    //  s2!!.length can give NullPointer exception
    // s2?.length can return null
    // s2?.length ?: -1 will return -1


    var b : Boolean? = null
    if (b?:false){
        println("passed")
    }else{
        println("failed")
    }

    // we can use elvis operator over here to avoid boolean mismatch

    val i : Int? = 10
    val i2 : Int? = 120

    //val  i3 = i + i2 -- it give type mismatch at compile time
    // we can choose elvis or !!.
    val i4 =i?.plus(i2?:0)
    val i5 =i?.plus(i2!!)

}
