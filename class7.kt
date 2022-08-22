    //Arrays kotlin
    
    
    // implicit array declatration
//     val arr = arrayOf(1,2,3,4,5,"string",'c','b',89.0)
    
    //Explicit array declaration
//     var arr = arrayOf<Int>(1,2,3) //where arrayOf is a function.
    
    
//     var arr = charArrayOf('a','r','u','n')
    
    
    //predefined methods to declare array without need of declaring the data type
    //intArrayOf(), floatArrayOf, longArrayOf;
    //
    
    
    // Array declaration using the counstructor
    
    var j = 1;
    
    var arr = Array(4,{i->i+2})
    
//     println(arr[3])
    
    
//     for(j in arr){
//         println(j);
//     }
    
    arr.forEach({i->println(i)})
    
   
