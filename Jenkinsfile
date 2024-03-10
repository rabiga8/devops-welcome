pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
        // Add more stages for deployment or testing as needed
    }
}
