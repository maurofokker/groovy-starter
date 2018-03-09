package cl.groovy.basics.scripts
// a script is any groovy code not enclosed in a class file
// but don't make the mistake thinking there is no class
println "Hello from myscript.groovy"

/*
http://groovy-lang.org/structure.html#_scripts_versus_classes
After compiled a script generates the next class

public class script1520443812208 extends groovy.lang.Script {

    public script1520443812208() {
    }

    public script1520443812208(groovy.lang.Binding context) {
        super(context)
    }

    public static void main(java.lang.String[] args) {
        org.codehaus.groovy.runtime.InvokerHelper.runScript(script1520443812208, args)
    }

    public java.lang.Object run() {
        this.println('Hello from myscript.groovy')
    }

}


 */