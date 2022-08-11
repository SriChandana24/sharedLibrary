def call(){
    sh 'curl -sSf -u admin:Artifactory1! -X PUT -T target/spring-petclinic-*-SNAPSHOT.jar http://${SONAR_JFROG_SERVERIP}:${ARTIFACTORY_PORT}/artifactory/pet-clinic/'
    sh 'curl -sSf -u admin:Artifactory1! -X PUT -T target/spring-petclinic-*-SNAPSHOT.jar http://${SONAR_JFROG_SERVERIP}:${ARTIFACTORY_PORT}/artifactory/pet-clinic/spring-petclinic-${BUILD_NUMBER}-SNAPSHOT.jar'
}