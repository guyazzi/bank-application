pipeline {
    agent any
    tools {
            maven 'Maven 3.8.6'
            jdk 'jdk11.0.16'
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