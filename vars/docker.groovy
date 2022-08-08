def call(){
  sh 'sudo service docker start'    
  sh 'sudo docker login -u="srichandana" -p="docker@2022"'        
  sh 'sudo docker build --tag srichandana/${DOCKERIMAGE}:${BUILD_NUMBER} .'
  sh 'sudo docker push srichandana/${DOCKERIMAGE}:${BUILD_NUMBER}' 
}
