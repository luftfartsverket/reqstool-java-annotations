// Copyright © LFV
package io.github.reqstool.processor;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.processing.Processor;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.lang.model.element.Element;
import com.google.auto.service.AutoService;
import io.github.reqstool.annotations.Requirements;

@SupportedAnnotationTypes("io.github.reqstool.annotations.Requirements")
@AutoService(Processor.class)
public class RequirementsProcessor extends AbstractAnnotationsProcessor {

	public RequirementsProcessor() {
		super(AnnotationTypes.REQUIREMENTS);
	}

	@Override
	List<String> getAnnotationStrings(Element element) {
		Requirements requirements = element.getAnnotation(Requirements.class);

		return (requirements == null ? Collections.<String>emptyList() : Arrays.asList(requirements.value()));
	}

}