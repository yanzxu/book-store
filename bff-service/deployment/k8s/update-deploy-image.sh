IMAGE_TAG=$1

if test -z "$(kubectl get deploy deployment-bff-service -n dev)"; then
    echo "******* deployment-bff-service not exist, create new deployment with tag: $IMAGE_TAG *******"
    sed -e "s/{IMAGE_TAG}/$IMAGE_TAG/g" deployment-bff-service-template.yaml > deployment-bff-service.yaml;
    kubectl apply -f ./deployment-bff-service.yaml
    kubectl apply -f ./svc-bff-service.yaml
    rm -rf ./deployment-bff-service.yaml
else
    echo "******* deployment-bff-service already exist, update image tag to: $IMAGE_TAG *******"
    kubectl set image deployment/deployment-bff-service bff-service=yanzxu/bff-service:"$IMAGE_TAG" -n dev
fi
