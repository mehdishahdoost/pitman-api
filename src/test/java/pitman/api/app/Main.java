package pitman.api.app;

import pitman.api.artifact.Artifact;
import pitman.api.artifact.ArtifactType;
import pitman.api.deployment.Deployment;
import pitman.api.deployment.DeploymentType;
import pitman.api.service.Api;
import pitman.api.service.ApiType;
import pitman.api.service.Service;
import pitman.api.service.ServiceType;
import pitman.api.service.http.HttpType;
import pitman.api.skeleton.Blueprint;
import pitman.api.stack.BuildSystem;
import pitman.api.stack.Framework;
import pitman.api.stack.Language;
import pitman.api.stack.TechStack;

@Blueprint(projectName = "test", workingDirectory = "", basePackageName = "")
@Monolith
@TechStack(
    language = Language.JAVA,
    buildSystem = BuildSystem.MAVEN,
    framework = Framework.SPRING_BOOT)
@Deployment(deploymentType = DeploymentType.TOMCAT)
@Artifact(artifactType = ArtifactType.WAR)
public interface Main {

    @Api(apiType = ApiType.HTTP_JSON, httpType = HttpType.POST)
    @Service(type = ServiceType.PROCESS_INPUT_OBJECT)
    void login();

}
