   pipeline {
    agent any
    environment {
        name = 'GRT'
    }
    parameters {
        string(name: 'Person', defaultValue: 'Gyana Ranjan Tripathy', description: "who are u ?")
        booleanParam(name: 'Ismale', defaultValue: true, description: "Are u male ?")
        choice(name: 'city', choices:['BBSR','Bengaluru','Haryana'], description: "Which city will u choose")
    }
    stages {
        stage('Run A command') {
            steps {
                sh '''
                    ls
                    date
                    pwd
                    cal 2026
                '''
                echo 'Testing is initialized'
            }
        }
        stage('Parameters') {
            steps {
                echo 'It is time for build'
                sh 'echo "${name}"'
                sh 'echo "${Person}"'
                sh 'echo "Is Male: ${Ismale}"'
                sh 'echo "City: ${city}"'
            }
        }
        stage('Continue ?') {
            input {
                message "Should we continue? "
                ok "Yes we should without any hesitation"
            }
            steps {
                echo 'It is time for build'
            }
        }
        stage('Build') {
            steps {
                echo 'It is time for build'
            }
        }
        stage('Environment Variables') {
            environment {
                username = 'TECH MONARCH'
            }
            steps {
                sh 'echo "${BUILD_ID}"'
                sh 'echo "${name}"'
                sh 'echo "${username}"'
            }
        }
        stage('Deploy on test') {
            steps {
                echo 'We should do deployment on test'
            }
        }
        stage('Deploy on prod') {
            steps {
                echo 'Now after deploy on production'
                sh 'echo "${name}"'
            }
        }
    }
}
