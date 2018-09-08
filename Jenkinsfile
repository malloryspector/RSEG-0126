pipeline {
    agent any

    stages {
    	stage('Clean') {
    		steps {
        		echo 'Cleaning..'
        		sh 'ant clean'
            }
    	}
        stage('Build') {
            steps {
        		echo 'Compiling..'
        		sh 'ant compile'
            }
        }
        stage('Test') {
            steps {
        		echo 'Test..'
        		sh 'ant run'
            }
        }
    }
}