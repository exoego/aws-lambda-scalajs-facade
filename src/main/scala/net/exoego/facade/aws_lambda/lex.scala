package net.exoego.facade.aws_lambda

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait LexEvent extends js.Object {
  var currentIntent: LexEvent.CurrentIntent = js.native
  var bot: LexEvent.Bot = js.native
  var userId: String = js.native
  var inputTranscript: String = js.native
  var invocationSource: literal.LexEventInvocationSource = js.native
  var outputDialogMode: literal.LexEventOutputDialogMode = js.native
  var messageVersion: String = js.native
  var sessionAttributes: LexEvent.SessionAttributes = js.native
  var requestAttributes: LexEvent.RequestAttributes | Null = js.native
}

object LexEvent {
  def apply(
      currentIntent: LexEvent.CurrentIntent,
      bot: LexEvent.Bot,
      userId: String,
      inputTranscript: String,
      invocationSource: literal.LexEventInvocationSource,
      outputDialogMode: literal.LexEventOutputDialogMode,
      messageVersion: String,
      sessionAttributes: LexEvent.SessionAttributes,
      requestAttributes: LexEvent.RequestAttributes | Null = null
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
    var slots: LexEvent.Slots = js.native
    var slotDetails: LexSlotDetails = js.native
    var confirmationStatus: literal.LexEventCurrentIntentConfirmationStatus = js.native
  }

  object CurrentIntent {
    def apply(
        name: String,
        slots: LexEvent.Slots,
        slotDetails: LexSlotDetails,
        confirmationStatus: literal.LexEventCurrentIntentConfirmationStatus
    ): CurrentIntent = {
      val _obj$ = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "slots" -> slots.asInstanceOf[js.Any],
        "slotDetails" -> slotDetails.asInstanceOf[js.Any],
        "confirmationStatus" -> confirmationStatus.asInstanceOf[js.Any]
      )
      _obj$.asInstanceOf[CurrentIntent]
    }
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

  @js.native
  trait LexSlotDetailsItem extends js.Object {
    // "at least 1 but no more than 5 items"
    var resolutions: OneToFive[LexSlotResolution] = js.native
    var originalValue: String = js.native
  }

  type Slots = js.Dictionary[String]
  type OneToFive[T] = js.Tuple5[T, js.UndefOr[T], js.UndefOr[T], js.UndefOr[T], js.UndefOr[T]]
  type RequestAttributes = js.Dictionary[String]
  type SessionAttributes = js.Dictionary[String]
  type LexSlotDetails = js.Dictionary[LexSlotDetailsItem]
}

@js.native
trait LexSlotResolution extends js.Object {
  var value: String = js.native
}

@js.native
trait LexGenericAttachment extends js.Object {
  var title: String = js.native
  var subTitle: String = js.native
  var imageUrl: String = js.native
  var attachmentLinkUrl: String = js.native
  var buttons: js.Array[LexGenericAttachment.ButtonsItem] = js.native
}

object LexGenericAttachment {
  @js.native
  trait ButtonsItem extends js.Object {
    var text: String = js.native
    var value: String = js.native
  }

  def apply(
      title: String,
      subTitle: String,
      imageUrl: String,
      attachmentLinkUrl: String,
      buttons: js.Array[LexGenericAttachment.ButtonsItem]
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
trait LexDialogActionBase[T <: literal.LexDialogActionType] extends js.Object {
  var `type`: T = js.native
  var message: js.UndefOr[LexDialogActionBase.Message] = js.native
  var responseCard: js.UndefOr[LexDialogActionBase.ResponseCard] = js.native
}

object LexDialogActionBase {
  @js.native
  trait Message extends js.Object {
    var contentType: literal.LexDialogActionMessageContentType = js.native
    var content: String = js.native
  }

  @js.native
  trait ResponseCard extends js.Object {
    var version: Double = js.native
    var contentType: String = js.native
    var genericAttachments: js.Array[LexGenericAttachment] = js.native
  }
}

@js.native
trait LexDialogActionClose extends LexDialogActionBase["Close"] {
  var fulfillmentState: literal.LexDialogActionCloseFulfillmentState = js.native
}

object LexDialogActionClose {
  def apply(
      `type`: "Close",
      fulfillmentState: literal.LexDialogActionCloseFulfillmentState
  ): LexDialogActionClose = {
    val _obj$ = js.Dynamic.literal(
      "type" -> `type`.asInstanceOf[js.Any],
      "fulfillmentState" -> fulfillmentState.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[LexDialogActionClose]
  }
}

@js.native
trait LexDialogActionElicitIntent extends LexDialogActionBase["ElicitIntent"] {}

object LexDialogActionElicitIntent {
  def apply(
      `type`: "ElicitIntent"
  ): LexDialogActionElicitIntent = {
    val _obj$ = js.Dynamic.literal(
      "type" -> `type`.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[LexDialogActionElicitIntent]
  }
}

@js.native
trait LexDialogActionElicitSlot extends LexDialogActionBase["ElicitSlot"] {
  var intentName: String = js.native
  var slots: LexDialogActionElicitSlot.Slots = js.native
  var slotToElicit: String = js.native
}

object LexDialogActionElicitSlot {
  type Slots = js.Dictionary[String]

  def apply(
      `type`: "ElicitSlot",
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
}

@js.native
trait LexDialogActionConfirmIntent extends LexDialogActionBase["ConfirmIntent"] {
  var intentName: String = js.native
  var slots: LexDialogActionConfirmIntent.Slots = js.native
}

object LexDialogActionConfirmIntent {
  type Slots = js.Dictionary[String]

  def apply(
      `type`: "ConfirmIntent",
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
}

@js.native
trait LexDialogActionDelegate extends js.Object {
  var `type`: String = js.native
  var slots: LexDialogActionDelegate.Slots = js.native
}

object LexDialogActionDelegate {
  type Slots = js.Dictionary[String]

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
}

@js.native
trait LexResult extends js.Object {
  var sessionAttributes: js.UndefOr[LexResult.SessionAttributes] = js.native
  var dialogAction: LexDialogAction = js.native
}

object LexResult {
  type SessionAttributes = js.Dictionary[String]

  def apply(
      dialogAction: LexDialogAction,
      sessionAttributes: js.UndefOr[js.Dictionary[String]] = js.undefined
  ): LexResult = {
    val _obj$ = js.Dynamic.literal(
      "dialogAction" -> dialogAction.asInstanceOf[js.Any]
    )
    sessionAttributes.foreach(_v => _obj$.updateDynamic("sessionAttributes")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[LexResult]
  }
}
