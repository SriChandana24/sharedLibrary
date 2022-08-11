def call(){
  sh 'mvn sonar:sonar -Dsonar.host.url=http://${SONAR_JFROG_SERVERIP}:${SONAR_PORT}/ -Dsonar.login=sqa_6efb7be29058cb368f8fc097a44f939b21f75993 -Dsonar.login=admin -Dsonar.password=sonarqube -Dsonar.junit.reportPaths=target/surefire-reports -Dsonar.java.binaries=target'    

}