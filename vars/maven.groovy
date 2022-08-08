def install(){
  sh 'mvn clean install'
}
def compile(){
  sh 'mvn clean compile'
}
def build(){
  sh 'mvn package'
}

