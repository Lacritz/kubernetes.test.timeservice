# MicroServices Example (TimeService)

## About
This project should show the the possibilities '**docker**' and '**kubernetes**' are capable of. 
It could be used as a skeleton for further projects. It will cover each step from building a 'Spring-Boot' 
application in kotlin to running the application in a docker-container. As well as running the **MicroServices** in a 
**docker-compose**. In the last step you can see how to run the services easily in a **kubernetes cluster**, without 
even 
writing a kubernetes file - just by translating the docker-compose via '**kompose**'.

## Intention
This piece of software should be used as a demo or as a skeleton for kotlin and spring-boot based microservices. 
It's not intended to be a piece of useful software besides of its demo capabilities. 

## Preparation
### Checkout both services:
Both services are needed to run the 

1) [MessageService](https://github.com/Lacritz/kubernetes.test.messageservice)
2) [TimeService](https://github.com/Lacritz/kubernetes.test.timeservice)

### Install the following software:
1. [Kotlin](https://kotlinlang.org/docs/tutorials/command-line.html) 
2. [Docker](https://docs.docker.com/install/)
3. [Docker-Compose](https://docs.docker.com/compose/install/) 
4. [MiniKube](https://kubernetes.io/docs/tasks/tools/install-minikube/)
5. [kubectl](https://kubernetes.io/docs/tasks/tools/install-kubectl/)
6. [kompose](https://github.com/kubernetes/kompose)



# Running the services (via Docker-Compose)

### Compile
```
gradle build
```

### Build Docker Image
```
docker build -t timogruen.com/kubernetes/example/timeservice .
```

### Run 'docker-compose'
Make sure you are in the root directory of the project and the docker image of both services are available.
```
cd ./docker && docker-compose up -d
```

# Running the services (via Kubernetes)

### Compile
```
gradle build
```

### Build Docker Image
```
docker build -t timogruen.com/kubernetes/example/timeservice .
```

### Run Minikube
```
minikube start
```
To publish your images to your minikube do the following:  
```
eval $(minikube docker-env)
```
```
gradle build
```
```
docker build -t timogruen.com/kubernetes/example/timeservice .
```
```
cd ./docker && kompose up
```

## Further Information

[kubectl cheatsheet](https://kubernetes.io/docs/reference/kubectl/cheatsheet/) \
[minikube external_ip workaround](https://github.com/elsonrodriguez/minikube-lb-patch)
