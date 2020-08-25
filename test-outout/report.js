$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/initialiseAPI.feature");
formatter.feature({
  "name": "Lavego_TMS Intialize API",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validate Initialize API",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Intialize"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "device info is available",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinations.InitializeApi_testSteps.device_info_is_available()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: 1 expectation failed.\nExpected status code \u003c200\u003e but was \u003c401\u003e.\n\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.codehaus.groovy.reflection.CachedConstructor.invoke(CachedConstructor.java:72)\r\n\tat org.codehaus.groovy.reflection.CachedConstructor.doConstructorInvoke(CachedConstructor.java:59)\r\n\tat org.codehaus.groovy.runtime.callsite.ConstructorSite$ConstructorSiteNoUnwrap.callConstructor(ConstructorSite.java:84)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCallConstructor(CallSiteArray.java:59)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.callConstructor(AbstractCallSite.java:263)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.callConstructor(AbstractCallSite.java:277)\r\n\tat io.restassured.internal.ResponseSpecificationImpl$HamcrestAssertionClosure.validate(ResponseSpecificationImpl.groovy:493)\r\n\tat io.restassured.internal.ResponseSpecificationImpl$HamcrestAssertionClosure$validate$1.call(Unknown Source)\r\n\tat io.restassured.internal.ResponseSpecificationImpl.validate(ResponseSpecificationImpl.groovy:92)\r\n\tat io.restassured.internal.ValidatableResponseOptionsImpl.spec(ValidatableResponseOptionsImpl.java:288)\r\n\tat io.restassured.internal.ValidatableResponseImpl.super$2$spec(ValidatableResponseImpl.groovy)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.codehaus.groovy.reflection.CachedMethod.invoke(CachedMethod.java:107)\r\n\tat groovy.lang.MetaMethod.doMethodInvoke(MetaMethod.java:323)\r\n\tat groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:1262)\r\n\tat org.codehaus.groovy.runtime.ScriptBytecodeAdapter.invokeMethodOnSuperN(ScriptBytecodeAdapter.java:144)\r\n\tat io.restassured.internal.ValidatableResponseImpl.spec(ValidatableResponseImpl.groovy:76)\r\n\tat io.restassured.internal.ValidatableResponseImpl.spec(ValidatableResponseImpl.groovy)\r\n\tat stepDefinations.InitializeApi_testSteps.device_info_is_available(InitializeApi_testSteps.java:39)\r\n\tat ✽.device info is available(file:///C:/Users/Deepankar/eclipse-workspace/lavego_TMS_API/src/test/java/features/initialiseAPI.feature:6)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "i add device info to server",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinations.InitializeApi_testSteps.i_add_device_info_to_server()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Information added",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinations.InitializeApi_testSteps.information_added()"
});
formatter.result({
  "status": "skipped"
});
});