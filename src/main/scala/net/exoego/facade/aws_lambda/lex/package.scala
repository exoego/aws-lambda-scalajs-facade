package net.exoego.facade.aws_lambda

import scala.scalajs.js.|

package object lex {
  type LexDialogAction =
    LexDialogActionClose | LexDialogActionElicitIntent | LexDialogActionElicitSlot | LexDialogActionConfirmIntent | LexDialogActionDelegate
  type LexHandler = Handler[LexEvent, LexResult]
  type AsyncLexHandler = AsyncHandler[LexEvent, LexResult]
}
