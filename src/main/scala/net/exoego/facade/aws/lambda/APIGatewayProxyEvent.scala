package net.exoego.facade.aws.lambda
import scala.scalajs.js
import scala.scalajs.js.annotation.JSBracketAccess
import scala.scalajs.js.|

@js.native
trait APIGatewayEventRequestContext extends js.Object {
  var accountId: String = js.native
  var apiId: String = js.native
  var authorizer: AuthResponseContext | Null = js.native
  var connectedAt: Double = js.native
  var connectionId: String = js.native
  var domainName: String = js.native
  var domainPrefix: String = js.native
  var eventType: String = js.native
  var extendedRequestId: String = js.native
  var httpMethod: String = js.native
  var identity: APIGatewayEventRequestContext.Identity = js.native
  var messageDirection: String = js.native
  var messageId: String | Null = js.native
  var path: String = js.native
  var stage: String = js.native
  var requestId: String = js.native
  var requestTime: String = js.native
  var requestTimeEpoch: Double = js.native
  var resourceId: String = js.native
  var resourcePath: String = js.native
  var routeKey: String = js.native
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

  @js.native
  trait Headers extends js.Object {

    @JSBracketAccess
    def apply(name: String): String = js.native

    @JSBracketAccess
    def update(name: String, v: String): Unit = js.native
  }

  @js.native
  trait MultiValueHeaders extends js.Object {

    @JSBracketAccess
    def apply(name: String): js.Array[String] = js.native

    @JSBracketAccess
    def update(name: String, v: js.Array[String]): Unit = js.native
  }
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
  var queryStringParameters: ALBEvent.QueryStringParameters = js.native
  var headers: ALBEvent.Headers = js.native

  var multiValueQueryStringParameters
      : ALBEvent.MultiValueQueryStringParameters = js.native
  var multiValueHeaders: ALBEvent.MultiValueHeaders = js.native
  var body: String | Null = js.native
  var isBase64Encoded: Boolean = js.native
}

object ALBEvent {

  @js.native
  trait QueryStringParameters extends js.Object {

    @JSBracketAccess
    def apply(parameter: String): String = js.native

    @JSBracketAccess
    def update(parameter: String, v: String): Unit = js.native
  }

  @js.native
  trait Headers extends js.Object {

    @JSBracketAccess
    def apply(header: String): String = js.native

    @JSBracketAccess
    def update(header: String, v: String): Unit = js.native
  }

  @js.native
  trait MultiValueQueryStringParameters extends js.Object {

    @JSBracketAccess
    def apply(parameter: String): js.Array[String] = js.native

    @JSBracketAccess
    def update(parameter: String, v: js.Array[String]): Unit = js.native
  }

  @js.native
  trait MultiValueHeaders extends js.Object {

    @JSBracketAccess
    def apply(header: String): js.Array[String] = js.native

    @JSBracketAccess
    def update(header: String, v: js.Array[String]): Unit = js.native
  }
}

@js.native
trait CustomAuthorizerEvent extends js.Object {
  var `type`: String = js.native
  var methodArn: String = js.native
  var authorizationToken: String = js.native
  var resource: String = js.native
  var path: String = js.native
  var httpMethod: String = js.native
  var headers: CustomAuthorizerEvent.Headers = js.native
  var multiValueHeaders: CustomAuthorizerEvent.MultiValueHeaders = js.native
  var pathParameters: js.Dictionary[String] | Null = js.native
  var queryStringParameters: js.Dictionary[String] | Null = js.native

  var multiValueQueryStringParameters: js.Dictionary[js.Array[String]] | Null =
    js.native
  var stageVariables: CustomAuthorizerEvent.StageVariables = js.native
  var requestContext: APIGatewayEventRequestContext = js.native
  var domainName: String = js.native
  var apiId: String = js.native
}

object CustomAuthorizerEvent {

  @js.native
  trait Headers extends js.Object {

