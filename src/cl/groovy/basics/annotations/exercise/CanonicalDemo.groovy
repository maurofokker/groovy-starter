package cl.groovy.basics.annotations.exercise

import groovy.transform.Canonical

/*
    The @Canonical annotation instructs the compiler to execute an AST transformation which adds positional constructors,
    equals, hashCode and a pretty print toString to your class. There are additional annotations if you only need some
    of the functionality: @EqualsAndHashCode, @ToString and @TupleConstructor. In addition, you can add one of the other
    annotations if you need to further customize the behavior of the AST transformation.

    http://docs.groovy-lang.org/latest/html/gapi/groovy/transform/Canonical.html
 */
@Canonical 
class Customer {
     String first, last
     int age
     Date since
     Collection favItems = ['Food']
     def object 
 }
 def d = new Date()
 def anyObject = new Object()
 def c1 = new Customer(first:'Tom', last:'Jones', age:21, since:d, favItems:['Books', 'Games'], object: anyObject)
 def c2 = new Customer('Tom', 'Jones', 21, d, ['Books', 'Games'], anyObject)
 assert c1 == c2