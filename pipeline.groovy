pipeline {
    agent any
    
    stages {
        stage('Print Date 1') {
            steps {
                script {
                    def date1 = new Date()
                    println "Date 1: ${date1}"
                }
            }
            post
            {
                always
                {
                    echo "stage 1 paased"
                }
            }
        }
        
        stage('Print Date 2') {
            steps {
                script {
                    def date2 = new Date()
                    println "Date 2: ${date2}"
                }
            }
        }
        
        stage('Print Date 3') {
            steps {
                script {
                    def date3 = new Date()
                    println "Date 3: ${date3}"
                }
            }
        }
        
        stage('Print Date 4') {
            steps {
                script {
                    d date4 = new Date()
                    println "Date 4: ${date4}"
                }
            }
        }
    }
}

