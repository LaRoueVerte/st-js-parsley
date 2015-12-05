package org.stjs.bridge.parsley;

import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.jquery.Event;

@STJSBridge
public class ParsleyForm {

	Event submitEvent;

	/**
	 * Validate form. Prevents submission if not valid. Fires events and affects
	 * UI.. You can only validate a certain group of fields by specifying
	 * optional group string parameter.
	 * 
	 * @return
	 */
	public boolean validate() {
		return true;
	}

	/**
	 * Validate form. Prevents submission if not valid. Fires events and affects
	 * UI.. You can only validate a certain group of fields by specifying
	 * optional group string parameter
	 * 
	 * @param group
	 *            it only validates fields that belong to this group
	 * @return
	 */
	public boolean validate(String group) {
		return true;
	}

	/**
	 * Validate form. Prevents submission if not valid. Fires events and affects
	 * UI.. You can only validate a certain group of fields by specifying
	 * optional group string parameter.
	 * 
	 * @param group
	 *            it only validates fields that belong to this group
	 * @param force
	 *            it force validates even non required fields
	 * @return
	 */
	public boolean validate(String group, boolean force) {
		return true;
	}
}
