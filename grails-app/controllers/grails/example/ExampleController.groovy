package grails.example

@Mixin(ExampleMixin)
class ExampleController {

    def index() { 

    	withExample { 

    	}

    }

}
