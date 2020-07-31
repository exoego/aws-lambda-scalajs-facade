package net.exoego.facade.aws_lambda

import net.exoego.scalajs.types.util.Factory

import scala.scalajs.js

@js.native
sealed trait CodeBuildStateType extends js.Any {}
object CodeBuildStateType {
  val IN_PROGRESS: CodeBuildStateType = "IN_PROGRESS".asInstanceOf[CodeBuildStateType]
  val SUCCEEDED: CodeBuildStateType = "SUCCEEDED".asInstanceOf[CodeBuildStateType]
  val FAILED: CodeBuildStateType = "FAILED".asInstanceOf[CodeBuildStateType]
  val STOPPED: CodeBuildStateType = "STOPPED".asInstanceOf[CodeBuildStateType]
}

@js.native
sealed trait CodeBuildPhaseType extends js.Any {}
object CodeBuildPhaseType {
  val COMPLETED: CodeBuildPhaseType = "COMPLETED".asInstanceOf[CodeBuildPhaseType]
  val FINALIZING: CodeBuildPhaseType = "FINALIZING".asInstanceOf[CodeBuildPhaseType]
  val UPLOAD_ARTIFACTS: CodeBuildPhaseType = "UPLOAD_ARTIFACTS".asInstanceOf[CodeBuildPhaseType]
  val POST_BUILD: CodeBuildPhaseType = "POST_BUILD".asInstanceOf[CodeBuildPhaseType]
  val BUILD: CodeBuildPhaseType = "BUILD".asInstanceOf[CodeBuildPhaseType]
  val PRE_BUILD: CodeBuildPhaseType = "PRE_BUILD".asInstanceOf[CodeBuildPhaseType]
  val INSTALL: CodeBuildPhaseType = "INSTALL".asInstanceOf[CodeBuildPhaseType]
  val QUEUED: CodeBuildPhaseType = "QUEUED".asInstanceOf[CodeBuildPhaseType]
  val DOWNLOAD_SOURCE: CodeBuildPhaseType = "DOWNLOAD_SOURCE".asInstanceOf[CodeBuildPhaseType]
  val PROVISIONING: CodeBuildPhaseType = "PROVISIONING".asInstanceOf[CodeBuildPhaseType]
  val SUBMITTED: CodeBuildPhaseType = "SUBMITTED".asInstanceOf[CodeBuildPhaseType]
}

@js.native
sealed trait CodeBuildPhaseStatusType extends js.Any {}
object CodeBuildPhaseStatusType {
  val TIMED_OUT: CodeBuildPhaseStatusType = "TIMED_OUT".asInstanceOf[CodeBuildPhaseStatusType]
  val STOPPED: CodeBuildPhaseStatusType = "STOPPED".asInstanceOf[CodeBuildPhaseStatusType]
  val FAILED: CodeBuildPhaseStatusType = "FAILED".asInstanceOf[CodeBuildPhaseStatusType]
  val SUCCEEDED: CodeBuildPhaseStatusType = "SUCCEEDED".asInstanceOf[CodeBuildPhaseStatusType]
  val FAULT: CodeBuildPhaseStatusType = "FAULT".asInstanceOf[CodeBuildPhaseStatusType]
  val CLIENT_ERROR: CodeBuildPhaseStatusType = "CLIENT_ERROR".asInstanceOf[CodeBuildPhaseStatusType]
}

@js.native
sealed trait CodeBuildCacheType extends js.Any {}
object CodeBuildCacheType {
  val NO_CACHE: CodeBuildCacheType = "NO_CACHE".asInstanceOf[CodeBuildCacheType]
  val LOCAL: CodeBuildCacheType = "LOCAL".asInstanceOf[CodeBuildCacheType]
  val S3: CodeBuildCacheType = "S3".asInstanceOf[CodeBuildCacheType]
}

@js.native
sealed trait CodeBuildSourceLocationType extends js.Any {}
object CodeBuildSourceLocationType {
  val CODECOMMIT: CodeBuildSourceLocationType = "CODECOMMIT".asInstanceOf[CodeBuildSourceLocationType]
  val CODEPIPELINE: CodeBuildSourceLocationType = "CODEPIPELINE".asInstanceOf[CodeBuildSourceLocationType]
  val GITHUB: CodeBuildSourceLocationType = "GITHUB".asInstanceOf[CodeBuildSourceLocationType]
  val GITHUB_ENTERPRISE: CodeBuildSourceLocationType = "GITHUB_ENTERPRISE".asInstanceOf[CodeBuildSourceLocationType]
  val BITBUCKET: CodeBuildSourceLocationType = "BITBUCKET".asInstanceOf[CodeBuildSourceLocationType]
  val S3: CodeBuildSourceLocationType = "S3".asInstanceOf[CodeBuildSourceLocationType]
  val NO_SOURCE: CodeBuildSourceLocationType = "NO_SOURCE".asInstanceOf[CodeBuildSourceLocationType]
}

