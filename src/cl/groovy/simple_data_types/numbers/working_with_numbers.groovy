package cl.groovy.simple_data_types.numbers
// Groovy Number Defaults
// ----------------------------------------------------------------------

def number = 10
println number.class        // java.lang.Integer

def decimal = 5.50
println decimal.class       // java.math.BigDecimal

// :: Converting Data Types ::
// ----------------------------------------------------------------------
// Explicit - casting

def myFloat = (float) 1.0   // explicit casting to java.lang.Float instead of default instance of java.math.BigDecimal
println myFloat.class

// Implicit - coercion ... done for us by groovy


// Rules for +,-,*
// ----------------------------------------------------------------------

// If either operand is a float or a double the result is a double 
// In Java if only floats are involved the result is a float

Float f = 5.25
Double d = 10.50

def result = d / f
println result
println result.class    // results in java.lang.Double

Float a = 10.75
Float b = 53.75
def result2 = b / a
println result2
println result2.class   // results in java.lang.Double even if there are 2 floats in the operands
    
// If either operand is a big decimal 

def x = 34.5    // BigDecimal
def y = 15      // Integer
def bigResult = x / y
println bigResult
println bigResult.class // results in java.math.BigDecimal


// If either operand is a BigInteger the result is a BigInteger
// If either operand is a Long the result is a Long
// If either operand is a Integer the result is an Integer

// Double division
println 5.0d - 4.1d     // lost of precision
println 5-4.1           // gives precision with BigDecimal

// Integer Division

def intDiv = 1 / 2
println intDiv // this is much different than Java where we would get 0 here the result is 0.5 because the BigDecimal
println intDiv.getClass().getName()
println 1.intdiv(2)     // this will print a 0 to get an integer division using method intdiv()



// GDK Methods
// ----------------------------------------------------------------------

assert 2 == 2.5.toInteger() // conversion
assert 2 == 2.5 as Integer  // enforced coercion
assert 2 == (int) 2.5 // cast

assert '5.50'.isNumber()
assert 5 == '5'.toInteger()

// times | upto | downto | step

20.times {
    print '-'
}

1.upto(10) { num ->
    println num
}

10.downto(1) { num ->
    println num
}

0.step(1,0.1) { num ->
    println num 
}



