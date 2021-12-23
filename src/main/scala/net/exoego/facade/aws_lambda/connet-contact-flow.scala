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
  def apply(
      Details: ConnectContactFlowEvent.Details,
      Name: String
  ): ConnectContactFlowEvent = {
    val _obj$ = js.Dynamic.literal(
      "Details" -> Details.asInstanceOf[js.Any],
      "Name" -> Name.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[ConnectContactFlowEvent]
  }

  @js.native
  trait Details extends js.Object {
    var ContactData: Details.ContactData = js.native
    var Parameters: Details.Parameters = js.native
  }

  object Details {
    type Parameters = js.Dictionary[String]

    def apply(
        ContactData: Details.ContactData,
        Parameters: Details.Parameters
    ): Details = {
      val _obj$ = js.Dynamic.literal(
        "ContactData" -> ContactData.asInstanceOf[js.Any],
        "Parameters" -> Parameters.asInstanceOf[js.Any]
      )
      _obj$.asInstanceOf[Details]
    }

    @js.native
    trait ContactData extends js.Object {
      var Attributes: ContactData.Attributes = js.native
      var Channel: literal.ConnectContactFlowChannel = js.native
      var ContactId: String = js.native
      var CustomerEndpoint: ConnectContactFlowEndpoint | Null = js.native
      var InitialContactId: String = js.native
      var InitiationMethod: literal.ConnectContactFlowInitiationMethod = js.native
      var InstanceARN: String = js.native
      var PreviousContactId: String = js.native
      var Queue: ConnectContactFlowQueue | Null = js.native
      var SystemEndpoint: ConnectContactFlowEndpoint | Null = js.native
      var MediaStreams: ContactData.MediaStreams = js.native
    }

    object ContactData {
      type Attributes = js.Dictionary[String]

      def apply(
          Attributes: ContactData.Attributes,
          Channel: literal.ConnectContactFlowChannel,
          ContactId: String,
          InitialContactId: String,
          InitiationMethod: literal.ConnectContactFlowInitiationMethod,
          InstanceARN: String,
          PreviousContactId: String,
          MediaStreams: ContactData.MediaStreams,
          CustomerEndpoint: ConnectContactFlowEndpoint | Null = null,
          Queue: ConnectContactFlowQueue | Null = null,
          SystemEndpoint: ConnectContactFlowEndpoint | Null = null
      ): ContactData = {
        val _obj$ = js.Dynamic.literal(
          "Attributes" -> Attributes.asInstanceOf[js.Any],
          "Channel" -> Channel.asInstanceOf[js.Any],
          "ContactId" -> ContactId.asInstanceOf[js.Any],
          "CustomerEndpoint" -> CustomerEndpoint.asInstanceOf[js.Any],
          "InitialContactId" -> InitialContactId.asInstanceOf[js.Any],
          "InitiationMethod" -> InitiationMethod.asInstanceOf[js.Any],
          "InstanceARN" -> InstanceARN.asInstanceOf[js.Any],
          "PreviousContactId" -> PreviousContactId.asInstanceOf[js.Any],
          "Queue" -> Queue.asInstanceOf[js.Any],
          "SystemEndpoint" -> SystemEndpoint.asInstanceOf[js.Any],
          "MediaStreams" -> MediaStreams.asInstanceOf[js.Any]
        )
        _obj$.asInstanceOf[ContactData]
      }

      @js.native
      trait MediaStreams extends js.Object {
        var Customer: MediaStreams.Customer = js.native
      }

      object MediaStreams {
        def apply(
            Customer: MediaStreams.Customer
        ): MediaStreams = {
          val _obj$ = js.Dynamic.literal(
            "Customer" -> Customer.asInstanceOf[js.Any]
          )
          _obj$.asInstanceOf[MediaStreams]
        }

        @js.native
        trait Customer extends js.Object {
          var Audio: CustomerAudio = js.native
        }

        object Customer {
          def apply(
              Audio: CustomerAudio
          ): Customer = {
            val _obj$ = js.Dynamic.literal(
              "Audio" -> Audio.asInstanceOf[js.Any]
            )
            _obj$.asInstanceOf[Customer]
          }
        }
      }
    }
  }
}

@js.native
trait ConnectContactFlowEndpoint extends js.Object {
  var Address: String = js.native
  var Type: literal.ConnectContactFlowEndpointType = js.native
}

object ConnectContactFlowEndpoint {
  def apply(
      Address: String
  ): ConnectContactFlowEndpoint = {
    val _obj$ = js.Dynamic.literal(
      "Address" -> Address.asInstanceOf[js.Any],
      "Type" -> "TELEPHONE_NUMBER"
    )
    _obj$.asInstanceOf[ConnectContactFlowEndpoint]
  }
}

@js.native
trait ConnectContactFlowQueue extends js.Object {
  var ARN: String = js.native
  var Name: String = js.native
}

object ConnectContactFlowQueue {
  def apply(
      ARN: String,
      Name: String
  ): ConnectContactFlowQueue = {
    val _obj$ = js.Dynamic.literal(
      "ARN" -> ARN.asInstanceOf[js.Any],
      "Name" -> Name.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[ConnectContactFlowQueue]
  }
}

@js.native
trait ConnectContactFlowResult extends js.Object {
  @JSBracketAccess
  def apply(key: String): String | Null = js.native
  @JSBracketAccess
  def update(key: String, v: String | Null): Unit = js.native
}

@js.native
trait StartedCustomerAudio extends js.Object {
  var StartFragmentNumber: String = js.native
  var StartTimestamp: String = js.native
  var StreamARN: String = js.native
}

object StartedCustomerAudio {
  def apply(
      StartFragmentNumber: String,
      StartTimestamp: String,
      StreamARN: String
  ): StartedCustomerAudio = {
    val _obj$ = js.Dynamic.literal(
      "StartFragmentNumber" -> StartFragmentNumber.asInstanceOf[js.Any],
      "StartTimestamp" -> StartTimestamp.asInstanceOf[js.Any],
      "StreamARN" -> StreamARN.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[StartedCustomerAudio]
  }
}

@js.native
trait StoppedCustomerAudio extends js.Object {
  var StopFragmentNumber: String = js.native
  var StopTimestamp: String = js.native
}

object StoppedCustomerAudio {
  def apply(
      StopFragmentNumber: String,
      StopTimestamp: String
  ): StoppedCustomerAudio = {
    val _obj$ = js.Dynamic.literal(
      "StopFragmentNumber" -> StopFragmentNumber.asInstanceOf[js.Any],
      "StopTimestamp" -> StopTimestamp.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[StoppedCustomerAudio]
  }
}

@js.native
trait StartedStoppedCustomerAudio extends StartedCustomerAudio with StoppedCustomerAudio

object StartedStoppedCustomerAudio {
  def apply(
      StartFragmentNumber: String,
      StartTimestamp: String,
      StreamARN: String,
      StopFragmentNumber: String,
      StopTimestamp: String
  ): StartedStoppedCustomerAudio = {
    val _obj$ = js.Dynamic.literal(
      "StartFragmentNumber" -> StartFragmentNumber.asInstanceOf[js.Any],
      "StartTimestamp" -> StartTimestamp.asInstanceOf[js.Any],
      "StreamARN" -> StreamARN.asInstanceOf[js.Any],
      "StopFragmentNumber" -> StopFragmentNumber.asInstanceOf[js.Any],
      "StopTimestamp" -> StopTimestamp.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[StartedStoppedCustomerAudio]
  }
}
