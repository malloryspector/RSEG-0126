pipeline {
    agent any

    stages {
    	stage('Clean') {
    		steps {
    			withAnt() {
	        		echo 'Cleaning..'
	        		sh 'ant clean'
	        	}	
            }
    	}
        stage('Build') {
        	 steps {
	        	withAnt() {
	        		echo 'Compiling..'
	        		sh 'ant compile'
	            }
        	}
        }
        stage('Test') {
            steps {
            	withAnt() {
	        		echo 'Test..'
	        		sh 'ant run'
	        	}	
            }
        }
    }
}