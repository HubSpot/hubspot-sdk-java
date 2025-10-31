// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.forms

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailFieldTest {

    @Test
    fun create() {
        val emailField =
            EmailField.builder()
                .addDependentField(
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
                            PhoneField.builder()
                                .dependentFields(listOf())
                                .fieldType(PhoneField.FieldType.PHONE)
                                .hidden(true)
                                .label("label")
                                .name("name")
                                .objectTypeId("objectTypeId")
                                .required(true)
                                .useCountryCodeSelect(true)
                                .validation(
                                    PhoneFieldValidation.builder()
                                        .maxAllowedDigits(0)
                                        .minAllowedDigits(0)
                                        .build()
                                )
                                .defaultValue("defaultValue")
                                .description("description")
                                .placeholder("placeholder")
                                .build()
                        )
                        .build()
                )
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

        assertThat(emailField.dependentFields())
            .containsExactly(
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
                        PhoneField.builder()
                            .dependentFields(listOf())
                            .fieldType(PhoneField.FieldType.PHONE)
                            .hidden(true)
                            .label("label")
                            .name("name")
                            .objectTypeId("objectTypeId")
                            .required(true)
                            .useCountryCodeSelect(true)
                            .validation(
                                PhoneFieldValidation.builder()
                                    .maxAllowedDigits(0)
                                    .minAllowedDigits(0)
                                    .build()
                            )
                            .defaultValue("defaultValue")
                            .description("description")
                            .placeholder("placeholder")
                            .build()
                    )
                    .build()
            )
        assertThat(emailField.fieldType()).isEqualTo(EmailField.FieldType.EMAIL)
        assertThat(emailField.hidden()).isEqualTo(true)
        assertThat(emailField.label()).isEqualTo("label")
        assertThat(emailField.name()).isEqualTo("name")
        assertThat(emailField.objectTypeId()).isEqualTo("objectTypeId")
        assertThat(emailField.required()).isEqualTo(true)
        assertThat(emailField.validation())
            .isEqualTo(
                EmailFieldValidation.builder()
                    .addBlockedEmailDomain("string")
                    .useDefaultBlockList(true)
                    .build()
            )
        assertThat(emailField.defaultValue()).contains("defaultValue")
        assertThat(emailField.description()).contains("description")
        assertThat(emailField.placeholder()).contains("placeholder")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val emailField =
            EmailField.builder()
                .addDependentField(
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
                            PhoneField.builder()
                                .dependentFields(listOf())
                                .fieldType(PhoneField.FieldType.PHONE)
                                .hidden(true)
                                .label("label")
                                .name("name")
                                .objectTypeId("objectTypeId")
                                .required(true)
                                .useCountryCodeSelect(true)
                                .validation(
                                    PhoneFieldValidation.builder()
                                        .maxAllowedDigits(0)
                                        .minAllowedDigits(0)
                                        .build()
                                )
                                .defaultValue("defaultValue")
                                .description("description")
                                .placeholder("placeholder")
                                .build()
                        )
                        .build()
                )
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

        val roundtrippedEmailField =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(emailField),
                jacksonTypeRef<EmailField>(),
            )

        assertThat(roundtrippedEmailField).isEqualTo(emailField)
    }
}
