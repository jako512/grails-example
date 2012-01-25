package grails.example

import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Book)
class BookTests {

    void 'test list'() {
    	assert Book.list() == []
    }

    void 'test named query without param'() {
    	assert Book.ofYear.list() == []
    }

    void 'test named query with null param'() {
    	assert Book.ofYear(null).list() == []
    }

    void 'test named query with null param followed by query without param'() {
    	assert Book.ofYear(null).ofYear.list() == []
    }

    void 'test named query with valid param'() {
    	assert Book.ofYear(2012).list() == []
    }

    void 'test named query with valid param followed by query without param'() {
    	assert Book.ofYear(2012).ofYear.list() == []
    }

    void 'test named query with valid param followed by query with null param'() {
    	assert Book.ofYear(2012).ofYear(null).list() == []
    }

}
