
class TestSpec extends GebSpec {

	def setup() {
		to TestPage
		assert at(TestPage)
	}
	
	def 'test direct selector'() {
		expect:
			$("article.modules section.module", 5).find("h1").text() == 'Module #6'
			$("article.modules section.module", 5).find("p").text() == 'Lorem ipsum #6'
			
	}
	
	def 'test content'() {
		expect:
			modules[5].find("h1").text() == 'Module #6'
			modules[5].find("p").text() == 'Lorem ipsum #6'
	}
	
	def 'test content with parameter'() {
		expect:
			title(5) == 'Module #6'
			text(5) == 'Lorem ipsum #6'
	}
	
	def 'test module'() {
		expect:
			module(5).title == 'Module #6'
			module(5).text == 'Lorem ipsum #6'
	}
	
}
