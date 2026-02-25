// Copyright © LFV
package io.github.reqstool.processor;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.processing.Processor;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.lang.model.element.Element;
import com.google.auto.service.AutoService;
import io.github.reqstool.annotations.SVCs;

@SupportedAnnotationTypes("io.github.reqstool.annotations.SVCs")
@AutoService(Processor.class)
public class SVCsProcessor extends AbstractAnnotationsProcessor {

	public SVCsProcessor() {
		super(AnnotationTypes.SVCS);
	}

	@Override
	List<String> getAnnotationStrings(Element element) {
		SVCs svcs = element.getAnnotation(SVCs.class);

		return (svcs == null ? Collections.<String>emptyList() : Arrays.asList(svcs.value()));
	}

}