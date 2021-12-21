package net.exoego.facade.aws_lambda

import scala.scalajs.js
import scala.scalajs.js.annotation.JSBracketAccess
import scala.scalajs.js.|

@js.native
trait ConnectContactFlowEvent extends js.Object {
  var Details: ConnectContactFlowEvent.Details = js.native
  var Name: String = js.native
}

object ConnectContactFlowEvent {
  @js.native
  trait Details extends js.Object {
    var ContactData: Details.ContactData = js.native
    var Parameters: Details.Parameters = js.native
  }

  object Details {
    type Parameters = js.Dictionary[String]

    @js.native
    trait ContactData extends js.Object {
      var Attributes: ContactData.Attributes = js.native
      var Channel: ConnectContactFlowChannel = js.native
      var ContactId: String = js.native
      var CustomerEndpoint: ConnectContactFlowEndpoint | Null = js.native
      var InitialContactId: String = js.native
      var InitiationMethod: ConnectContactFlowInitiationMethod = js.native
      var InstanceARN: String = js.native
      var PreviousContactId: String = js.native
      var Queue: ContactData.ConnectContactFlowQueue | Null = js.native
      var SystemEndpoint: ConnectContactFlowEndpoint | Null = js.native
      var MediaStreams: ContactData.MediaStreams = js.native
    }

    object ContactData {
      type Attributes = js.Dictionary[String]

      @js.native
      trait ConnectContactFlowQueue extends js.Object {
        var ARN: String = js.native
        var Name: String = js.native
      }

      @js.native
      trait MediaStreams extends js.Object {
        var Customer: MediaStreams.Customer = js.native
      }

      object MediaStreams {
        @js.native
        trait Customer extends js.Object {
          var Audio: Customer.Audio = js.native
        }

        object Customer {
          @js.native
          trait Audio extends js.Object {
            var StartFragmentNumber: js.UndefOr[String] = js.native
            var StartTimestamp: js.UndefOr[String] = js.native
            var StreamARN: js.UndefOr[String] = js.native
          }
        }
      }
    }
  }
}

@js.native
sealed trait ConnectContactFlowChannel extends js.Any {}

object ConnectContactFlowChannel {
  val VOICE: ConnectContactFlowChannel = "VOICE".asInstanceOf[ConnectContactFlowChannel]
  val CHAT: ConnectContactFlowChannel = "CHAT".asInstanceOf[ConnectContactFlowChannel]
}

@js.native
sealed trait ConnectContactFlowInitiationMethod extends js.Any {}

object ConnectContactFlowInitiationMethod {
  val INBOUND: ConnectContactFlowInitiationMethod = "INBOUND".asInstanceOf[ConnectContactFlowInitiationMethod]
  val OUTBOUND: ConnectContactFlowInitiationMethod = "OUTBOUND".asInstanceOf[ConnectContactFlowInitiationMethod]
  val TRANSFER: ConnectContactFlowInitiationMethod = "TRANSFER".asInstanceOf[ConnectContactFlowInitiationMethod]
  val CALLBACK: ConnectContactFlowInitiationMethod = "CALLBACK".asInstanceOf[ConnectContactFlowInitiationMethod]
  val API: ConnectContactFlowInitiationMethod = "API".asInstanceOf[ConnectContactFlowInitiationMethod]
}

@js.native
trait ConnectContactFlowEndpoint extends js.Object {
  var Address: String = js.native
  var Type: String = js.native
}

@js.native
trait ConnectContactFlowResult extends js.Object {
  @JSBracketAccess
  def apply(key: String): String | Null = js.native
  @JSBracketAccess
  def update(key: String, v: String | Null): Unit = js.native
}