    @JSBracketAccess
    def apply(name: String): String = js.native

    @JSBracketAccess
    def update(name: String, v: String): Unit = js.native
  }

  @js.native
  trait MultiValueHeaders extends js.Object {

    @JSBracketAccess
    def apply(name: String): js.Array[String] = js.native

    @JSBracketAccess
    def update(name: String, v: js.Array[String]): Unit = js.native
  }

  @js.native
  trait StageVariables extends js.Object {

    @JSBracketAccess
    def apply(name: String): String = js.native

    @JSBracketAccess
    def update(name: String, v: String): Unit = js.native
  }
}

@js.native
trait AttributeValue extends js.Object {
  var B: String = js.native
  var BS: js.Array[String] = js.native
  var BOOL: Boolean = js.native
  var L: js.Array[AttributeValue] = js.native
  var M: AttributeValue.M = js.native
  var N: String = js.native
  var NS: js.Array[String] = js.native
  var NULL: Boolean = js.native
  var S: String = js.native
  var SS: js.Array[String] = js.native
}

object AttributeValue {

  @js.native
  trait M extends js.Object {

    @JSBracketAccess
    def apply(id: String): AttributeValue = js.native

    @JSBracketAccess
    def update(id: String, v: AttributeValue): Unit = js.native
  }
}

@js.native
trait StreamRecord extends js.Object {
  var ApproximateCreationDateTime: Double = js.native
  var Keys: StreamRecord.Keys = js.native
  var NewImage: StreamRecord.NewImage = js.native
  var OldImage: StreamRecord.OldImage = js.native
  var SequenceNumber: String = js.native
  var SizeBytes: Double = js.native
  var StreamViewType: String = js.native
}

object StreamRecord {

  @js.native
  trait Keys extends js.Object {

    @JSBracketAccess
    def apply(key: String): AttributeValue = js.native

    @JSBracketAccess
    def update(key: String, v: AttributeValue): Unit = js.native
  }

  @js.native
  trait NewImage extends js.Object {

    @JSBracketAccess
    def apply(key: String): AttributeValue = js.native

    @JSBracketAccess
    def update(key: String, v: AttributeValue): Unit = js.native
  }

  @js.native
  trait OldImage extends js.Object {

    @JSBracketAccess
    def apply(key: String): AttributeValue = js.native

    @JSBracketAccess
    def update(key: String, v: AttributeValue): Unit = js.native
  }
}

@js.native
trait DynamoDBRecord extends js.Object {
  var awsRegion: String = js.native
  var dynamodb: StreamRecord = js.native
  var eventID: String = js.native
  var eventName: String = js.native
  var eventSource: String = js.native
  var eventSourceARN: String = js.native
  var eventVersion: String = js.native
  var userIdentity: js.Any = js.native
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
trait SNSMessageAttributes extends js.Object {

  @JSBracketAccess
  def apply(name: String): SNSMessageAttribute = js.native

  @JSBracketAccess
  def update(name: String, v: SNSMessageAttribute): Unit = js.native
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
  var userName: String = js.native
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
    var validationData: Request.ValidationData = js.native
    var codeParameter: String = js.native
    var linkParameter: String = js.native
    var usernameParameter: String = js.native
    var newDeviceUsed: Boolean = js.native
    var session: js.Array[js.Any] = js.native
    var challengeName: String = js.native

    var privateChallengeParameters: Request.PrivateChallengeParameters =
      js.native
    var challengeAnswer: String = js.native
    var password: String = js.native
  }

  object Request {

    @js.native
    trait UserAttributes extends js.Object {

      @JSBracketAccess
      def apply(key: String): String = js.native

      @JSBracketAccess
      def update(key: String, v: String): Unit = js.native
    }

    @js.native
    trait ValidationData extends js.Object {

      @JSBracketAccess
      def apply(key: String): String = js.native

