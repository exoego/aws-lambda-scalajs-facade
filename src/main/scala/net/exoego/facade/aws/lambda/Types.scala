package net.exoego.facade.aws.lambda
import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait APIGatewayEventRequestContext extends js.Object {
  var accountId: String = js.native
  var apiId: String = js.native
  var authorizer: js.UndefOr[AuthResponseContext] = js.native
  var connectedAt: js.UndefOr[Double] = js.native
  var connectionId: js.UndefOr[String] = js.native
  var domainName: js.UndefOr[String] = js.native
  var domainPrefix: js.UndefOr[String] = js.native
  var eventType: js.UndefOr[String] = js.native
  var extendedRequestId: js.UndefOr[String] = js.native
  var httpMethod: String = js.native
  var identity: APIGatewayEventRequestContext.Identity = js.native
  var messageDirection: js.UndefOr[String] = js.native
  var messageId: js.UndefOr[String] = js.native
  var path: String = js.native
  var stage: String = js.native
  var requestId: String = js.native
  var requestTime: js.UndefOr[String] = js.native
  var requestTimeEpoch: Double = js.native
  var resourceId: String = js.native
  var resourcePath: String = js.native
  var routeKey: js.UndefOr[String] = js.native
}

object APIGatewayEventRequestContext {

  @js.native
  trait Identity extends js.Object {
    var accessKey: String | Null = js.native
    var accountId: String | Null = js.native
    var apiKey: String | Null = js.native
    var apiKeyId: String | Null = js.native
    var caller: String | Null = js.native
    var cognitoAuthenticationProvider: String | Null = js.native
    var cognitoAuthenticationType: String | Null = js.native
    var cognitoIdentityId: String | Null = js.native
    var cognitoIdentityPoolId: String | Null = js.native
    var sourceIp: String = js.native
    var user: String | Null = js.native
    var userAgent: String | Null = js.native
    var userArn: String | Null = js.native
  }
}

@js.native
trait APIGatewayProxyEvent extends js.Object {
  var body: String | Null = js.native
  var headers: APIGatewayProxyEvent.Headers = js.native
  var multiValueHeaders: APIGatewayProxyEvent.MultiValueHeaders = js.native
  var httpMethod: String = js.native
  var isBase64Encoded: Boolean = js.native
  var path: String = js.native
  var pathParameters: js.Dictionary[String] | Null = js.native
  var queryStringParameters: js.Dictionary[String] | Null = js.native
  var multiValueQueryStringParameters: js.Dictionary[js.Array[String]] | Null =
    js.native
  var stageVariables: js.Dictionary[String] | Null = js.native
  var requestContext: APIGatewayEventRequestContext = js.native
  var resource: String = js.native
}

object APIGatewayProxyEvent {
  type Headers = js.Dictionary[String]
  type MultiValueHeaders = js.Dictionary[js.Array[String]]
}

@js.native
trait ALBEventRequestContext extends js.Object {
  var elb: ALBEventRequestContext.Elb = js.native
}

object ALBEventRequestContext {

  @js.native
  trait Elb extends js.Object {
    var targetGroupArn: String = js.native
  }
}

@js.native
trait ALBEvent extends js.Object {
  var requestContext: ALBEventRequestContext = js.native
  var httpMethod: String = js.native
  var path: String = js.native
  var queryStringParameters: js.UndefOr[js.Dictionary[String]] = js.native
  var headers: js.UndefOr[js.Dictionary[String]] = js.native
  var multiValueQueryStringParameters
      : js.UndefOr[js.Dictionary[js.Array[String]]] = js.native
  var multiValueHeaders: js.UndefOr[js.Dictionary[js.Array[String]]] = js.native
  var body: String | Null = js.native
  var isBase64Encoded: Boolean = js.native
}

object ALBEvent {
  type QueryStringParameters = js.Dictionary[String]
  type Headers = js.Dictionary[String]
  type MultiValueQueryStringParameters = js.Dictionary[js.Array[String]]
  type MultiValueHeaders = js.Dictionary[js.Array[String]]
}

