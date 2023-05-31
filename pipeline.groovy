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
                    def date4 = new Date()
                    println "Date 4: ${date4}"
                }
            }
        }
    }
}