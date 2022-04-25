IMAGE_TAG=$1

if test -z "$(kubectl get deploy deployment-user-service -n dev)"; then
    echo "******* deployment-user-service not exist, create new deployment with tag: $IMAGE_TAG *******"
    sed -e "s/{IMAGE_TAG}/$IMAGE_TAG/g" deployment-user-service-template.yaml > deployment-user-service.yaml;
    kubectl apply -f ./deployment-user-service.yaml
    kubectl apply -f ./svc-user-service.yaml
    rm -rf ./deployment-user-service.yaml
else
    echo "******* deployment-user-service already exist, update image tag to: $IMAGE_TAG *******"
    kubectl set image deployment/deployment-user-service user-service=yanzxu/user-service:"$IMAGE_TAG" -n dev
fi
