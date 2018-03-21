package cl.groovy.closures
// Delegates.groovy
/*
    Owner, delegate and this
    ---------------------------
    owner   : corresponds to the enclosing object where the closure is defined,
            which may be either a class or a closure
    delegate: corresponds to a third party object where methods calls or properties
            are resolved whenever the receiver of the message is not defined
    this    : corresponds to the enclosing class where the closure is defined
 */
def writer = {
    append 'John'
    append ' lives in Santiago'
}

def append(String s) {
    println "append() called with argument of $s"
}

// to delegate to append method in StringBuffer that is another class
// so not delegate in our append implementation
StringBuffer sb = new StringBuffer()
writer.resolveStrategy = Closure.DELEGATE_FIRST // without this line the strategy resolution will be our implementation of append method
writer.delegate = sb
writer()
