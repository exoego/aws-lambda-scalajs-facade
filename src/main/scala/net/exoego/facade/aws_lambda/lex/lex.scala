package net.exoego.facade.aws_lambda.lex

import scala.scalajs.js
import scala.scalajs.js.|

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
  def apply(
      currentIntent: LexEvent.CurrentIntent,
      bot: LexEvent.Bot,
      userId: String,
      inputTranscript: String,
      invocationSource: String,
      outputDialogMode: String,
      messageVersion: String,
      sessionAttributes: LexEvent.SessionAttributes,
      requestAttributes: js.Dictionary[String] | Null = null
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
    var slots: CurrentIntent.Slots = js.native
    var slotDetails: LexSlotDetails = js.native
    var confirmationStatus: String = js.native
  }

  object CurrentIntent {
    def apply(
        name: String,
        slots: CurrentIntent.Slots,
        slotDetails: LexSlotDetails,
        confirmationStatus: String
    ): CurrentIntent = {
      val _obj$ = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "slots" -> slots.asInstanceOf[js.Any],
        "slotDetails" -> slotDetails.asInstanceOf[js.Any],
        "confirmationStatus" -> confirmationStatus.asInstanceOf[js.Any]
      )
      _obj$.asInstanceOf[CurrentIntent]
    }
    type Slots = js.Dictionary[String]
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
    var resolutions: js.Array[LexSlotResolution] = js.native
    var originalValue: String = js.native
  }

  object LexSlotDetailsItem {
    def apply(
        resolutions: js.Array[LexSlotResolution],
        originalValue: String
    ): LexSlotDetailsItem = {
      val _obj$ = js.Dynamic.literal(
        "resolutions" -> resolutions.asInstanceOf[js.Any],
        "originalValue" -> originalValue.asInstanceOf[js.Any]
      )
      _obj$.asInstanceOf[LexSlotDetailsItem]
    }
  }

  type SessionAttributes = js.Dictionary[String]
  type LexSlotDetails = js.Dictionary[LexSlotDetailsItem]
}

@js.native
trait LexSlotResolution extends js.Object {
  var value: String = js.native
}

object LexSlotResolution {
  def apply(
      value: String
  ): LexSlotResolution = {
    val _obj$ = js.Dynamic.literal(
      "value" -> value.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[LexSlotResolution]
  }
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
  def apply(
      title: String,
      subTitle: String,
      imageUrl: String,
      attachmentLinkUrl: String,
      buttons: js.Array[ButtonsItem]
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

  @js.native
  trait ButtonsItem extends js.Object {
    var text: String = js.native
    var value: String = js.native
  }

  object ButtonsItem {
    def apply(
        text: String,
        value: String
    ): ButtonsItem = {
      val _obj$ = js.Dynamic.literal(
        "text" -> text.asInstanceOf[js.Any],
        "value" -> value.asInstanceOf[js.Any]
      )
      _obj$.asInstanceOf[ButtonsItem]
    }
  }
}

@js.native
trait LexDialogActionBase extends js.Object {
  var `type`: String = js.native
  var message: js.UndefOr[LexDialogActionBase.Message] = js.native
  var responseCard: js.UndefOr[LexDialogActionBase.ResponseCard] = js.native
}

object LexDialogActionBase {
  def apply(
      `type`: String,
      message: js.UndefOr[LexDialogActionBase.Message] = js.undefined,
      responseCard: js.UndefOr[LexDialogActionBase.ResponseCard] = js.undefined
  ): LexDialogActionBase = {
    val _obj$ = js.Dynamic.literal(
      "type" -> `type`.asInstanceOf[js.Any]
    )
    message.foreach(_v =>
      _obj$.updateDynamic("message")(_v.asInstanceOf[js.Any])
    )
    responseCard.foreach(_v =>
      _obj$.updateDynamic("responseCard")(_v.asInstanceOf[js.Any])
    )
    _obj$.asInstanceOf[LexDialogActionBase]
  }

  @js.native
  trait Message extends js.Object {
    var contentType: String = js.native
    var content: String = js.native
  }

  object Message {
    def apply(
        contentType: String,
        content: String
    ): Message = {
      val _obj$ = js.Dynamic.literal(
        "contentType" -> contentType.asInstanceOf[js.Any],
        "content" -> content.asInstanceOf[js.Any]
      )
      _obj$.asInstanceOf[Message]
    }
  }

  @js.native
  trait ResponseCard extends js.Object {
    var version: Double = js.native
    var contentType: String = js.native
    var genericAttachments: js.Array[LexGenericAttachment] = js.native
  }

  object ResponseCard {
    def apply(
        version: Double,
        contentType: String,
        genericAttachments: js.Array[LexGenericAttachment]
    ): ResponseCard = {
      val _obj$ = js.Dynamic.literal(
        "version" -> version.asInstanceOf[js.Any],
        "contentType" -> contentType.asInstanceOf[js.Any],
        "genericAttachments" -> genericAttachments.asInstanceOf[js.Any]
      )
      _obj$.asInstanceOf[ResponseCard]
    }
  }
}

@js.native
trait LexDialogActionClose extends LexDialogActionBase {
  var fulfillmentState: String = js.native
}

object LexDialogActionClose {
  def apply(
      `type`: String,
      fulfillmentState: String
  ): LexDialogActionClose = {
    val _obj$ = js.Dynamic.literal(
      "type" -> `type`.asInstanceOf[js.Any],
      "fulfillmentState" -> fulfillmentState.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[LexDialogActionClose]
  }
}

@js.native
trait LexDialogActionElicitIntent extends LexDialogActionBase {}

object LexDialogActionElicitIntent {
  def apply(
      `type`: String
  ): LexDialogActionElicitIntent = {
    val _obj$ = js.Dynamic.literal(
      "type" -> `type`.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[LexDialogActionElicitIntent]
  }
}

@js.native
trait LexDialogActionElicitSlot extends LexDialogActionBase {
  var intentName: String = js.native
  var slots: LexDialogActionElicitSlot.Slots = js.native
  var slotToElicit: String = js.native
}

object LexDialogActionElicitSlot {
  def apply(
      `type`: String,
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
  type Slots = js.Dictionary[String]
}

@js.native
trait LexDialogActionConfirmIntent extends LexDialogActionBase {
  var intentName: String = js.native
  var slots: LexDialogActionConfirmIntent.Slots = js.native
}

object LexDialogActionConfirmIntent {
  def apply(
      `type`: String,
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
  type Slots = js.Dictionary[String]
}

@js.native
trait LexDialogActionDelegate extends js.Object {
  var `type`: String = js.native
  var slots: LexDialogActionDelegate.Slots = js.native
}

object LexDialogActionDelegate {
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
  type Slots = js.Dictionary[String]
}

@js.native
trait LexResult extends js.Object {
  var sessionAttributes: js.UndefOr[LexResult.SessionAttributes] = js.native
  var dialogAction: LexDialogAction = js.native
}

object LexResult {
  def apply(
      dialogAction: LexDialogAction,
      sessionAttributes: js.UndefOr[LexResult.SessionAttributes] = js.undefined
  ): LexResult = {
    val _obj$ = js.Dynamic.literal(
      "dialogAction" -> dialogAction.asInstanceOf[js.Any]
    )
    sessionAttributes.foreach(_v =>
      _obj$.updateDynamic("sessionAttributes")(_v.asInstanceOf[js.Any])
    )
    _obj$.asInstanceOf[LexResult]
  }
  type SessionAttributes = js.Dictionary[String]
}
