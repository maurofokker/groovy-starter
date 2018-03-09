package cl.groovy.basics.grapes

/*
    Scripts to run un groovyConsole
    Using @Grapes and @Grab to embbed maven dependencies into groovy scripts
 */

@Grapes(
    @Grab(group='org.apache.commons',module='commons-lang3',version='3.4')
)

import org.apache.commons.lang3.text.WordUtils

String name = "John Juan Doe"
WordUtils wordUtils = new WordUtils()

println wordUtils.initials(name)