pipeline {
  agent any
		
  stages {
    stage ('build'){
      steps {
        sh 'export JAVA_HOME="/usr/java/latest"
        sh 'ant -f build.xml -v'
      }
    }
  } 
}
