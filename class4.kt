  println("3 equals 2 is: ${3 == 2}")
    println("3 equals 3 is: ${3.equals(3)}")
    println("4 == 4 using null safety operator:${4?.equals(4)?: (4 === null)}")
    println("3 != 4 is : ${3!=4}")
     println("4 != 4 using null safety operator: ${!(4?.equals(4)?: (4 === null))}")
     
     var a : Int = 4
    var b : Int = 5
    a+=b
     println("a  = ${-a}")
     ++a
    print(a)
