pipeline
{
    agent {
        label 'RajeshPC'
    }
    
    stages
    {
    stage('clean')
    {
    steps {
        bat 'mvn clean'
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
