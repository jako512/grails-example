package grails.example

import static org.junit.Assert.*

import grails.test.mixin.*
import grails.test.mixin.support.*
import org.junit.*
import spock.lang.Specification

@TestFor(ExampleController)
class ExampleControllerSpec extends Specification {

    def 'test controller with mixin 1'() {

		when:
			controller.index()
		then:
			controller.flash.message == 'example'

    }

    def 'test controller with mixin 2'() {

		when:
			controller.index()
		then:
			controller.flash.message == 'example'

    }

}
