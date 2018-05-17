pipeline {
        agent any
		triggers {
			cron('* * * * *')
		}
        stages {
            stage('Test') {
                steps {
					sh 'chmod +x gradlew'
                    sh './gradlew clean build'
                }
            }
        }
    }