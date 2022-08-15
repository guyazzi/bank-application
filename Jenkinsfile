pipeline {
    agent any
    tools {
            maven 'MAVEN_HOME'
            jdk 'jdk11'
        }

    stages {
        stage ('Initialize') {
                steps {
                 echo "PATH = ${PATH}"
                 echo "M2_HOME = ${MAVEN_HOME}"
                }
            }
        stage('Build') {
            steps {
                echo 'Building..'
                bat (/'${maven}\bin\mvn clean package'/)

            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}