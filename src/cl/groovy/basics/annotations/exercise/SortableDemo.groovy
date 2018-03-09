package cl.groovy.basics.annotations.exercise

import groovy.transform.*

/*
    A class annotation used to make a class Comparable by multiple Comparators.

    http://docs.groovy-lang.org/latest/html/gapi/groovy/transform/Sortable.html
 */

@ToString
@Sortable
class Person {

    String first
    String last
    Address address

}

@Sortable
class Address {
    String first
}

def p1 = new Person(first:"John",last:"Doe")
def p2 = new Person(first:"Jane",last:"Doe")

def people = [p1,p2]
println people

def sorted = people.sort(false /* do not mutate original collection */ )
println sorted