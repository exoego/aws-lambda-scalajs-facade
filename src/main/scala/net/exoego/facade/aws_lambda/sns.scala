package net.exoego.facade.aws_lambda

import net.exoego.scalajs.types.util.Factory
import scala.scalajs.js

@Factory
trait SNSMessageAttribute extends js.Object {
  var Type: String
  var Value: String
}

@Factory
trait SNSMessage extends js.Object {
  var SignatureVersion: String
  var Timestamp: String
  var Signature: String
  var SigningCertUrl: String
  var MessageId: String
  var Message: String
  var MessageAttributes: SNSMessageAttributes
  var Type: String
  var UnsubscribeUrl: String
  var TopicArn: String
  var Subject: String
}

@Factory
trait SNSEventRecord extends js.Object {
  var EventVersion: String
  var EventSubscriptionArn: String
  var EventSource: String
  var Sns: SNSMessage
}

@Factory
trait SNSEvent extends js.Object {
  var Records: js.Array[SNSEventRecord]
}
