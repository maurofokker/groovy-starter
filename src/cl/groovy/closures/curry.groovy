package cl.groovy.closures

// curry in groovy refers to the concept of partial application
// curry will set the parameters of one method and will return a new Closure accepting one last parameter

def log = { String type, Date createdOn, String msg -> 
    println "$createdOn [$type] - $msg"
}

log("DEBUG",new Date(),"This is my first debug statement...")

// Applying curry creating new closure depending in other one
// the new method will receive just 2 args, bc in the declaration the type parameter is already used
def debugLog = log.curry("DEBUG")
debugLog(new Date(), "This is another debug statement...")
debugLog(new Date(), "This is one more...")

// Creating a new closure
def todayDebugLog = log.curry("DEBUG",new Date())
todayDebugLog("This is today's debug msg")

// right curry will replace parameters from right to the left
def crazyPersonLog = log.rcurry("Why am I logging this way")
crazyPersonLog("ERROR",new Date())

// index based currying will replace parameter based on index
def typeMsgLog = log.ncurry(1,new Date())
typeMsgLog("ERROR","This is using ncurry...")
