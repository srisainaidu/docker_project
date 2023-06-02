pipeline {
    agent any
    
    stages {
        stage('Build Docker Image') {
            steps {
                script {
                    def imageName = 'my-nginx-image'
                    def imageTag = 'latest'
                    def dockerfile = '''
                        FROM nginx
                        LABEL maintainer="Your Name <your_email@example.com>"
                        
                        # Custom configurations, if needed
                        COPY nginx.conf /etc/nginx/nginx.conf
                        
                        EXPOSE 80
                        
                        CMD ["nginx", "-g", "daemon off;"]
                    '''
                    
                    writeFile file: 'Dockerfile', text: dockerfile
                    
                    build("${imageName}:${imageTag}", '-f Dockerfile .').push()
                }
            }
        }
    }
}