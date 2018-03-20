package cl.groovy.closures

// Closure are first class citizens in the language, so they are objects
// Closure class is located in groovy.lang package
// Closure arguments can be typed and have default values => def closure = { String x, String y -> ... }

def c = { }

println c.class.name
println c instanceof Closure

def sayHello = { name ->    // parameter to the function
    println "Hello, $name"
}

sayHello('John')

List nums = [1,4,7,4,30,2]
nums.each({ num ->      // 'it' is the default name if no parameter is passed in this section
    println num         // and 'it' is used here
})

// closures are objects & last param

def timesTen(num,closure) {
    closure(num * 10)
}

timesTen(10, { println it })

// and this is the expression used every time a closure is declared as last parameter
timesTen(2) {           // this is how groovy keeps clean the syntax
    println it 
}

// above nums.each has 1 parameter and is a closure so it can be rewritten in this way
nums.each {
    println it
}

// in GDK doc for instance Number class has a lot of methods that take closures as parameters
10.times { 
    println it
}

import java.util.Random

Random rand = new Random()

3.times {
    println rand.nextInt()
}