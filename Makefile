compile:
	gradle build
dockerImage: compile
	docker build -t timogruen.com/kubernetes/example/timeservice:1.0.0 .

