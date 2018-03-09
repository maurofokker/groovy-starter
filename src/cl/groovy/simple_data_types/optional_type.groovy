package cl.groovy.simple_data_types

def x = 10          // def defines that there is no declaration of type for the variable, don't know what type x is but it is assigned a value of 10
x.getClass().getName()  // wrapper class is Integer

x = "John"
x.getClass().getName()  // wrapper class now is String, before was Integer

// def gives the possibility to use optional type, if var change in time

// If you know that the type will be constant during time then is good practice
// to assign the Type
Integer y = 10
