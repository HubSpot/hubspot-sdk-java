// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.forms

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneFieldTest {

    @Test
    fun create() {
        val phoneField =
            PhoneField.builder()
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
                .fieldType(PhoneField.FieldType.PHONE)
                .hidden(true)
                .label("label")
                .name("name")
                .objectTypeId("objectTypeId")
                .required(true)
                .useCountryCodeSelect(true)
                .validation(
                    PhoneFieldValidation.builder().maxAllowedDigits(0).minAllowedDigits(0).build()
                )
                .defaultValue("defaultValue")
                .description("description")
                .placeholder("placeholder")
                .build()

        assertThat(phoneField.dependentFields())
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
        assertThat(phoneField.fieldType()).isEqualTo(PhoneField.FieldType.PHONE)
        assertThat(phoneField.hidden()).isEqualTo(true)
        assertThat(phoneField.label()).isEqualTo("label")
        assertThat(phoneField.name()).isEqualTo("name")
        assertThat(phoneField.objectTypeId()).isEqualTo("objectTypeId")
        assertThat(phoneField.required()).isEqualTo(true)
        assertThat(phoneField.useCountryCodeSelect()).isEqualTo(true)
        assertThat(phoneField.validation())
            .isEqualTo(
                PhoneFieldValidation.builder().maxAllowedDigits(0).minAllowedDigits(0).build()
            )
        assertThat(phoneField.defaultValue()).contains("defaultValue")
        assertThat(phoneField.description()).contains("description")
        assertThat(phoneField.placeholder()).contains("placeholder")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val phoneField =
            PhoneField.builder()
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
                .fieldType(PhoneField.FieldType.PHONE)
                .hidden(true)
                .label("label")
                .name("name")
                .objectTypeId("objectTypeId")
                .required(true)
                .useCountryCodeSelect(true)
                .validation(
                    PhoneFieldValidation.builder().maxAllowedDigits(0).minAllowedDigits(0).build()
                )
                .defaultValue("defaultValue")
                .description("description")
                .placeholder("placeholder")
                .build()

        val roundtrippedPhoneField =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(phoneField),
                jacksonTypeRef<PhoneField>(),
            )

        assertThat(roundtrippedPhoneField).isEqualTo(phoneField)
    }
}
