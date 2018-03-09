package cl.groovy.simple_data_types.strings
// Working with Strings in Groovy
/*
    There are 17 data types in groovy
    8 primitives
    8 wrapper
    1 string
 */

// Java :: 

char c = 'c'
println c.class

String str = "this is a string"
println str.class

// Groovy ::

def c2 = 'c'
println c2.class

def str2 = 'this is a string'
println str2.class

// string interpolation

String name = "Joh"
String msg = "Hello " + name + "..."        // java style
println msg

String msg2 = "Hello ${name}"               // groovy interpolation with double quotes evaluates placeholder
println msg2

String msg3 = 'Hello ${name}'               // groove with single quotes print what it has
println msg3

String msg4 = "We can evaulate expressions here: ${1 + 1}"
println msg4

// multiline strings
/*
    In multilin single and double quotes works just like in single line
    """ """ evaluates expressions
    ''' ''' print what it has
 */
def aLargeMsg = """
A 
Msg
goes 
here and 
keeps going ${1+1}
"""

println aLargeMsg

// dollar slashy
// everything in between of $/ /$ doesn't need to be escaped
def folder = $/C:\groovy\john\foo\bar/$      // instead of "C:\\groovy\\john\\foo\\bar"
println folder



