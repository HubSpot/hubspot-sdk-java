// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.forms

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MultipleCheckboxesFieldTest {

    @Test
    fun create() {
        val multipleCheckboxesField =
            MultipleCheckboxesField.builder()
                .addDefaultValue("string")
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
                .fieldType(MultipleCheckboxesField.FieldType.MULTIPLE_CHECKBOXES)
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

        assertThat(multipleCheckboxesField.defaultValues()).containsExactly("string")
        assertThat(multipleCheckboxesField.dependentFields())
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
        assertThat(multipleCheckboxesField.fieldType())
            .isEqualTo(MultipleCheckboxesField.FieldType.MULTIPLE_CHECKBOXES)
        assertThat(multipleCheckboxesField.hidden()).isEqualTo(true)
        assertThat(multipleCheckboxesField.label()).isEqualTo("label")
        assertThat(multipleCheckboxesField.name()).isEqualTo("name")
        assertThat(multipleCheckboxesField.objectTypeId()).isEqualTo("objectTypeId")
        assertThat(multipleCheckboxesField.options())
            .containsExactly(
                EnumeratedFieldOption.builder()
                    .displayOrder(0)
                    .label("label")
                    .value("value")
                    .description("description")
                    .build()
            )
        assertThat(multipleCheckboxesField.required()).isEqualTo(true)
        assertThat(multipleCheckboxesField.description()).contains("description")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val multipleCheckboxesField =
            MultipleCheckboxesField.builder()
                .addDefaultValue("string")
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
                .fieldType(MultipleCheckboxesField.FieldType.MULTIPLE_CHECKBOXES)
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

        val roundtrippedMultipleCheckboxesField =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(multipleCheckboxesField),
                jacksonTypeRef<MultipleCheckboxesField>(),
            )

        assertThat(roundtrippedMultipleCheckboxesField).isEqualTo(multipleCheckboxesField)
    }
}
