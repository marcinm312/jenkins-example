pipeline {
	agent any

	tools {
		maven "maven"
	}

	stages {
		stage('Build') {
			steps {
				dir("jenkins-example"){
				    bat "mvn clean compile"
				}
			}
		}
		stage('Test') {
			steps {
				dir("jenkins-example"){
					bat "mvn test"
				}
			}
		}
		stage('Deploy') {
			steps {
				dir("jenkins-example"){
					bat "mvn clean heroku:deploy" 
				}
			}
		}
	}
}