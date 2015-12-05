package org.stjs.bridge.parsley;

import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.dom.Element;
import org.stjs.javascript.functions.Function1;

@STJSBridge
/**
 * See http://parsleyjs.org/doc/annotated-source/defaults.html
 * @author pascal
 *
 */
public class ParsleyConfig {

	/**
	 * Class that would be added on every failing validation Parsley field
	 */
	public String errorClass;

	/**
	 * Same as errorClass but for success validation
	 */
	public String successClass;

	/**
	 * Return the $element where errors will be appended Could also be (and
	 * given directly from DOM) a valid selector like '#div'
	 */
	public Function1<ParsleyField, Element> errorsContainer;
}
