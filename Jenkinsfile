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
                 echo "MAVEN_HOME = ${MAVEN_HOME}"
                }
            }
        stage('Build') {
            steps {
                echo 'Building..'
                bat (/'mvn clean package'/)

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