package grails.example

class ExampleMixin {

	def withExample(Closure c) {

		flash.message = 'example'

	}

}
