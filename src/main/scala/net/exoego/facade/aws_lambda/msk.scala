package net.exoego.facade.aws_lambda

import net.exoego.scalajs.types.util.Factory

import scala.scalajs.js

@Factory
@js.native
trait MSKRecord extends js.Object {
  var topic: String = js.native
  var partition: Double = js.native
  var offset: Double = js.native
  var timestamp: Double = js.native
  var timestampType: String = js.native
  var key: String = js.native
  var value: String = js.native
}

@Factory
@js.native
trait MSKEvent extends js.Object {
  var eventSource: String = js.native
  var eventSourceArn: String = js.native
  var records: MSKEvent.Records = js.native
}

object MSKEvent {
  type Records = js.Dictionary[js.Array[MSKRecord]]
}
