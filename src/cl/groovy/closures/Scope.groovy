package cl.groovy.closures
/*
  this      : corresponds to the enclosing class where the closure is defined
  owner     : corresponds to the enclosing object where the closure is defined,
            which may be either a class or a closure
  delegate  : corresponds to a third party object where methods calls or properties
            are resolved whenever the receiver of the message is not defined
*/

class ScopeDemo {

    def outerClosure = {                // outer closure
        println this.class.name     // print ScopeDemo
        println owner.class.name    // print ScopeDemo
        println delegate.class.name // print ScopeDemo  // most of the time owner and delegate are the same
        def nestedClosure = {           // nested closure
            println this.class.name         // print ScopeDemo
            println owner.class.name        // print ScopeDemo$_closure1 (aka outerClosure)
            println delegate.class.name     // print ScopeDemo$_closure1 (aka outerClosure)
        }
        nestedClosure()
    }

}

def demo = new ScopeDemo()
demo.outerClosure()