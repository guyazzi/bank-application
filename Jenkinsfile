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

       /*  stage('Sonar scan execution') {
                    // Run the sonar scan
                    steps {
                        script {
                            withSonarQubeEnv {
                                bat (/"${M2_HOME}\bin\mvn"  verify sonar:sonar -Dintegration-tests.skip=true -Dmaven.test.failure.ignore=true/)
                            }
                        }
                    }
                } */

        stage('Deploy') {
            steps {
                echo 'Deploying....'
            withCredentials([usernamePassword(credentialsId: 'git-pass-credentials-ID',
             passwordVariable: 'GIT_PASSWORD', usernameVariable: 'GIT_USERNAME')]) {
                sh('git push -u origin master https://${GIT_USERNAME}:${GIT_PASSWORD}@<https://github.com/guyazzi/bank-application/> ')
            }
            }
        }
    }
}