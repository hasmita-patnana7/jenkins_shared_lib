/* Performs a Maven clean build with tests skipped. */

def call(){
    sh 'mvn clean install -DskipTests'
}
