import geb.Module


class TestModule extends Module {

	static content = {
		title { $("h1").text() }
		text { $("p").text() }
	}

	
}
