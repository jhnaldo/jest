package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ClassTail0ClassDefinitionEvaluation3 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ClassTail0ClassDefinitionEvaluation3" (this, ClassHeritage, ClassBody, classBinding, className) => {
    access __x0__ = (GLOBAL_context "LexicalEnvironment")
    let lex = __x0__
    app __x1__ = (NewDeclarativeEnvironment lex)
    let classScope = __x1__
    let classScopeEnvRec = classScope["EnvironmentRecord"]
    if (! (= classBinding undefined)) {
      app __x2__ = (classScopeEnvRec["CreateImmutableBinding"] classScopeEnvRec classBinding true)
      __x2__
    } else {}
    if (= ClassHeritage absent) {
      let protoParent = INTRINSIC_ObjectPrototype
      let constructorParent = INTRINSIC_FunctionPrototype
    } else {
      GLOBAL_context["LexicalEnvironment"] = classScope
      access __x3__ = (ClassHeritage "Evaluation")
      let superclassRef = __x3__
      GLOBAL_context["LexicalEnvironment"] = lex
      app __x4__ = (GetValue superclassRef)
      if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
      let superclass = __x4__
      if (= superclass null) {
        let protoParent = null
        let constructorParent = INTRINSIC_FunctionPrototype
      } else {
        app __x5__ = (IsConstructor superclass)
        if (= __x5__ false) {
          app __x6__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
          return __x6__
        } else {
          app __x7__ = (Get superclass "prototype")
          if (is-completion __x7__) if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
          let protoParent = __x7__
          app __x8__ = (Type protoParent)
          if (! (|| (= __x8__ Object) (= __x8__ Null))) {
            app __x9__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
            return __x9__
          } else {}
          let constructorParent = superclass
        }
      }
    }
    app __x10__ = (ObjectCreate protoParent)
    let proto = __x10__
    if (= ClassBody absent) let constructor = CONST_empty else {
      access __x11__ = (ClassBody "ConstructorMethod")
      let constructor = __x11__
    }
    if (= constructor CONST_empty) if (! (= ClassHeritage absent)) constructor = (parse-syntax "constructor(... args){ super (...args);}" "MethodDefinition" false false) else constructor = (parse-syntax "constructor(){ }" "MethodDefinition" false false) else {}
    GLOBAL_context["LexicalEnvironment"] = classScope
    access __x12__ = (constructor "DefineMethod")
    app __x13__ = (__x12__ proto constructorParent)
    let constructorInfo = __x13__
    if (is-completion constructorInfo) if (= constructorInfo["Type"] CONST_normal) constructorInfo = constructorInfo["Value"] else return constructorInfo else {}
    constructorInfo
    app __x14__ = (IsAbruptCompletion constructorInfo)
    assert (! __x14__)
    let F = constructorInfo["Closure"]
    if (! (= ClassHeritage absent)) F["ConstructorKind"] = "derived" else {}
    app __x15__ = (MakeConstructor F false proto)
    __x15__
    app __x16__ = (MakeClassConstructor F)
    __x16__
    if (! (= className undefined)) {
      app __x17__ = (SetFunctionName F className)
      __x17__
    } else {}
    app __x18__ = (CreateMethodProperty proto "constructor" F)
    __x18__
    if (= ClassBody absent) let methods = (new []) else {
      access __x19__ = (ClassBody "NonConstructorMethodDefinitions")
      let methods = __x19__
    }
    let __x20__ = methods
    let __x21__ = 0i
    while (< __x21__ __x20__["length"]) {
      let m = __x20__[__x21__]
      access __x22__ = (m "IsStatic")
      if (= __x22__ false) {
        access __x23__ = (m "PropertyDefinitionEvaluation")
        app __x24__ = (__x23__ proto false)
        let status = __x24__
      } else {
        access __x25__ = (m "PropertyDefinitionEvaluation")
        app __x26__ = (__x25__ F false)
        let status = __x26__
      }
      app __x27__ = (IsAbruptCompletion status)
      if __x27__ {
        GLOBAL_context["LexicalEnvironment"] = lex
        app __x28__ = (Completion status)
        app __x29__ = (WrapCompletion __x28__)
        return __x29__
      } else {}
      __x21__ = (+ __x21__ 1i)
    }
    GLOBAL_context["LexicalEnvironment"] = lex
    if (! (= classBinding undefined)) {
      app __x30__ = (classScopeEnvRec["InitializeBinding"] classScopeEnvRec classBinding F)
      __x30__
    } else {}
    app __x31__ = (WrapCompletion F)
    return __x31__
  }"""))
}
