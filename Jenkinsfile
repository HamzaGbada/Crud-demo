node{
   stage('git Checkout'){
        git credentialsId: 'git-creds', url: 'https://github.com/HamzaGbada/Crud-demo.git'
   }
    stage('Build Docker Image'){
     sh '''if [[ "$(docker images -q hamzagbada/crud:1.0 2> /dev/null)" == "" ]]; then
                   docker build --force-rm -t hamzagbada/crud:1.0 .
                 fi'''
   }
    stage('Push Docker Image to dockerHub'){
        withCredentials([string(credentialsId: 'docker-pwd', variable: 'dockerHubPassword')]) {
            sh 'docker login -u hamzagbada -p ${dockerHubPassword}'
            sh 'docker push hamzagbada/crud:1.0'
        }
    }
    stage('Run the application'){
     sh 'docker-compose up -d'
    }

}
