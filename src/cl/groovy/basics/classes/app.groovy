package cl.groovy.basics.classes
// create a new instance of a developer
Developer d = new Developer()
d.first = "John"
d.setLast("Doe")

// assign some languages
d.languages << "Groovy" // left shift operator to add into array
d.languages << "Java"

// call some methods
d.work()