package cl.groovy.collections.ranges

/*
    In Java a range from 1 to 10
    for (int i = 1; i <= 10; i++) print i
    from 10 to 1
    for (int i = 10; i >= 1; i--) print i

    In Groovy ranges are objects
 */
Range r = 1..10
println r               // [1, 2, 3, 4, 5, ..., 9, 10]
println r.class.name    // groovy.lang.IntRange
println r.from          // 1
println r.to            // 10

assert (0..10).contains(0)              // true
assert (0..10).contains(10)             // true
assert (0..10).contains(-1) == false    // false
assert (0..10).contains(11) == false    // false

assert (0..<10).contains(0)             // true
assert (0..<10).contains(10) == false   // left_value..<right_value less inclusive, not include the right part so is false

Date today = new Date()
Date oneWeekAway = today + 7 // thank the GDK for that simple statement

println today           // Mon Mar 12 15:56:35 CLST 2018
println oneWeekAway     // Mon Mar 19 15:56:35 CLST 2018

Range days = today..oneWeekAway
println days
/* output
[Mon Mar 12 16:05:31 CLST 2018, Tue Mar 13 16:05:31 CLST 2018, Wed Mar 14 16:05:31 CLST 2018, Thu Mar 15 16:05:31 CLST 2018,
Fri Mar 16 16:05:31 CLST 2018, Sat Mar 17 16:05:31 CLST 2018, Sun Mar 18 16:05:31 CLST 2018, Mon Mar 19 16:05:31 CLST 2018]
 */

Range letters = 'a'..'z'
println letters
/* output
[a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z]
 */