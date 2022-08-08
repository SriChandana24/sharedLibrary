def helm_upgrade(chart){
  sh 'helm upgrade --install ${chart} --set image.tag=${BUILD_NUMBER} ./helm/${chart}'
}