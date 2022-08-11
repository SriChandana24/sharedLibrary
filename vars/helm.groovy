def call(){
  sh 'aws eks update-kubeconfig --region ${AWS_REGION} --name ${AWS_EKS_CLUSTER}'
  sh 'helm upgrade --install ${HELMCHART_NAME} --set image.tag=${BUILD_NUMBER} ./helm/${HELMCHART_NAME}'
}