pipeline {
        agent any
        stages {
            stage('Test') {
                steps {
                    echo 'test'
                    sh 'chmod +x gradlew'
                    sh './gradlew clean build'
                }
            }
        }
    }