      @JSBracketAccess
      def update(key: String, v: String): Unit = js.native
    }

    @js.native
    trait PrivateChallengeParameters extends js.Object {

      @JSBracketAccess
      def apply(key: String): String = js.native

      @JSBracketAccess
      def update(key: String, v: String): Unit = js.native
    }
  }

  @js.native
  trait Response extends js.Object {
    var autoConfirmUser: Boolean = js.native
    var autoVerifyPhone: Boolean = js.native
    var autoVerifyEmail: Boolean = js.native
    var smsMessage: String = js.native
    var emailMessage: String = js.native
    var emailSubject: String = js.native
    var challengeName: String = js.native
    var issueTokens: Boolean = js.native
    var failAuthentication: Boolean = js.native

    var publicChallengeParameters: Response.PublicChallengeParameters =
      js.native

    var privateChallengeParameters: Response.PrivateChallengeParameters =
      js.native
    var challengeMetadata: String = js.native
    var answerCorrect: Boolean = js.native
    var userAttributes: Response.UserAttributes = js.native
    var finalUserStatus: String = js.native
    var messageAction: String = js.native
    var desiredDeliveryMediums: js.Array[String] = js.native
    var forceAliasCreation: Boolean = js.native
    var claimsOverrideDetails: Response.ClaimsOverrideDetails = js.native
  }

  object Response {

    @js.native
    trait PublicChallengeParameters extends js.Object {

      @JSBracketAccess
      def apply(key: String): String = js.native

      @JSBracketAccess
      def update(key: String, v: String): Unit = js.native
    }

    @js.native
    trait PrivateChallengeParameters extends js.Object {

      @JSBracketAccess
      def apply(key: String): String = js.native

      @JSBracketAccess
      def update(key: String, v: String): Unit = js.native
    }

    @js.native
    trait UserAttributes extends js.Object {

      @JSBracketAccess
      def apply(key: String): String = js.native

      @JSBracketAccess
      def update(key: String, v: String): Unit = js.native
    }

    @js.native
    trait ClaimsOverrideDetails extends js.Object {

      var claimsToAddOrOverride: ClaimsOverrideDetails.ClaimsToAddOrOverride =
        js.native
      var claimsToSuppress: js.Array[String] = js.native
      var groupOverrideDetails: Null | js.Any = js.native
    }

    object ClaimsOverrideDetails {

      @js.native
      trait ClaimsToAddOrOverride extends js.Object {

        @JSBracketAccess
        def apply(key: String): String = js.native

        @JSBracketAccess
        def update(key: String, v: String): Unit = js.native
      }
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

  @js.native
  trait ResourceProperties extends js.Object {
    var ServiceToken: String = js.native

    @JSBracketAccess
    def apply(Key: String): js.Any = js.native

    @JSBracketAccess
    def update(Key: String, v: js.Any): Unit = js.native
  }
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

  @js.native
  trait OldResourceProperties extends js.Object {

    @JSBracketAccess
    def apply(Key: String): js.Any = js.native

    @JSBracketAccess
    def update(Key: String, v: js.Any): Unit = js.native
  }
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
  var Data: CloudFormationCustomResourceResponseCommon.Data = js.native
}

object CloudFormationCustomResourceResponseCommon {

  @js.native
  trait Data extends js.Object {

    @JSBracketAccess
    def apply(Key: String): js.Any = js.native

    @JSBracketAccess
    def update(Key: String, v: js.Any): Unit = js.native
  }
}

@js.native
trait CloudFormationCustomResourceSuccessResponse
    extends CloudFormationCustomResourceResponseCommon {
  var Status: String = js.native
  var Reason: String = js.native
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
  var extractedFields: CloudWatchLogsLogEvent.ExtractedFields = js.native
}

object CloudWatchLogsLogEvent {

  @js.native
  trait ExtractedFields extends js.Object {

    @JSBracketAccess
    def apply(key: String): String = js.native

