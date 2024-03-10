
pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                script {
                    // Compile the Java code
                    sh 'javac Main.java'
                }
            }
        }
        stage('Run') {
            steps {
                script {
                    // Run the Java program
                    sh 'java Main'
                }
            }
        }
    }
}
