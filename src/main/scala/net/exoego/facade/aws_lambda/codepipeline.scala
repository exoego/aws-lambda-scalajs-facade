package net.exoego.facade.aws_lambda

import net.exoego.scalajs.types.util.Factory

import scala.scalajs.js
import scala.scalajs.js.|

@Factory
@js.native
trait S3ArtifactLocation extends js.Object {
  var bucketName: String = js.native
  var objectKey: String = js.native
}

@Factory
@js.native
trait S3ArtifactStore extends js.Object {
  var `type`: String = js.native
  var s3Location: S3ArtifactLocation = js.native
}

@Factory
@js.native
trait Artifact extends js.Object {
  var name: String = js.native
  var revision: String | Null = js.native
  var location: ArtifactLocation = js.native
}

@Factory
@js.native
trait Credentials extends js.Object {
  var accessKeyId: String = js.native
  var secretAccessKey: String = js.native
  var sessionToken: js.UndefOr[String] = js.native
}

@Factory
@js.native
trait EncryptionKey extends js.Object {
  var `type`: String = js.native
  var id: String = js.native
}

@Factory(false)
@js.native
trait CodePipelineEvent extends js.Object {
  var `CodePipeline.job`: CodePipelineEvent.`CodePipeline.job` = js.native
}

object CodePipelineEvent {
  @Factory(false)
  @js.native
  trait `CodePipeline.job` extends js.Object {
    var id: String = js.native
    var accountId: String = js.native
    var data: `CodePipeline.job`.Data = js.native
  }

  object `CodePipeline.job` {
    @Factory(false)
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
      @Factory(false)
      @js.native
      trait ActionConfiguration extends js.Object {
        var configuration: ActionConfiguration.Configuration = js.native
      }

      object ActionConfiguration {
        @Factory(false)
        @js.native
        trait Configuration extends js.Object {
          var FunctionName: String = js.native
          var UserParameters: String = js.native
        }
      }
    }
  }
}
