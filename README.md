# auto-reload-app

#### This is a springboot project that is used to demonstrate the auto reload of the configuration when the configmap is updated in the kubernetes cluster. The specific usecase we have taken here is changing the log level of application on runtime. Here application would be using the log level defined on config map and any time it is changed on the config map the application would be able to detect the change and update the log level on all the instances without the need of manually doing this change on each instances.  

## Minikube installation

brew install minikube

brew install kubectl

minikube start --driver=docker

minikube status

kubectl get nodes


## Deploy the application in the minikube cluster

kubectl create namespace dev-environment

kubectl config set-context --current --namespace=dev-environment

kubectl create deployment auto-reload-app --image=shakeeldockerhub/auto-config-reload:latest

kubectl expose deployment auto-reload-app --type=NodePort --port=8080

kubectl apply -f configmap-reader-rolebinding.yaml

minikube service auto-reload-app --url

minikube dashboard









