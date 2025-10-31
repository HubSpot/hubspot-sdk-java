// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.forms

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DependentFieldTest {

    @Test
    fun create() {
        val dependentField =
            DependentField.builder()
                .dependentCondition(
                    DependentFieldFilter.builder()
                        .operator(DependentFieldFilter.Operator.EQ)
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

        assertThat(dependentField.dependentCondition())
            .isEqualTo(
                DependentFieldFilter.builder()
                    .operator(DependentFieldFilter.Operator.EQ)
                    .rangeEnd("rangeEnd")
                    .rangeStart("rangeStart")
                    .value("value")
                    .addValue("string")
                    .build()
            )
        assertThat(dependentField.dependentField())
            .isEqualTo(
                DependentField.InnerDependentField.ofEmail(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dependentField =
            DependentField.builder()
                .dependentCondition(
                    DependentFieldFilter.builder()
                        .operator(DependentFieldFilter.Operator.EQ)
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

        val roundtrippedDependentField =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dependentField),
                jacksonTypeRef<DependentField>(),
            )

        assertThat(roundtrippedDependentField).isEqualTo(dependentField)
    }
}
