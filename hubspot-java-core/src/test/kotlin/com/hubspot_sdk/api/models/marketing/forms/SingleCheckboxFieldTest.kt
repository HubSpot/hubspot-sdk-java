// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.forms

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SingleCheckboxFieldTest {

    @Test
    fun create() {
        val singleCheckboxField =
            SingleCheckboxField.builder()
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
                .fieldType(SingleCheckboxField.FieldType.SINGLE_CHECKBOX)
                .hidden(true)
                .label("label")
                .name("name")
                .objectTypeId("objectTypeId")
                .required(true)
                .defaultValue("defaultValue")
                .description("description")
                .build()

        assertThat(singleCheckboxField.dependentFields())
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
        assertThat(singleCheckboxField.fieldType())
            .isEqualTo(SingleCheckboxField.FieldType.SINGLE_CHECKBOX)
        assertThat(singleCheckboxField.hidden()).isEqualTo(true)
        assertThat(singleCheckboxField.label()).isEqualTo("label")
        assertThat(singleCheckboxField.name()).isEqualTo("name")
        assertThat(singleCheckboxField.objectTypeId()).isEqualTo("objectTypeId")
        assertThat(singleCheckboxField.required()).isEqualTo(true)
        assertThat(singleCheckboxField.defaultValue()).contains("defaultValue")
        assertThat(singleCheckboxField.description()).contains("description")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val singleCheckboxField =
            SingleCheckboxField.builder()
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
                .fieldType(SingleCheckboxField.FieldType.SINGLE_CHECKBOX)
                .hidden(true)
                .label("label")
                .name("name")
                .objectTypeId("objectTypeId")
                .required(true)
                .defaultValue("defaultValue")
                .description("description")
                .build()

        val roundtrippedSingleCheckboxField =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(singleCheckboxField),
                jacksonTypeRef<SingleCheckboxField>(),
            )

        assertThat(roundtrippedSingleCheckboxField).isEqualTo(singleCheckboxField)
    }
}
