pipeline {

agent any

    stages {

        stage('Git clone') {

            steps {

            git branch: 'main', url: 'https://github.com/dadda5/26april.git'

            }

        }

        stage('Build'){

            steps{

            sh 'javac HellooWorld.java'

            }

        }

        stage('Run'){

            steps{

            sh 'java Simple'

            }

        }

    }

}
