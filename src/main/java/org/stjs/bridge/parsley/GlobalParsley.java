package org.stjs.bridge.parsley;

import org.stjs.javascript.annotation.GlobalScope;
import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.annotation.SyntheticType;

@GlobalScope
@STJSBridge
@SyntheticType
public class GlobalParsley {

	public static ParsleyUI ParsleyUI = new ParsleyUI(); 
	public static ParsleyConfig ParsleyConfig = new ParsleyConfig(); 
}
