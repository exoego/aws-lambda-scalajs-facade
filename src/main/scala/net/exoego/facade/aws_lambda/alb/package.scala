package net.exoego.facade.aws_lambda

package object alb {
  type ALBHandler = Handler[ALBEvent, ALBResult]
  type AsyncALBHandler = AsyncHandler[ALBEvent, ALBResult]
}
