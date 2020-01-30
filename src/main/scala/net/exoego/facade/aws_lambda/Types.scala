package net.exoego.facade.aws_lambda
import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait APIGatewayEventRequestContext extends js.Object {
  var accountId: String = js.native
  var apiId: String = js.native
  var authorizer: js.UndefOr[AuthResponseContext | Null] = js.native
  var connectedAt: js.UndefOr[Double] = js.native
  var connectionId: js.UndefOr[String] = js.native
  var domainName: js.UndefOr[String] = js.native
  var domainPrefix: js.UndefOr[String] = js.native
  var eventType: js.UndefOr[String] = js.native
  var extendedRequestId: js.UndefOr[String] = js.native
  var httpMethod: String = js.native
  var identity: APIGatewayEventRequestContext.Identity = js.native
  var messageDirection: js.UndefOr[String] = js.native
  var messageId: js.UndefOr[String | Null] = js.native
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
  def apply(
      accountId: String,
      apiId: String,
      httpMethod: String,
      identity: APIGatewayEventRequestContext.Identity,
      path: String,
      stage: String,
      requestId: String,
      requestTimeEpoch: Double,
      resourceId: String,
      resourcePath: String,
      authorizer: js.UndefOr[AuthResponseContext | Null] = js.undefined,
      connectedAt: js.UndefOr[Double] = js.undefined,
      connectionId: js.UndefOr[String] = js.undefined,
      domainName: js.UndefOr[String] = js.undefined,
      domainPrefix: js.UndefOr[String] = js.undefined,
      eventType: js.UndefOr[String] = js.undefined,
      extendedRequestId: js.UndefOr[String] = js.undefined,
      messageDirection: js.UndefOr[String] = js.undefined,
      messageId: js.UndefOr[String | Null] = js.undefined,
      requestTime: js.UndefOr[String] = js.undefined,
      routeKey: js.UndefOr[String] = js.undefined
  ): APIGatewayEventRequestContext = {
    val _obj$ = js.Dynamic.literal(
      "accountId" -> accountId.asInstanceOf[js.Any],
      "apiId" -> apiId.asInstanceOf[js.Any],
      "httpMethod" -> httpMethod.asInstanceOf[js.Any],
      "identity" -> identity.asInstanceOf[js.Any],
      "path" -> path.asInstanceOf[js.Any],
      "stage" -> stage.asInstanceOf[js.Any],
      "requestId" -> requestId.asInstanceOf[js.Any],
      "requestTimeEpoch" -> requestTimeEpoch.asInstanceOf[js.Any],
      "resourceId" -> resourceId.asInstanceOf[js.Any],
      "resourcePath" -> resourcePath.asInstanceOf[js.Any]
    )
    authorizer.foreach(_v =>
      _obj$.updateDynamic("authorizer")(_v.asInstanceOf[js.Any])
    )
    connectedAt.foreach(_v =>
      _obj$.updateDynamic("connectedAt")(_v.asInstanceOf[js.Any])
    )
    connectionId.foreach(_v =>
      _obj$.updateDynamic("connectionId")(_v.asInstanceOf[js.Any])
    )
    domainName.foreach(_v =>
      _obj$.updateDynamic("domainName")(_v.asInstanceOf[js.Any])
    )
    domainPrefix.foreach(_v =>
      _obj$.updateDynamic("domainPrefix")(_v.asInstanceOf[js.Any])
    )
    eventType.foreach(_v =>
      _obj$.updateDynamic("eventType")(_v.asInstanceOf[js.Any])
    )
    extendedRequestId.foreach(_v =>
      _obj$.updateDynamic("extendedRequestId")(_v.asInstanceOf[js.Any])
    )
    messageDirection.foreach(_v =>
      _obj$.updateDynamic("messageDirection")(_v.asInstanceOf[js.Any])
    )
    messageId.foreach(_v =>
      _obj$.updateDynamic("messageId")(_v.asInstanceOf[js.Any])
    )
    requestTime.foreach(_v =>
      _obj$.updateDynamic("requestTime")(_v.asInstanceOf[js.Any])
    )
    routeKey.foreach(_v =>
      _obj$.updateDynamic("routeKey")(_v.asInstanceOf[js.Any])
    )
    _obj$.asInstanceOf[APIGatewayEventRequestContext]
  }

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
    var principalOrgId: String | Null = js.native
    var sourceIp: String = js.native
    var user: String | Null = js.native
    var userAgent: String | Null = js.native
    var userArn: String | Null = js.native
  }

  object Identity {
    def apply(
        sourceIp: String,
        accessKey: String | Null = null,
        accountId: String | Null = null,
        apiKey: String | Null = null,
        apiKeyId: String | Null = null,
        caller: String | Null = null,
        cognitoAuthenticationProvider: String | Null = null,
        cognitoAuthenticationType: String | Null = null,
        cognitoIdentityId: String | Null = null,
        cognitoIdentityPoolId: String | Null = null,
        principalOrgId: String | Null = null,
        user: String | Null = null,
        userAgent: String | Null = null,
        userArn: String | Null = null
    ): Identity = {
      val _obj$ = js.Dynamic.literal(
        "accessKey" -> accessKey.asInstanceOf[js.Any],
        "accountId" -> accountId.asInstanceOf[js.Any],
        "apiKey" -> apiKey.asInstanceOf[js.Any],
        "apiKeyId" -> apiKeyId.asInstanceOf[js.Any],
        "caller" -> caller.asInstanceOf[js.Any],
        "cognitoAuthenticationProvider" -> cognitoAuthenticationProvider
          .asInstanceOf[js.Any],
        "cognitoAuthenticationType" -> cognitoAuthenticationType
          .asInstanceOf[js.Any],
        "cognitoIdentityId" -> cognitoIdentityId.asInstanceOf[js.Any],
        "cognitoIdentityPoolId" -> cognitoIdentityPoolId.asInstanceOf[js.Any],
        "principalOrgId" -> principalOrgId.asInstanceOf[js.Any],
        "sourceIp" -> sourceIp.asInstanceOf[js.Any],
        "user" -> user.asInstanceOf[js.Any],
        "userAgent" -> userAgent.asInstanceOf[js.Any],
        "userArn" -> userArn.asInstanceOf[js.Any]
      )
      _obj$.asInstanceOf[Identity]
    }
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
  def apply(
      headers: APIGatewayProxyEvent.Headers,
      multiValueHeaders: APIGatewayProxyEvent.MultiValueHeaders,
      httpMethod: String,
      isBase64Encoded: Boolean,
      path: String,
      requestContext: APIGatewayEventRequestContext,
      resource: String,
      body: String | Null = null,
      pathParameters: js.Dictionary[String] | Null = null,
      queryStringParameters: js.Dictionary[String] | Null = null,
      multiValueQueryStringParameters: js.Dictionary[js.Array[String]] | Null =
        null,
      stageVariables: js.Dictionary[String] | Null = null
  ): APIGatewayProxyEvent = {
    val _obj$ = js.Dynamic.literal(
      "body" -> body.asInstanceOf[js.Any],
      "headers" -> headers.asInstanceOf[js.Any],
      "multiValueHeaders" -> multiValueHeaders.asInstanceOf[js.Any],
      "httpMethod" -> httpMethod.asInstanceOf[js.Any],
      "isBase64Encoded" -> isBase64Encoded.asInstanceOf[js.Any],
      "path" -> path.asInstanceOf[js.Any],
      "pathParameters" -> pathParameters.asInstanceOf[js.Any],
      "queryStringParameters" -> queryStringParameters.asInstanceOf[js.Any],
      "multiValueQueryStringParameters" -> multiValueQueryStringParameters
        .asInstanceOf[js.Any],
      "stageVariables" -> stageVariables.asInstanceOf[js.Any],
      "requestContext" -> requestContext.asInstanceOf[js.Any],
      "resource" -> resource.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[APIGatewayProxyEvent]
  }
  type Headers = js.Dictionary[String]
  type MultiValueHeaders = js.Dictionary[js.Array[String]]
}

@js.native
trait ALBEventRequestContext extends js.Object {
  var elb: ALBEventRequestContext.Elb = js.native
}

object ALBEventRequestContext {
  def apply(
      elb: ALBEventRequestContext.Elb
  ): ALBEventRequestContext = {
    val _obj$ = js.Dynamic.literal(
      "elb" -> elb.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[ALBEventRequestContext]
  }

  @js.native
  trait Elb extends js.Object {
    var targetGroupArn: String = js.native
  }

  object Elb {
    def apply(
        targetGroupArn: String
    ): Elb = {
      val _obj$ = js.Dynamic.literal(
        "targetGroupArn" -> targetGroupArn.asInstanceOf[js.Any]
      )
      _obj$.asInstanceOf[Elb]
    }
  }
}

@js.native
trait ALBEvent extends js.Object {
  var requestContext: ALBEventRequestContext = js.native
  var httpMethod: String = js.native
  var path: String = js.native
  var queryStringParameters: js.UndefOr[ALBEvent.QueryStringParameters] =
    js.native
  var headers: js.UndefOr[ALBEvent.Headers] = js.native
  var multiValueQueryStringParameters
      : js.UndefOr[ALBEvent.MultiValueQueryStringParameters] = js.native
  var multiValueHeaders: js.UndefOr[ALBEvent.MultiValueHeaders] = js.native
  var body: String | Null = js.native
  var isBase64Encoded: Boolean = js.native
}

object ALBEvent {
  def apply(
      requestContext: ALBEventRequestContext,
      httpMethod: String,
      path: String,
      isBase64Encoded: Boolean,
      body: String | Null = null,
      queryStringParameters: js.UndefOr[ALBEvent.QueryStringParameters] =
        js.undefined,
      headers: js.UndefOr[ALBEvent.Headers] = js.undefined,
      multiValueQueryStringParameters: js.UndefOr[
        ALBEvent.MultiValueQueryStringParameters
      ] = js.undefined,
      multiValueHeaders: js.UndefOr[ALBEvent.MultiValueHeaders] = js.undefined
  ): ALBEvent = {
    val _obj$ = js.Dynamic.literal(
      "requestContext" -> requestContext.asInstanceOf[js.Any],
      "httpMethod" -> httpMethod.asInstanceOf[js.Any],
      "path" -> path.asInstanceOf[js.Any],
      "body" -> body.asInstanceOf[js.Any],
      "isBase64Encoded" -> isBase64Encoded.asInstanceOf[js.Any]
    )
    queryStringParameters.foreach(_v =>
      _obj$.updateDynamic("queryStringParameters")(_v.asInstanceOf[js.Any])
    )
    headers.foreach(_v =>
      _obj$.updateDynamic("headers")(_v.asInstanceOf[js.Any])
    )
    multiValueQueryStringParameters.foreach(_v =>
      _obj$.updateDynamic("multiValueQueryStringParameters")(
        _v.asInstanceOf[js.Any]
      )
    )
    multiValueHeaders.foreach(_v =>
      _obj$.updateDynamic("multiValueHeaders")(_v.asInstanceOf[js.Any])
    )
    _obj$.asInstanceOf[ALBEvent]
  }
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
  var headers: js.UndefOr[CustomAuthorizerEvent.Headers] = js.native
  var multiValueHeaders: js.UndefOr[CustomAuthorizerEvent.MultiValueHeaders] =
    js.native
  var pathParameters: js.UndefOr[js.Dictionary[String] | Null] = js.native
  var queryStringParameters: js.UndefOr[js.Dictionary[String] | Null] =
    js.native
  var multiValueQueryStringParameters
      : js.UndefOr[js.Dictionary[js.Array[String]] | Null] = js.native
  var stageVariables: js.UndefOr[CustomAuthorizerEvent.StageVariables] =
    js.native
  var requestContext: js.UndefOr[APIGatewayEventRequestContext] = js.native
  var domainName: js.UndefOr[String] = js.native
  var apiId: js.UndefOr[String] = js.native
}

object CustomAuthorizerEvent {
  def apply(
      `type`: String,
      methodArn: String,
      authorizationToken: js.UndefOr[String] = js.undefined,
      resource: js.UndefOr[String] = js.undefined,
      path: js.UndefOr[String] = js.undefined,
      httpMethod: js.UndefOr[String] = js.undefined,
      headers: js.UndefOr[CustomAuthorizerEvent.Headers] = js.undefined,
      multiValueHeaders: js.UndefOr[CustomAuthorizerEvent.MultiValueHeaders] =
        js.undefined,
      pathParameters: js.UndefOr[js.Dictionary[String] | Null] = js.undefined,
      queryStringParameters: js.UndefOr[js.Dictionary[String] | Null] =
        js.undefined,
      multiValueQueryStringParameters: js.UndefOr[
        js.Dictionary[js.Array[String]] | Null
      ] = js.undefined,
      stageVariables: js.UndefOr[CustomAuthorizerEvent.StageVariables] =
        js.undefined,
      requestContext: js.UndefOr[APIGatewayEventRequestContext] = js.undefined,
      domainName: js.UndefOr[String] = js.undefined,
      apiId: js.UndefOr[String] = js.undefined
  ): CustomAuthorizerEvent = {
    val _obj$ = js.Dynamic.literal(
      "type" -> `type`.asInstanceOf[js.Any],
      "methodArn" -> methodArn.asInstanceOf[js.Any]
    )
    authorizationToken.foreach(_v =>
      _obj$.updateDynamic("authorizationToken")(_v.asInstanceOf[js.Any])
    )
    resource.foreach(_v =>
      _obj$.updateDynamic("resource")(_v.asInstanceOf[js.Any])
    )
    path.foreach(_v => _obj$.updateDynamic("path")(_v.asInstanceOf[js.Any]))
    httpMethod.foreach(_v =>
      _obj$.updateDynamic("httpMethod")(_v.asInstanceOf[js.Any])
    )
    headers.foreach(_v =>
      _obj$.updateDynamic("headers")(_v.asInstanceOf[js.Any])
    )
    multiValueHeaders.foreach(_v =>
      _obj$.updateDynamic("multiValueHeaders")(_v.asInstanceOf[js.Any])
    )
    pathParameters.foreach(_v =>
      _obj$.updateDynamic("pathParameters")(_v.asInstanceOf[js.Any])
    )
    queryStringParameters.foreach(_v =>
      _obj$.updateDynamic("queryStringParameters")(_v.asInstanceOf[js.Any])
    )
    multiValueQueryStringParameters.foreach(_v =>
      _obj$.updateDynamic("multiValueQueryStringParameters")(
        _v.asInstanceOf[js.Any]
      )
    )
    stageVariables.foreach(_v =>
      _obj$.updateDynamic("stageVariables")(_v.asInstanceOf[js.Any])
    )
    requestContext.foreach(_v =>
      _obj$.updateDynamic("requestContext")(_v.asInstanceOf[js.Any])
    )
    domainName.foreach(_v =>
      _obj$.updateDynamic("domainName")(_v.asInstanceOf[js.Any])
    )
    apiId.foreach(_v => _obj$.updateDynamic("apiId")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[CustomAuthorizerEvent]
  }
  type Headers = js.Dictionary[String]
  type MultiValueHeaders = js.Dictionary[String]
  type StageVariables = js.Dictionary[String]
  type PathParameters = js.Dictionary[String]
  type QueryStringParameters = js.Dictionary[String]
  type MultiValueQueryStringParameters = js.Dictionary[js.Array[String]]
}

@js.native
trait StreamRecord extends js.Object {
  var ApproximateCreationDateTime: js.UndefOr[Double] = js.native
  var Keys: js.UndefOr[StreamRecord.Keys] = js.native
  var NewImage: js.UndefOr[StreamRecord.NewImage] = js.native
  var OldImage: js.UndefOr[StreamRecord.OldImage] = js.native
  var SequenceNumber: js.UndefOr[String] = js.native
  var SizeBytes: js.UndefOr[Double] = js.native
  var StreamViewType: js.UndefOr[String] = js.native
}

object StreamRecord {
  def apply(
      ApproximateCreationDateTime: js.UndefOr[Double] = js.undefined,
      Keys: js.UndefOr[StreamRecord.Keys] = js.undefined,
      NewImage: js.UndefOr[StreamRecord.NewImage] = js.undefined,
      OldImage: js.UndefOr[StreamRecord.OldImage] = js.undefined,
      SequenceNumber: js.UndefOr[String] = js.undefined,
      SizeBytes: js.UndefOr[Double] = js.undefined,
      StreamViewType: js.UndefOr[String] = js.undefined
  ): StreamRecord = {
    val _obj$ = js.Dynamic.literal(
      )
    ApproximateCreationDateTime.foreach(_v =>
      _obj$.updateDynamic("ApproximateCreationDateTime")(
        _v.asInstanceOf[js.Any]
      )
    )
    Keys.foreach(_v => _obj$.updateDynamic("Keys")(_v.asInstanceOf[js.Any]))
    NewImage.foreach(_v =>
      _obj$.updateDynamic("NewImage")(_v.asInstanceOf[js.Any])
    )
    OldImage.foreach(_v =>
      _obj$.updateDynamic("OldImage")(_v.asInstanceOf[js.Any])
    )
    SequenceNumber.foreach(_v =>
      _obj$.updateDynamic("SequenceNumber")(_v.asInstanceOf[js.Any])
    )
    SizeBytes.foreach(_v =>
      _obj$.updateDynamic("SizeBytes")(_v.asInstanceOf[js.Any])
    )
    StreamViewType.foreach(_v =>
      _obj$.updateDynamic("StreamViewType")(_v.asInstanceOf[js.Any])
    )
    _obj$.asInstanceOf[StreamRecord]
  }
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

object DynamoDBRecord {
  def apply(
      awsRegion: js.UndefOr[String] = js.undefined,
      dynamodb: js.UndefOr[StreamRecord] = js.undefined,
      eventID: js.UndefOr[String] = js.undefined,
      eventName: js.UndefOr[String] = js.undefined,
      eventSource: js.UndefOr[String] = js.undefined,
      eventSourceARN: js.UndefOr[String] = js.undefined,
      eventVersion: js.UndefOr[String] = js.undefined,
      userIdentity: js.UndefOr[js.Any] = js.undefined
  ): DynamoDBRecord = {
    val _obj$ = js.Dynamic.literal(
      )
    awsRegion.foreach(_v =>
      _obj$.updateDynamic("awsRegion")(_v.asInstanceOf[js.Any])
    )
    dynamodb.foreach(_v =>
      _obj$.updateDynamic("dynamodb")(_v.asInstanceOf[js.Any])
    )
    eventID.foreach(_v =>
      _obj$.updateDynamic("eventID")(_v.asInstanceOf[js.Any])
    )
    eventName.foreach(_v =>
      _obj$.updateDynamic("eventName")(_v.asInstanceOf[js.Any])
    )
    eventSource.foreach(_v =>
      _obj$.updateDynamic("eventSource")(_v.asInstanceOf[js.Any])
    )
    eventSourceARN.foreach(_v =>
      _obj$.updateDynamic("eventSourceARN")(_v.asInstanceOf[js.Any])
    )
    eventVersion.foreach(_v =>
      _obj$.updateDynamic("eventVersion")(_v.asInstanceOf[js.Any])
    )
    userIdentity.foreach(_v =>
      _obj$.updateDynamic("userIdentity")(_v.asInstanceOf[js.Any])
    )
    _obj$.asInstanceOf[DynamoDBRecord]
  }
}

@js.native
trait DynamoDBStreamEvent extends js.Object {
  var Records: js.Array[DynamoDBRecord] = js.native
}

object DynamoDBStreamEvent {
  def apply(
      Records: js.Array[DynamoDBRecord]
  ): DynamoDBStreamEvent = {
    val _obj$ = js.Dynamic.literal(
      "Records" -> Records.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[DynamoDBStreamEvent]
  }
}

@js.native
trait SNSMessageAttribute extends js.Object {
  var Type: String = js.native
  var Value: String = js.native
}

object SNSMessageAttribute {
  def apply(
      Type: String,
      Value: String
  ): SNSMessageAttribute = {
    val _obj$ = js.Dynamic.literal(
      "Type" -> Type.asInstanceOf[js.Any],
      "Value" -> Value.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[SNSMessageAttribute]
  }
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

object SNSMessage {
  def apply(
      SignatureVersion: String,
      Timestamp: String,
      Signature: String,
      SigningCertUrl: String,
      MessageId: String,
      Message: String,
      MessageAttributes: SNSMessageAttributes,
      Type: String,
      UnsubscribeUrl: String,
      TopicArn: String,
      Subject: String
  ): SNSMessage = {
    val _obj$ = js.Dynamic.literal(
      "SignatureVersion" -> SignatureVersion.asInstanceOf[js.Any],
      "Timestamp" -> Timestamp.asInstanceOf[js.Any],
      "Signature" -> Signature.asInstanceOf[js.Any],
      "SigningCertUrl" -> SigningCertUrl.asInstanceOf[js.Any],
      "MessageId" -> MessageId.asInstanceOf[js.Any],
      "Message" -> Message.asInstanceOf[js.Any],
      "MessageAttributes" -> MessageAttributes.asInstanceOf[js.Any],
      "Type" -> Type.asInstanceOf[js.Any],
      "UnsubscribeUrl" -> UnsubscribeUrl.asInstanceOf[js.Any],
      "TopicArn" -> TopicArn.asInstanceOf[js.Any],
      "Subject" -> Subject.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[SNSMessage]
  }
}

@js.native
trait SNSEventRecord extends js.Object {
  var EventVersion: String = js.native
  var EventSubscriptionArn: String = js.native
  var EventSource: String = js.native
  var Sns: SNSMessage = js.native
}

object SNSEventRecord {
  def apply(
      EventVersion: String,
      EventSubscriptionArn: String,
      EventSource: String,
      Sns: SNSMessage
  ): SNSEventRecord = {
    val _obj$ = js.Dynamic.literal(
      "EventVersion" -> EventVersion.asInstanceOf[js.Any],
      "EventSubscriptionArn" -> EventSubscriptionArn.asInstanceOf[js.Any],
      "EventSource" -> EventSource.asInstanceOf[js.Any],
      "Sns" -> Sns.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[SNSEventRecord]
  }
}

@js.native
trait SNSEvent extends js.Object {
  var Records: js.Array[SNSEventRecord] = js.native
}

object SNSEvent {
  def apply(
      Records: js.Array[SNSEventRecord]
  ): SNSEvent = {
    val _obj$ = js.Dynamic.literal(
      "Records" -> Records.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[SNSEvent]
  }
}

@js.native
trait S3EventRecordGlacierRestoreEventData extends js.Object {
  var lifecycleRestorationExpiryTime: String = js.native
  var lifecycleRestoreStorageClass: String = js.native
}

object S3EventRecordGlacierRestoreEventData {
  def apply(
      lifecycleRestorationExpiryTime: String,
      lifecycleRestoreStorageClass: String
  ): S3EventRecordGlacierRestoreEventData = {
    val _obj$ = js.Dynamic.literal(
      "lifecycleRestorationExpiryTime" -> lifecycleRestorationExpiryTime
        .asInstanceOf[js.Any],
      "lifecycleRestoreStorageClass" -> lifecycleRestoreStorageClass
        .asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[S3EventRecordGlacierRestoreEventData]
  }
}

@js.native
trait S3EventRecordGlacierEventData extends js.Object {
  var restoreEventData: S3EventRecordGlacierRestoreEventData = js.native
}

object S3EventRecordGlacierEventData {
  def apply(
      restoreEventData: S3EventRecordGlacierRestoreEventData
  ): S3EventRecordGlacierEventData = {
    val _obj$ = js.Dynamic.literal(
      "restoreEventData" -> restoreEventData.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[S3EventRecordGlacierEventData]
  }
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
  var glacierEventData: js.UndefOr[S3EventRecordGlacierEventData] = js.native
}

object S3EventRecord {
  def apply(
      eventVersion: String,
      eventSource: String,
      awsRegion: String,
      eventTime: String,
      eventName: String,
      userIdentity: S3EventRecord.UserIdentity,
      requestParameters: S3EventRecord.RequestParameters,
      responseElements: S3EventRecord.ResponseElements,
      s3: S3EventRecord.S3,
      glacierEventData: js.UndefOr[S3EventRecordGlacierEventData] = js.undefined
  ): S3EventRecord = {
    val _obj$ = js.Dynamic.literal(
      "eventVersion" -> eventVersion.asInstanceOf[js.Any],
      "eventSource" -> eventSource.asInstanceOf[js.Any],
      "awsRegion" -> awsRegion.asInstanceOf[js.Any],
      "eventTime" -> eventTime.asInstanceOf[js.Any],
      "eventName" -> eventName.asInstanceOf[js.Any],
      "userIdentity" -> userIdentity.asInstanceOf[js.Any],
      "requestParameters" -> requestParameters.asInstanceOf[js.Any],
      "responseElements" -> responseElements.asInstanceOf[js.Any],
      "s3" -> s3.asInstanceOf[js.Any]
    )
    glacierEventData.foreach(_v =>
      _obj$.updateDynamic("glacierEventData")(_v.asInstanceOf[js.Any])
    )
    _obj$.asInstanceOf[S3EventRecord]
  }

  @js.native
  trait UserIdentity extends js.Object {
    var principalId: String = js.native
  }

  object UserIdentity {
    def apply(
        principalId: String
    ): UserIdentity = {
      val _obj$ = js.Dynamic.literal(
        "principalId" -> principalId.asInstanceOf[js.Any]
      )
      _obj$.asInstanceOf[UserIdentity]
    }
  }

  @js.native
  trait RequestParameters extends js.Object {
    var sourceIPAddress: String = js.native
  }

  object RequestParameters {
    def apply(
        sourceIPAddress: String
    ): RequestParameters = {
      val _obj$ = js.Dynamic.literal(
        "sourceIPAddress" -> sourceIPAddress.asInstanceOf[js.Any]
      )
      _obj$.asInstanceOf[RequestParameters]
    }
  }

  @js.native
  trait ResponseElements extends js.Object {
    var `x-amz-request-id`: String = js.native
    var `x-amz-id-2`: String = js.native
  }

  object ResponseElements {
    def apply(
        `x-amz-request-id`: String,
        `x-amz-id-2`: String
    ): ResponseElements = {
      val _obj$ = js.Dynamic.literal(
        "x-amz-request-id" -> `x-amz-request-id`.asInstanceOf[js.Any],
        "x-amz-id-2" -> `x-amz-id-2`.asInstanceOf[js.Any]
      )
      _obj$.asInstanceOf[ResponseElements]
    }
  }

  @js.native
  trait S3 extends js.Object {
    var s3SchemaVersion: String = js.native
    var configurationId: String = js.native
    var bucket: S3.Bucket = js.native
    var `object`: S3.Object = js.native
  }

  object S3 {
    def apply(
        s3SchemaVersion: String,
        configurationId: String,
        bucket: S3.Bucket,
        `object`: S3.Object
    ): S3 = {
      val _obj$ = js.Dynamic.literal(
        "s3SchemaVersion" -> s3SchemaVersion.asInstanceOf[js.Any],
        "configurationId" -> configurationId.asInstanceOf[js.Any],
        "bucket" -> bucket.asInstanceOf[js.Any],
        "object" -> `object`.asInstanceOf[js.Any]
      )
      _obj$.asInstanceOf[S3]
    }

    @js.native
    trait Bucket extends js.Object {
      var name: String = js.native
      var ownerIdentity: Bucket.OwnerIdentity = js.native
      var arn: String = js.native
    }

    object Bucket {
      def apply(
          name: String,
          ownerIdentity: Bucket.OwnerIdentity,
          arn: String
      ): Bucket = {
        val _obj$ = js.Dynamic.literal(
          "name" -> name.asInstanceOf[js.Any],
          "ownerIdentity" -> ownerIdentity.asInstanceOf[js.Any],
          "arn" -> arn.asInstanceOf[js.Any]
        )
        _obj$.asInstanceOf[Bucket]
      }

      @js.native
      trait OwnerIdentity extends js.Object {
        var principalId: String = js.native
      }

      object OwnerIdentity {
        def apply(
            principalId: String
        ): OwnerIdentity = {
          val _obj$ = js.Dynamic.literal(
            "principalId" -> principalId.asInstanceOf[js.Any]
          )
          _obj$.asInstanceOf[OwnerIdentity]
        }
      }
    }

    @js.native
    trait Object extends js.Object {
      var key: String = js.native
      var size: Double = js.native
      var eTag: String = js.native
      var versionId: js.UndefOr[String] = js.native
      var sequencer: String = js.native
    }

    object Object {
      def apply(
          key: String,
          size: Double,
          eTag: String,
          sequencer: String,
          versionId: js.UndefOr[String] = js.undefined
      ): Object = {
        val _obj$ = js.Dynamic.literal(
          "key" -> key.asInstanceOf[js.Any],
          "size" -> size.asInstanceOf[js.Any],
          "eTag" -> eTag.asInstanceOf[js.Any],
          "sequencer" -> sequencer.asInstanceOf[js.Any]
        )
        versionId.foreach(_v =>
          _obj$.updateDynamic("versionId")(_v.asInstanceOf[js.Any])
        )
        _obj$.asInstanceOf[Object]
      }
    }
  }
}

@js.native
trait S3Event extends js.Object {
  var Records: js.Array[S3EventRecord] = js.native
}

object S3Event {
  def apply(
      Records: js.Array[S3EventRecord]
  ): S3Event = {
    val _obj$ = js.Dynamic.literal(
      "Records" -> Records.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[S3Event]
  }
}

@js.native
trait S3BatchEvent extends js.Object {
  var invocationSchemaVersion: String = js.native
  var invocationId: String = js.native
  var job: S3BatchEventJob = js.native
  var tasks: js.Array[S3BatchEventTask] = js.native
}

object S3BatchEvent {
  def apply(
      invocationSchemaVersion: String,
      invocationId: String,
      job: S3BatchEventJob,
      tasks: js.Array[S3BatchEventTask]
  ): S3BatchEvent = {
    val _obj$ = js.Dynamic.literal(
      "invocationSchemaVersion" -> invocationSchemaVersion.asInstanceOf[js.Any],
      "invocationId" -> invocationId.asInstanceOf[js.Any],
      "job" -> job.asInstanceOf[js.Any],
      "tasks" -> tasks.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[S3BatchEvent]
  }
}

@js.native
trait S3BatchEventJob extends js.Object {
  var id: String = js.native
}

object S3BatchEventJob {
  def apply(
      id: String
  ): S3BatchEventJob = {
    val _obj$ = js.Dynamic.literal(
      "id" -> id.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[S3BatchEventJob]
  }
}

@js.native
trait S3BatchEventTask extends js.Object {
  var taskId: String = js.native
  var s3Key: String = js.native
  var s3VersionId: String | Null = js.native
  var s3BucketArn: String = js.native
}

object S3BatchEventTask {
  def apply(
      taskId: String,
      s3Key: String,
      s3BucketArn: String,
      s3VersionId: String | Null = null
  ): S3BatchEventTask = {
    val _obj$ = js.Dynamic.literal(
      "taskId" -> taskId.asInstanceOf[js.Any],
      "s3Key" -> s3Key.asInstanceOf[js.Any],
      "s3VersionId" -> s3VersionId.asInstanceOf[js.Any],
      "s3BucketArn" -> s3BucketArn.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[S3BatchEventTask]
  }
}

@js.native
trait S3BatchResult extends js.Object {
  var invocationSchemaVersion: String = js.native
  var treatMissingKeysAs: S3BatchResultResultCode = js.native
  var invocationId: String = js.native
  var results: js.Array[S3BatchResultResult] = js.native
}

object S3BatchResult {
  def apply(
      invocationSchemaVersion: String,
      treatMissingKeysAs: S3BatchResultResultCode,
      invocationId: String,
      results: js.Array[S3BatchResultResult]
  ): S3BatchResult = {
    val _obj$ = js.Dynamic.literal(
      "invocationSchemaVersion" -> invocationSchemaVersion.asInstanceOf[js.Any],
      "treatMissingKeysAs" -> treatMissingKeysAs.asInstanceOf[js.Any],
      "invocationId" -> invocationId.asInstanceOf[js.Any],
      "results" -> results.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[S3BatchResult]
  }
}

@js.native
trait S3BatchResultResult extends js.Object {
  var taskId: String = js.native
  var resultCode: S3BatchResultResultCode = js.native
  var resultString: String = js.native
}

object S3BatchResultResult {
  def apply(
      taskId: String,
      resultCode: S3BatchResultResultCode,
      resultString: String
  ): S3BatchResultResult = {
    val _obj$ = js.Dynamic.literal(
      "taskId" -> taskId.asInstanceOf[js.Any],
      "resultCode" -> resultCode.asInstanceOf[js.Any],
      "resultString" -> resultString.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[S3BatchResultResult]
  }
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
  def apply(
      version: Double,
      triggerSource: String,
      region: String,
      userPoolId: String,
      callerContext: CognitoUserPoolTriggerEvent.CallerContext,
      request: CognitoUserPoolTriggerEvent.Request,
      response: CognitoUserPoolTriggerEvent.Response,
      userName: js.UndefOr[String] = js.undefined
  ): CognitoUserPoolTriggerEvent = {
    val _obj$ = js.Dynamic.literal(
      "version" -> version.asInstanceOf[js.Any],
      "triggerSource" -> triggerSource.asInstanceOf[js.Any],
      "region" -> region.asInstanceOf[js.Any],
      "userPoolId" -> userPoolId.asInstanceOf[js.Any],
      "callerContext" -> callerContext.asInstanceOf[js.Any],
      "request" -> request.asInstanceOf[js.Any],
      "response" -> response.asInstanceOf[js.Any]
    )
    userName.foreach(_v =>
      _obj$.updateDynamic("userName")(_v.asInstanceOf[js.Any])
    )
    _obj$.asInstanceOf[CognitoUserPoolTriggerEvent]
  }

  @js.native
  trait CallerContext extends js.Object {
    var awsSdkVersion: String = js.native
    var clientId: String = js.native
  }

  object CallerContext {
    def apply(
        awsSdkVersion: String,
        clientId: String
    ): CallerContext = {
      val _obj$ = js.Dynamic.literal(
        "awsSdkVersion" -> awsSdkVersion.asInstanceOf[js.Any],
        "clientId" -> clientId.asInstanceOf[js.Any]
      )
      _obj$.asInstanceOf[CallerContext]
    }
  }

  @js.native
  trait Request extends js.Object {
    var userAttributes: Request.UserAttributes = js.native
    var validationData: js.UndefOr[Request.ValidationData] = js.native
    var codeParameter: js.UndefOr[String] = js.native
    var linkParameter: js.UndefOr[String] = js.native
    var usernameParameter: js.UndefOr[String] = js.native
    var newDeviceUsed: js.UndefOr[Boolean] = js.native
    var session: js.UndefOr[js.Array[js.Any]] = js.native
    var challengeName: js.UndefOr[String] = js.native
    var privateChallengeParameters
        : js.UndefOr[Request.PrivateChallengeParameters] = js.native
    var challengeAnswer: js.UndefOr[String] = js.native
    var password: js.UndefOr[String] = js.native
  }

  object Request {
    def apply(
        userAttributes: Request.UserAttributes,
        validationData: js.UndefOr[Request.ValidationData] = js.undefined,
        codeParameter: js.UndefOr[String] = js.undefined,
        linkParameter: js.UndefOr[String] = js.undefined,
        usernameParameter: js.UndefOr[String] = js.undefined,
        newDeviceUsed: js.UndefOr[Boolean] = js.undefined,
        session: js.UndefOr[js.Array[js.Any]] = js.undefined,
        challengeName: js.UndefOr[String] = js.undefined,
        privateChallengeParameters: js.UndefOr[
          Request.PrivateChallengeParameters
        ] = js.undefined,
        challengeAnswer: js.UndefOr[String] = js.undefined,
        password: js.UndefOr[String] = js.undefined
    ): Request = {
      val _obj$ = js.Dynamic.literal(
        "userAttributes" -> userAttributes.asInstanceOf[js.Any]
      )
      validationData.foreach(_v =>
        _obj$.updateDynamic("validationData")(_v.asInstanceOf[js.Any])
      )
      codeParameter.foreach(_v =>
        _obj$.updateDynamic("codeParameter")(_v.asInstanceOf[js.Any])
      )
      linkParameter.foreach(_v =>
        _obj$.updateDynamic("linkParameter")(_v.asInstanceOf[js.Any])
      )
      usernameParameter.foreach(_v =>
        _obj$.updateDynamic("usernameParameter")(_v.asInstanceOf[js.Any])
      )
      newDeviceUsed.foreach(_v =>
        _obj$.updateDynamic("newDeviceUsed")(_v.asInstanceOf[js.Any])
      )
      session.foreach(_v =>
        _obj$.updateDynamic("session")(_v.asInstanceOf[js.Any])
      )
      challengeName.foreach(_v =>
        _obj$.updateDynamic("challengeName")(_v.asInstanceOf[js.Any])
      )
      privateChallengeParameters.foreach(_v =>
        _obj$.updateDynamic("privateChallengeParameters")(
          _v.asInstanceOf[js.Any]
        )
      )
      challengeAnswer.foreach(_v =>
        _obj$.updateDynamic("challengeAnswer")(_v.asInstanceOf[js.Any])
      )
      password.foreach(_v =>
        _obj$.updateDynamic("password")(_v.asInstanceOf[js.Any])
      )
      _obj$.asInstanceOf[Request]
    }
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
    var publicChallengeParameters
        : js.UndefOr[Response.PublicChallengeParameters] = js.native
    var privateChallengeParameters
        : js.UndefOr[Response.PrivateChallengeParameters] = js.native
    var challengeMetadata: js.UndefOr[String] = js.native
    var answerCorrect: js.UndefOr[Boolean] = js.native
    var userAttributes: js.UndefOr[Response.UserAttributes] = js.native
    var finalUserStatus: js.UndefOr[String] = js.native
    var messageAction: js.UndefOr[String] = js.native
    var desiredDeliveryMediums: js.UndefOr[js.Array[String]] = js.native
    var forceAliasCreation: js.UndefOr[Boolean] = js.native
    var claimsOverrideDetails: js.UndefOr[Response.ClaimsOverrideDetails] =
      js.native
  }

  object Response {
    def apply(
        autoConfirmUser: js.UndefOr[Boolean] = js.undefined,
        autoVerifyPhone: js.UndefOr[Boolean] = js.undefined,
        autoVerifyEmail: js.UndefOr[Boolean] = js.undefined,
        smsMessage: js.UndefOr[String] = js.undefined,
        emailMessage: js.UndefOr[String] = js.undefined,
        emailSubject: js.UndefOr[String] = js.undefined,
        challengeName: js.UndefOr[String] = js.undefined,
        issueTokens: js.UndefOr[Boolean] = js.undefined,
        failAuthentication: js.UndefOr[Boolean] = js.undefined,
        publicChallengeParameters: js.UndefOr[
          Response.PublicChallengeParameters
        ] = js.undefined,
        privateChallengeParameters: js.UndefOr[
          Response.PrivateChallengeParameters
        ] = js.undefined,
        challengeMetadata: js.UndefOr[String] = js.undefined,
        answerCorrect: js.UndefOr[Boolean] = js.undefined,
        userAttributes: js.UndefOr[Response.UserAttributes] = js.undefined,
        finalUserStatus: js.UndefOr[String] = js.undefined,
        messageAction: js.UndefOr[String] = js.undefined,
        desiredDeliveryMediums: js.UndefOr[js.Array[String]] = js.undefined,
        forceAliasCreation: js.UndefOr[Boolean] = js.undefined,
        claimsOverrideDetails: js.UndefOr[Response.ClaimsOverrideDetails] =
          js.undefined
    ): Response = {
      val _obj$ = js.Dynamic.literal(
        )
      autoConfirmUser.foreach(_v =>
        _obj$.updateDynamic("autoConfirmUser")(_v.asInstanceOf[js.Any])
      )
      autoVerifyPhone.foreach(_v =>
        _obj$.updateDynamic("autoVerifyPhone")(_v.asInstanceOf[js.Any])
      )
      autoVerifyEmail.foreach(_v =>
        _obj$.updateDynamic("autoVerifyEmail")(_v.asInstanceOf[js.Any])
      )
      smsMessage.foreach(_v =>
        _obj$.updateDynamic("smsMessage")(_v.asInstanceOf[js.Any])
      )
      emailMessage.foreach(_v =>
        _obj$.updateDynamic("emailMessage")(_v.asInstanceOf[js.Any])
      )
      emailSubject.foreach(_v =>
        _obj$.updateDynamic("emailSubject")(_v.asInstanceOf[js.Any])
      )
      challengeName.foreach(_v =>
        _obj$.updateDynamic("challengeName")(_v.asInstanceOf[js.Any])
      )
      issueTokens.foreach(_v =>
        _obj$.updateDynamic("issueTokens")(_v.asInstanceOf[js.Any])
      )
      failAuthentication.foreach(_v =>
        _obj$.updateDynamic("failAuthentication")(_v.asInstanceOf[js.Any])
      )
      publicChallengeParameters.foreach(_v =>
        _obj$.updateDynamic("publicChallengeParameters")(
          _v.asInstanceOf[js.Any]
        )
      )
      privateChallengeParameters.foreach(_v =>
        _obj$.updateDynamic("privateChallengeParameters")(
          _v.asInstanceOf[js.Any]
        )
      )
      challengeMetadata.foreach(_v =>
        _obj$.updateDynamic("challengeMetadata")(_v.asInstanceOf[js.Any])
      )
      answerCorrect.foreach(_v =>
        _obj$.updateDynamic("answerCorrect")(_v.asInstanceOf[js.Any])
      )
      userAttributes.foreach(_v =>
        _obj$.updateDynamic("userAttributes")(_v.asInstanceOf[js.Any])
      )
      finalUserStatus.foreach(_v =>
        _obj$.updateDynamic("finalUserStatus")(_v.asInstanceOf[js.Any])
      )
      messageAction.foreach(_v =>
        _obj$.updateDynamic("messageAction")(_v.asInstanceOf[js.Any])
      )
      desiredDeliveryMediums.foreach(_v =>
        _obj$.updateDynamic("desiredDeliveryMediums")(_v.asInstanceOf[js.Any])
      )
      forceAliasCreation.foreach(_v =>
        _obj$.updateDynamic("forceAliasCreation")(_v.asInstanceOf[js.Any])
      )
      claimsOverrideDetails.foreach(_v =>
        _obj$.updateDynamic("claimsOverrideDetails")(_v.asInstanceOf[js.Any])
      )
      _obj$.asInstanceOf[Response]
    }
    type PublicChallengeParameters = js.Dictionary[String]
    type PrivateChallengeParameters = js.Dictionary[String]
    type UserAttributes = js.Dictionary[String]

    @js.native
    trait ClaimsOverrideDetails extends js.Object {
      var claimsToAddOrOverride
          : js.UndefOr[ClaimsOverrideDetails.ClaimsToAddOrOverride] = js.native
      var claimsToSuppress: js.UndefOr[js.Array[String]] = js.native
      var groupOverrideDetails: js.UndefOr[Null | js.Any] = js.native
    }

    object ClaimsOverrideDetails {
      def apply(
          claimsToAddOrOverride: js.UndefOr[
            ClaimsOverrideDetails.ClaimsToAddOrOverride
          ] = js.undefined,
          claimsToSuppress: js.UndefOr[js.Array[String]] = js.undefined,
          groupOverrideDetails: js.UndefOr[Null | js.Any] = js.undefined
      ): ClaimsOverrideDetails = {
        val _obj$ = js.Dynamic.literal(
          )
        claimsToAddOrOverride.foreach(_v =>
          _obj$.updateDynamic("claimsToAddOrOverride")(_v.asInstanceOf[js.Any])
        )
        claimsToSuppress.foreach(_v =>
          _obj$.updateDynamic("claimsToSuppress")(_v.asInstanceOf[js.Any])
        )
        groupOverrideDetails.foreach(_v =>
          _obj$.updateDynamic("groupOverrideDetails")(_v.asInstanceOf[js.Any])
        )
        _obj$.asInstanceOf[ClaimsOverrideDetails]
      }

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
  def apply(
      ServiceToken: String,
      ResponseURL: String,
      StackId: String,
      RequestId: String,
      LogicalResourceId: String,
      ResourceType: String,
      ResourceProperties: CloudFormationCustomResourceEventCommon.ResourceProperties
  ): CloudFormationCustomResourceEventCommon = {
    val _obj$ = js.Dynamic.literal(
      "ServiceToken" -> ServiceToken.asInstanceOf[js.Any],
      "ResponseURL" -> ResponseURL.asInstanceOf[js.Any],
      "StackId" -> StackId.asInstanceOf[js.Any],
      "RequestId" -> RequestId.asInstanceOf[js.Any],
      "LogicalResourceId" -> LogicalResourceId.asInstanceOf[js.Any],
      "ResourceType" -> ResourceType.asInstanceOf[js.Any],
      "ResourceProperties" -> ResourceProperties.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[CloudFormationCustomResourceEventCommon]
  }
  type ResourceProperties = js.Dictionary[js.Any]
}

@js.native
trait CloudFormationCustomResourceCreateEvent
    extends CloudFormationCustomResourceEventCommon {
  var RequestType: String = js.native
}

object CloudFormationCustomResourceCreateEvent {
  def apply(
      RequestType: String
  ): CloudFormationCustomResourceCreateEvent = {
    val _obj$ = js.Dynamic.literal(
      "RequestType" -> RequestType.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[CloudFormationCustomResourceCreateEvent]
  }
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
  def apply(
      RequestType: String,
      PhysicalResourceId: String,
      OldResourceProperties: CloudFormationCustomResourceUpdateEvent.OldResourceProperties
  ): CloudFormationCustomResourceUpdateEvent = {
    val _obj$ = js.Dynamic.literal(
      "RequestType" -> RequestType.asInstanceOf[js.Any],
      "PhysicalResourceId" -> PhysicalResourceId.asInstanceOf[js.Any],
      "OldResourceProperties" -> OldResourceProperties.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[CloudFormationCustomResourceUpdateEvent]
  }
  type OldResourceProperties = js.Dictionary[js.Any]
}

@js.native
trait CloudFormationCustomResourceDeleteEvent
    extends CloudFormationCustomResourceEventCommon {
  var RequestType: String = js.native
  var PhysicalResourceId: String = js.native
}

object CloudFormationCustomResourceDeleteEvent {
  def apply(
      RequestType: String,
      PhysicalResourceId: String
  ): CloudFormationCustomResourceDeleteEvent = {
    val _obj$ = js.Dynamic.literal(
      "RequestType" -> RequestType.asInstanceOf[js.Any],
      "PhysicalResourceId" -> PhysicalResourceId.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[CloudFormationCustomResourceDeleteEvent]
  }
}

@js.native
trait CloudFormationCustomResourceResponseCommon extends js.Object {
  var PhysicalResourceId: String = js.native
  var StackId: String = js.native
  var RequestId: String = js.native
  var LogicalResourceId: String = js.native
  var Data: js.UndefOr[CloudFormationCustomResourceResponseCommon.Data] =
    js.native
}

object CloudFormationCustomResourceResponseCommon {
  def apply(
      PhysicalResourceId: String,
      StackId: String,
      RequestId: String,
      LogicalResourceId: String,
      Data: js.UndefOr[CloudFormationCustomResourceResponseCommon.Data] =
        js.undefined,
      NoEcho: js.UndefOr[Boolean] = js.undefined
  ): CloudFormationCustomResourceResponseCommon = {
    val _obj$ = js.Dynamic.literal(
      "PhysicalResourceId" -> PhysicalResourceId.asInstanceOf[js.Any],
      "StackId" -> StackId.asInstanceOf[js.Any],
      "RequestId" -> RequestId.asInstanceOf[js.Any],
      "LogicalResourceId" -> LogicalResourceId.asInstanceOf[js.Any]
    )
    Data.foreach(_v => _obj$.updateDynamic("Data")(_v.asInstanceOf[js.Any]))
    NoEcho.foreach(_v => _obj$.updateDynamic("NoEcho")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[CloudFormationCustomResourceResponseCommon]
  }
  type Data = js.Dictionary[js.Any]
}

@js.native
trait CloudFormationCustomResourceSuccessResponse
    extends CloudFormationCustomResourceResponseCommon {
  var Status: String = js.native
  var Reason: js.UndefOr[String] = js.native
}

object CloudFormationCustomResourceSuccessResponse {
  def apply(
      Status: String,
      Reason: js.UndefOr[String] = js.undefined
  ): CloudFormationCustomResourceSuccessResponse = {
    val _obj$ = js.Dynamic.literal(
      "Status" -> Status.asInstanceOf[js.Any]
    )
    Reason.foreach(_v => _obj$.updateDynamic("Reason")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[CloudFormationCustomResourceSuccessResponse]
  }
}

@js.native
trait CloudFormationCustomResourceFailedResponse
    extends CloudFormationCustomResourceResponseCommon {
  var Status: String = js.native
  var Reason: String = js.native
}

object CloudFormationCustomResourceFailedResponse {
  def apply(
      Status: String,
      Reason: String
  ): CloudFormationCustomResourceFailedResponse = {
    val _obj$ = js.Dynamic.literal(
      "Status" -> Status.asInstanceOf[js.Any],
      "Reason" -> Reason.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[CloudFormationCustomResourceFailedResponse]
  }
}

@js.native
trait ScheduledEvent extends js.Object {
  var account: String = js.native
  var region: String = js.native
  var detail: js.Dictionary[js.Any] = js.native
  var `detail-type`: String = js.native
  var source: String = js.native
  var time: String = js.native
  var id: String = js.native
  var resources: js.Array[String] = js.native
}

object ScheduledEvent {
  def apply(
      account: String,
      region: String,
      detail: js.Any,
      `detail-type`: String,
      source: String,
      time: String,
      id: String,
      resources: js.Array[String]
  ): ScheduledEvent = {
    val _obj$ = js.Dynamic.literal(
      "account" -> account.asInstanceOf[js.Any],
      "region" -> region.asInstanceOf[js.Any],
      "detail" -> detail.asInstanceOf[js.Any],
      "detail-type" -> `detail-type`.asInstanceOf[js.Any],
      "source" -> source.asInstanceOf[js.Any],
      "time" -> time.asInstanceOf[js.Any],
      "id" -> id.asInstanceOf[js.Any],
      "resources" -> resources.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[ScheduledEvent]
  }
}

@js.native
trait CloudWatchLogsEvent extends js.Object {
  var awslogs: CloudWatchLogsEventData = js.native
}

object CloudWatchLogsEvent {
  def apply(
      awslogs: CloudWatchLogsEventData
  ): CloudWatchLogsEvent = {
    val _obj$ = js.Dynamic.literal(
      "awslogs" -> awslogs.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[CloudWatchLogsEvent]
  }
}

@js.native
trait CloudWatchLogsEventData extends js.Object {
  var data: String = js.native
}

object CloudWatchLogsEventData {
  def apply(
      data: String
  ): CloudWatchLogsEventData = {
    val _obj$ = js.Dynamic.literal(
      "data" -> data.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[CloudWatchLogsEventData]
  }
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

object CloudWatchLogsDecodedData {
  def apply(
      owner: String,
      logGroup: String,
      logStream: String,
      subscriptionFilters: js.Array[String],
      messageType: String,
      logEvents: js.Array[CloudWatchLogsLogEvent]
  ): CloudWatchLogsDecodedData = {
    val _obj$ = js.Dynamic.literal(
      "owner" -> owner.asInstanceOf[js.Any],
      "logGroup" -> logGroup.asInstanceOf[js.Any],
      "logStream" -> logStream.asInstanceOf[js.Any],
      "subscriptionFilters" -> subscriptionFilters.asInstanceOf[js.Any],
      "messageType" -> messageType.asInstanceOf[js.Any],
      "logEvents" -> logEvents.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[CloudWatchLogsDecodedData]
  }
}

@js.native
trait CloudWatchLogsLogEvent extends js.Object {
  var id: String = js.native
  var timestamp: Double = js.native
  var message: String = js.native
  var extractedFields: js.UndefOr[CloudWatchLogsLogEvent.ExtractedFields] =
    js.native
}

object CloudWatchLogsLogEvent {
  def apply(
      id: String,
      timestamp: Double,
      message: String,
      extractedFields: js.UndefOr[CloudWatchLogsLogEvent.ExtractedFields] =
        js.undefined
  ): CloudWatchLogsLogEvent = {
    val _obj$ = js.Dynamic.literal(
      "id" -> id.asInstanceOf[js.Any],
      "timestamp" -> timestamp.asInstanceOf[js.Any],
      "message" -> message.asInstanceOf[js.Any]
    )
    extractedFields.foreach(_v =>
      _obj$.updateDynamic("extractedFields")(_v.asInstanceOf[js.Any])
    )
    _obj$.asInstanceOf[CloudWatchLogsLogEvent]
  }
  type ExtractedFields = js.Dictionary[String]
}

@js.native
trait Context extends js.Object {
  var callbackWaitsForEmptyEventLoop: Boolean = js.native
  var functionName: String = js.native
  var functionVersion: String = js.native
  var invokedFunctionArn: String = js.native
  var memoryLimitInMB: String = js.native
  var awsRequestId: String = js.native
  var logGroupName: String = js.native
  var logStreamName: String = js.native
  var identity: js.UndefOr[CognitoIdentity] = js.native
  var clientContext: js.UndefOr[ClientContext] = js.native
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

object CognitoIdentity {
  def apply(
      cognitoIdentityId: String,
      cognitoIdentityPoolId: String
  ): CognitoIdentity = {
    val _obj$ = js.Dynamic.literal(
      "cognitoIdentityId" -> cognitoIdentityId.asInstanceOf[js.Any],
      "cognitoIdentityPoolId" -> cognitoIdentityPoolId.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[CognitoIdentity]
  }
}

@js.native
trait ClientContext extends js.Object {
  var client: ClientContextClient = js.native
  var Custom: js.UndefOr[js.Any] = js.native
  var env: ClientContextEnv = js.native
}

object ClientContext {
  def apply(
      client: ClientContextClient,
      env: ClientContextEnv,
      Custom: js.UndefOr[js.Any] = js.undefined
  ): ClientContext = {
    val _obj$ = js.Dynamic.literal(
      "client" -> client.asInstanceOf[js.Any],
      "env" -> env.asInstanceOf[js.Any]
    )
    Custom.foreach(_v => _obj$.updateDynamic("Custom")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[ClientContext]
  }
}

@js.native
trait ClientContextClient extends js.Object {
  var installationId: String = js.native
  var appTitle: String = js.native
  var appVersionName: String = js.native
  var appVersionCode: String = js.native
  var appPackageName: String = js.native
}

object ClientContextClient {
  def apply(
      installationId: String,
      appTitle: String,
      appVersionName: String,
      appVersionCode: String,
      appPackageName: String
  ): ClientContextClient = {
    val _obj$ = js.Dynamic.literal(
      "installationId" -> installationId.asInstanceOf[js.Any],
      "appTitle" -> appTitle.asInstanceOf[js.Any],
      "appVersionName" -> appVersionName.asInstanceOf[js.Any],
      "appVersionCode" -> appVersionCode.asInstanceOf[js.Any],
      "appPackageName" -> appPackageName.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[ClientContextClient]
  }
}

@js.native
trait ClientContextEnv extends js.Object {
  var platformVersion: String = js.native
  var platform: String = js.native
  var make: String = js.native
  var model: String = js.native
  var locale: String = js.native
}

object ClientContextEnv {
  def apply(
      platformVersion: String,
      platform: String,
      make: String,
      model: String,
      locale: String
  ): ClientContextEnv = {
    val _obj$ = js.Dynamic.literal(
      "platformVersion" -> platformVersion.asInstanceOf[js.Any],
      "platform" -> platform.asInstanceOf[js.Any],
      "make" -> make.asInstanceOf[js.Any],
      "model" -> model.asInstanceOf[js.Any],
      "locale" -> locale.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[ClientContextEnv]
  }
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
  def apply(
      statusCode: Double,
      body: String,
      headers: js.UndefOr[APIGatewayProxyResult.Headers] = js.undefined,
      multiValueHeaders: js.UndefOr[APIGatewayProxyResult.MultiValueHeaders] =
        js.undefined,
      isBase64Encoded: js.UndefOr[Boolean] = js.undefined
  ): APIGatewayProxyResult = {
    val _obj$ = js.Dynamic.literal(
      "statusCode" -> statusCode.asInstanceOf[js.Any],
      "body" -> body.asInstanceOf[js.Any]
    )
    headers.foreach(_v =>
      _obj$.updateDynamic("headers")(_v.asInstanceOf[js.Any])
    )
    multiValueHeaders.foreach(_v =>
      _obj$.updateDynamic("multiValueHeaders")(_v.asInstanceOf[js.Any])
    )
    isBase64Encoded.foreach(_v =>
      _obj$.updateDynamic("isBase64Encoded")(_v.asInstanceOf[js.Any])
    )
    _obj$.asInstanceOf[APIGatewayProxyResult]
  }
  type Headers = HeadersBDS
  type MultiValueHeaders = MultiValueHeadersBDS
}

@js.native
trait ALBResult extends js.Object {
  var statusCode: Double = js.native
  var statusDescription: String = js.native
  var headers: js.UndefOr[ALBResult.Headers] = js.native
  var multiValueHeaders: js.UndefOr[ALBResult.MultiValueHeaders] = js.native
  var body: js.UndefOr[String] = js.native
  var isBase64Encoded: Boolean = js.native
}

object ALBResult {
  def apply(
      statusCode: Double,
      statusDescription: String,
      isBase64Encoded: Boolean,
      headers: js.UndefOr[ALBResult.Headers] = js.undefined,
      multiValueHeaders: js.UndefOr[ALBResult.MultiValueHeaders] = js.undefined,
      body: js.UndefOr[String] = js.undefined
  ): ALBResult = {
    val _obj$ = js.Dynamic.literal(
      "statusCode" -> statusCode.asInstanceOf[js.Any],
      "statusDescription" -> statusDescription.asInstanceOf[js.Any],
      "isBase64Encoded" -> isBase64Encoded.asInstanceOf[js.Any]
    )
    headers.foreach(_v =>
      _obj$.updateDynamic("headers")(_v.asInstanceOf[js.Any])
    )
    multiValueHeaders.foreach(_v =>
      _obj$.updateDynamic("multiValueHeaders")(_v.asInstanceOf[js.Any])
    )
    body.foreach(_v => _obj$.updateDynamic("body")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[ALBResult]
  }

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

object CustomAuthorizerResult {
  def apply(
      principalId: String,
      policyDocument: PolicyDocument,
      context: js.UndefOr[AuthResponseContext] = js.undefined,
      usageIdentifierKey: js.UndefOr[String] = js.undefined
  ): CustomAuthorizerResult = {
    val _obj$ = js.Dynamic.literal(
      "principalId" -> principalId.asInstanceOf[js.Any],
      "policyDocument" -> policyDocument.asInstanceOf[js.Any]
    )
    context.foreach(_v =>
      _obj$.updateDynamic("context")(_v.asInstanceOf[js.Any])
    )
    usageIdentifierKey.foreach(_v =>
      _obj$.updateDynamic("usageIdentifierKey")(_v.asInstanceOf[js.Any])
    )
    _obj$.asInstanceOf[CustomAuthorizerResult]
  }
}

@js.native
trait PolicyDocument extends js.Object {
  var Version: String = js.native
  var Id: js.UndefOr[String] = js.native
  var Statement: js.Array[Statement] = js.native
}

object PolicyDocument {
  def apply(
      Version: String,
      Statement: js.Array[Statement],
      Id: js.UndefOr[String] = js.undefined
  ): PolicyDocument = {
    val _obj$ = js.Dynamic.literal(
      "Version" -> Version.asInstanceOf[js.Any],
      "Statement" -> Statement.asInstanceOf[js.Any]
    )
    Id.foreach(_v => _obj$.updateDynamic("Id")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[PolicyDocument]
  }
}

@js.native
trait BaseStatement extends js.Object {
  var Effect: String = js.native
  var Sid: js.UndefOr[String] = js.native
  var Condition: js.UndefOr[ConditionBlock] = js.native
}

object BaseStatement {
  def apply(
      Effect: String,
      Sid: js.UndefOr[String] = js.undefined,
      Condition: js.UndefOr[ConditionBlock] = js.undefined
  ): BaseStatement = {
    val _obj$ = js.Dynamic.literal(
      "Effect" -> Effect.asInstanceOf[js.Any]
    )
    Sid.foreach(_v => _obj$.updateDynamic("Sid")(_v.asInstanceOf[js.Any]))
    Condition.foreach(_v =>
      _obj$.updateDynamic("Condition")(_v.asInstanceOf[js.Any])
    )
    _obj$.asInstanceOf[BaseStatement]
  }
}

@js.native
trait MaybeStatementPrincipal extends js.Object {
  var Principal: js.UndefOr[PrincipalValue] = js.native
  var NotPrincipal: js.UndefOr[PrincipalValue] = js.native
}

object MaybeStatementPrincipal {
  def apply(
      Principal: js.UndefOr[PrincipalValue] = js.undefined,
      NotPrincipal: js.UndefOr[PrincipalValue] = js.undefined
  ): MaybeStatementPrincipal = {
    val _obj$ = js.Dynamic.literal(
      )
    Principal.foreach(_v =>
      _obj$.updateDynamic("Principal")(_v.asInstanceOf[js.Any])
    )
    NotPrincipal.foreach(_v =>
      _obj$.updateDynamic("NotPrincipal")(_v.asInstanceOf[js.Any])
    )
    _obj$.asInstanceOf[MaybeStatementPrincipal]
  }
}

@js.native
trait MaybeStatementResource extends js.Object {
  var Resource: js.UndefOr[String | js.Array[String]] = js.native
  var NotResource: js.UndefOr[String | js.Array[String]] = js.native
}

object MaybeStatementResource {
  def apply(
      Resource: js.UndefOr[String | js.Array[String]] = js.undefined,
      NotResource: js.UndefOr[String | js.Array[String]] = js.undefined
  ): MaybeStatementResource = {
    val _obj$ = js.Dynamic.literal(
      )
    Resource.foreach(_v =>
      _obj$.updateDynamic("Resource")(_v.asInstanceOf[js.Any])
    )
    NotResource.foreach(_v =>
      _obj$.updateDynamic("NotResource")(_v.asInstanceOf[js.Any])
    )
    _obj$.asInstanceOf[MaybeStatementResource]
  }
}

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
  def apply(
      version: String,
      id: String,
      `detail-type`: String,
      source: String,
      account: String,
      time: String,
      region: String,
      resources: js.Array[String],
      detail: CodePipelineCloudWatchPipelineEvent.Detail
  ): CodePipelineCloudWatchPipelineEvent = {
    val _obj$ = js.Dynamic.literal(
      "version" -> version.asInstanceOf[js.Any],
      "id" -> id.asInstanceOf[js.Any],
      "detail-type" -> `detail-type`.asInstanceOf[js.Any],
      "source" -> source.asInstanceOf[js.Any],
      "account" -> account.asInstanceOf[js.Any],
      "time" -> time.asInstanceOf[js.Any],
      "region" -> region.asInstanceOf[js.Any],
      "resources" -> resources.asInstanceOf[js.Any],
      "detail" -> detail.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[CodePipelineCloudWatchPipelineEvent]
  }

  @js.native
  trait Detail extends js.Object {
    var pipeline: String = js.native
    var version: Double = js.native
    var state: CodePipelineState = js.native
    var `execution-id`: String = js.native
  }

  object Detail {
    def apply(
        pipeline: String,
        version: Double,
        state: CodePipelineState,
        `execution-id`: String
    ): Detail = {
      val _obj$ = js.Dynamic.literal(
        "pipeline" -> pipeline.asInstanceOf[js.Any],
        "version" -> version.asInstanceOf[js.Any],
        "state" -> state.asInstanceOf[js.Any],
        "execution-id" -> `execution-id`.asInstanceOf[js.Any]
      )
      _obj$.asInstanceOf[Detail]
    }
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
  def apply(
      version: String,
      id: String,
      `detail-type`: String,
      source: String,
      account: String,
      time: String,
      region: String,
      resources: js.Array[String],
      detail: CodePipelineCloudWatchStageEvent.Detail
  ): CodePipelineCloudWatchStageEvent = {
    val _obj$ = js.Dynamic.literal(
      "version" -> version.asInstanceOf[js.Any],
      "id" -> id.asInstanceOf[js.Any],
      "detail-type" -> `detail-type`.asInstanceOf[js.Any],
      "source" -> source.asInstanceOf[js.Any],
      "account" -> account.asInstanceOf[js.Any],
      "time" -> time.asInstanceOf[js.Any],
      "region" -> region.asInstanceOf[js.Any],
      "resources" -> resources.asInstanceOf[js.Any],
      "detail" -> detail.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[CodePipelineCloudWatchStageEvent]
  }

  @js.native
  trait Detail extends js.Object {
    var pipeline: String = js.native
    var version: Double = js.native
    var `execution-id`: String = js.native
    var stage: String = js.native
    var state: CodePipelineStageState = js.native
  }

  object Detail {
    def apply(
        pipeline: String,
        version: Double,
        `execution-id`: String,
        stage: String,
        state: CodePipelineStageState
    ): Detail = {
      val _obj$ = js.Dynamic.literal(
        "pipeline" -> pipeline.asInstanceOf[js.Any],
        "version" -> version.asInstanceOf[js.Any],
        "execution-id" -> `execution-id`.asInstanceOf[js.Any],
        "stage" -> stage.asInstanceOf[js.Any],
        "state" -> state.asInstanceOf[js.Any]
      )
      _obj$.asInstanceOf[Detail]
    }
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
  def apply(
      version: String,
      id: String,
      `detail-type`: String,
      source: String,
      account: String,
      time: String,
      region: String,
      resources: js.Array[String],
      detail: CodePipelineCloudWatchActionEvent.Detail
  ): CodePipelineCloudWatchActionEvent = {
    val _obj$ = js.Dynamic.literal(
      "version" -> version.asInstanceOf[js.Any],
      "id" -> id.asInstanceOf[js.Any],
      "detail-type" -> `detail-type`.asInstanceOf[js.Any],
      "source" -> source.asInstanceOf[js.Any],
      "account" -> account.asInstanceOf[js.Any],
      "time" -> time.asInstanceOf[js.Any],
      "region" -> region.asInstanceOf[js.Any],
      "resources" -> resources.asInstanceOf[js.Any],
      "detail" -> detail.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[CodePipelineCloudWatchActionEvent]
  }

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
    def apply(
        pipeline: String,
        version: Double,
        `execution-id`: String,
        stage: String,
        action: String,
        state: CodePipelineActionState,
        `type`: Detail.Type
    ): Detail = {
      val _obj$ = js.Dynamic.literal(
        "pipeline" -> pipeline.asInstanceOf[js.Any],
        "version" -> version.asInstanceOf[js.Any],
        "execution-id" -> `execution-id`.asInstanceOf[js.Any],
        "stage" -> stage.asInstanceOf[js.Any],
        "action" -> action.asInstanceOf[js.Any],
        "state" -> state.asInstanceOf[js.Any],
        "type" -> `type`.asInstanceOf[js.Any]
      )
      _obj$.asInstanceOf[Detail]
    }

    @js.native
    trait Type extends js.Object {
      var owner: String = js.native
      var category: CodePipelineActionCategory = js.native
      var provider: String = js.native
      var version: Double = js.native
    }

    object Type {
      def apply(
          owner: String,
          category: CodePipelineActionCategory,
          provider: String,
          version: Double
      ): Type = {
        val _obj$ = js.Dynamic.literal(
          "owner" -> owner.asInstanceOf[js.Any],
          "category" -> category.asInstanceOf[js.Any],
          "provider" -> provider.asInstanceOf[js.Any],
          "version" -> version.asInstanceOf[js.Any]
        )
        _obj$.asInstanceOf[Type]
      }
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

object CloudFrontCustomOrigin {
  def apply(
      customHeaders: CloudFrontHeaders,
      domainName: String,
      keepaliveTimeout: Double,
      path: String,
      port: Double,
      protocol: String,
      readTimeout: Double,
      sslProtocols: js.Array[String]
  ): CloudFrontCustomOrigin = {
    val _obj$ = js.Dynamic.literal(
      "customHeaders" -> customHeaders.asInstanceOf[js.Any],
      "domainName" -> domainName.asInstanceOf[js.Any],
      "keepaliveTimeout" -> keepaliveTimeout.asInstanceOf[js.Any],
      "path" -> path.asInstanceOf[js.Any],
      "port" -> port.asInstanceOf[js.Any],
      "protocol" -> protocol.asInstanceOf[js.Any],
      "readTimeout" -> readTimeout.asInstanceOf[js.Any],
      "sslProtocols" -> sslProtocols.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[CloudFrontCustomOrigin]
  }
}

@js.native
trait CloudFrontS3Origin extends js.Object {
  var authMethod: String = js.native
  var customHeaders: CloudFrontHeaders = js.native
  var domainName: String = js.native
  var path: String = js.native
  var region: String = js.native
}

object CloudFrontS3Origin {
  def apply(
      authMethod: String,
      customHeaders: CloudFrontHeaders,
      domainName: String,
      path: String,
      region: String
  ): CloudFrontS3Origin = {
    val _obj$ = js.Dynamic.literal(
      "authMethod" -> authMethod.asInstanceOf[js.Any],
      "customHeaders" -> customHeaders.asInstanceOf[js.Any],
      "domainName" -> domainName.asInstanceOf[js.Any],
      "path" -> path.asInstanceOf[js.Any],
      "region" -> region.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[CloudFrontS3Origin]
  }
}

@js.native
trait CloudFrontResponse extends js.Object {
  var status: String = js.native
  var statusDescription: String = js.native
  var headers: CloudFrontHeaders = js.native
}

object CloudFrontResponse {
  def apply(
      status: String,
      statusDescription: String,
      headers: CloudFrontHeaders
  ): CloudFrontResponse = {
    val _obj$ = js.Dynamic.literal(
      "status" -> status.asInstanceOf[js.Any],
      "statusDescription" -> statusDescription.asInstanceOf[js.Any],
      "headers" -> headers.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[CloudFrontResponse]
  }
}

@js.native
trait CloudFrontRequest extends js.Object {
  var body: js.UndefOr[CloudFrontRequest.Body] = js.native
  def clientIp: String = js.native
  def method: String = js.native
  var uri: String = js.native
  var querystring: String = js.native
  var headers: CloudFrontHeaders = js.native
  var origin: js.UndefOr[CloudFrontOrigin] = js.native
}

object CloudFrontRequest {
  def apply(
      clientIp: String,
      method: String,
      uri: String,
      querystring: String,
      headers: CloudFrontHeaders,
      body: js.UndefOr[CloudFrontRequest.Body] = js.undefined,
      origin: js.UndefOr[CloudFrontOrigin] = js.undefined
  ): CloudFrontRequest = {
    val _obj$ = js.Dynamic.literal(
      "clientIp" -> clientIp.asInstanceOf[js.Any],
      "method" -> method.asInstanceOf[js.Any],
      "uri" -> uri.asInstanceOf[js.Any],
      "querystring" -> querystring.asInstanceOf[js.Any],
      "headers" -> headers.asInstanceOf[js.Any]
    )
    body.foreach(_v => _obj$.updateDynamic("body")(_v.asInstanceOf[js.Any]))
    origin.foreach(_v => _obj$.updateDynamic("origin")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[CloudFrontRequest]
  }

  @js.native
  trait Body extends js.Object {
    var action: String = js.native
    var data: String = js.native
    var encoding: String = js.native
    def inputTruncated: Boolean = js.native
  }

  object Body {
    def apply(
        action: String,
        data: String,
        encoding: String,
        inputTruncated: Boolean
    ): Body = {
      val _obj$ = js.Dynamic.literal(
        "action" -> action.asInstanceOf[js.Any],
        "data" -> data.asInstanceOf[js.Any],
        "encoding" -> encoding.asInstanceOf[js.Any],
        "inputTruncated" -> inputTruncated.asInstanceOf[js.Any]
      )
      _obj$.asInstanceOf[Body]
    }
  }
}

@js.native
trait CloudFrontEvent extends js.Object {
  var config: CloudFrontEvent.Config = js.native
}

object CloudFrontEvent {
  def apply(
      config: CloudFrontEvent.Config
  ): CloudFrontEvent = {
    val _obj$ = js.Dynamic.literal(
      "config" -> config.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[CloudFrontEvent]
  }

  @js.native
  trait Config extends js.Object {
    var distributionDomainName: String = js.native
    var distributionId: String = js.native
    var eventType: String = js.native
    var requestId: String = js.native
  }

  object Config {
    def apply(
        distributionDomainName: String,
        distributionId: String,
        eventType: String,
        requestId: String
    ): Config = {
      val _obj$ = js.Dynamic.literal(
        "distributionDomainName" -> distributionDomainName.asInstanceOf[js.Any],
        "distributionId" -> distributionId.asInstanceOf[js.Any],
        "eventType" -> eventType.asInstanceOf[js.Any],
        "requestId" -> requestId.asInstanceOf[js.Any]
      )
      _obj$.asInstanceOf[Config]
    }
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

object CloudFrontResultResponse {
  def apply(
      status: String,
      statusDescription: js.UndefOr[String] = js.undefined,
      headers: js.UndefOr[CloudFrontHeaders] = js.undefined,
      bodyEncoding: js.UndefOr[String] = js.undefined,
      body: js.UndefOr[String] = js.undefined
  ): CloudFrontResultResponse = {
    val _obj$ = js.Dynamic.literal(
      "status" -> status.asInstanceOf[js.Any]
    )
    statusDescription.foreach(_v =>
      _obj$.updateDynamic("statusDescription")(_v.asInstanceOf[js.Any])
    )
    headers.foreach(_v =>
      _obj$.updateDynamic("headers")(_v.asInstanceOf[js.Any])
    )
    bodyEncoding.foreach(_v =>
      _obj$.updateDynamic("bodyEncoding")(_v.asInstanceOf[js.Any])
    )
    body.foreach(_v => _obj$.updateDynamic("body")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[CloudFrontResultResponse]
  }
}

@js.native
trait CloudFrontResponseEvent extends js.Object {
  var Records: js.Array[js.Any] = js.native
}

object CloudFrontResponseEvent {
  def apply(
      Records: js.Array[js.Any]
  ): CloudFrontResponseEvent = {
    val _obj$ = js.Dynamic.literal(
      "Records" -> Records.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[CloudFrontResponseEvent]
  }
}

@js.native
trait CloudFrontRequestEvent extends js.Object {
  var Records: js.Array[js.Any] = js.native
}

object CloudFrontRequestEvent {
  def apply(
      Records: js.Array[js.Any]
  ): CloudFrontRequestEvent = {
    val _obj$ = js.Dynamic.literal(
      "Records" -> Records.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[CloudFrontRequestEvent]
  }
}

@js.native
trait KinesisStreamRecordPayload extends js.Object {
  var approximateArrivalTimestamp: Double = js.native
  var data: String = js.native
  var kinesisSchemaVersion: String = js.native
  var partitionKey: String = js.native
  var sequenceNumber: String = js.native
}

object KinesisStreamRecordPayload {
  def apply(
      approximateArrivalTimestamp: Double,
      data: String,
      kinesisSchemaVersion: String,
      partitionKey: String,
      sequenceNumber: String
  ): KinesisStreamRecordPayload = {
    val _obj$ = js.Dynamic.literal(
      "approximateArrivalTimestamp" -> approximateArrivalTimestamp
        .asInstanceOf[js.Any],
      "data" -> data.asInstanceOf[js.Any],
      "kinesisSchemaVersion" -> kinesisSchemaVersion.asInstanceOf[js.Any],
      "partitionKey" -> partitionKey.asInstanceOf[js.Any],
      "sequenceNumber" -> sequenceNumber.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[KinesisStreamRecordPayload]
  }
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

object KinesisStreamRecord {
  def apply(
      awsRegion: String,
      eventID: String,
      eventName: String,
      eventSource: String,
      eventSourceARN: String,
      eventVersion: String,
      invokeIdentityArn: String,
      kinesis: KinesisStreamRecordPayload
  ): KinesisStreamRecord = {
    val _obj$ = js.Dynamic.literal(
      "awsRegion" -> awsRegion.asInstanceOf[js.Any],
      "eventID" -> eventID.asInstanceOf[js.Any],
      "eventName" -> eventName.asInstanceOf[js.Any],
      "eventSource" -> eventSource.asInstanceOf[js.Any],
      "eventSourceARN" -> eventSourceARN.asInstanceOf[js.Any],
      "eventVersion" -> eventVersion.asInstanceOf[js.Any],
      "invokeIdentityArn" -> invokeIdentityArn.asInstanceOf[js.Any],
      "kinesis" -> kinesis.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[KinesisStreamRecord]
  }
}

@js.native
trait KinesisStreamEvent extends js.Object {
  var Records: js.Array[KinesisStreamRecord] = js.native
}

object KinesisStreamEvent {
  def apply(
      Records: js.Array[KinesisStreamRecord]
  ): KinesisStreamEvent = {
    val _obj$ = js.Dynamic.literal(
      "Records" -> Records.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[KinesisStreamEvent]
  }
}

@js.native
trait FirehoseTransformationEvent extends js.Object {
  var invocationId: String = js.native
  var deliveryStreamArn: String = js.native
  var region: String = js.native
  var records: js.Array[FirehoseTransformationEventRecord] = js.native
}

object FirehoseTransformationEvent {
  def apply(
      invocationId: String,
      deliveryStreamArn: String,
      region: String,
      records: js.Array[FirehoseTransformationEventRecord]
  ): FirehoseTransformationEvent = {
    val _obj$ = js.Dynamic.literal(
      "invocationId" -> invocationId.asInstanceOf[js.Any],
      "deliveryStreamArn" -> deliveryStreamArn.asInstanceOf[js.Any],
      "region" -> region.asInstanceOf[js.Any],
      "records" -> records.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[FirehoseTransformationEvent]
  }
}

@js.native
trait FirehoseTransformationEventRecord extends js.Object {
  var recordId: String = js.native
  var approximateArrivalTimestamp: Double = js.native
  var data: String = js.native
  var kinesisRecordMetadata: js.UndefOr[FirehoseRecordMetadata] = js.native
}

object FirehoseTransformationEventRecord {
  def apply(
      recordId: String,
      approximateArrivalTimestamp: Double,
      data: String,
      kinesisRecordMetadata: js.UndefOr[FirehoseRecordMetadata] = js.undefined
  ): FirehoseTransformationEventRecord = {
    val _obj$ = js.Dynamic.literal(
      "recordId" -> recordId.asInstanceOf[js.Any],
      "approximateArrivalTimestamp" -> approximateArrivalTimestamp
        .asInstanceOf[js.Any],
      "data" -> data.asInstanceOf[js.Any]
    )
    kinesisRecordMetadata.foreach(_v =>
      _obj$.updateDynamic("kinesisRecordMetadata")(_v.asInstanceOf[js.Any])
    )
    _obj$.asInstanceOf[FirehoseTransformationEventRecord]
  }
}

@js.native
trait FirehoseRecordMetadata extends js.Object {
  var shardId: String = js.native
  var partitionKey: String = js.native
  var approximateArrivalTimestamp: String = js.native
  var sequenceNumber: String = js.native
  var subsequenceNumber: String = js.native
}

object FirehoseRecordMetadata {
  def apply(
      shardId: String,
      partitionKey: String,
      approximateArrivalTimestamp: String,
      sequenceNumber: String,
      subsequenceNumber: String
  ): FirehoseRecordMetadata = {
    val _obj$ = js.Dynamic.literal(
      "shardId" -> shardId.asInstanceOf[js.Any],
      "partitionKey" -> partitionKey.asInstanceOf[js.Any],
      "approximateArrivalTimestamp" -> approximateArrivalTimestamp
        .asInstanceOf[js.Any],
      "sequenceNumber" -> sequenceNumber.asInstanceOf[js.Any],
      "subsequenceNumber" -> subsequenceNumber.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[FirehoseRecordMetadata]
  }
}

@js.native
trait FirehoseTransformationResultRecord extends js.Object {
  var recordId: String = js.native
  var result: FirehoseRecordTransformationStatus = js.native
  var data: String = js.native
}

object FirehoseTransformationResultRecord {
  def apply(
      recordId: String,
      result: FirehoseRecordTransformationStatus,
      data: String
  ): FirehoseTransformationResultRecord = {
    val _obj$ = js.Dynamic.literal(
      "recordId" -> recordId.asInstanceOf[js.Any],
      "result" -> result.asInstanceOf[js.Any],
      "data" -> data.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[FirehoseTransformationResultRecord]
  }
}

@js.native
trait FirehoseTransformationResult extends js.Object {
  var records: js.Array[FirehoseTransformationResultRecord] = js.native
}

object FirehoseTransformationResult {
  def apply(
      records: js.Array[FirehoseTransformationResultRecord]
  ): FirehoseTransformationResult = {
    val _obj$ = js.Dynamic.literal(
      "records" -> records.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[FirehoseTransformationResult]
  }
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

object SQSRecord {
  def apply(
      messageId: String,
      receiptHandle: String,
      body: String,
      attributes: SQSRecordAttributes,
      messageAttributes: SQSMessageAttributes,
      md5OfBody: String,
      eventSource: String,
      eventSourceARN: String,
      awsRegion: String
  ): SQSRecord = {
    val _obj$ = js.Dynamic.literal(
      "messageId" -> messageId.asInstanceOf[js.Any],
      "receiptHandle" -> receiptHandle.asInstanceOf[js.Any],
      "body" -> body.asInstanceOf[js.Any],
      "attributes" -> attributes.asInstanceOf[js.Any],
      "messageAttributes" -> messageAttributes.asInstanceOf[js.Any],
      "md5OfBody" -> md5OfBody.asInstanceOf[js.Any],
      "eventSource" -> eventSource.asInstanceOf[js.Any],
      "eventSourceARN" -> eventSourceARN.asInstanceOf[js.Any],
      "awsRegion" -> awsRegion.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[SQSRecord]
  }
}

@js.native
trait SQSEvent extends js.Object {
  var Records: js.Array[SQSRecord] = js.native
}

object SQSEvent {
  def apply(
      Records: js.Array[SQSRecord]
  ): SQSEvent = {
    val _obj$ = js.Dynamic.literal(
      "Records" -> Records.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[SQSEvent]
  }
}

@js.native
trait SQSRecordAttributes extends js.Object {
  var ApproximateReceiveCount: String = js.native
  var SentTimestamp: String = js.native
  var SenderId: String = js.native
  var ApproximateFirstReceiveTimestamp: String = js.native
}

object SQSRecordAttributes {
  def apply(
      ApproximateReceiveCount: String,
      SentTimestamp: String,
      SenderId: String,
      ApproximateFirstReceiveTimestamp: String
  ): SQSRecordAttributes = {
    val _obj$ = js.Dynamic.literal(
      "ApproximateReceiveCount" -> ApproximateReceiveCount.asInstanceOf[js.Any],
      "SentTimestamp" -> SentTimestamp.asInstanceOf[js.Any],
      "SenderId" -> SenderId.asInstanceOf[js.Any],
      "ApproximateFirstReceiveTimestamp" -> ApproximateFirstReceiveTimestamp
        .asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[SQSRecordAttributes]
  }
}

@js.native
trait SQSMessageAttribute extends js.Object {
  var stringValue: js.UndefOr[String] = js.native
  var binaryValue: js.UndefOr[String] = js.native
  var stringListValues: js.Array[Nothing] = js.native
  var binaryListValues: js.Array[Nothing] = js.native
  var dataType: SQSMessageAttributeDataType = js.native
}

object SQSMessageAttribute {
  def apply(
      stringListValues: js.Array[Nothing],
      binaryListValues: js.Array[Nothing],
      dataType: SQSMessageAttributeDataType,
      stringValue: js.UndefOr[String] = js.undefined,
      binaryValue: js.UndefOr[String] = js.undefined
  ): SQSMessageAttribute = {
    val _obj$ = js.Dynamic.literal(
      "stringListValues" -> stringListValues.asInstanceOf[js.Any],
      "binaryListValues" -> binaryListValues.asInstanceOf[js.Any],
      "dataType" -> dataType.asInstanceOf[js.Any]
    )
    stringValue.foreach(_v =>
      _obj$.updateDynamic("stringValue")(_v.asInstanceOf[js.Any])
    )
    binaryValue.foreach(_v =>
      _obj$.updateDynamic("binaryValue")(_v.asInstanceOf[js.Any])
    )
    _obj$.asInstanceOf[SQSMessageAttribute]
  }
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
  def apply(
      currentIntent: LexEvent.CurrentIntent,
      bot: LexEvent.Bot,
      userId: String,
      inputTranscript: String,
      invocationSource: String,
      outputDialogMode: String,
      messageVersion: String,
      sessionAttributes: LexEvent.SessionAttributes,
      requestAttributes: js.Dictionary[String] | Null = null
  ): LexEvent = {
    val _obj$ = js.Dynamic.literal(
      "currentIntent" -> currentIntent.asInstanceOf[js.Any],
      "bot" -> bot.asInstanceOf[js.Any],
      "userId" -> userId.asInstanceOf[js.Any],
      "inputTranscript" -> inputTranscript.asInstanceOf[js.Any],
      "invocationSource" -> invocationSource.asInstanceOf[js.Any],
      "outputDialogMode" -> outputDialogMode.asInstanceOf[js.Any],
      "messageVersion" -> messageVersion.asInstanceOf[js.Any],
      "sessionAttributes" -> sessionAttributes.asInstanceOf[js.Any],
      "requestAttributes" -> requestAttributes.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[LexEvent]
  }

  @js.native
  trait CurrentIntent extends js.Object {
    var name: String = js.native
    var slots: CurrentIntent.Slots = js.native
    var slotDetails: LexSlotDetails = js.native
    var confirmationStatus: String = js.native
  }

  object CurrentIntent {
    def apply(
        name: String,
        slots: CurrentIntent.Slots,
        slotDetails: LexSlotDetails,
        confirmationStatus: String
    ): CurrentIntent = {
      val _obj$ = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "slots" -> slots.asInstanceOf[js.Any],
        "slotDetails" -> slotDetails.asInstanceOf[js.Any],
        "confirmationStatus" -> confirmationStatus.asInstanceOf[js.Any]
      )
      _obj$.asInstanceOf[CurrentIntent]
    }
    type Slots = js.Dictionary[String]
  }

  @js.native
  trait Bot extends js.Object {
    var name: String = js.native
    var alias: String = js.native
    var version: String = js.native
  }

  object Bot {
    def apply(
        name: String,
        alias: String,
        version: String
    ): Bot = {
      val _obj$ = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "alias" -> alias.asInstanceOf[js.Any],
        "version" -> version.asInstanceOf[js.Any]
      )
      _obj$.asInstanceOf[Bot]
    }
  }

  type SessionAttributes = js.Dictionary[String]
  type LexSlotDetails = js.Dictionary[js.Any]
}

@js.native
trait LexSlotResolution extends js.Object {
  var value: String = js.native
}

object LexSlotResolution {
  def apply(
      value: String
  ): LexSlotResolution = {
    val _obj$ = js.Dynamic.literal(
      "value" -> value.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[LexSlotResolution]
  }
}

@js.native
trait LexGenericAttachment extends js.Object {
  var title: String = js.native
  var subTitle: String = js.native
  var imageUrl: String = js.native
  var attachmentLinkUrl: String = js.native
  var buttons: js.Array[js.Any] = js.native
}

object LexGenericAttachment {
  def apply(
      title: String,
      subTitle: String,
      imageUrl: String,
      attachmentLinkUrl: String,
      buttons: js.Array[js.Any]
  ): LexGenericAttachment = {
    val _obj$ = js.Dynamic.literal(
      "title" -> title.asInstanceOf[js.Any],
      "subTitle" -> subTitle.asInstanceOf[js.Any],
      "imageUrl" -> imageUrl.asInstanceOf[js.Any],
      "attachmentLinkUrl" -> attachmentLinkUrl.asInstanceOf[js.Any],
      "buttons" -> buttons.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[LexGenericAttachment]
  }
}

@js.native
trait LexDialogActionBase extends js.Object {
  var `type`: String = js.native
  var message: js.UndefOr[LexDialogActionBase.Message] = js.native
  var responseCard: js.UndefOr[LexDialogActionBase.ResponseCard] = js.native
}

object LexDialogActionBase {
  def apply(
      `type`: String,
      message: js.UndefOr[LexDialogActionBase.Message] = js.undefined,
      responseCard: js.UndefOr[LexDialogActionBase.ResponseCard] = js.undefined
  ): LexDialogActionBase = {
    val _obj$ = js.Dynamic.literal(
      "type" -> `type`.asInstanceOf[js.Any]
    )
    message.foreach(_v =>
      _obj$.updateDynamic("message")(_v.asInstanceOf[js.Any])
    )
    responseCard.foreach(_v =>
      _obj$.updateDynamic("responseCard")(_v.asInstanceOf[js.Any])
    )
    _obj$.asInstanceOf[LexDialogActionBase]
  }

  @js.native
  trait Message extends js.Object {
    var contentType: String = js.native
    var content: String = js.native
  }

  object Message {
    def apply(
        contentType: String,
        content: String
    ): Message = {
      val _obj$ = js.Dynamic.literal(
        "contentType" -> contentType.asInstanceOf[js.Any],
        "content" -> content.asInstanceOf[js.Any]
      )
      _obj$.asInstanceOf[Message]
    }
  }

  @js.native
  trait ResponseCard extends js.Object {
    var version: Double = js.native
    var contentType: String = js.native
    var genericAttachments: js.Array[LexGenericAttachment] = js.native
  }

  object ResponseCard {
    def apply(
        version: Double,
        contentType: String,
        genericAttachments: js.Array[LexGenericAttachment]
    ): ResponseCard = {
      val _obj$ = js.Dynamic.literal(
        "version" -> version.asInstanceOf[js.Any],
        "contentType" -> contentType.asInstanceOf[js.Any],
        "genericAttachments" -> genericAttachments.asInstanceOf[js.Any]
      )
      _obj$.asInstanceOf[ResponseCard]
    }
  }
}

@js.native
trait LexDialogActionClose extends LexDialogActionBase {
  var fulfillmentState: String = js.native
}

object LexDialogActionClose {
  def apply(
      `type`: String,
      fulfillmentState: String
  ): LexDialogActionClose = {
    val _obj$ = js.Dynamic.literal(
      "type" -> `type`.asInstanceOf[js.Any],
      "fulfillmentState" -> fulfillmentState.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[LexDialogActionClose]
  }
}

@js.native
trait LexDialogActionElicitIntent extends LexDialogActionBase {}

object LexDialogActionElicitIntent {
  def apply(
      `type`: String
  ): LexDialogActionElicitIntent = {
    val _obj$ = js.Dynamic.literal(
      "type" -> `type`.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[LexDialogActionElicitIntent]
  }
}

@js.native
trait LexDialogActionElicitSlot extends LexDialogActionBase {
  var intentName: String = js.native
  var slots: LexDialogActionElicitSlot.Slots = js.native
  var slotToElicit: String = js.native
}

object LexDialogActionElicitSlot {
  def apply(
      `type`: String,
      intentName: String,
      slots: LexDialogActionElicitSlot.Slots,
      slotToElicit: String
  ): LexDialogActionElicitSlot = {
    val _obj$ = js.Dynamic.literal(
      "type" -> `type`.asInstanceOf[js.Any],
      "intentName" -> intentName.asInstanceOf[js.Any],
      "slots" -> slots.asInstanceOf[js.Any],
      "slotToElicit" -> slotToElicit.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[LexDialogActionElicitSlot]
  }
  type Slots = js.Dictionary[String]
}

@js.native
trait LexDialogActionConfirmIntent extends LexDialogActionBase {
  var intentName: String = js.native
  var slots: LexDialogActionConfirmIntent.Slots = js.native
}

object LexDialogActionConfirmIntent {
  def apply(
      `type`: String,
      intentName: String,
      slots: LexDialogActionConfirmIntent.Slots
  ): LexDialogActionConfirmIntent = {
    val _obj$ = js.Dynamic.literal(
      "type" -> `type`.asInstanceOf[js.Any],
      "intentName" -> intentName.asInstanceOf[js.Any],
      "slots" -> slots.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[LexDialogActionConfirmIntent]
  }
  type Slots = js.Dictionary[String]
}

@js.native
trait LexDialogActionDelegate extends js.Object {
  var `type`: String = js.native
  var slots: LexDialogActionDelegate.Slots = js.native
}

object LexDialogActionDelegate {
  def apply(
      `type`: String,
      slots: LexDialogActionDelegate.Slots
  ): LexDialogActionDelegate = {
    val _obj$ = js.Dynamic.literal(
      "type" -> `type`.asInstanceOf[js.Any],
      "slots" -> slots.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[LexDialogActionDelegate]
  }
  type Slots = js.Dictionary[String]
}

@js.native
trait LexResult extends js.Object {
  var sessionAttributes: js.UndefOr[LexResult.SessionAttributes] = js.native
  var dialogAction: LexDialogAction = js.native
}

object LexResult {
  def apply(
      dialogAction: LexDialogAction,
      sessionAttributes: js.UndefOr[LexResult.SessionAttributes] = js.undefined
  ): LexResult = {
    val _obj$ = js.Dynamic.literal(
      "dialogAction" -> dialogAction.asInstanceOf[js.Any]
    )
    sessionAttributes.foreach(_v =>
      _obj$.updateDynamic("sessionAttributes")(_v.asInstanceOf[js.Any])
    )
    _obj$.asInstanceOf[LexResult]
  }
  type SessionAttributes = js.Dictionary[String]
}
