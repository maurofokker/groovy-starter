package cl.groovy.collections.maps

def map = [:]   // declare maps with : , without : is a list
// Map map = [:] // this is the same but declaring implicitly the Map
println map
println map.getClass().getName()

def person = [first:"John",last:"Doe",email:"johndoe@gmail.com"]    // declare a map with values
println person
println person.first        // accessing by key using the dot operator

person.twitter = "@johndoe"     // add to the map
println person

def emailKey = "EmailAddress"
def twitter = [username:"@johndoe",(emailKey):"johndoe@gmail.com"] // to use a variable as a key name
// ['Email Address': "johndoe@gmail.com"] // to explicitly declare a key string

// methods in map
println person.size()
println person.sort()

// looping through person
for( entry in person ) {
    println entry
}

for( key in person.keySet() ) {     // loop through key set in person
    println "$key:${person[key]}"   // print key and evaluate key in person map
}

// each | eachWithIndex