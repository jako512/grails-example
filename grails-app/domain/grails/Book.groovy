package grails

class Book {

    String content

    static mapping = {
        content type: 'text'
    }

}
