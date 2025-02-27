pipeline {
    agent any
    stages {
        stage('git_ckeckout') {
            steps {
                git url: 'https://github.com/Anilbamnote/student-ui-app.git', branch: 'main'
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
