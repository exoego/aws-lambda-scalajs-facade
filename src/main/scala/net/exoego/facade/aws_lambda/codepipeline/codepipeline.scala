package net.exoego.facade.aws_lambda.codepipeline

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait S3ArtifactLocation extends js.Object {
  var bucketName: String = js.native
  var objectKey: String = js.native
}

object S3ArtifactLocation {
  def apply(
      bucketName: String,
      objectKey: String
  ): S3ArtifactLocation = {
    val _obj$ = js.Dynamic.literal(
      "bucketName" -> bucketName.asInstanceOf[js.Any],
      "objectKey" -> objectKey.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[S3ArtifactLocation]
  }
}

@js.native
trait S3ArtifactStore extends js.Object {
  var `type`: String = js.native
  var s3Location: S3ArtifactLocation = js.native
}

object S3ArtifactStore {
  def apply(
      `type`: String,
      s3Location: S3ArtifactLocation
  ): S3ArtifactStore = {
    val _obj$ = js.Dynamic.literal(
      "type" -> `type`.asInstanceOf[js.Any],
      "s3Location" -> s3Location.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[S3ArtifactStore]
  }
}
@js.native
trait Artifact extends js.Object {
  var name: String = js.native
  var revision: String | Null = js.native
  var location: ArtifactLocation = js.native
}

object Artifact {
  def apply(
      name: String,
      location: ArtifactLocation,
      revision: String | Null = null
  ): Artifact = {
    val _obj$ = js.Dynamic.literal(
      "name" -> name.asInstanceOf[js.Any],
      "revision" -> revision.asInstanceOf[js.Any],
      "location" -> location.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[Artifact]
  }
}

@js.native
trait Credentials extends js.Object {
  var accessKeyId: String = js.native
  var secretAccessKey: String = js.native
  var sessionToken: js.UndefOr[String] = js.native
}

object Credentials {
  def apply(
      accessKeyId: String,
      secretAccessKey: String,
      sessionToken: js.UndefOr[String] = js.undefined
  ): Credentials = {
    val _obj$ = js.Dynamic.literal(
      "accessKeyId" -> accessKeyId.asInstanceOf[js.Any],
      "secretAccessKey" -> secretAccessKey.asInstanceOf[js.Any]
    )
    sessionToken.foreach(_v =>
      _obj$.updateDynamic("sessionToken")(_v.asInstanceOf[js.Any])
    )
    _obj$.asInstanceOf[Credentials]
  }
}

@js.native
trait EncryptionKey extends js.Object {
  var `type`: String = js.native
  var id: String = js.native
}

object EncryptionKey {
  def apply(
      `type`: String,
      id: String
  ): EncryptionKey = {
    val _obj$ = js.Dynamic.literal(
      "type" -> `type`.asInstanceOf[js.Any],
      "id" -> id.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[EncryptionKey]
  }
}

@js.native
trait CodePipelineEvent extends js.Object {
  var `CodePipeline.job`: CodePipelineEvent.`CodePipeline.job` = js.native
}

object CodePipelineEvent {
  def apply(
      `CodePipeline.job`: CodePipelineEvent.`CodePipeline.job`
  ): CodePipelineEvent = {
    val _obj$ = js.Dynamic.literal(
      "CodePipeline.job" -> `CodePipeline.job`.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[CodePipelineEvent]
  }

  @js.native
  trait `CodePipeline.job` extends js.Object {
    var id: String = js.native
    var accountId: String = js.native
    var data: `CodePipeline.job`.Data = js.native
  }

  object `CodePipeline.job` {
    def apply(
        id: String,
        accountId: String,
        data: `CodePipeline.job`.Data
    ): `CodePipeline.job` = {
      val _obj$ = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any],
        "accountId" -> accountId.asInstanceOf[js.Any],
        "data" -> data.asInstanceOf[js.Any]
      )
      _obj$.asInstanceOf[`CodePipeline.job`]
    }

    @js.native
    trait Data extends js.Object {
      var actionConfiguration: Data.ActionConfiguration = js.native
      var inputArtifacts: js.Array[Artifact] = js.native
      var outputArtifacts: js.Array[Artifact] = js.native
      var artifactCredentials: Credentials = js.native
      var encryptionKey: js.UndefOr[EncryptionKey] = js.native
      var continuationToken: js.UndefOr[String] = js.native
    }

    object Data {
      def apply(
          actionConfiguration: Data.ActionConfiguration,
          inputArtifacts: js.Array[Artifact],
          outputArtifacts: js.Array[Artifact],
          artifactCredentials: Credentials,
          encryptionKey: js.UndefOr[EncryptionKey with js.Any] = js.undefined,
          continuationToken: js.UndefOr[String] = js.undefined
      ): Data = {
        val _obj$ = js.Dynamic.literal(
          "actionConfiguration" -> actionConfiguration.asInstanceOf[js.Any],
          "inputArtifacts" -> inputArtifacts.asInstanceOf[js.Any],
          "outputArtifacts" -> outputArtifacts.asInstanceOf[js.Any],
          "artifactCredentials" -> artifactCredentials.asInstanceOf[js.Any]
        )
        encryptionKey.foreach(_v =>
          _obj$.updateDynamic("encryptionKey")(_v.asInstanceOf[js.Any])
        )
        continuationToken.foreach(_v =>
          _obj$.updateDynamic("continuationToken")(_v.asInstanceOf[js.Any])
        )
        _obj$.asInstanceOf[Data]
      }

      @js.native
      trait ActionConfiguration extends js.Object {
        var configuration: ActionConfiguration.Configuration = js.native
      }

      object ActionConfiguration {
        def apply(
            configuration: ActionConfiguration.Configuration
        ): ActionConfiguration = {
          val _obj$ = js.Dynamic.literal(
            "configuration" -> configuration.asInstanceOf[js.Any]
          )
          _obj$.asInstanceOf[ActionConfiguration]
        }

        @js.native
        trait Configuration extends js.Object {
          var FunctionName: String = js.native
          var UserParameters: String = js.native
        }

        object Configuration {
          def apply(
              FunctionName: String,
              UserParameters: String
          ): Configuration = {
            val _obj$ = js.Dynamic.literal(
              "FunctionName" -> FunctionName.asInstanceOf[js.Any],
              "UserParameters" -> UserParameters.asInstanceOf[js.Any]
            )
            _obj$.asInstanceOf[Configuration]
          }
        }
      }
    }
  }
}
