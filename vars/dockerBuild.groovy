/**
 * This method builds a Docker image for a given project.
 * @param project The name of the project for which the Docker image is built.
 * @param ImageTag The tag to be applied to the Docker image.
 * @param hubUser The username or organization name on Docker Hub.
 */

def call(String project, String ImageTag, String hubUser){
    
    sh """
     docker image build -t ${hubUser}/${project}:latest .
    """
}


