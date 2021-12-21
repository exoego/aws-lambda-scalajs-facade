package net.exoego.facade.aws_lambda

import scala.scalajs.js

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
