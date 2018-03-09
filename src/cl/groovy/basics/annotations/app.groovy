package cl.groovy.basics.annotations
// testing out our customer class

def d = new Date()
def c1 = new Customer(first:'Tom', last:'Jones', age:21, since:d, favItems:['Books', 'Games'])
def c2 = new Customer('Tom', 'Jones', 21, d, ['Books', 'Games'])
assert c1 == c2     // this will work

c1.first = "Dan"    // this will not work bc can not set a read only property of a immutable class