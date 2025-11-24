// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.forms

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SingleLineTextFieldTest {

    @Test
    fun create() {
        val singleLineTextField =
            SingleLineTextField.builder()
                .addDependentField(
                    DependentField.builder()
                        .dependentCondition(
                            DependentFieldFilter.builder()
                                .operator(DependentFieldFilter.Operator.BETWEEN)
                                .rangeEnd("rangeEnd")
                                .rangeStart("rangeStart")
                                .value("value")
                                .addValue("string")
                                .build()
                        )
                        .dependentField(
                            EmailField.builder()
                                .dependentFields(listOf())
                                .fieldType(EmailField.FieldType.EMAIL)
                                .hidden(true)
                                .label("label")
                                .name("name")
                                .objectTypeId("objectTypeId")
                                .required(true)
                                .validation(
                                    EmailFieldValidation.builder()
                                        .addBlockedEmailDomain("string")
                                        .useDefaultBlockList(true)
                                        .build()
                                )
                                .defaultValue("defaultValue")
                                .description("description")
                                .placeholder("placeholder")
                                .build()
                        )
                        .build()
                )
                .fieldType(SingleLineTextField.FieldType.SINGLE_LINE_TEXT)
                .hidden(true)
                .label("label")
                .name("name")
                .objectTypeId("objectTypeId")
                .required(true)
                .defaultValue("defaultValue")
                .description("description")
                .placeholder("placeholder")
                .build()

        assertThat(singleLineTextField.dependentFields())
            .containsExactly(
                DependentField.builder()
                    .dependentCondition(
                        DependentFieldFilter.builder()
                            .operator(DependentFieldFilter.Operator.BETWEEN)
                            .rangeEnd("rangeEnd")
                            .rangeStart("rangeStart")
                            .value("value")
                            .addValue("string")
                            .build()
                    )
                    .dependentField(
                        EmailField.builder()
                            .dependentFields(listOf())
                            .fieldType(EmailField.FieldType.EMAIL)
                            .hidden(true)
                            .label("label")
                            .name("name")
                            .objectTypeId("objectTypeId")
                            .required(true)
                            .validation(
                                EmailFieldValidation.builder()
                                    .addBlockedEmailDomain("string")
                                    .useDefaultBlockList(true)
                                    .build()
                            )
                            .defaultValue("defaultValue")
                            .description("description")
                            .placeholder("placeholder")
                            .build()
                    )
                    .build()
            )
        assertThat(singleLineTextField.fieldType())
            .isEqualTo(SingleLineTextField.FieldType.SINGLE_LINE_TEXT)
        assertThat(singleLineTextField.hidden()).isEqualTo(true)
        assertThat(singleLineTextField.label()).isEqualTo("label")
        assertThat(singleLineTextField.name()).isEqualTo("name")
        assertThat(singleLineTextField.objectTypeId()).isEqualTo("objectTypeId")
        assertThat(singleLineTextField.required()).isEqualTo(true)
        assertThat(singleLineTextField.defaultValue()).contains("defaultValue")
        assertThat(singleLineTextField.description()).contains("description")
        assertThat(singleLineTextField.placeholder()).contains("placeholder")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val singleLineTextField =
            SingleLineTextField.builder()
                .addDependentField(
                    DependentField.builder()
                        .dependentCondition(
                            DependentFieldFilter.builder()
                                .operator(DependentFieldFilter.Operator.BETWEEN)
                                .rangeEnd("rangeEnd")
                                .rangeStart("rangeStart")
                                .value("value")
                                .addValue("string")
                                .build()
                        )
                        .dependentField(
                            EmailField.builder()
                                .dependentFields(listOf())
                                .fieldType(EmailField.FieldType.EMAIL)
                                .hidden(true)
                                .label("label")
                                .name("name")
                                .objectTypeId("objectTypeId")
                                .required(true)
                                .validation(
                                    EmailFieldValidation.builder()
                                        .addBlockedEmailDomain("string")
                                        .useDefaultBlockList(true)
                                        .build()
                                )
                                .defaultValue("defaultValue")
                                .description("description")
                                .placeholder("placeholder")
                                .build()
                        )
                        .build()
                )
                .fieldType(SingleLineTextField.FieldType.SINGLE_LINE_TEXT)
                .hidden(true)
                .label("label")
                .name("name")
                .objectTypeId("objectTypeId")
                .required(true)
                .defaultValue("defaultValue")
                .description("description")
                .placeholder("placeholder")
                .build()

        val roundtrippedSingleLineTextField =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(singleLineTextField),
                jacksonTypeRef<SingleLineTextField>(),
            )

        assertThat(roundtrippedSingleLineTextField).isEqualTo(singleLineTextField)
    }
}
