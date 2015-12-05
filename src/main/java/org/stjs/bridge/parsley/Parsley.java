package org.stjs.bridge.parsley;

import org.stjs.javascript.XMLHttpRequest;
import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.functions.Callback1;
import org.stjs.javascript.functions.Callback2;
import org.stjs.javascript.functions.Function1;

@STJSBridge
public class Parsley {

	public void subscribe(String event, Callback1<ParsleyForm> callback) { }
	
	public void addAsyncValidator(String name, Function1<XMLHttpRequest, Boolean> function1, String apiUrl) { }

}
