/**
 * This method performs static code analysis using SonarQube.
 * It executes the Maven command 'mvn clean package sonar:sonar' within a SonarQube environment.
 * This command performs a clean build, packages the application, and runs SonarQube analysis
 * @param credentialsId The ID of the SonarQube credentials configured in Jenkins.
 */

def call(credentialsId){

    withSonarQubeEnv(credentialsId: credentialsId) {
         sh 'mvn clean package sonar:sonar'
    }
}