@js.native
trait CustomAuthorizerEvent extends js.Object {
  var `type`: String = js.native
  var methodArn: String = js.native
  var authorizationToken: js.UndefOr[String] = js.native
  var resource: js.UndefOr[String] = js.native
  var path: js.UndefOr[String] = js.native
  var httpMethod: js.UndefOr[String] = js.native
  var headers: js.UndefOr[js.Dictionary[String]] = js.native
  var multiValueHeaders: js.UndefOr[js.Dictionary[js.Array[String]]] = js.native
  var pathParameters: js.UndefOr[js.Dictionary[String]] = js.native
  var queryStringParameters: js.UndefOr[js.Dictionary[String]] = js.native
  var multiValueQueryStringParameters
      : js.UndefOr[js.Dictionary[js.Array[String]]] = js.native
  var stageVariables: js.UndefOr[js.Dictionary[String]] = js.native
  var requestContext: js.UndefOr[APIGatewayEventRequestContext] = js.native
  var domainName: js.UndefOr[String] = js.native
  var apiId: js.UndefOr[String] = js.native
}

object CustomAuthorizerEvent {
  type Headers = js.Dictionary[String]
  type MultiValueHeaders = js.Dictionary[String]
  type StageVariables = js.Dictionary[String]
}

@js.native
trait AttributeValue extends js.Object {
  var B: js.UndefOr[String] = js.native
  var BS: js.UndefOr[js.Array[String]] = js.native
  var BOOL: js.UndefOr[Boolean] = js.native
  var L: js.UndefOr[js.Array[AttributeValue]] = js.native
  var M: js.UndefOr[js.Dictionary[AttributeValue]] = js.native
  var N: js.UndefOr[String] = js.native
  var NS: js.UndefOr[js.Array[String]] = js.native
  var NULL: js.UndefOr[Boolean] = js.native
  var S: js.UndefOr[String] = js.native
  var SS: js.UndefOr[js.Array[String]] = js.native
}

object AttributeValue {
  type M = js.Dictionary[AttributeValue]
}

@js.native
trait StreamRecord extends js.Object {
  var ApproximateCreationDateTime: js.UndefOr[Double] = js.native
  var Keys: js.UndefOr[js.Dictionary[AttributeValue]] = js.native
  var NewImage: js.UndefOr[js.Dictionary[AttributeValue]] = js.native
  var OldImage: js.UndefOr[js.Dictionary[AttributeValue]] = js.native
  var SequenceNumber: js.UndefOr[String] = js.native
  var SizeBytes: js.UndefOr[Double] = js.native
  var StreamViewType: js.UndefOr[String] = js.native
}

object StreamRecord {
  type Keys = js.Dictionary[AttributeValue]
  type NewImage = js.Dictionary[AttributeValue]
  type OldImage = js.Dictionary[AttributeValue]
}

@js.native
trait DynamoDBRecord extends js.Object {
  var awsRegion: js.UndefOr[String] = js.native
  var dynamodb: js.UndefOr[StreamRecord] = js.native
  var eventID: js.UndefOr[String] = js.native
  var eventName: js.UndefOr[String] = js.native
  var eventSource: js.UndefOr[String] = js.native
  var eventSourceARN: js.UndefOr[String] = js.native
  var eventVersion: js.UndefOr[String] = js.native
  var userIdentity: js.UndefOr[js.Any] = js.native
}

@js.native
trait DynamoDBStreamEvent extends js.Object {
  var Records: js.Array[DynamoDBRecord] = js.native
}

@js.native
trait SNSMessageAttribute extends js.Object {
  var Type: String = js.native
  var Value: String = js.native
}

@js.native
trait SNSMessage extends js.Object {
  var SignatureVersion: String = js.native
  var Timestamp: String = js.native
  var Signature: String = js.native
  var SigningCertUrl: String = js.native
  var MessageId: String = js.native
  var Message: String = js.native
  var MessageAttributes: SNSMessageAttributes = js.native
  var Type: String = js.native
  var UnsubscribeUrl: String = js.native
  var TopicArn: String = js.native
  var Subject: String = js.native
}

@js.native
trait SNSEventRecord extends js.Object {
  var EventVersion: String = js.native
  var EventSubscriptionArn: String = js.native
  var EventSource: String = js.native
  var Sns: SNSMessage = js.native
}

@js.native
trait SNSEvent extends js.Object {
  var Records: js.Array[SNSEventRecord] = js.native
}

