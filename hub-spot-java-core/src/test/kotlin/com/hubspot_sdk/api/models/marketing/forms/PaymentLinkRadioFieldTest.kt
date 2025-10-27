// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.forms

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaymentLinkRadioFieldTest {

    @Test
    fun create() {
        val paymentLinkRadioField =
            PaymentLinkRadioField.builder()
                .addDefaultValue("string")
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
                .fieldType(PaymentLinkRadioField.FieldType.PAYMENT_LINK_RADIO)
                .hidden(true)
                .label("label")
                .name("name")
                .objectTypeId("objectTypeId")
                .addOption(
                    EnumeratedFieldOption.builder()
                        .displayOrder(0)
                        .label("label")
                        .value("value")
                        .description("description")
                        .build()
                )
                .required(true)
                .description("description")
                .build()

        assertThat(paymentLinkRadioField.defaultValues()).containsExactly("string")
        assertThat(paymentLinkRadioField.dependentFields())
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
        assertThat(paymentLinkRadioField.fieldType())
            .isEqualTo(PaymentLinkRadioField.FieldType.PAYMENT_LINK_RADIO)
        assertThat(paymentLinkRadioField.hidden()).isEqualTo(true)
        assertThat(paymentLinkRadioField.label()).isEqualTo("label")
        assertThat(paymentLinkRadioField.name()).isEqualTo("name")
        assertThat(paymentLinkRadioField.objectTypeId()).isEqualTo("objectTypeId")
        assertThat(paymentLinkRadioField.options())
            .containsExactly(
                EnumeratedFieldOption.builder()
                    .displayOrder(0)
                    .label("label")
                    .value("value")
                    .description("description")
                    .build()
            )
        assertThat(paymentLinkRadioField.required()).isEqualTo(true)
        assertThat(paymentLinkRadioField.description()).contains("description")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val paymentLinkRadioField =
            PaymentLinkRadioField.builder()
                .addDefaultValue("string")
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
                .fieldType(PaymentLinkRadioField.FieldType.PAYMENT_LINK_RADIO)
                .hidden(true)
                .label("label")
                .name("name")
                .objectTypeId("objectTypeId")
                .addOption(
                    EnumeratedFieldOption.builder()
                        .displayOrder(0)
                        .label("label")
                        .value("value")
                        .description("description")
                        .build()
                )
                .required(true)
                .description("description")
                .build()

        val roundtrippedPaymentLinkRadioField =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(paymentLinkRadioField),
                jacksonTypeRef<PaymentLinkRadioField>(),
            )

        assertThat(roundtrippedPaymentLinkRadioField).isEqualTo(paymentLinkRadioField)
    }
}
