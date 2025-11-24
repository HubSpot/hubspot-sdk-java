// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.forms

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MobilePhoneFieldTest {

    @Test
    fun create() {
        val mobilePhoneField =
            MobilePhoneField.builder()
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
                .fieldType(MobilePhoneField.FieldType.MOBILE_PHONE)
                .hidden(true)
                .label("label")
                .name("name")
                .objectTypeId("objectTypeId")
                .required(true)
                .validation(
                    PhoneFieldValidation.builder().maxAllowedDigits(0).minAllowedDigits(0).build()
                )
                .defaultValue("defaultValue")
                .description("description")
                .placeholder("placeholder")
                .build()

        assertThat(mobilePhoneField.dependentFields())
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
        assertThat(mobilePhoneField.fieldType()).isEqualTo(MobilePhoneField.FieldType.MOBILE_PHONE)
        assertThat(mobilePhoneField.hidden()).isEqualTo(true)
        assertThat(mobilePhoneField.label()).isEqualTo("label")
        assertThat(mobilePhoneField.name()).isEqualTo("name")
        assertThat(mobilePhoneField.objectTypeId()).isEqualTo("objectTypeId")
        assertThat(mobilePhoneField.required()).isEqualTo(true)
        assertThat(mobilePhoneField.validation())
            .isEqualTo(
                PhoneFieldValidation.builder().maxAllowedDigits(0).minAllowedDigits(0).build()
            )
        assertThat(mobilePhoneField.defaultValue()).contains("defaultValue")
        assertThat(mobilePhoneField.description()).contains("description")
        assertThat(mobilePhoneField.placeholder()).contains("placeholder")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val mobilePhoneField =
            MobilePhoneField.builder()
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
                .fieldType(MobilePhoneField.FieldType.MOBILE_PHONE)
                .hidden(true)
                .label("label")
                .name("name")
                .objectTypeId("objectTypeId")
                .required(true)
                .validation(
                    PhoneFieldValidation.builder().maxAllowedDigits(0).minAllowedDigits(0).build()
                )
                .defaultValue("defaultValue")
                .description("description")
                .placeholder("placeholder")
                .build()

        val roundtrippedMobilePhoneField =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(mobilePhoneField),
                jacksonTypeRef<MobilePhoneField>(),
            )

        assertThat(roundtrippedMobilePhoneField).isEqualTo(mobilePhoneField)
    }
}