@js.native
trait S3EventRecord extends js.Object {
  var eventVersion: String = js.native
  var eventSource: String = js.native
  var awsRegion: String = js.native
  var eventTime: String = js.native
  var eventName: String = js.native
  var userIdentity: S3EventRecord.UserIdentity = js.native
  var requestParameters: S3EventRecord.RequestParameters = js.native
  var responseElements: S3EventRecord.ResponseElements = js.native
  var s3: S3EventRecord.S3 = js.native
}

object S3EventRecord {

  @js.native
  trait UserIdentity extends js.Object {
    var principalId: String = js.native
  }

  @js.native
  trait RequestParameters extends js.Object {
    var sourceIPAddress: String = js.native
  }

  @js.native
  trait ResponseElements extends js.Object {
    var `x-amz-request-id`: String = js.native
    var `x-amz-id-2`: String = js.native
  }

  @js.native
  trait S3 extends js.Object {
    var s3SchemaVersion: String = js.native
    var configurationId: String = js.native
    var bucket: S3.Bucket = js.native
    var `object`: S3.Object = js.native
  }

  object S3 {

    @js.native
    trait Bucket extends js.Object {
      var name: String = js.native
      var ownerIdentity: Bucket.OwnerIdentity = js.native
      var arn: String = js.native
    }

    object Bucket {

      @js.native
      trait OwnerIdentity extends js.Object {
        var principalId: String = js.native
      }
    }

    @js.native
    trait Object extends js.Object {
      var key: String = js.native
      var size: Double = js.native
      var eTag: String = js.native
      var versionId: String = js.native
      var sequencer: String = js.native
    }
  }
}

@js.native
trait S3Event extends js.Object {
  var Records: js.Array[S3EventRecord] = js.native
}

@js.native
trait CognitoUserPoolTriggerEvent extends js.Object {
  var version: Double = js.native
  var triggerSource: String = js.native
  var region: String = js.native
  var userPoolId: String = js.native
  var userName: js.UndefOr[String] = js.native
  var callerContext: CognitoUserPoolTriggerEvent.CallerContext = js.native
  var request: CognitoUserPoolTriggerEvent.Request = js.native
  var response: CognitoUserPoolTriggerEvent.Response = js.native
}

object CognitoUserPoolTriggerEvent {

  @js.native
  trait CallerContext extends js.Object {
    var awsSdkVersion: String = js.native
    var clientId: String = js.native
  }

  @js.native
  trait Request extends js.Object {
    var userAttributes: Request.UserAttributes = js.native
    var validationData: js.UndefOr[js.Dictionary[String]] = js.native
    var codeParameter: js.UndefOr[String] = js.native
    var linkParameter: js.UndefOr[String] = js.native
    var usernameParameter: js.UndefOr[String] = js.native
    var newDeviceUsed: js.UndefOr[Boolean] = js.native
    var session: js.UndefOr[js.Array[js.Any]] = js.native
    var challengeName: js.UndefOr[String] = js.native
    var privateChallengeParameters: js.UndefOr[js.Dictionary[String]] =
      js.native
    var challengeAnswer: js.UndefOr[String] = js.native
    var password: js.UndefOr[String] = js.native
  }

  object Request {
    type UserAttributes = js.Dictionary[String]
    type ValidationData = js.Dictionary[String]
    type PrivateChallengeParameters = js.Dictionary[String]
  }

  @js.native
  trait Response extends js.Object {
    var autoConfirmUser: js.UndefOr[Boolean] = js.native
    var autoVerifyPhone: js.UndefOr[Boolean] = js.native
    var autoVerifyEmail: js.UndefOr[Boolean] = js.native
    var smsMessage: js.UndefOr[String] = js.native
    var emailMessage: js.UndefOr[String] = js.native
    var emailSubject: js.UndefOr[String] = js.native
    var challengeName: js.UndefOr[String] = js.native
    var issueTokens: js.UndefOr[Boolean] = js.native
    var failAuthentication: js.UndefOr[Boolean] = js.native
    var publicChallengeParameters: js.UndefOr[js.Dictionary[String]] = js.native
    var privateChallengeParameters: js.UndefOr[js.Dictionary[String]] =
      js.native
    var challengeMetadata: js.UndefOr[String] = js.native
    var answerCorrect: js.UndefOr[Boolean] = js.native
    var userAttributes: js.UndefOr[js.Dictionary[String]] = js.native
    var finalUserStatus: js.UndefOr[String] = js.native
    var messageAction: js.UndefOr[String] = js.native
    var desiredDeliveryMediums: js.UndefOr[js.Array[String]] = js.native
    var forceAliasCreation: js.UndefOr[Boolean] = js.native
    var claimsOverrideDetails: js.UndefOr[js.Any] = js.native
  }

