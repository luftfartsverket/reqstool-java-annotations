// Copyright © LFV
package io.github.reqstool.annotations;

import io.github.reqstool.annotations.SVCs;

@SVCs({ "SVC_001", "SVC_002", "SVC_003" })
public class SVCsExample {

	@SVCs("SVC_003")
	public void someMethod() {
	}

}