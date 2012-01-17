<head>
	<title>Test Page</title>
</head>

<body>
	<article class="modules">
	
		<g:each var="i" in="${1..25}">
		
			<section class="module">
			
				<h1>Module #${i}</h1>
				
				<p>Lorem ipsum #${i}</p>
			
			</section>
		
		
		</g:each>
	
	</article>
</body>
