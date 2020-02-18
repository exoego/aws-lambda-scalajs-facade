package net.exoego.facade.aws_lambda

import scala.scalajs.js

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
