def call(){
  sh 'sudo service docker start'    
  sh 'sudo docker login -u="${DOCKER_USERNAME}" -p="${DOCKER_PASSWORD}"'        
  sh 'sudo docker build --tag srichandana/${DOCKERIMAGE}:${BUILD_NUMBER} .'
  sh 'sudo docker push srichandana/${DOCKERIMAGE}:${BUILD_NUMBER}' 
}


