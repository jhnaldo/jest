package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object FunctionDeclarationInstantiation extends Algorithm {
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = parseFunc(""""FunctionDeclarationInstantiation" (func, argumentsList) => {
    let calleeContext = GLOBAL_context
    access __x0__ = (calleeContext "LexicalEnvironment")
    let env = __x0__
    let envRec = env["EnvironmentRecord"]
    let code = func["ECMAScriptCode"]
    let strict = func["Strict"]
    let formals = func["FormalParameters"]
    access __x1__ = (formals "BoundNames")
    let parameterNames = __x1__
    app __x2__ = (IsDuplicate parameterNames)
    if __x2__ let hasDuplicates = true else let hasDuplicates = false
    access __x3__ = (formals "IsSimpleParameterList")
    let simpleParameterList = __x3__
    access __x4__ = (formals "ContainsExpression")
    let hasParameterExpressions = __x4__
    access __x5__ = (code "VarDeclaredNames")
    let varNames = __x5__
    access __x6__ = (code "VarScopedDeclarations")
    let varDeclarations = __x6__
    access __x7__ = (code "LexicallyDeclaredNames")
    let lexicalNames = __x7__
    let functionNames = (new [])
    let functionsToInitialize = (new [])
    let __x8__ = varDeclarations
    let __x9__ = __x8__["length"]
    while (< 0i __x9__) {
      __x9__ = (- __x9__ 1i)
      let d = __x8__[__x9__]
      if (! (|| (|| (is-instance-of d VariableDeclaration) (is-instance-of d ForBinding)) (is-instance-of d BindingIdentifier))) {
        assert (|| (|| (|| (is-instance-of d FunctionDeclaration) (is-instance-of d GeneratorDeclaration)) (is-instance-of d AsyncFunctionDeclaration)) (is-instance-of d AsyncGeneratorDeclaration))
        access __x10__ = (d "BoundNames")
        let fn = __x10__[0i]
        if (! (contains functionNames fn)) {
          prepend fn -> functionNames
          prepend d -> functionsToInitialize
        } else {}
      } else {}
    }
    let argumentsObjectNeeded = true
    if (= func["ThisMode"] CONST_lexical) argumentsObjectNeeded = false else if (contains parameterNames "arguments") argumentsObjectNeeded = false else if (= hasParameterExpressions false) if (|| (contains functionNames "arguments") (contains lexicalNames "arguments")) argumentsObjectNeeded = false else {} else {}
    let __x11__ = parameterNames
    let __x12__ = 0i
    while (< __x12__ __x11__["length"]) {
      let paramName = __x11__[__x12__]
      app __x13__ = (envRec["HasBinding"] envRec paramName)
      let alreadyDeclared = __x13__
      if (= alreadyDeclared false) {
        app __x14__ = (envRec["CreateMutableBinding"] envRec paramName false)
        if (is-completion __x14__) if (= __x14__["Type"] CONST_normal) __x14__ = __x14__["Value"] else return __x14__ else {}
        __x14__
        if (= hasDuplicates true) {
          app __x15__ = (envRec["InitializeBinding"] envRec paramName undefined)
          if (is-completion __x15__) if (= __x15__["Type"] CONST_normal) __x15__ = __x15__["Value"] else return __x15__ else {}
          __x15__
        } else {}
      } else {}
      __x12__ = (+ __x12__ 1i)
    }
    if (= argumentsObjectNeeded true) {
      if (|| (= strict true) (= simpleParameterList false)) {
        app __x16__ = (CreateUnmappedArgumentsObject argumentsList)
        let ao = __x16__
      } else {
        app __x17__ = (CreateMappedArgumentsObject func formals argumentsList envRec)
        let ao = __x17__
      }
      if (= strict true) {
        app __x18__ = (envRec["CreateImmutableBinding"] envRec "arguments" false)
        if (is-completion __x18__) if (= __x18__["Type"] CONST_normal) __x18__ = __x18__["Value"] else return __x18__ else {}
        __x18__
      } else {
        app __x19__ = (envRec["CreateMutableBinding"] envRec "arguments" false)
        if (is-completion __x19__) if (= __x19__["Type"] CONST_normal) __x19__ = __x19__["Value"] else return __x19__ else {}
        __x19__
      }
      app __x20__ = (envRec["InitializeBinding"] envRec "arguments" ao)
      __x20__
      let __x21__ = (copy-obj parameterNames)
      append "arguments" -> __x21__
      let parameterBindings = __x21__
    } else let parameterBindings = parameterNames
    app __x22__ = (CreateListIteratorRecord argumentsList)
    let iteratorRecord = __x22__
    if (= hasDuplicates true) {
      access __x23__ = (formals "IteratorBindingInitialization")
      app __x24__ = (__x23__ iteratorRecord undefined)
      if (is-completion __x24__) if (= __x24__["Type"] CONST_normal) __x24__ = __x24__["Value"] else return __x24__ else {}
      __x24__
    } else {
      access __x25__ = (formals "IteratorBindingInitialization")
      app __x26__ = (__x25__ iteratorRecord env)
      if (is-completion __x26__) if (= __x26__["Type"] CONST_normal) __x26__ = __x26__["Value"] else return __x26__ else {}
      __x26__
    }
    if (= hasParameterExpressions false) {
      let instantiatedVarNames = (copy-obj parameterBindings)
      let __x27__ = varNames
      let __x28__ = 0i
      while (< __x28__ __x27__["length"]) {
        let n = __x27__[__x28__]
        if (! (contains instantiatedVarNames n)) {
          append n -> instantiatedVarNames
          app __x29__ = (envRec["CreateMutableBinding"] envRec n false)
          if (is-completion __x29__) if (= __x29__["Type"] CONST_normal) __x29__ = __x29__["Value"] else return __x29__ else {}
          __x29__
          app __x30__ = (envRec["InitializeBinding"] envRec n undefined)
          __x30__
        } else {}
        __x28__ = (+ __x28__ 1i)
      }
      let varEnv = env
      let varEnvRec = envRec
    } else {
      app __x31__ = (NewDeclarativeEnvironment env)
      let varEnv = __x31__
      let varEnvRec = varEnv["EnvironmentRecord"]
      calleeContext["VariableEnvironment"] = varEnv
      let instantiatedVarNames = (new [])
      let __x32__ = varNames
      let __x33__ = 0i
      while (< __x33__ __x32__["length"]) {
        let n = __x32__[__x33__]
        if (! (contains instantiatedVarNames n)) {
          append n -> instantiatedVarNames
          app __x34__ = (varEnvRec["CreateMutableBinding"] varEnvRec n false)
          if (is-completion __x34__) if (= __x34__["Type"] CONST_normal) __x34__ = __x34__["Value"] else return __x34__ else {}
          __x34__
          if (|| (! (contains parameterBindings n)) (contains functionNames n)) let initialValue = undefined else {
            app __x35__ = (envRec["GetBindingValue"] envRec n false)
            if (is-completion __x35__) if (= __x35__["Type"] CONST_normal) __x35__ = __x35__["Value"] else return __x35__ else {}
            let initialValue = __x35__
          }
          app __x36__ = (varEnvRec["InitializeBinding"] varEnvRec n initialValue)
          __x36__
        } else {}
        __x33__ = (+ __x33__ 1i)
      }
    }
    if (= strict false) {
      app __x37__ = (NewDeclarativeEnvironment varEnv)
      let lexEnv = __x37__
    } else let lexEnv = varEnv
    let lexEnvRec = lexEnv["EnvironmentRecord"]
    calleeContext["LexicalEnvironment"] = lexEnv
    access __x38__ = (code "LexicallyScopedDeclarations")
    let lexDeclarations = __x38__
    let __x39__ = lexDeclarations
    let __x40__ = 0i
    while (< __x40__ __x39__["length"]) {
      let d = __x39__[__x40__]
      access __x41__ = (d "BoundNames")
      let __x42__ = __x41__
      let __x43__ = 0i
      while (< __x43__ __x42__["length"]) {
        let dn = __x42__[__x43__]
        access __x44__ = (d "IsConstantDeclaration")
        if (= __x44__ true) {
          app __x45__ = (lexEnvRec["CreateImmutableBinding"] lexEnvRec dn true)
          if (is-completion __x45__) if (= __x45__["Type"] CONST_normal) __x45__ = __x45__["Value"] else return __x45__ else {}
          __x45__
        } else {
          app __x46__ = (lexEnvRec["CreateMutableBinding"] lexEnvRec dn false)
          if (is-completion __x46__) if (= __x46__["Type"] CONST_normal) __x46__ = __x46__["Value"] else return __x46__ else {}
          __x46__
        }
        __x43__ = (+ __x43__ 1i)
      }
      __x40__ = (+ __x40__ 1i)
    }
    let __x47__ = functionsToInitialize
    let __x48__ = 0i
    while (< __x48__ __x47__["length"]) {
      let f = __x47__[__x48__]
      access __x49__ = (f "BoundNames")
      let fn = __x49__[0i]
      access __x50__ = (f "InstantiateFunctionObject")
      app __x51__ = (__x50__ lexEnv)
      let fo = __x51__
      app __x52__ = (varEnvRec["SetMutableBinding"] varEnvRec fn fo false)
      if (is-completion __x52__) if (= __x52__["Type"] CONST_normal) __x52__ = __x52__["Value"] else return __x52__ else {}
      __x52__
      __x48__ = (+ __x48__ 1i)
    }
    app __x53__ = (NormalCompletion CONST_empty)
    app __x54__ = (WrapCompletion __x53__)
    return __x54__
  }""")
}
