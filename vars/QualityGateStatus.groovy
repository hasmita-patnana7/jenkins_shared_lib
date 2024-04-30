

def call(credentialsId){

//pipeline should not be aborted if the Quality Gate fails
waitForQualityGate abortPipeline: false, credentialsId: credentialsId 

}


