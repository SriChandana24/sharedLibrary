def call()
{
    sh 'ansible-playbook -i inv.ini ansible-playbook.yml --extra-vars "JFROG_SERVERIP=${SONAR_JFROG_SERVERIP}"'
}