  object Response {
    type PublicChallengeParameters = js.Dictionary[String]
    type PrivateChallengeParameters = js.Dictionary[String]
    type UserAttributes = js.Dictionary[String]

    @js.native
    trait ClaimsOverrideDetails extends js.Object {

      var claimsToAddOrOverride: ClaimsOverrideDetails.ClaimsToAddOrOverride =
        js.native
      var claimsToSuppress: js.Array[String] = js.native
      var groupOverrideDetails: Null | js.Any = js.native
    }

    object ClaimsOverrideDetails {
      type ClaimsToAddOrOverride = js.Dictionary[String]
    }
  }
}

@js.native
trait CloudFormationCustomResourceEventCommon extends js.Object {
  var ServiceToken: String = js.native
  var ResponseURL: String = js.native
  var StackId: String = js.native
  var RequestId: String = js.native
  var LogicalResourceId: String = js.native
  var ResourceType: String = js.native

  var ResourceProperties
      : CloudFormationCustomResourceEventCommon.ResourceProperties = js.native
}

object CloudFormationCustomResourceEventCommon {
  type ResourceProperties = js.Dictionary[js.Any]
}

@js.native
trait CloudFormationCustomResourceCreateEvent
    extends CloudFormationCustomResourceEventCommon {
  var RequestType: String = js.native
}

@js.native
trait CloudFormationCustomResourceUpdateEvent
    extends CloudFormationCustomResourceEventCommon {
  var RequestType: String = js.native
  var PhysicalResourceId: String = js.native

  var OldResourceProperties
      : CloudFormationCustomResourceUpdateEvent.OldResourceProperties =
    js.native
}

object CloudFormationCustomResourceUpdateEvent {
  type OldResourceProperties = js.Dictionary[js.Any]
}

@js.native
trait CloudFormationCustomResourceDeleteEvent
    extends CloudFormationCustomResourceEventCommon {
  var RequestType: String = js.native
  var PhysicalResourceId: String = js.native
}

@js.native
trait CloudFormationCustomResourceResponseCommon extends js.Object {
  var PhysicalResourceId: String = js.native
  var StackId: String = js.native
  var RequestId: String = js.native
  var LogicalResourceId: String = js.native
  var Data: js.UndefOr[js.Dictionary[js.Any]] = js.native
}

object CloudFormationCustomResourceResponseCommon {
  type Data = js.Dictionary[js.Any]
}

@js.native
trait CloudFormationCustomResourceSuccessResponse
    extends CloudFormationCustomResourceResponseCommon {
  var Status: String = js.native
  var Reason: js.UndefOr[String] = js.native
}

@js.native
trait CloudFormationCustomResourceFailedResponse
    extends CloudFormationCustomResourceResponseCommon {
  var Status: String = js.native
  var Reason: String = js.native
}

@js.native
trait ScheduledEvent extends js.Object {
  var account: String = js.native
  var region: String = js.native
  var detail: js.Any = js.native
  var `detail-type`: String = js.native
  var source: String = js.native
  var time: String = js.native
  var id: String = js.native
  var resources: js.Array[String] = js.native
}

@js.native
trait CloudWatchLogsEvent extends js.Object {
  var awslogs: CloudWatchLogsEventData = js.native
}

@js.native
trait CloudWatchLogsEventData extends js.Object {
  var data: String = js.native
}

@js.native
trait CloudWatchLogsDecodedData extends js.Object {
  var owner: String = js.native
  var logGroup: String = js.native
  var logStream: String = js.native
  var subscriptionFilters: js.Array[String] = js.native
  var messageType: String = js.native
  var logEvents: js.Array[CloudWatchLogsLogEvent] = js.native
}

