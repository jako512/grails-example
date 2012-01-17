import geb.Page
import groovy.lang.MetaClass


class TestPage extends Page {

	static url = '/test/index'
	static at = { assert title == 'Test Page'; true }

	
	static content = {
		modules { $("article.modules section.module") }
		module { index -> module TestModule, modules[index] }
//		title { index -> modules[index].find("h1").text() }
		title { index -> $("article.modules section.module", index).find("h1").text() }
		text { index -> modules[index].find("p").text() }
	}

}
