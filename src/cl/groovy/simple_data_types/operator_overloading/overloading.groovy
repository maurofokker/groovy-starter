package cl.groovy.simple_data_types.operator_overloading

/*
    http://groovy-lang.org/operators.html#Operator-Overloading
 */
def a = 1
def b = 2

println a + b       // results in 3
println a.plus(b)   // this is happening behind the scene when using + operator

def s1 = "Hello"
def s2 = ", World!"

println s1 + s2
println s1.plus(s2) // this call to plus() method and is an overloading