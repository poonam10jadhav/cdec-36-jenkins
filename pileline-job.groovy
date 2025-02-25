pipeline {
    agent any
    stages {
        stage('git_ckeckout') {
            steps {
                echo 'pull success'
            }
        }
        stage('build') {
            steps {
                echo 'build success'
            }
        }
        stage('Test') {
            steps {
                echo 'test success'
            }
        }
                stage('Deploy') {
            steps {
                echo "Deploy success"
            }
        }
    }
}