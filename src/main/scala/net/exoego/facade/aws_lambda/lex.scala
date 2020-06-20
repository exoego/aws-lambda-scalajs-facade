package net.exoego.facade.aws_lambda

import net.exoego.scalajs.types.util.Factory

import scala.scalajs.js
import scala.scalajs.js.|

@Factory
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
  @Factory(false)
  @js.native
  trait CurrentIntent extends js.Object {
    var name: String = js.native
    var slots: CurrentIntent.Slots = js.native
    var slotDetails: LexSlotDetails = js.native
    var confirmationStatus: String = js.native
  }

  object CurrentIntent {
    type Slots = js.Dictionary[String]
  }

  @Factory(false)
  @js.native
  trait Bot extends js.Object {
    var name: String = js.native
    var alias: String = js.native
    var version: String = js.native
  }

  @Factory(false)
  @js.native
  trait LexSlotDetailsItem extends js.Object {
    var resolutions: js.Array[LexSlotResolution] = js.native
    var originalValue: String = js.native
  }

  type SessionAttributes = js.Dictionary[String]
  type LexSlotDetails = js.Dictionary[LexSlotDetailsItem]
}

@Factory
@js.native
trait LexSlotResolution extends js.Object {
  var value: String = js.native
}

@Factory
@js.native
trait LexGenericAttachment extends js.Object {
  var title: String = js.native
  var subTitle: String = js.native
  var imageUrl: String = js.native
  var attachmentLinkUrl: String = js.native
  var buttons: js.Array[LexGenericAttachment.ButtonsItem] = js.native
}

object LexGenericAttachment {
  @Factory(false)
  @js.native
  trait ButtonsItem extends js.Object {
    var text: String = js.native
    var value: String = js.native
  }
}

@Factory
@js.native
trait LexDialogActionBase extends js.Object {
  var `type`: String = js.native
  var message: js.UndefOr[LexDialogActionBase.Message] = js.native
  var responseCard: js.UndefOr[LexDialogActionBase.ResponseCard] = js.native
}

object LexDialogActionBase {
  @Factory(false)
  @js.native
  trait Message extends js.Object {
    var contentType: String = js.native
    var content: String = js.native
  }

  @Factory(false)
  @js.native
  trait ResponseCard extends js.Object {
    var version: Double = js.native
    var contentType: String = js.native
    var genericAttachments: js.Array[LexGenericAttachment] = js.native
  }
}

@Factory
@js.native
trait LexDialogActionClose extends js.Object with LexDialogActionBase {
  var fulfillmentState: String = js.native
}

@Factory
@js.native
trait LexDialogActionElicitIntent extends js.Object with LexDialogActionBase {}

@Factory
@js.native
trait LexDialogActionElicitSlot extends js.Object with LexDialogActionBase {
  var intentName: String = js.native
  var slots: LexDialogActionElicitSlot.Slots = js.native
  var slotToElicit: String = js.native
}

object LexDialogActionElicitSlot {
  type Slots = js.Dictionary[String]
}

@Factory
@js.native
trait LexDialogActionConfirmIntent extends js.Object with LexDialogActionBase {
  var intentName: String = js.native
  var slots: LexDialogActionConfirmIntent.Slots = js.native
}

object LexDialogActionConfirmIntent {
  type Slots = js.Dictionary[String]
}

@Factory
@js.native
trait LexDialogActionDelegate extends js.Object {
  var `type`: String = js.native
  var slots: LexDialogActionDelegate.Slots = js.native
}

object LexDialogActionDelegate {
  type Slots = js.Dictionary[String]
}

@Factory
@js.native
trait LexResult extends js.Object {
  var sessionAttributes: js.UndefOr[LexResult.SessionAttributes] = js.native
  var dialogAction: LexDialogAction = js.native
}

object LexResult {
  type SessionAttributes = js.Dictionary[String]
}
