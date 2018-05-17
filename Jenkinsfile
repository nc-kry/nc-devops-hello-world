pipeline {
        agent any
		triggers {
			cron('* * * * *')
		}
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