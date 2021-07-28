
// In kotlin , if and when conditions are actually expression (some result ), not statement (do something)



fun main() {

     val length : Int = 10
     val f = if (length<10){
             "it's small"
             }else if(length<20) {
             // "it's medium"
              length
             }else{
               "it's large"
            }

    // when using if as expression, we must have if and else, both branches . last statement of each block
   //  actually return
     println(f)

    // when -- it is equivalent to switch statement in java,but the difference ,we don't need to mention break after
    // each block.

    val price : Int =50

    when(price) {
        0-> println("is free today")
        in 1..19 -> println("on sale")
        else-> println("normal price")
    }


  var result =  when{
        price == 0 -> "is free today"
        price in 1..19 -> "on sale"
        else -> "normal price"
    }

    println(result)


}