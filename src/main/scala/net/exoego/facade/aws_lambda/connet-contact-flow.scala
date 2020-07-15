package net.exoego.facade.aws_lambda

import net.exoego.scalajs.types.util.Factory

import scala.scalajs.js
import scala.scalajs.js.annotation.JSBracketAccess
import scala.scalajs.js.|

@Factory
@js.native
trait ConnectContactFlowEvent extends js.Object {
  var Details: ConnectContactFlowEvent.Details = js.native
  var Name: String = js.native
}

object ConnectContactFlowEvent {
  @Factory(false)
  @js.native
  trait Details extends js.Object {
    var ContactData: Details.ContactData = js.native
    var Parameters: Details.Parameters = js.native
  }

  object Details {
    type Parameters = js.Dictionary[String]

    @Factory(false)
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
      var Queue: String | Null = js.native
      var SystemEndpoint: ConnectContactFlowEndpoint | Null = js.native
      var MediaStreams: ContactData.MediaStreams = js.native
    }

    object ContactData {
      type Attributes = js.Dictionary[String]

      @Factory(false)
      @js.native
      trait MediaStreams extends js.Object {
        var Customer: MediaStreams.Customer = js.native
      }

      object MediaStreams {
        @Factory(false)
        @js.native
        trait Customer extends js.Object {
          var Audio: Customer.Audio = js.native
        }

        object Customer {
          @Factory(false)
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
  @inline val VOICE: ConnectContactFlowChannel =
    "VOICE".asInstanceOf[ConnectContactFlowChannel]
  @inline val CHAT: ConnectContactFlowChannel =
    "CHAT".asInstanceOf[ConnectContactFlowChannel]
}

@js.native
sealed trait ConnectContactFlowInitiationMethod extends js.Any {}

object ConnectContactFlowInitiationMethod {
  @inline val INBOUND: ConnectContactFlowInitiationMethod =
    "INBOUND".asInstanceOf[ConnectContactFlowInitiationMethod]
  @inline val OUTBOUND: ConnectContactFlowInitiationMethod =
    "OUTBOUND".asInstanceOf[ConnectContactFlowInitiationMethod]
  @inline val TRANSFER: ConnectContactFlowInitiationMethod =
    "TRANSFER".asInstanceOf[ConnectContactFlowInitiationMethod]
  @inline val CALLBACK: ConnectContactFlowInitiationMethod =
    "CALLBACK".asInstanceOf[ConnectContactFlowInitiationMethod]
  @inline val API: ConnectContactFlowInitiationMethod =
    "API".asInstanceOf[ConnectContactFlowInitiationMethod]
}

@Factory
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