@js.native
trait CloudWatchLogsLogEvent extends js.Object {
  var id: String = js.native
  var timestamp: Double = js.native
  var message: String = js.native
  var extractedFields: js.UndefOr[js.Dictionary[String]] = js.native
}

object CloudWatchLogsLogEvent {
  type ExtractedFields = js.Dictionary[String]
}

@js.native
trait Context extends js.Object {
  var callbackWaitsForEmptyEventLoop: Boolean = js.native
  var functionName: String = js.native
  var functionVersion: String = js.native
  var invokedFunctionArn: String = js.native
  var memoryLimitInMB: Double = js.native
  var awsRequestId: String = js.native
  var logGroupName: String = js.native
  var logStreamName: String = js.native
  var identity: js.UndefOr[CognitoIdentity] = js.native
  var clientContext: js.UndefOr[ClientContext] = js.native
  def getRemainingTimeInMillis(): Double = js.native
  def done(error: js.UndefOr[Error], result: js.UndefOr[js.Any]): Unit =
    js.native
  def fail(error: Error | String): Unit = js.native
  def succeed(messageOrObject: js.Any): Unit = js.native
  def succeed(message: String, `object`: js.Any): Unit = js.native
}

@js.native
trait CognitoIdentity extends js.Object {
  var cognitoIdentityId: String = js.native
  var cognitoIdentityPoolId: String = js.native
}

@js.native
trait ClientContext extends js.Object {
  var client: ClientContextClient = js.native
  var Custom: js.UndefOr[js.Any] = js.native
  var env: ClientContextEnv = js.native
}

@js.native
trait ClientContextClient extends js.Object {
  var installationId: String = js.native
  var appTitle: String = js.native
  var appVersionName: String = js.native
  var appVersionCode: String = js.native
  var appPackageName: String = js.native
}

@js.native
trait ClientContextEnv extends js.Object {
  var platformVersion: String = js.native
  var platform: String = js.native
  var make: String = js.native
  var model: String = js.native
  var locale: String = js.native
}

@js.native
trait APIGatewayProxyResult extends js.Object {
  var statusCode: Double = js.native
  var headers: js.UndefOr[APIGatewayProxyResult.Headers] = js.native
  var multiValueHeaders: js.UndefOr[APIGatewayProxyResult.MultiValueHeaders] =
    js.native
  var body: String = js.native
  var isBase64Encoded: js.UndefOr[Boolean] = js.native
}

object APIGatewayProxyResult {
  type Headers = HeadersBDS
  type MultiValueHeaders = MultiValueHeadersBDS
}

@js.native
trait ALBResult extends js.Object {
  var statusCode: Double = js.native
  var statusDescription: String = js.native
  var headers: js.UndefOr[js.Dictionary[Boolean | Double | String]] = js.native
  var multiValueHeaders
      : js.UndefOr[js.Dictionary[js.Array[Boolean | Double | String]]] =
    js.native
  var body: String = js.native
  var isBase64Encoded: Boolean = js.native
}

object ALBResult {
  type Headers = HeadersBDS
  type MultiValueHeaders = MultiValueHeadersBDS
}

@js.native
trait CustomAuthorizerResult extends js.Object {
  var principalId: String = js.native
  var policyDocument: PolicyDocument = js.native
  var context: js.UndefOr[AuthResponseContext] = js.native
  var usageIdentifierKey: js.UndefOr[String] = js.native
}

@js.native
trait PolicyDocument extends js.Object {
  var Version: String = js.native
  var Id: js.UndefOr[String] = js.native
  var Statement: js.Array[Statement] = js.native
}

@js.native
trait BaseStatement extends js.Object {
  var Effect: String = js.native
  var Sid: js.UndefOr[String] = js.native
  var Condition: js.UndefOr[ConditionBlock] = js.native
}

@js.native
trait MaybeStatementPrincipal extends js.Object {
  var Principal: js.UndefOr[PrincipalValue] = js.native
  var NotPrincipal: js.UndefOr[PrincipalValue] = js.native
}

@js.native
trait MaybeStatementResource extends js.Object {
  var Resource: js.UndefOr[String | js.Array[String]] = js.native
  var NotResource: js.UndefOr[String | js.Array[String]] = js.native
}

