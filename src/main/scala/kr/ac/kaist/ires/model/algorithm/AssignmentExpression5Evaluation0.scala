package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AssignmentExpression5Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""AssignmentExpression5Evaluation0""", List(Id("""this"""), Id("""LeftHandSideExpression"""), Id("""AssignmentOperator"""), Id("""AssignmentExpression""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""LeftHandSideExpression"""))), EStr("""Evaluation""")), ILet(Id("""lref"""), ERef(RefId(Id("""__x0__""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""lref"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x1__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x1__"""))))), ISeq(List())), ILet(Id("""lval"""), ERef(RefId(Id("""__x1__""")))), IAccess(Id("""__x2__"""), ERef(RefId(Id("""AssignmentExpression"""))), EStr("""Evaluation""")), ILet(Id("""rref"""), ERef(RefId(Id("""__x2__""")))), IApp(Id("""__x3__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""rref"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x3__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x3__"""))))), ISeq(List())), ILet(Id("""rval"""), ERef(RefId(Id("""__x3__""")))), ILet(Id("""__x4__"""), EGetSyntax(ERef(RefId(Id("""AssignmentOperator"""))))), IAssign(RefId(Id("""__x4__""")), EBOp(OSub, ERef(RefId(Id("""__x4__"""))), EINum(1L))), ILet(Id("""op"""), ERef(RefId(Id("""__x4__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""op"""))), EStr("""+""")), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""ToPrimitive"""))), List(ERef(RefId(Id("""lval"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x5__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x5__"""))))), ISeq(List())), IApp(Id("""__x6__"""), ERef(RefId(Id("""ToPrimitive"""))), List(ERef(RefId(Id("""rval"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x6__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x6__"""))))), ISeq(List())), IApp(Id("""__x7__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""__x5__"""))))), IApp(Id("""__x8__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""__x6__"""))))), IIf(EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""__x7__"""))), EStr("""String""")), EBOp(OEq, ERef(RefId(Id("""__x8__"""))), EStr("""String"""))), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""__x5__"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x9__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x9__""")), ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x9__"""))))), ISeq(List())), IApp(Id("""__x10__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""__x6__"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x10__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x10__""")), ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x10__"""))))), ISeq(List())), IAssign(RefId(Id("""__x11__""")), EBOp(OPlus, ERef(RefId(Id("""__x9__"""))), ERef(RefId(Id("""__x10__"""))))))), ISeq(List(IApp(Id("""__x12__"""), ERef(RefId(Id("""ToNumber"""))), List(ERef(RefId(Id("""__x5__"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x12__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x12__""")), ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x12__"""))))), ISeq(List())), IApp(Id("""__x13__"""), ERef(RefId(Id("""ToNumber"""))), List(ERef(RefId(Id("""__x6__"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x13__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x13__""")), ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x13__"""))))), ISeq(List())), IAssign(RefId(Id("""__x11__""")), EBOp(OPlus, ERef(RefId(Id("""__x12__"""))), ERef(RefId(Id("""__x13__""")))))))))), IIf(EBOp(OEq, ERef(RefId(Id("""op"""))), EStr("""**""")), ISeq(List(IApp(Id("""__x14__"""), ERef(RefId(Id("""ToNumber"""))), List(ERef(RefId(Id("""lval"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x14__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x14__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x14__""")), ERef(RefProp(RefId(Id("""__x14__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x14__"""))))), ISeq(List())), IApp(Id("""__x15__"""), ERef(RefId(Id("""ToNumber"""))), List(ERef(RefId(Id("""rval"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x15__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x15__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x15__""")), ERef(RefProp(RefId(Id("""__x15__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x15__"""))))), ISeq(List())), IAssign(RefId(Id("""__x11__""")), EBOp(OPow, ERef(RefId(Id("""__x14__"""))), ERef(RefId(Id("""__x15__"""))))))), IIf(EBOp(OEq, ERef(RefId(Id("""op"""))), EStr("""|""")), ISeq(List(IApp(Id("""__x16__"""), ERef(RefId(Id("""ToInt32"""))), List(ERef(RefId(Id("""lval"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x16__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x16__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x16__""")), ERef(RefProp(RefId(Id("""__x16__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x16__"""))))), ISeq(List())), IApp(Id("""__x17__"""), ERef(RefId(Id("""ToInt32"""))), List(ERef(RefId(Id("""rval"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x17__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x17__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x17__""")), ERef(RefProp(RefId(Id("""__x17__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x17__"""))))), ISeq(List())), IAssign(RefId(Id("""__x11__""")), EBOp(OBOr, ERef(RefId(Id("""__x16__"""))), ERef(RefId(Id("""__x17__"""))))))), IIf(EBOp(OEq, ERef(RefId(Id("""op"""))), EStr("""^""")), ISeq(List(IApp(Id("""__x16__"""), ERef(RefId(Id("""ToInt32"""))), List(ERef(RefId(Id("""lval"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x16__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x16__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x16__""")), ERef(RefProp(RefId(Id("""__x16__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x16__"""))))), ISeq(List())), IApp(Id("""__x17__"""), ERef(RefId(Id("""ToInt32"""))), List(ERef(RefId(Id("""rval"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x17__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x17__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x17__""")), ERef(RefProp(RefId(Id("""__x17__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x17__"""))))), ISeq(List())), IAssign(RefId(Id("""__x11__""")), EBOp(OBXOr, ERef(RefId(Id("""__x16__"""))), ERef(RefId(Id("""__x17__"""))))))), IIf(EBOp(OEq, ERef(RefId(Id("""op"""))), EStr("""&""")), ISeq(List(IApp(Id("""__x16__"""), ERef(RefId(Id("""ToInt32"""))), List(ERef(RefId(Id("""lval"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x16__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x16__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x16__""")), ERef(RefProp(RefId(Id("""__x16__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x16__"""))))), ISeq(List())), IApp(Id("""__x17__"""), ERef(RefId(Id("""ToInt32"""))), List(ERef(RefId(Id("""rval"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x17__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x17__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x17__""")), ERef(RefProp(RefId(Id("""__x17__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x17__"""))))), ISeq(List())), IAssign(RefId(Id("""__x11__""")), EBOp(OBAnd, ERef(RefId(Id("""__x16__"""))), ERef(RefId(Id("""__x17__"""))))))), IIf(EBOp(OEq, ERef(RefId(Id("""op"""))), EStr(""">>>""")), ISeq(List(IApp(Id("""__x18__"""), ERef(RefId(Id("""ToUint32"""))), List(ERef(RefId(Id("""lval"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x18__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x18__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x18__""")), ERef(RefProp(RefId(Id("""__x18__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x18__"""))))), ISeq(List())), IApp(Id("""__x19__"""), ERef(RefId(Id("""ToUint32"""))), List(ERef(RefId(Id("""rval"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x19__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x19__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x19__""")), ERef(RefProp(RefId(Id("""__x19__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x19__"""))))), ISeq(List())), IAssign(RefId(Id("""__x11__""")), EBOp(OURShift, ERef(RefId(Id("""__x18__"""))), ERef(RefId(Id("""__x19__"""))))))), IIf(EBOp(OEq, ERef(RefId(Id("""op"""))), EStr(""">>""")), ISeq(List(IApp(Id("""__x16__"""), ERef(RefId(Id("""ToInt32"""))), List(ERef(RefId(Id("""lval"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x16__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x16__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x16__""")), ERef(RefProp(RefId(Id("""__x16__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x16__"""))))), ISeq(List())), IApp(Id("""__x19__"""), ERef(RefId(Id("""ToUint32"""))), List(ERef(RefId(Id("""rval"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x19__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x19__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x19__""")), ERef(RefProp(RefId(Id("""__x19__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x19__"""))))), ISeq(List())), IAssign(RefId(Id("""__x11__""")), EBOp(OSRShift, ERef(RefId(Id("""__x16__"""))), ERef(RefId(Id("""__x19__"""))))))), IIf(EBOp(OEq, ERef(RefId(Id("""op"""))), EStr("""<<""")), ISeq(List(IApp(Id("""__x16__"""), ERef(RefId(Id("""ToInt32"""))), List(ERef(RefId(Id("""lval"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x16__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x16__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x16__""")), ERef(RefProp(RefId(Id("""__x16__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x16__"""))))), ISeq(List())), IApp(Id("""__x19__"""), ERef(RefId(Id("""ToUint32"""))), List(ERef(RefId(Id("""rval"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x19__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x19__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x19__""")), ERef(RefProp(RefId(Id("""__x19__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x19__"""))))), ISeq(List())), IAssign(RefId(Id("""__x11__""")), EBOp(OLShift, ERef(RefId(Id("""__x16__"""))), ERef(RefId(Id("""__x19__"""))))))), IIf(EBOp(OEq, ERef(RefId(Id("""op"""))), EStr("""-""")), ISeq(List(IApp(Id("""__x14__"""), ERef(RefId(Id("""ToNumber"""))), List(ERef(RefId(Id("""lval"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x14__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x14__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x14__""")), ERef(RefProp(RefId(Id("""__x14__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x14__"""))))), ISeq(List())), IApp(Id("""__x15__"""), ERef(RefId(Id("""ToNumber"""))), List(ERef(RefId(Id("""rval"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x15__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x15__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x15__""")), ERef(RefProp(RefId(Id("""__x15__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x15__"""))))), ISeq(List())), IAssign(RefId(Id("""__x11__""")), EBOp(OSub, ERef(RefId(Id("""__x14__"""))), ERef(RefId(Id("""__x15__"""))))))), IIf(EBOp(OEq, ERef(RefId(Id("""op"""))), EStr("""%""")), ISeq(List(IApp(Id("""__x14__"""), ERef(RefId(Id("""ToNumber"""))), List(ERef(RefId(Id("""lval"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x14__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x14__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x14__""")), ERef(RefProp(RefId(Id("""__x14__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x14__"""))))), ISeq(List())), IApp(Id("""__x15__"""), ERef(RefId(Id("""ToNumber"""))), List(ERef(RefId(Id("""rval"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x15__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x15__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x15__""")), ERef(RefProp(RefId(Id("""__x15__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x15__"""))))), ISeq(List())), IAssign(RefId(Id("""__x11__""")), EBOp(OMod, ERef(RefId(Id("""__x14__"""))), ERef(RefId(Id("""__x15__"""))))))), IIf(EBOp(OEq, ERef(RefId(Id("""op"""))), EStr("""/""")), ISeq(List(IApp(Id("""__x14__"""), ERef(RefId(Id("""ToNumber"""))), List(ERef(RefId(Id("""lval"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x14__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x14__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x14__""")), ERef(RefProp(RefId(Id("""__x14__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x14__"""))))), ISeq(List())), IApp(Id("""__x15__"""), ERef(RefId(Id("""ToNumber"""))), List(ERef(RefId(Id("""rval"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x15__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x15__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x15__""")), ERef(RefProp(RefId(Id("""__x15__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x15__"""))))), ISeq(List())), IAssign(RefId(Id("""__x11__""")), EBOp(ODiv, ERef(RefId(Id("""__x14__"""))), ERef(RefId(Id("""__x15__"""))))))), IIf(EBOp(OEq, ERef(RefId(Id("""op"""))), EStr("""*""")), ISeq(List(IApp(Id("""__x14__"""), ERef(RefId(Id("""ToNumber"""))), List(ERef(RefId(Id("""lval"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x14__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x14__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x14__""")), ERef(RefProp(RefId(Id("""__x14__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x14__"""))))), ISeq(List())), IApp(Id("""__x15__"""), ERef(RefId(Id("""ToNumber"""))), List(ERef(RefId(Id("""rval"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x15__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x15__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x15__""")), ERef(RefProp(RefId(Id("""__x15__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x15__"""))))), ISeq(List())), IAssign(RefId(Id("""__x11__""")), EBOp(OMul, ERef(RefId(Id("""__x14__"""))), ERef(RefId(Id("""__x15__"""))))))), IExpr(ENotSupported("""assign operator""")))))))))))))), ILet(Id("""r"""), ERef(RefId(Id("""__x11__""")))), IApp(Id("""__x20__"""), ERef(RefId(Id("""PutValue"""))), List(ERef(RefId(Id("""lref"""))), ERef(RefId(Id("""r"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x20__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x20__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x20__""")), ERef(RefProp(RefId(Id("""__x20__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x20__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x20__""")))), IApp(Id("""__x21__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""r"""))))), IReturn(ERef(RefId(Id("""__x21__""")))))))
  /* Beautified form:
  "AssignmentExpression5Evaluation0" (this, LeftHandSideExpression, AssignmentOperator, AssignmentExpression) => {
    access __x0__ = (LeftHandSideExpression "Evaluation")
    let lref = __x0__
    app __x1__ = (GetValue lref)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let lval = __x1__
    access __x2__ = (AssignmentExpression "Evaluation")
    let rref = __x2__
    app __x3__ = (GetValue rref)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let rval = __x3__
    let __x4__ = (get-syntax AssignmentOperator)
    __x4__ = (- __x4__ 1i)
    let op = __x4__
    if (= op "+") {
      app __x5__ = (ToPrimitive lval)
      if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
      app __x6__ = (ToPrimitive rval)
      if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
      app __x7__ = (Type __x5__)
      app __x8__ = (Type __x6__)
      if (|| (= __x7__ "String") (= __x8__ "String")) {
        app __x9__ = (ToString __x5__)
        if (is-completion __x9__) if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
        app __x10__ = (ToString __x6__)
        if (is-completion __x10__) if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
        __x11__ = (+ __x9__ __x10__)
      } else {
        app __x12__ = (ToNumber __x5__)
        if (is-completion __x12__) if (= __x12__["Type"] CONST_normal) __x12__ = __x12__["Value"] else return __x12__ else {}
        app __x13__ = (ToNumber __x6__)
        if (is-completion __x13__) if (= __x13__["Type"] CONST_normal) __x13__ = __x13__["Value"] else return __x13__ else {}
        __x11__ = (+ __x12__ __x13__)
      }
    } else if (= op "**") {
      app __x14__ = (ToNumber lval)
      if (is-completion __x14__) if (= __x14__["Type"] CONST_normal) __x14__ = __x14__["Value"] else return __x14__ else {}
      app __x15__ = (ToNumber rval)
      if (is-completion __x15__) if (= __x15__["Type"] CONST_normal) __x15__ = __x15__["Value"] else return __x15__ else {}
      __x11__ = (** __x14__ __x15__)
    } else if (= op "|") {
      app __x16__ = (ToInt32 lval)
      if (is-completion __x16__) if (= __x16__["Type"] CONST_normal) __x16__ = __x16__["Value"] else return __x16__ else {}
      app __x17__ = (ToInt32 rval)
      if (is-completion __x17__) if (= __x17__["Type"] CONST_normal) __x17__ = __x17__["Value"] else return __x17__ else {}
      __x11__ = (| __x16__ __x17__)
    } else if (= op "^") {
      app __x16__ = (ToInt32 lval)
      if (is-completion __x16__) if (= __x16__["Type"] CONST_normal) __x16__ = __x16__["Value"] else return __x16__ else {}
      app __x17__ = (ToInt32 rval)
      if (is-completion __x17__) if (= __x17__["Type"] CONST_normal) __x17__ = __x17__["Value"] else return __x17__ else {}
      __x11__ = (^ __x16__ __x17__)
    } else if (= op "&") {
      app __x16__ = (ToInt32 lval)
      if (is-completion __x16__) if (= __x16__["Type"] CONST_normal) __x16__ = __x16__["Value"] else return __x16__ else {}
      app __x17__ = (ToInt32 rval)
      if (is-completion __x17__) if (= __x17__["Type"] CONST_normal) __x17__ = __x17__["Value"] else return __x17__ else {}
      __x11__ = (& __x16__ __x17__)
    } else if (= op ">>>") {
      app __x18__ = (ToUint32 lval)
      if (is-completion __x18__) if (= __x18__["Type"] CONST_normal) __x18__ = __x18__["Value"] else return __x18__ else {}
      app __x19__ = (ToUint32 rval)
      if (is-completion __x19__) if (= __x19__["Type"] CONST_normal) __x19__ = __x19__["Value"] else return __x19__ else {}
      __x11__ = (>>> __x18__ __x19__)
    } else if (= op ">>") {
      app __x16__ = (ToInt32 lval)
      if (is-completion __x16__) if (= __x16__["Type"] CONST_normal) __x16__ = __x16__["Value"] else return __x16__ else {}
      app __x19__ = (ToUint32 rval)
      if (is-completion __x19__) if (= __x19__["Type"] CONST_normal) __x19__ = __x19__["Value"] else return __x19__ else {}
      __x11__ = (>> __x16__ __x19__)
    } else if (= op "<<") {
      app __x16__ = (ToInt32 lval)
      if (is-completion __x16__) if (= __x16__["Type"] CONST_normal) __x16__ = __x16__["Value"] else return __x16__ else {}
      app __x19__ = (ToUint32 rval)
      if (is-completion __x19__) if (= __x19__["Type"] CONST_normal) __x19__ = __x19__["Value"] else return __x19__ else {}
      __x11__ = (<< __x16__ __x19__)
    } else if (= op "-") {
      app __x14__ = (ToNumber lval)
      if (is-completion __x14__) if (= __x14__["Type"] CONST_normal) __x14__ = __x14__["Value"] else return __x14__ else {}
      app __x15__ = (ToNumber rval)
      if (is-completion __x15__) if (= __x15__["Type"] CONST_normal) __x15__ = __x15__["Value"] else return __x15__ else {}
      __x11__ = (- __x14__ __x15__)
    } else if (= op "%") {
      app __x14__ = (ToNumber lval)
      if (is-completion __x14__) if (= __x14__["Type"] CONST_normal) __x14__ = __x14__["Value"] else return __x14__ else {}
      app __x15__ = (ToNumber rval)
      if (is-completion __x15__) if (= __x15__["Type"] CONST_normal) __x15__ = __x15__["Value"] else return __x15__ else {}
      __x11__ = (% __x14__ __x15__)
    } else if (= op "/") {
      app __x14__ = (ToNumber lval)
      if (is-completion __x14__) if (= __x14__["Type"] CONST_normal) __x14__ = __x14__["Value"] else return __x14__ else {}
      app __x15__ = (ToNumber rval)
      if (is-completion __x15__) if (= __x15__["Type"] CONST_normal) __x15__ = __x15__["Value"] else return __x15__ else {}
      __x11__ = (/ __x14__ __x15__)
    } else if (= op "*") {
      app __x14__ = (ToNumber lval)
      if (is-completion __x14__) if (= __x14__["Type"] CONST_normal) __x14__ = __x14__["Value"] else return __x14__ else {}
      app __x15__ = (ToNumber rval)
      if (is-completion __x15__) if (= __x15__["Type"] CONST_normal) __x15__ = __x15__["Value"] else return __x15__ else {}
      __x11__ = (* __x14__ __x15__)
    } else !!! "assign operator"
    let r = __x11__
    app __x20__ = (PutValue lref r)
    if (is-completion __x20__) if (= __x20__["Type"] CONST_normal) __x20__ = __x20__["Value"] else return __x20__ else {}
    __x20__
    app __x21__ = (WrapCompletion r)
    return __x21__
  }
  */
}