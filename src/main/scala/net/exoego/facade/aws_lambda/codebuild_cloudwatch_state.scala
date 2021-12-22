package net.exoego.facade.aws_lambda

import scala.scalajs.js

@js.native
trait CodeBuildStateEventDetail extends js.Object {
  var `build-status`: literal.CodeBuildStateType
  var `project-name`: String
  var `build-id`: String
  var `current-phase`: literal.CodeBuildPhaseType
  var `current-phase-context`: String
  var version: String
  var `additional-information`: CodeBuildStateEventDetail.`Additional-information`
}

object CodeBuildStateEventDetail {
  def apply(
      `build-status`: literal.CodeBuildStateType,
      `project-name`: String,
      `build-id`: String,
      `current-phase`: literal.CodeBuildPhaseType,
      `current-phase-context`: String,
      version: String,
      `additional-information`: CodeBuildStateEventDetail.`Additional-information`
  ): CodeBuildStateEventDetail = {
    val _obj$ = js.Dynamic.literal(
      "build-status" -> `build-status`.asInstanceOf[js.Any],
      "project-name" -> `project-name`.asInstanceOf[js.Any],
      "build-id" -> `build-id`.asInstanceOf[js.Any],
      "current-phase" -> `current-phase`.asInstanceOf[js.Any],
      "current-phase-context" -> `current-phase-context`.asInstanceOf[js.Any],
      "version" -> version.asInstanceOf[js.Any],
      "additional-information" -> `additional-information`.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[CodeBuildStateEventDetail]
  }

  @js.native
  trait `Additional-information` extends js.Object {
    var cache: `Additional-information`.Cache = js.native
    var `build-number`: Double = js.native
    var `timeout-in-minutes`: Double = js.native
    var `build-complete`: Boolean = js.native
    var initiator: String = js.native
    var `build-start-time`: String = js.native
    var source: `Additional-information`.Source = js.native
    var `source-version`: String = js.native
    var artifact: `Additional-information`.Artifact = js.native
    var environment: `Additional-information`.Environment = js.native
    var `project-file-system-locations`: js.Array[Nothing] = js.native
    var logs: `Additional-information`.Logs = js.native
    var phases: js.Array[js.Any] = js.native
    var `queued-timeout-in-minutes`: Double = js.native
  }

  object `Additional-information` {
    def apply(
        cache: `Additional-information`.Cache,
        `build-number`: Double,
        `timeout-in-minutes`: Double,
        `build-complete`: Boolean,
        initiator: String,
        `build-start-time`: String,
        source: `Additional-information`.Source,
        `source-version`: String,
        artifact: `Additional-information`.Artifact,
        environment: `Additional-information`.Environment,
        `project-file-system-locations`: js.Array[Nothing],
        logs: `Additional-information`.Logs,
        phases: js.Array[js.Any],
        `queued-timeout-in-minutes`: Double
    ): `Additional-information` = {
      val _obj$ = js.Dynamic.literal(
        "cache" -> cache.asInstanceOf[js.Any],
        "build-number" -> `build-number`.asInstanceOf[js.Any],
        "timeout-in-minutes" -> `timeout-in-minutes`.asInstanceOf[js.Any],
        "build-complete" -> `build-complete`.asInstanceOf[js.Any],
        "initiator" -> initiator.asInstanceOf[js.Any],
        "build-start-time" -> `build-start-time`.asInstanceOf[js.Any],
        "source" -> source.asInstanceOf[js.Any],
        "source-version" -> `source-version`.asInstanceOf[js.Any],
        "artifact" -> artifact.asInstanceOf[js.Any],
        "environment" -> environment.asInstanceOf[js.Any],
        "project-file-system-locations" -> `project-file-system-locations`.asInstanceOf[js.Any],
        "logs" -> logs.asInstanceOf[js.Any],
        "phases" -> phases.asInstanceOf[js.Any],
        "queued-timeout-in-minutes" -> `queued-timeout-in-minutes`.asInstanceOf[js.Any]
      )
      _obj$.asInstanceOf[`Additional-information`]
    }

    @js.native
    trait Cache extends js.Object {
      var `type`: literal.CodeBuildCacheType
    }
    object Cache {
      def apply(
          `type`: literal.CodeBuildCacheType
      ): Cache = {
        val _obj$ = js.Dynamic.literal(
          "type" -> `type`.asInstanceOf[js.Any]
        )
        _obj$.asInstanceOf[Cache]
      }
    }

    @js.native
    trait Source extends js.Object {
      var buildspec: String
      var location: String
      var `type`: literal.CodeBuildSourceLocationType
    }

    object Source {
      def apply(
          buildspec: String,
          location: String,
          `type`: literal.CodeBuildSourceLocationType
      ): Source = {
        val _obj$ = js.Dynamic.literal(
          "buildspec" -> buildspec.asInstanceOf[js.Any],
          "location" -> location.asInstanceOf[js.Any],
          "type" -> `type`.asInstanceOf[js.Any]
        )
        _obj$.asInstanceOf[Source]
      }
    }

    @js.native
    trait Artifact extends js.Object {
      var location: String
    }
    object Artifact {
      def apply(
          location: String
      ): Artifact = {
        val _obj$ = js.Dynamic.literal(
          "location" -> location.asInstanceOf[js.Any]
        )
        _obj$.asInstanceOf[Artifact]
      }
    }

    @js.native
    trait Environment extends js.Object {
      var image: String = js.native
      var `privileged-mode`: Boolean = js.native
      var `image-pull-credentials-type`: js.UndefOr[literal.CodeBuildEnvironmentPullCredentialsType] = js.native
      var `compute-type`: literal.CodeBuildEnvironmentComputeType = js.native
      var `type`: literal.CodeBuildEnvironmentType = js.native
      var `environment-variables`: js.Array[js.Any] = js.native
    }

    object Environment {
      def apply(
          image: String,
          `privileged-mode`: Boolean,
          `compute-type`: literal.CodeBuildEnvironmentComputeType,
          `type`: literal.CodeBuildEnvironmentType,
          `environment-variables`: js.Array[js.Any],
          `image-pull-credentials-type`: js.UndefOr[literal.CodeBuildEnvironmentPullCredentialsType] = js.undefined
      ): Environment = {
        val _obj$ = js.Dynamic.literal(
          "image" -> image.asInstanceOf[js.Any],
          "privileged-mode" -> `privileged-mode`.asInstanceOf[js.Any],
          "compute-type" -> `compute-type`.asInstanceOf[js.Any],
          "type" -> `type`.asInstanceOf[js.Any],
          "environment-variables" -> `environment-variables`.asInstanceOf[js.Any]
        )
        `image-pull-credentials-type`.foreach(_v =>
          _obj$.updateDynamic("image-pull-credentials-type")(_v.asInstanceOf[js.Any])
        )
        _obj$.asInstanceOf[Environment]
      }
    }

    @js.native
    trait Logs extends js.Object {
      var `group-name`: String
      var `stream-name`: String
      var `deep-link`: String
    }

    object Logs {
      def apply(
          `group-name`: String,
          `stream-name`: String,
          `deep-link`: String
      ): Logs = {
        val _obj$ = js.Dynamic.literal(
          "group-name" -> `group-name`.asInstanceOf[js.Any],
          "stream-name" -> `stream-name`.asInstanceOf[js.Any],
          "deep-link" -> `deep-link`.asInstanceOf[js.Any]
        )
        _obj$.asInstanceOf[Logs]
      }
    }
  }
}

@js.native
trait CodeBuildCloudWatchStateEvent extends EventBridgeEvent["CodeBuild Build State Change", CodeBuildStateEventDetail]

object CodeBuildCloudWatchStateEvent {
  def apply(
      account: String,
      region: String,
      detail: CodeBuildStateEventDetail,
      time: String,
      id: String,
      version: String,
      resources: js.Array[String]
  ): CodeBuildCloudWatchStateEvent = {
    val _obj$ = js.Dynamic.literal(
      "account" -> account.asInstanceOf[js.Any],
      "region" -> region.asInstanceOf[js.Any],
      "version" -> version.asInstanceOf[js.Any],
      "detail" -> detail.asInstanceOf[js.Any],
      "detail-type" -> "CodeBuild Build State Change",
      "source" -> "ws.codebuild",
      "time" -> time.asInstanceOf[js.Any],
      "id" -> id.asInstanceOf[js.Any],
      "resources" -> resources.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[CodeBuildCloudWatchStateEvent]
  }
}
