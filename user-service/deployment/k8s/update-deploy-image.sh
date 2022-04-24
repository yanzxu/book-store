if test -z "$(kubectl get deploy deployment-user-service -n dev)"; then
    echo "******* deployment-user-service not exist, create new deployment *******"
    sed -e 's/{IMAGE_TAG}/46/g' deployment-user-service.template > deployment-user-service.yaml;
    kubectl apply -f ./deployment-user-service.yaml 
else
    echo "******* deployment-user-service already exist, update image *******"
    kubectl set image deployment/deployment-user-service user-service=yanzxu/user-service:45 -n dev
fi
