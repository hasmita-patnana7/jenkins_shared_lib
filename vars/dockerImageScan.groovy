/**
 * This method performs a vulnerability scan on a Docker image.
 * @param project The name of the project for which the Docker image is scanned.
 * @param ImageTag The tag of the Docker image to be scanned.
 * @param hubUser The username name on Docker Hub.
 */

def call(String project, String ImageTag, String hubUser){
    
    sh """   
     trivy image ${hubUser}/${project}:latest > scan.txt
     cat scan.txt
    """
}

