pipeline
{
    agent {
        label 'RajeshPC'
    }
    
    stages
    {
    stage('Build')
    {
    steps {
        checkout([$class: 'GitSCM', branches: [[name: 'develop']], extensions: [], userRemoteConfigs: [[credentialsId: '9def0e99-8348-4a43-ac4c-71150229ced3', url: 'https://github.com/rajesh-cts/CucumberFlipkart.git']]])
    }
    }
    stage('testing')
    {
    
    steps{
        echo 'testing'
    }
    }
    stage('Deploy'){
        steps{
            echo 'Deploying'
        }
        }

    }


}
