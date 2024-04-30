/**
 * This method removes a Docker image for a given project.
 * @param project The name of the project for which the Docker image is removed.
 * @param ImageTag The tag of the Docker image to be removed.
 * @param hubUser The username name on Docker Hub.
 */

def call(String project, String ImageTag, String hubUser){
    
    sh """
     docker rmi ${hubUser}/${project}:latest
    """
}

