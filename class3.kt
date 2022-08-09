   var arr:IntArray = intArrayOf(1,2,3,4)
//     println(arr[10]);
    
    var count:Int = 0;
    
    for(i in arr)
        count++

//      println(count);
     
    
    println("5+4 is ${5.plus(4)}")
    println("5-4 is ${5.minus(4)}")
    println("5*4 is ${5.times(4)}")
    println("5/4 is ${5.div(4)}")
    println("5%4 is ${5.rem(4)}")
    println("5 > 4 ? : ${5.compareTo(4) > 0}" )
    println("4 <= 4 ? : ${4.compareTo(4) < 0}")
    println("5 == 5 ? : ${5?.equals(5)?:(5 == null)}")
    
    
//        println(" 5 + 4 is ${5.plus(4)}")
