package cl.groovy.simple_data_types.regex


/*
    Resource
        www.regular-expressions.info/refquick.html
 */
// Java Sample Pattern

import java.util.regex.*;
Pattern pattern = Pattern.compile("a\\\\b")     // escape for a\b expression
println pattern
println pattern.class

// What patterns will look like in Groovy

String slashy = /a\b/                       // something between \ \  <-- named slashy string
String url = $/http://localhost.com/blog/$  // using $/ /$ replace before line

println slashy.class

def pattern2 = ~/a\b/                       // ~string replace java Pattern.compile()
println pattern2.class                      // instance of java.util.regex.Pattern

// Find | Match

def text = "Being a Cleveland Sports Fan is no way to go through life" // true
def pattern3 = ~/Cleveland Sports Fan/      // pattern operator ~string
def finder = text =~ pattern3               // find operator =~
def matcher = text ==~ pattern3             // exact match operator ==~

println finder          // prints java.util.regex.Matcher[pattern=Cleveland Sport Fan region=0,57  lastmatch=]
println finder.size()   // prints 1
println matcher         // prints false

// ----------------------------------------------------------------------------------

def text2 = "Cleveland Sports Fan"
def pattern4 = ~/Cleveland Sports Fan/
def matcher2 = text2 ==~ pattern4

println matcher2    // prints true

if( matcher2 ) { // do something
}


// ----------------------------------------------------------------------------------

def text3 = "Being a Cleveland Sports Fan is no way to go through life" // true
def pattern5 = ~/Cleveland/

text3 = text3.replaceFirst(pattern5,"Buffalo")
println text3
