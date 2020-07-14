package net.exoego.facade.aws_lambda

import net.exoego.scalajs.types.util.Factory

import scala.scalajs.js

@js.native
sealed trait CodeBuildStateType extends js.Any {}
object CodeBuildStateType {
  @inline val IN_PROGRESS: CodeBuildStateType =
    "IN_PROGRESS".asInstanceOf[CodeBuildStateType]
  @inline val SUCCEEDED: CodeBuildStateType =
    "SUCCEEDED".asInstanceOf[CodeBuildStateType]
  @inline val FAILED: CodeBuildStateType =
    "FAILED".asInstanceOf[CodeBuildStateType]
  @inline val STOPPED: CodeBuildStateType =
    "STOPPED".asInstanceOf[CodeBuildStateType]
}

@js.native
sealed trait CodeBuildPhaseType extends js.Any {}
object CodeBuildPhaseType {
  @inline val COMPLETED: CodeBuildPhaseType =
    "COMPLETED".asInstanceOf[CodeBuildPhaseType]
  @inline val FINALIZING: CodeBuildPhaseType =
    "FINALIZING".asInstanceOf[CodeBuildPhaseType]
  @inline val UPLOAD_ARTIFACTS: CodeBuildPhaseType =
    "UPLOAD_ARTIFACTS".asInstanceOf[CodeBuildPhaseType]
  @inline val POST_BUILD: CodeBuildPhaseType =
    "POST_BUILD".asInstanceOf[CodeBuildPhaseType]
  @inline val BUILD: CodeBuildPhaseType =
    "BUILD".asInstanceOf[CodeBuildPhaseType]
  @inline val PRE_BUILD: CodeBuildPhaseType =
    "PRE_BUILD".asInstanceOf[CodeBuildPhaseType]
  @inline val INSTALL: CodeBuildPhaseType =
    "INSTALL".asInstanceOf[CodeBuildPhaseType]
  @inline val QUEUED: CodeBuildPhaseType =
    "QUEUED".asInstanceOf[CodeBuildPhaseType]
  @inline val DOWNLOAD_SOURCE: CodeBuildPhaseType =
    "DOWNLOAD_SOURCE".asInstanceOf[CodeBuildPhaseType]
  @inline val PROVISIONING: CodeBuildPhaseType =
    "PROVISIONING".asInstanceOf[CodeBuildPhaseType]
  @inline val SUBMITTED: CodeBuildPhaseType =
    "SUBMITTED".asInstanceOf[CodeBuildPhaseType]
}

@js.native
sealed trait CodeBuildPhaseStatusType extends js.Any {}
object CodeBuildPhaseStatusType {
  @inline val TIMED_OUT: CodeBuildPhaseStatusType =
    "TIMED_OUT".asInstanceOf[CodeBuildPhaseStatusType]
  @inline val STOPPED: CodeBuildPhaseStatusType =
    "STOPPED".asInstanceOf[CodeBuildPhaseStatusType]
  @inline val FAILED: CodeBuildPhaseStatusType =
    "FAILED".asInstanceOf[CodeBuildPhaseStatusType]
  @inline val SUCCEEDED: CodeBuildPhaseStatusType =
    "SUCCEEDED".asInstanceOf[CodeBuildPhaseStatusType]
  @inline val FAULT: CodeBuildPhaseStatusType =
    "FAULT".asInstanceOf[CodeBuildPhaseStatusType]
  @inline val CLIENT_ERROR: CodeBuildPhaseStatusType =
    "CLIENT_ERROR".asInstanceOf[CodeBuildPhaseStatusType]
}

@js.native
sealed trait CodeBuildCacheType extends js.Any {}
object CodeBuildCacheType {
  @inline val NO_CACHE: CodeBuildCacheType =
    "NO_CACHE".asInstanceOf[CodeBuildCacheType]
  @inline val LOCAL: CodeBuildCacheType =
    "LOCAL".asInstanceOf[CodeBuildCacheType]
  @inline val S3: CodeBuildCacheType = "S3".asInstanceOf[CodeBuildCacheType]
}

