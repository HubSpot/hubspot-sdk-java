// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.forms

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FieldGroupTest {

    @Test
    fun create() {
        val fieldGroup =
            FieldGroup.builder()
                .addField(
                    EmailField.builder()
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
                )
                .groupType(FieldGroup.GroupType.DEFAULT_GROUP)
                .richTextType(FieldGroup.RichTextType.IMAGE)
                .richText("richText")
                .build()

        assertThat(fieldGroup.fields())
            .containsExactly(
                FieldGroup.Field.ofEmail(
                    EmailField.builder()
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
                )
            )
        assertThat(fieldGroup.groupType()).isEqualTo(FieldGroup.GroupType.DEFAULT_GROUP)
        assertThat(fieldGroup.richTextType()).isEqualTo(FieldGroup.RichTextType.IMAGE)
        assertThat(fieldGroup.richText()).contains("richText")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val fieldGroup =
            FieldGroup.builder()
                .addField(
                    EmailField.builder()
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
                )
                .groupType(FieldGroup.GroupType.DEFAULT_GROUP)
                .richTextType(FieldGroup.RichTextType.IMAGE)
                .richText("richText")
                .build()

        val roundtrippedFieldGroup =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(fieldGroup),
                jacksonTypeRef<FieldGroup>(),
            )

        assertThat(roundtrippedFieldGroup).isEqualTo(fieldGroup)
    }
}