    @JSBracketAccess
    def update(key: String, v: String): Unit = js.native
  }
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
  var identity: CognitoIdentity = js.native
  var clientContext: ClientContext = js.native
  def getRemainingTimeInMillis(): Double = js.native
  def done(error: Error = ???, result: js.Any = ???): Unit = js.native
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
  var Custom: js.Any = js.native
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
  var headers: APIGatewayProxyResult.Headers = js.native
  var multiValueHeaders: APIGatewayProxyResult.MultiValueHeaders = js.native
  var body: String = js.native
  var isBase64Encoded: Boolean = js.native
}

object APIGatewayProxyResult {

  @js.native
  trait Headers extends js.Object {

    @JSBracketAccess
    def apply(header: String): Boolean | Double | String = js.native

    @JSBracketAccess
    def update(header: String, v: Boolean | Double | String): Unit = js.native
  }

  @js.native
  trait MultiValueHeaders extends js.Object {

    @JSBracketAccess
    def apply(header: String): js.Array[Boolean | Double | String] = js.native

    @JSBracketAccess
    def update(header: String, v: js.Array[Boolean | Double | String]): Unit =
      js.native
  }
}

@js.native
trait ALBResult extends js.Object {
  var statusCode: Double = js.native
  var statusDescription: String = js.native
  var headers: ALBResult.Headers = js.native
  var multiValueHeaders: ALBResult.MultiValueHeaders = js.native
  var body: String = js.native
  var isBase64Encoded: Boolean = js.native
}

object ALBResult {

  @js.native
  trait Headers extends js.Object {

    @JSBracketAccess
    def apply(header: String): Boolean | Double | String = js.native

    @JSBracketAccess
    def update(header: String, v: Boolean | Double | String): Unit = js.native
  }

  @js.native
  trait MultiValueHeaders extends js.Object {

    @JSBracketAccess
    def apply(header: String): js.Array[Boolean | Double | String] = js.native

    @JSBracketAccess
    def update(header: String, v: js.Array[Boolean | Double | String]): Unit =
      js.native
  }
}

@js.native
trait CustomAuthorizerResult extends js.Object {
  var principalId: String = js.native
  var policyDocument: PolicyDocument = js.native
  var context: AuthResponseContext = js.native
  var usageIdentifierKey: String = js.native
}

@js.native
trait PolicyDocument extends js.Object {
  var Version: String = js.native
  var Id: String = js.native
  var Statement: js.Array[Statement] = js.native
}

@js.native
trait ConditionBlock extends js.Object {

  @JSBracketAccess
  def apply(condition: String): Condition | js.Array[Condition] = js.native

  @JSBracketAccess
  def update(condition: String, v: Condition | js.Array[Condition]): Unit =
    js.native
}

@js.native
trait Condition extends js.Object {

  @JSBracketAccess
  def apply(key: String): String | js.Array[String] = js.native

  @JSBracketAccess
  def update(key: String, v: String | js.Array[String]): Unit = js.native
}

@js.native
trait BaseStatement extends js.Object {
  var Effect: String = js.native
  var Sid: String = js.native
  var Condition: ConditionBlock = js.native
}

@js.native
trait MaybeStatementPrincipal extends js.Object {
  var Principal: PrincipalValue = js.native
  var NotPrincipal: PrincipalValue = js.native
}

@js.native
trait MaybeStatementResource extends js.Object {
  var Resource: String | js.Array[String] = js.native
  var NotResource: String | js.Array[String] = js.native
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
  var sessionToken: String = js.native
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
      var encryptionKey: EncryptionKey with js.Any = js.native
      var continuationToken: String = js.native
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
trait CloudFrontHeaders extends js.Object {

  @JSBracketAccess
  def apply(name: String): js.Array[js.Any] = js.native

