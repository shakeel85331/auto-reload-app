# auto-reload-app

#### This is a springboot project that is used to demonstrate the auto reload of the configuration when the configmap is updated in the kubernetes cluster.

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









