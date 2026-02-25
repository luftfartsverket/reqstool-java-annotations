// Copyright © LFV
package io.github.reqstool.annotations;

import io.github.reqstool.annotations.Requirements;

@Requirements({ "REQ_001", "REQ_002", "REQ_003" })
public class RequirementsExample {

	@Requirements("REQ_004")
	int field;

	@Requirements("REQ_003")
	public void someMethod1() {
	}

}