  @JSBracketAccess
  def update(name: String, v: js.Array[js.Any]): Unit = js.native
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
  var origin: CloudFrontOrigin = js.native
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
  var statusDescription: String = js.native
  var headers: CloudFrontHeaders = js.native
  var bodyEncoding: String = js.native
  var body: String = js.native
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
  var kinesisRecordMetadata: FirehoseRecordMetadata = js.native
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
  var stringValue: String = js.native
  var binaryValue: String = js.native
  var stringListValues: js.Array[Nothing] = js.native
  var binaryListValues: js.Array[Nothing] = js.native
  var dataType: SQSMessageAttributeDataType = js.native
}

@js.native
trait SQSMessageAttributes extends js.Object {

  @JSBracketAccess
  def apply(name: String): SQSMessageAttribute = js.native

  @JSBracketAccess
  def update(name: String, v: SQSMessageAttribute): Unit = js.native
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

    @js.native
    trait Slots extends js.Object {

      @JSBracketAccess
      def apply(name: String): String | Null = js.native

      @JSBracketAccess
      def update(name: String, v: String | Null): Unit = js.native
    }
  }

  @js.native
  trait Bot extends js.Object {
    var name: String = js.native
    var alias: String = js.native
    var version: String = js.native
  }

  @js.native
  trait SessionAttributes extends js.Object {

    @JSBracketAccess
    def apply(key: String): String = js.native

    @JSBracketAccess
    def update(key: String, v: String): Unit = js.native
  }
}

@js.native
trait LexSlotResolution extends js.Object {
  var value: String = js.native
}

@js.native
trait LexSlotDetails extends js.Object {

  @JSBracketAccess
  def apply(name: String): js.Any = js.native

  @JSBracketAccess
  def update(name: String, v: js.Any): Unit = js.native
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
  var message: LexDialogActionBase.Message = js.native
  var responseCard: LexDialogActionBase.ResponseCard = js.native
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
  override var `type`: String = js.native
  var fulfillmentState: String = js.native
}

@js.native
trait LexDialogActionElicitIntent extends LexDialogActionBase {
  override var `type`: String = js.native
}

@js.native
trait LexDialogActionElicitSlot extends LexDialogActionBase {
  override var `type`: String = js.native
  var intentName: String = js.native
  var slots: LexDialogActionElicitSlot.Slots = js.native
  var slotToElicit: String = js.native
}

object LexDialogActionElicitSlot {

  @js.native
  trait Slots extends js.Object {

    @JSBracketAccess
    def apply(name: String): String | Null = js.native

    @JSBracketAccess
    def update(name: String, v: String | Null): Unit = js.native
  }
}

@js.native
trait LexDialogActionConfirmIntent extends LexDialogActionBase {
  override var `type`: String = js.native
  var intentName: String = js.native
  var slots: LexDialogActionConfirmIntent.Slots = js.native
}

object LexDialogActionConfirmIntent {

  @js.native
  trait Slots extends js.Object {

    @JSBracketAccess
    def apply(name: String): String | Null = js.native

    @JSBracketAccess
    def update(name: String, v: String | Null): Unit = js.native
  }
}

@js.native
trait LexDialogActionDelegate extends js.Object {
  var `type`: String = js.native
  var slots: LexDialogActionDelegate.Slots = js.native
}

object LexDialogActionDelegate {

  @js.native
  trait Slots extends js.Object {

    @JSBracketAccess
    def apply(name: String): String | Null = js.native

    @JSBracketAccess
    def update(name: String, v: String | Null): Unit = js.native
  }
}

@js.native
trait LexResult extends js.Object {
  var sessionAttributes: LexResult.SessionAttributes = js.native
  var dialogAction: LexDialogAction = js.native
}

object LexResult {

  @js.native
  trait SessionAttributes extends js.Object {

    @JSBracketAccess
    def apply(key: String): String = js.native

    @JSBracketAccess
    def update(key: String, v: String): Unit = js.native
  }
}
