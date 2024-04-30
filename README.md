**Jenkins Shared Library: Static Code Analysis**

**Overview**

This Jenkins Shared Library contains scripts for automating static code analysis tasks within Jenkins pipelines. Each script serves a specific purpose related to static code analysis, such as running Maven builds, performing Docker operations, and integrating with SonarQube for code quality checks.
Contents

**dockerBuild.groovy**

•	Purpose: Builds a Docker image for a specified project.

•	Usage: dockerBuild(project, ImageTag, hubUser)

•	Example: dockerBuild('myproject', 'latest', 'myhubuser')

**dockerImageCleanup.groovy**

•	Purpose: Removes a Docker image for a specified project.

•	Usage: dockerImageCleanup(project, ImageTag, hubUser)

•	Example: dockerImageCleanup('myproject', 'latest', 'myhubuser')

**dockerImagePush.groovy**

•	Purpose: Pushes a Docker image to a Docker registry.

•	Usage: dockerImagePush(project, ImageTag, hubUser)

•	Example: dockerImagePush('myproject', 'latest', 'myhubuser')

**dockerImageScan.groovy**

•	Purpose: Performs vulnerability scanning on a Docker image.

•	Usage: dockerImageScan(project, ImageTag, hubUser)

•	Example: dockerImageScan('myproject', 'latest', 'myhubuser')

**gitCheckout.groovy**

•	Purpose: Checks out code from a Git repository.

•	Usage: gitCheckout(stageParams)

•	Example: gitCheckout(['branch': 'main', 'url': 'https://github.com/myuser/myproject.git'])

**mvnBuild.groovy**

•	Purpose: Runs a Maven build with tests skipped.

•	Usage: mvnBuild()

•	Example: mvnBuild()

**mvnIntegrationTest.groovy**

•	Purpose: Runs Maven integration tests with unit tests skipped.

•	Usage: mvnIntegrationTest()

•	Example: mvnIntegrationTest()

**mvnTest.groovy**

•	Purpose: Runs Maven tests.

•	Usage: mvnTest()

•	Example: mvnTest()

**statiCodeAnalysis.groovy**

•	Purpose: Performs static code analysis using SonarQube.

•	Usage: statiCodeAnalysis(credentialsId)

•	Example: statiCodeAnalysis('my-sonar-credentials')

**QualityGateStatus.groovy**

•	Purpose: Waits for the Quality Gate status of a project to be reported.

•	Usage: QualityGateStatus(credentialsId)

•	Example: QualityGateStatus('my-sonar-credentials')

