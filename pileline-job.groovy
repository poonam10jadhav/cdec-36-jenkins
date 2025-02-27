pipeline {
    agent any
    stages {
        stage('git_ckeckout') {
            steps {
                git branch: 'main',Url:'https://github.com/poonam10jadhav/cdec-36-jenkins.gitt'
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
