// Copyright © LFV
package se.lfv.reqstool.processor;

import javax.lang.model.element.ElementKind;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Placeholder class for @Requirement annotation locations and their type
 */

@JsonPropertyOrder({ "elementKind", "fullyQualifiedName" })
public record AnnotationInfo(String fullyQualifiedName, ElementKind elementKind) {
}