@js.native
sealed trait CodeBuildSourceLocationType extends js.Any {}
object CodeBuildSourceLocationType {
  @inline val CODECOMMIT: CodeBuildSourceLocationType =
    "CODECOMMIT".asInstanceOf[CodeBuildSourceLocationType]
  @inline val CODEPIPELINE: CodeBuildSourceLocationType =
    "CODEPIPELINE".asInstanceOf[CodeBuildSourceLocationType]
  @inline val GITHUB: CodeBuildSourceLocationType =
    "GITHUB".asInstanceOf[CodeBuildSourceLocationType]
  @inline val GITHUB_ENTERPRISE: CodeBuildSourceLocationType =
    "GITHUB_ENTERPRISE".asInstanceOf[CodeBuildSourceLocationType]
  @inline val BITBUCKET: CodeBuildSourceLocationType =
    "BITBUCKET".asInstanceOf[CodeBuildSourceLocationType]
  @inline val S3: CodeBuildSourceLocationType =
    "S3".asInstanceOf[CodeBuildSourceLocationType]
  @inline val NO_SOURCE: CodeBuildSourceLocationType =
    "NO_SOURCE".asInstanceOf[CodeBuildSourceLocationType]
}

@js.native
sealed trait CodeBuildEnvironmentType extends js.Any {}
object CodeBuildEnvironmentType {
  @inline val LINUX_CONTAINER: CodeBuildEnvironmentType =
    "LINUX_CONTAINER".asInstanceOf[CodeBuildEnvironmentType]
  @inline val LINUX_GPU_CONTAINER: CodeBuildEnvironmentType =
    "LINUX_GPU_CONTAINER".asInstanceOf[CodeBuildEnvironmentType]
  @inline val WINDOWS_CONTAINER: CodeBuildEnvironmentType =
    "WINDOWS_CONTAINER".asInstanceOf[CodeBuildEnvironmentType]
  @inline val ARM_CONTAINER: CodeBuildEnvironmentType =
    "ARM_CONTAINER".asInstanceOf[CodeBuildEnvironmentType]
}

@js.native
sealed trait CodeBuildEnvironmentPullCredentialsType extends js.Any {}
object CodeBuildEnvironmentPullCredentialsType {
  @inline val CODEBUILD: CodeBuildEnvironmentPullCredentialsType =
    "CODEBUILD".asInstanceOf[CodeBuildEnvironmentPullCredentialsType]
  @inline val SERVICE_ROLE: CodeBuildEnvironmentPullCredentialsType =
    "SERVICE_ROLE".asInstanceOf[CodeBuildEnvironmentPullCredentialsType]
}

@js.native
sealed trait CodeBuildEnvironmentComputeType extends js.Any {}
object CodeBuildEnvironmentComputeType {
  @inline val BUILD_GENERAL1_SMALL: CodeBuildEnvironmentComputeType =
    "BUILD_GENERAL1_SMALL".asInstanceOf[CodeBuildEnvironmentComputeType]
  @inline val BUILD_GENERAL1_MEDIUM: CodeBuildEnvironmentComputeType =
    "BUILD_GENERAL1_MEDIUM".asInstanceOf[CodeBuildEnvironmentComputeType]
  @inline val BUILD_GENERAL1_LARGE: CodeBuildEnvironmentComputeType =
    "BUILD_GENERAL1_LARGE".asInstanceOf[CodeBuildEnvironmentComputeType]
  @inline val BUILD_GENERAL1_2XLARGE: CodeBuildEnvironmentComputeType =
    "BUILD_GENERAL1_2XLARGE".asInstanceOf[CodeBuildEnvironmentComputeType]
}

@js.native
sealed trait CodeBuildEnvironmentVariableType extends js.Any {}
object CodeBuildEnvironmentVariableType {
  @inline val PARAMETER_STORE: CodeBuildEnvironmentVariableType =
    "PARAMETER_STORE".asInstanceOf[CodeBuildEnvironmentVariableType]
  @inline val PLAINTEXT: CodeBuildEnvironmentVariableType =
    "PLAINTEXT".asInstanceOf[CodeBuildEnvironmentVariableType]
  @inline val SECRETS_MANAGER: CodeBuildEnvironmentVariableType =
    "SECRETS_MANAGER".asInstanceOf[CodeBuildEnvironmentVariableType]
}

@Factory
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
    trait Cache extends js.Object {
      var `type`: CodeBuildCacheType
    }

    @Factory(false)
    trait Source extends js.Object {
      var buildspec: String
      var location: String
      var `type`: CodeBuildSourceLocationType
    }

    @Factory(false)
    trait Artifact extends js.Object {
      var location: String
    }

    @Factory(false)
    trait Environment extends js.Object {
      var image: String
      var `privileged-mode`: Boolean
      var `image-pull-credentials-type`: js.UndefOr[
        CodeBuildEnvironmentPullCredentialsType
      ]
      var `compute-type`: CodeBuildEnvironmentComputeType
      var `type`: CodeBuildEnvironmentType
      var `environment-variables`: js.Array[js.Any]
    }

    @Factory(false)
    trait Logs extends js.Object {
      var `group-name`: String
      var `stream-name`: String
      var `deep-link`: String
    }
  }
}
