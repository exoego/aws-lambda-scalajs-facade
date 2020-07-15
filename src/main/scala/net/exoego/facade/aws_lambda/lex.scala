package net.exoego.facade.aws_lambda

import net.exoego.scalajs.types.util.Factory

import scala.scalajs.js
import scala.scalajs.js.|

@Factory
trait LexEvent extends js.Object {
  var currentIntent: LexEvent.CurrentIntent
  var bot: LexEvent.Bot
  var userId: String
  var inputTranscript: String
  var invocationSource: String
  var outputDialogMode: String
  var messageVersion: String
  var sessionAttributes: LexEvent.SessionAttributes
  var requestAttributes: js.Dictionary[String] | Null
}

object LexEvent {
  @Factory(false)
  trait CurrentIntent extends js.Object {
    var name: String
    var slots: CurrentIntent.Slots
    var slotDetails: LexSlotDetails
    var confirmationStatus: String
  }

  object CurrentIntent {
    type Slots = js.Dictionary[String]
  }

  @Factory(false)
  trait Bot extends js.Object {
    var name: String
    var alias: String
    var version: String
  }

  @Factory(false)
  trait LexSlotDetailsItem extends js.Object {
    var resolutions: js.Array[LexSlotResolution]
    var originalValue: String
  }

  type SessionAttributes = js.Dictionary[String]
  type LexSlotDetails = js.Dictionary[LexSlotDetailsItem]
}

@Factory
trait LexSlotResolution extends js.Object {
  var value: String
}

@Factory
trait LexGenericAttachment extends js.Object {
  var title: String
  var subTitle: String
  var imageUrl: String
  var attachmentLinkUrl: String
  var buttons: js.Array[LexGenericAttachment.ButtonsItem]
}

object LexGenericAttachment {
  @Factory(false)
  trait ButtonsItem extends js.Object {
    var text: String
    var value: String
  }
}

@Factory
trait LexDialogActionBase extends js.Object {
  var `type`: String
  var message: js.UndefOr[LexDialogActionBase.Message] = js.undefined
  var responseCard: js.UndefOr[LexDialogActionBase.ResponseCard] = js.undefined
}

object LexDialogActionBase {
  @Factory(false)
  trait Message extends js.Object {
    var contentType: String
    var content: String
  }

  @Factory(false)
  trait ResponseCard extends js.Object {
    var version: Double
    var contentType: String
    var genericAttachments: js.Array[LexGenericAttachment]
  }
}

@Factory
trait LexDialogActionClose extends js.Object with LexDialogActionBase {
  var fulfillmentState: String
}

@Factory
trait LexDialogActionElicitIntent extends js.Object with LexDialogActionBase {}

@Factory
trait LexDialogActionElicitSlot extends js.Object with LexDialogActionBase {
  var intentName: String
  var slots: LexDialogActionElicitSlot.Slots
  var slotToElicit: String
}

object LexDialogActionElicitSlot {
  type Slots = js.Dictionary[String]
}

@Factory
trait LexDialogActionConfirmIntent extends js.Object with LexDialogActionBase {
  var intentName: String
  var slots: LexDialogActionConfirmIntent.Slots
}

object LexDialogActionConfirmIntent {
  type Slots = js.Dictionary[String]
}

@Factory
trait LexDialogActionDelegate extends js.Object {
  var `type`: String
  var slots: LexDialogActionDelegate.Slots
}

object LexDialogActionDelegate {
  type Slots = js.Dictionary[String]
}

@Factory
trait LexResult extends js.Object {
  var sessionAttributes: js.UndefOr[LexResult.SessionAttributes] = js.undefined
  var dialogAction: LexDialogAction
}

object LexResult {
  type SessionAttributes = js.Dictionary[String]
}
