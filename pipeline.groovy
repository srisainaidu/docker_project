pipeline {
    agent any
    
    stages {
        stage('Build Docker Image') {
            steps {
                script {
                    def imageName = 'my-docker-image'
                    def imageTag = 'latest'
                    
                    docker.withRegistry('https://docker.registry.url', 'docker-credentials-id') {
                        def dockerImage = docker.build("${imageName}:${imageTag}", '.')
                        dockerImage.push()
                    }
                }
            }
        }
    }
}
