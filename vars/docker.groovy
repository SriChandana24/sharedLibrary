def call(String imageName){
  sh 'sudo service docker start'    
  sh 'sudo docker login -u="srichandana" -p="docker@2022"'        
  sh 'sudo docker build --tag srichandana/${imageName}:${BUILD_NUMBER} .'
  sh 'sudo docker push srichandana/${imageName}:${BUILD_NUMBER}' 
}
