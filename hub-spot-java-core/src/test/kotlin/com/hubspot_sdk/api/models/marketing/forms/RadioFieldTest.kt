// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.forms

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RadioFieldTest {

    @Test
    fun create() {
        val radioField =
            RadioField.builder()
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
                .fieldType(RadioField.FieldType.RADIO)
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
                .placeholder("placeholder")
                .build()

        assertThat(radioField.defaultValues()).containsExactly("string")
        assertThat(radioField.dependentFields())
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
        assertThat(radioField.fieldType()).isEqualTo(RadioField.FieldType.RADIO)
        assertThat(radioField.hidden()).isEqualTo(true)
        assertThat(radioField.label()).isEqualTo("label")
        assertThat(radioField.name()).isEqualTo("name")
        assertThat(radioField.objectTypeId()).isEqualTo("objectTypeId")
        assertThat(radioField.options())
            .containsExactly(
                EnumeratedFieldOption.builder()
                    .displayOrder(0)
                    .label("label")
                    .value("value")
                    .description("description")
                    .build()
            )
        assertThat(radioField.required()).isEqualTo(true)
        assertThat(radioField.description()).contains("description")
        assertThat(radioField.placeholder()).contains("placeholder")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val radioField =
            RadioField.builder()
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
                .fieldType(RadioField.FieldType.RADIO)
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
                .placeholder("placeholder")
                .build()

        val roundtrippedRadioField =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(radioField),
                jacksonTypeRef<RadioField>(),
            )

        assertThat(roundtrippedRadioField).isEqualTo(radioField)
    }
}