@js.native
sealed trait CodeBuildEnvironmentType extends js.Any {}
object CodeBuildEnvironmentType {
  val LINUX_CONTAINER: CodeBuildEnvironmentType = "LINUX_CONTAINER".asInstanceOf[CodeBuildEnvironmentType]
  val LINUX_GPU_CONTAINER: CodeBuildEnvironmentType = "LINUX_GPU_CONTAINER".asInstanceOf[CodeBuildEnvironmentType]
  val WINDOWS_CONTAINER: CodeBuildEnvironmentType = "WINDOWS_CONTAINER".asInstanceOf[CodeBuildEnvironmentType]
  val ARM_CONTAINER: CodeBuildEnvironmentType = "ARM_CONTAINER".asInstanceOf[CodeBuildEnvironmentType]
}

@js.native
sealed trait CodeBuildEnvironmentPullCredentialsType extends js.Any {}
object CodeBuildEnvironmentPullCredentialsType {
  val CODEBUILD: CodeBuildEnvironmentPullCredentialsType =
    "CODEBUILD".asInstanceOf[CodeBuildEnvironmentPullCredentialsType]
  val SERVICE_ROLE: CodeBuildEnvironmentPullCredentialsType =
    "SERVICE_ROLE".asInstanceOf[CodeBuildEnvironmentPullCredentialsType]
}

@js.native
sealed trait CodeBuildEnvironmentComputeType extends js.Any {}
object CodeBuildEnvironmentComputeType {
  val BUILD_GENERAL1_SMALL: CodeBuildEnvironmentComputeType =
    "BUILD_GENERAL1_SMALL".asInstanceOf[CodeBuildEnvironmentComputeType]
  val BUILD_GENERAL1_MEDIUM: CodeBuildEnvironmentComputeType =
    "BUILD_GENERAL1_MEDIUM".asInstanceOf[CodeBuildEnvironmentComputeType]
  val BUILD_GENERAL1_LARGE: CodeBuildEnvironmentComputeType =
    "BUILD_GENERAL1_LARGE".asInstanceOf[CodeBuildEnvironmentComputeType]
  val BUILD_GENERAL1_2XLARGE: CodeBuildEnvironmentComputeType =
    "BUILD_GENERAL1_2XLARGE".asInstanceOf[CodeBuildEnvironmentComputeType]
}

@js.native
sealed trait CodeBuildEnvironmentVariableType extends js.Any {}
object CodeBuildEnvironmentVariableType {
  val PARAMETER_STORE: CodeBuildEnvironmentVariableType =
    "PARAMETER_STORE".asInstanceOf[CodeBuildEnvironmentVariableType]
  val PLAINTEXT: CodeBuildEnvironmentVariableType = "PLAINTEXT".asInstanceOf[CodeBuildEnvironmentVariableType]
  val SECRETS_MANAGER: CodeBuildEnvironmentVariableType =
    "SECRETS_MANAGER".asInstanceOf[CodeBuildEnvironmentVariableType]
}

@Factory
@js.native
trait CodeBuildStateEventDetail extends js.Object {
  var `build-status`: CodeBuildStateType
  var `project-name`: String
  var `build-id`: String
  var `current-phase`: CodeBuildPhaseType
  var `current-phase-context`: String
  var version: String
  var `additional-information`: CodeBuildStateEventDetail.`Additional-information`
}

object CodeBuildStateEventDetail {
  @Factory(false)
  @js.native
  trait `Additional-information` extends js.Object {
    var cache: `Additional-information`.Cache
    var `build-number`: Double
    var `timeout-in-minutes`: Double
    var `build-complete`: Boolean
    var initiator: String
    var `build-start-time`: String
    var source: `Additional-information`.Source
    var `source-version`: String
    var artifact: `Additional-information`.Artifact
    var environment: `Additional-information`.Environment
    var `project-file-system-locations`: js.Array[Nothing]
    var logs: `Additional-information`.Logs
    var phases: js.Array[js.Any]
    var `queued-timeout-in-minutes`: Double
  }

  object `Additional-information` {
    @Factory(false)
    @js.native
    trait Cache extends js.Object {
      var `type`: CodeBuildCacheType
    }

    @Factory(false)
    @js.native
    trait Source extends js.Object {
      var buildspec: String
      var location: String
      var `type`: CodeBuildSourceLocationType
    }

    @Factory(false)
    @js.native
    trait Artifact extends js.Object {
      var location: String
    }

    @Factory(false)
    @js.native
    trait Environment extends js.Object {
      var image: String
      var `privileged-mode`: Boolean
      var `image-pull-credentials-type`: js.UndefOr[CodeBuildEnvironmentPullCredentialsType]
      var `compute-type`: CodeBuildEnvironmentComputeType
      var `type`: CodeBuildEnvironmentType
      var `environment-variables`: js.Array[js.Any]
    }

    @Factory(false)
    @js.native
    trait Logs extends js.Object {
      var `group-name`: String
      var `stream-name`: String
      var `deep-link`: String
    }
  }
}