@js.native
trait S3ArtifactLocation extends js.Object {
  var bucketName: String = js.native
  var objectKey: String = js.native
}

@js.native
trait S3ArtifactStore extends js.Object {
  var `type`: String = js.native
  var s3Location: S3ArtifactLocation = js.native
}

@js.native
trait Artifact extends js.Object {
  var name: String = js.native
  var revision: String | Null = js.native
  var location: ArtifactLocation = js.native
}

@js.native
trait Credentials extends js.Object {
  var accessKeyId: String = js.native
  var secretAccessKey: String = js.native
  var sessionToken: js.UndefOr[String] = js.native
}

@js.native
trait EncryptionKey extends js.Object {
  var `type`: String = js.native
  var id: String = js.native
}

@js.native
trait CodePipelineEvent extends js.Object {
  var `CodePipeline.job`: CodePipelineEvent.`CodePipeline.job` = js.native
}

object CodePipelineEvent {

  @js.native
  trait `CodePipeline.job` extends js.Object {
    var id: String = js.native
    var accountId: String = js.native
    var data: `CodePipeline.job`.Data = js.native
  }

  object `CodePipeline.job` {

    @js.native
    trait Data extends js.Object {
      var actionConfiguration: Data.ActionConfiguration = js.native
      var inputArtifacts: js.Array[Artifact] = js.native
      var outputArtifacts: js.Array[Artifact] = js.native
      var artifactCredentials: Credentials = js.native
      var encryptionKey: js.UndefOr[EncryptionKey with js.Any] = js.native
      var continuationToken: js.UndefOr[String] = js.native
    }

    object Data {

      @js.native
      trait ActionConfiguration extends js.Object {
        var configuration: ActionConfiguration.Configuration = js.native
      }

      object ActionConfiguration {

        @js.native
        trait Configuration extends js.Object {
          var FunctionName: String = js.native
          var UserParameters: String = js.native
        }
      }
    }
  }
}

@js.native
trait CodePipelineCloudWatchPipelineEvent extends js.Object {
  var version: String = js.native
  var id: String = js.native
  var `detail-type`: String = js.native
  var source: String = js.native
  var account: String = js.native
  var time: String = js.native
  var region: String = js.native
  var resources: js.Array[String] = js.native
  var detail: CodePipelineCloudWatchPipelineEvent.Detail = js.native
}

object CodePipelineCloudWatchPipelineEvent {

  @js.native
  trait Detail extends js.Object {
    var pipeline: String = js.native
    var version: Double = js.native
    var state: CodePipelineState = js.native
    var `execution-id`: String = js.native
  }
}

@js.native
trait CodePipelineCloudWatchStageEvent extends js.Object {
  var version: String = js.native
  var id: String = js.native
  var `detail-type`: String = js.native
  var source: String = js.native
  var account: String = js.native
  var time: String = js.native
  var region: String = js.native
  var resources: js.Array[String] = js.native
  var detail: CodePipelineCloudWatchStageEvent.Detail = js.native
}

object CodePipelineCloudWatchStageEvent {

  @js.native
  trait Detail extends js.Object {
    var pipeline: String = js.native
    var version: Double = js.native
    var `execution-id`: String = js.native
    var stage: String = js.native
    var state: CodePipelineStageState = js.native
  }
}

@js.native
trait CodePipelineCloudWatchActionEvent extends js.Object {
  var version: String = js.native
  var id: String = js.native
  var `detail-type`: String = js.native
  var source: String = js.native
  var account: String = js.native
  var time: String = js.native
  var region: String = js.native
  var resources: js.Array[String] = js.native
  var detail: CodePipelineCloudWatchActionEvent.Detail = js.native
}

object CodePipelineCloudWatchActionEvent {

  @js.native
  trait Detail extends js.Object {
    var pipeline: String = js.native
    var version: Double = js.native
    var `execution-id`: String = js.native
    var stage: String = js.native
    var action: String = js.native
    var state: CodePipelineActionState = js.native
    var `type`: Detail.Type = js.native
  }

  object Detail {

    @js.native
    trait Type extends js.Object {
      var owner: String = js.native
      var category: CodePipelineActionCategory = js.native
      var provider: String = js.native
      var version: Double = js.native
    }
  }
}

