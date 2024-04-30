/**
 * Performs a Git checkout of a specific branch from a Git repository.
 * @param stageParams A map containing parameters for the Git checkout stage.
 *                    Contains the keys 'branch' and 'url'.
 */
def call(Map stageParams) {
    // Using the Jenkins pipeline 'checkout' step to perform Git checkout
    checkout([
        $class: 'GitSCM',
        branches: [[name:  stageParams.branch ]],
        userRemoteConfigs: [[ url: stageParams.url ]]
    ])
}
