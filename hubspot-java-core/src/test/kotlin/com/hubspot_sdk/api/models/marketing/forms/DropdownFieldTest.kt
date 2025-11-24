// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.forms

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DropdownFieldTest {

    @Test
    fun create() {
        val dropdownField =
            DropdownField.builder()
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
                .fieldType(DropdownField.FieldType.DROPDOWN)
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

        assertThat(dropdownField.defaultValues()).containsExactly("string")
        assertThat(dropdownField.dependentFields())
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
        assertThat(dropdownField.fieldType()).isEqualTo(DropdownField.FieldType.DROPDOWN)
        assertThat(dropdownField.hidden()).isEqualTo(true)
        assertThat(dropdownField.label()).isEqualTo("label")
        assertThat(dropdownField.name()).isEqualTo("name")
        assertThat(dropdownField.objectTypeId()).isEqualTo("objectTypeId")
        assertThat(dropdownField.options())
            .containsExactly(
                EnumeratedFieldOption.builder()
                    .displayOrder(0)
                    .label("label")
                    .value("value")
                    .description("description")
                    .build()
            )
        assertThat(dropdownField.required()).isEqualTo(true)
        assertThat(dropdownField.description()).contains("description")
        assertThat(dropdownField.placeholder()).contains("placeholder")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dropdownField =
            DropdownField.builder()
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
                .fieldType(DropdownField.FieldType.DROPDOWN)
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

        val roundtrippedDropdownField =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dropdownField),
                jacksonTypeRef<DropdownField>(),
            )

        assertThat(roundtrippedDropdownField).isEqualTo(dropdownField)
    }
}