@js.native
trait CloudFrontCustomOrigin extends js.Object {
  var customHeaders: CloudFrontHeaders = js.native
  var domainName: String = js.native
  var keepaliveTimeout: Double = js.native
  var path: String = js.native
  var port: Double = js.native
  var protocol: String = js.native
  var readTimeout: Double = js.native
  var sslProtocols: js.Array[String] = js.native
}

@js.native
trait CloudFrontS3Origin extends js.Object {
  var authMethod: String = js.native
  var customHeaders: CloudFrontHeaders = js.native
  var domainName: String = js.native
  var path: String = js.native
  var region: String = js.native
}

@js.native
trait CloudFrontResponse extends js.Object {
  var status: String = js.native
  var statusDescription: String = js.native
  var headers: CloudFrontHeaders = js.native
}

@js.native
trait CloudFrontRequest extends js.Object {
  var clientIp: String = js.native
  var method: String = js.native
  var uri: String = js.native
  var querystring: String = js.native
  var headers: CloudFrontHeaders = js.native
  var origin: js.UndefOr[CloudFrontOrigin] = js.native
}

@js.native
trait CloudFrontEvent extends js.Object {
  var config: CloudFrontEvent.Config = js.native
}

object CloudFrontEvent {

  @js.native
  trait Config extends js.Object {
    var distributionDomainName: String = js.native
    var distributionId: String = js.native
    var eventType: String = js.native
    var requestId: String = js.native
  }
}

@js.native
trait CloudFrontResultResponse extends js.Object {
  var status: String = js.native
  var statusDescription: js.UndefOr[String] = js.native
  var headers: js.UndefOr[CloudFrontHeaders] = js.native
  var bodyEncoding: js.UndefOr[String] = js.native
  var body: js.UndefOr[String] = js.native
}

@js.native
trait CloudFrontResponseEvent extends js.Object {
  var Records: js.Array[js.Any] = js.native
}

@js.native
trait CloudFrontRequestEvent extends js.Object {
  var Records: js.Array[js.Any] = js.native
}

@js.native
trait KinesisStreamRecordPayload extends js.Object {
  var approximateArrivalTimestamp: Double = js.native
  var data: String = js.native
  var kinesisSchemaVersion: String = js.native
  var partitionKey: String = js.native
  var sequenceNumber: String = js.native
}

@js.native
trait KinesisStreamRecord extends js.Object {
  var awsRegion: String = js.native
  var eventID: String = js.native
  var eventName: String = js.native
  var eventSource: String = js.native
  var eventSourceARN: String = js.native
  var eventVersion: String = js.native
  var invokeIdentityArn: String = js.native
  var kinesis: KinesisStreamRecordPayload = js.native
}

@js.native
trait KinesisStreamEvent extends js.Object {
  var Records: js.Array[KinesisStreamRecord] = js.native
}

@js.native
trait FirehoseTransformationEvent extends js.Object {
  var invocationId: String = js.native
  var deliveryStreamArn: String = js.native
  var region: String = js.native
  var records: js.Array[FirehoseTransformationEventRecord] = js.native
}

@js.native
trait FirehoseTransformationEventRecord extends js.Object {
  var recordId: String = js.native
  var approximateArrivalTimestamp: Double = js.native
  var data: String = js.native
  var kinesisRecordMetadata: js.UndefOr[FirehoseRecordMetadata] = js.native
}

@js.native
trait FirehoseRecordMetadata extends js.Object {
  var shardId: String = js.native
  var partitionKey: String = js.native
  var approximateArrivalTimestamp: String = js.native
  var sequenceNumber: String = js.native
  var subsequenceNumber: String = js.native
}

@js.native
trait FirehoseTransformationResultRecord extends js.Object {
  var recordId: String = js.native
  var result: FirehoseRecordTransformationStatus = js.native
  var data: String = js.native
}

@js.native
trait FirehoseTransformationResult extends js.Object {
  var records: js.Array[FirehoseTransformationResultRecord] = js.native
}

@js.native
trait SQSRecord extends js.Object {
  var messageId: String = js.native
  var receiptHandle: String = js.native
  var body: String = js.native
  var attributes: SQSRecordAttributes = js.native
  var messageAttributes: SQSMessageAttributes = js.native
  var md5OfBody: String = js.native
  var eventSource: String = js.native
  var eventSourceARN: String = js.native
  var awsRegion: String = js.native
}

