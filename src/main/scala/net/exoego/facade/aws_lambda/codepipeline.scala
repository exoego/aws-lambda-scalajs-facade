package net.exoego.facade.aws_lambda

import net.exoego.scalajs.types.util.Factory

import scala.scalajs.js
import scala.scalajs.js.|

@Factory
trait S3ArtifactLocation extends js.Object {
  var bucketName: String
  var objectKey: String
}

@Factory
trait S3ArtifactStore extends js.Object {
  var `type`: String
  var s3Location: S3ArtifactLocation
}

@Factory
trait Artifact extends js.Object {
  var name: String
  var revision: String | Null
  var location: ArtifactLocation
}

@Factory
trait Credentials extends js.Object {
  var accessKeyId: String
  var secretAccessKey: String
  var sessionToken: js.UndefOr[String]
}

@Factory
trait EncryptionKey extends js.Object {
  var `type`: String
  var id: String
}

@Factory(false)
trait CodePipelineEvent extends js.Object {
  var `CodePipeline.job`: CodePipelineEvent.`CodePipeline.job`
}

object CodePipelineEvent {
  @Factory(false)
  trait `CodePipeline.job` extends js.Object {
    var id: String
    var accountId: String
    var data: `CodePipeline.job`.Data
  }

  object `CodePipeline.job` {
    @Factory(false)
    trait Data extends js.Object {
      var actionConfiguration: Data.ActionConfiguration
      var inputArtifacts: js.Array[Artifact]
      var outputArtifacts: js.Array[Artifact]
      var artifactCredentials: Credentials
      var encryptionKey: js.UndefOr[EncryptionKey]
      var continuationToken: js.UndefOr[String]
    }

    object Data {
      @Factory(false)
      trait ActionConfiguration extends js.Object {
        var configuration: ActionConfiguration.Configuration
      }

      object ActionConfiguration {
        @Factory(false)
        trait Configuration extends js.Object {
          var FunctionName: String
          var UserParameters: String
        }
      }
    }
  }
}
