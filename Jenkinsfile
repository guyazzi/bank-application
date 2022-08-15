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
                bat (/"${M2_HOME}\bin\mvn" -Dunit-tests.skip=true clean install/)

            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
                 bat(/"${M2_HOME}\bin\mvn" verify -Dintegration-tests.skip=true/)
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}