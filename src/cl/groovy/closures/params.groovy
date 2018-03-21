package cl.groovy.closures
// implicit parameter will be keyword 'it'
def foo = {
    println it
}

foo('john')

// with no params in closure
// this way is used to indicate no args are allowed
def noparams = { ->
    println "no params..."
}

noparams()

// closure args can by typed or not  => { first, last -> ... }
def sayHello = { String first, String last ->
    println "Hello, $first $last"
}

sayHello("John","Doe")

// default values in typed arg
def greet = { String name, String greeting = "Howdy" ->
    println "$greeting, $name"
}

greet("John","Hello")
greet("Joe")                    // this will print the default value Howdy in greet method greeting arg

// var-arg means that closure accept at least 1 arg in this case String type
// var-arg apply to methods and closures
def concat = { String... args -> 
    args.join('')
}

println concat('abc','def')
println concat('abc','def','123','456')


def someMethod(Closure c) {
    println "..."
    println c.maximumNumberOfParameters
    println c.parameterTypes
}

def someClosure = { int x, int y -> x + y }
someMethod(someClosure)
// will print 2
// will print [int, int]

