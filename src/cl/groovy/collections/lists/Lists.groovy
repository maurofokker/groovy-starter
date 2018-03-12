package cl.groovy.collections.lists

List nums = [1,2,3,6,7,9,4,5,3,6,8,9]   // def nums = [1,2,3,6,7,9,4,5,3,6,8,9] will be an ArrayList
println nums
println nums.class.name         // java.util.ArrayList by default

// add | remove | get | clear

nums.push(99)           // append to list
nums.putAt(0,77)        // put in specific index
nums[0] = 78            // updates an specific index
nums + 7                // this will create a new list performing a union
nums << 66              // left shift add

nums.pop()              // remove the last element
nums.removeAt(0)        // remove at specific index
def newList = nums - 3  // create new list removing elements in the right
println newList

println nums.getAt(0..3)    // get elements at indexes in range
nums = []                   // empty list

// flatten
nums << [3,4,5]             // add list to a list
nums << [1,2]               // add list to a list
println nums                // [1,2,3,6,7,9,4,5,3,6,8,9, [3,4,5], [1,2]]
println nums.flatten()      // flatten the list, any li
// [1,2,3,6,7,9,4,5,3,6,8,9,3,4,5,1,2]

// equals
def myNumbers = [1,2,3]
def myNumbers2 = [1,2,3]
println myNumbers.equals(myNumbers2)

// findAll
println nums.findAll { it == 4 }
println nums.flatten().findAll { it < 5 }

// getAt(Range)
println nums.getAt(0..5)

// reverse list
println nums.reverse()

// unique
println nums.unique()

// Java Collections List(LinkedList) (Set,SortedSet)
// using _as_ can 'cast' to other implementation i.e. LinkedList, LinkedHashSet
def evens = [10,2,8,4,24,14,2] as Set   // in case I want the list to be a Set (in this case a LinkedHashSet)
println evens                           // when cast as Set it will remove duplicates
println evens.class.name

def evens = [10,2,8,4,24,14,2] as SortedSet // class of type TreeSet and list will be sorted