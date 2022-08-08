def helm_upgrade(){
  sh 'helm upgrade --install ${HELMCHART_NAME} --set image.tag=${BUILD_NUMBER} ./helm/${HELMCHART_NAME}'
}