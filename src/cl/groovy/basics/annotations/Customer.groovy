package cl.groovy.basics.annotations

import groovy.transform.Immutable

/*
    Groovy annotation of an AST
    The @Immutable annotation instructs the compiler to execute an AST transformation which adds the necessary getters,
    constructors, equals, hashCode and other helper methods that are typically written when creating immutable classes
    with the defined properties.
    Further notes on
    http://docs.groovy-lang.org/latest/html/gapi/groovy/transform/Immutable.html
 */
@Immutable
class Customer {

    String first, last
    int age
    Date since
    Collection favItems

}