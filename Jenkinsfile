pipeline {
  agent any
  stages {
    stage('Package') {
      steps {
        bat 'mvn clean package -nsu -DskipMunitTests'
      }
    }
    stage('Deploy CloudHub') {
      environment {
        ANYPOINT_CREDENTIALS = credentials('anypoint.credentials')
      }
      steps {
        bat 'mvn clean package deploy -DmuleDeploy -Danypoint.username=${ANYPOINT_CREDENTIALS_USR} -Danypoint.password=${ANYPOINT_CREDENTIALS_PSW}'
      }
    }
  }
}
