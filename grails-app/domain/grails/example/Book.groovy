package grails.example

class Book {

	String title
	Integer year

	static namedQueries = {
		
		ofYear { Integer year ->
			if (year) eq 'year', year
		}
		
    }

}
