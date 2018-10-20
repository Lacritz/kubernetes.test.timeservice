#Installation

##Compile
'''gradle build'''

##Build DockerImage
'''docker build -t timogruen.com/kubernetes/example/messageservice .'''

##Run 'docker-compose'
Make sure you are in the root directory of the project.
'''cd ./docker && docker-compose up -d'''
