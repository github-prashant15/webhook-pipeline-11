pipeline {
        agent any 
        stages {
          stage('Build') { 
            steps {
              echo "Build is completed"
            }
          }
          stage('Test') { 
            steps {
              echo "Test is completed"
            }
          }
          stage('Deploy') { 
            steps {
              echo "Deploy is completed"
            }
          }
          stage('prod') { 
            steps {
              echo "product is completed"
            }
          }
        }
      }