@js.native
trait SQSEvent extends js.Object {
  var Records: js.Array[SQSRecord] = js.native
}

@js.native
trait SQSRecordAttributes extends js.Object {
  var ApproximateReceiveCount: String = js.native
  var SentTimestamp: String = js.native
  var SenderId: String = js.native
  var ApproximateFirstReceiveTimestamp: String = js.native
}

@js.native
trait SQSMessageAttribute extends js.Object {
  var stringValue: js.UndefOr[String] = js.native
  var binaryValue: js.UndefOr[String] = js.native
  var stringListValues: js.Array[Nothing] = js.native
  var binaryListValues: js.Array[Nothing] = js.native
  var dataType: SQSMessageAttributeDataType = js.native
}

@js.native
trait LexEvent extends js.Object {
  var currentIntent: LexEvent.CurrentIntent = js.native
  var bot: LexEvent.Bot = js.native
  var userId: String = js.native
  var inputTranscript: String = js.native
  var invocationSource: String = js.native
  var outputDialogMode: String = js.native
  var messageVersion: String = js.native
  var sessionAttributes: LexEvent.SessionAttributes = js.native
  var requestAttributes: js.Dictionary[String] | Null = js.native
}

object LexEvent {

  @js.native
  trait CurrentIntent extends js.Object {
    var name: String = js.native
    var slots: CurrentIntent.Slots = js.native
    var slotDetails: LexSlotDetails = js.native
    var confirmationStatus: String = js.native
  }

  object CurrentIntent {
    type Slots = js.Dictionary[String]
  }

  @js.native
  trait Bot extends js.Object {
    var name: String = js.native
    var alias: String = js.native
    var version: String = js.native
  }

  type SessionAttributes = js.Dictionary[String]
  type LexSlotDetails = js.Dictionary[js.Any]
}

@js.native
trait LexSlotResolution extends js.Object {
  var value: String = js.native
}

@js.native
trait LexGenericAttachment extends js.Object {
  var title: String = js.native
  var subTitle: String = js.native
  var imageUrl: String = js.native
  var attachmentLinkUrl: String = js.native
  var buttons: js.Array[js.Any] = js.native
}

@js.native
trait LexDialogActionBase extends js.Object {
  var `type`: String = js.native
  var message: js.UndefOr[js.Any] = js.native
  var responseCard: js.UndefOr[js.Any] = js.native
}

object LexDialogActionBase {

  @js.native
  trait Message extends js.Object {
    var contentType: String = js.native
    var content: String = js.native
  }

  @js.native
  trait ResponseCard extends js.Object {
    var version: Double = js.native
    var contentType: String = js.native
    var genericAttachments: js.Array[LexGenericAttachment] = js.native
  }
}

@js.native
trait LexDialogActionClose extends LexDialogActionBase {
  var fulfillmentState: String = js.native
}

@js.native
trait LexDialogActionElicitIntent extends LexDialogActionBase {}

@js.native
trait LexDialogActionElicitSlot extends LexDialogActionBase {
  var intentName: String = js.native
  var slots: LexDialogActionElicitSlot.Slots = js.native
  var slotToElicit: String = js.native
}

object LexDialogActionElicitSlot {
  type Slots = js.Dictionary[String]
}

@js.native
trait LexDialogActionConfirmIntent extends LexDialogActionBase {
  var intentName: String = js.native
  var slots: LexDialogActionConfirmIntent.Slots = js.native
}

object LexDialogActionConfirmIntent {
  type Slots = js.Dictionary[String]
}

@js.native
trait LexDialogActionDelegate extends js.Object {
  var `type`: String = js.native
  var slots: LexDialogActionDelegate.Slots = js.native
}

object LexDialogActionDelegate {
  type Slots = js.Dictionary[String]
}

@js.native
trait LexResult extends js.Object {
  var sessionAttributes: js.UndefOr[LexResult.SessionAttributes] = js.native
  var dialogAction: LexDialogAction = js.native
}

object LexResult {
  type SessionAttributes = js.Dictionary[String]
}
