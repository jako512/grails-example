grails.servlet.version = "2.5" // Change depending on target container compliance (2.5 or 3.0)
grails.project.work.dir = ".grails"
grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"
grails.project.target.level = 1.6
grails.project.source.level = 1.6
//grails.project.war.file = "target/${appName}-${appVersion}.war"

grails.project.dependency.resolution = {
    // inherit Grails' default dependencies
    inherits("global") {
        // uncomment to disable ehcache
        // excludes 'ehcache'
    }
    log "error" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'
    checksums true // Whether to verify checksums on resolve

    repositories {
        inherits true // Whether to inherit repository definitions from plugins
        grailsPlugins()
        grailsHome()
        grailsCentral()
        mavenCentral()

        // uncomment these to enable remote dependency resolution from public Maven repositories
        //mavenCentral()
        //mavenLocal()
        //mavenRepo "http://snapshots.repository.codehaus.org"
        //mavenRepo "http://repository.codehaus.org"
        //mavenRepo "http://download.java.net/maven/2/"
        //mavenRepo "http://repository.jboss.com/maven2/"
    }

	def gebVersion = '0.6.2'
	def seleniumVersion = '2.16.1'

    dependencies {
        // specify dependencies here under either 'build', 'compile', 'runtime', 'test' or 'provided' scopes eg.

        // runtime 'mysql:mysql-connector-java:5.1.16'

		test "org.codehaus.geb:geb-spock:$gebVersion"
		
		test "org.seleniumhq.selenium:selenium-htmlunit-driver:$seleniumVersion", { exclude 'xml-apis' }
		test "org.seleniumhq.selenium:selenium-firefox-driver:$seleniumVersion" // -Dgeb.driver=firefox
		test "org.seleniumhq.selenium:selenium-chrome-driver:$seleniumVersion"  // -Dgeb.driver=chrome


    }

    plugins {
        runtime ":hibernate:$grailsVersion"
        runtime ":jquery:1.7.1"
        runtime ":resources:1.1.5"

        build ":tomcat:$grailsVersion"

		test ":spock:0.6-SNAPSHOT"
		test ":geb:$gebVersion"

    }
}
