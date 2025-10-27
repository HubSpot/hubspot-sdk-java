// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objects.schemas

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.OptionInput
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ObjectTypePropertyCreateTest {

    @Test
    fun create() {
        val objectTypePropertyCreate =
            ObjectTypePropertyCreate.builder()
                .fieldType("select")
                .label("My object property")
                .name("name")
                .type(ObjectTypePropertyCreate.Type.ENUMERATION)
                .description("description")
                .displayOrder(2)
                .formField(true)
                .groupName("my_object_information")
                .hasUniqueValue(false)
                .hidden(true)
                .numberDisplayHint(ObjectTypePropertyCreate.NumberDisplayHint.UNFORMATTED)
                .addOption(
                    OptionInput.builder()
                        .displayOrder(1)
                        .hidden(true)
                        .label("Option A")
                        .value("A")
                        .description("Choice number one")
                        .build()
                )
                .addOption(
                    OptionInput.builder()
                        .displayOrder(2)
                        .hidden(true)
                        .label("Option B")
                        .value("B")
                        .description("Choice number two")
                        .build()
                )
                .optionSortStrategy(ObjectTypePropertyCreate.OptionSortStrategy.DISPLAY_ORDER)
                .referencedObjectType("referencedObjectType")
                .searchableInGlobalSearch(true)
                .showCurrencySymbol(true)
                .textDisplayHint(ObjectTypePropertyCreate.TextDisplayHint.UNFORMATTED_SINGLE_LINE)
                .build()

        assertThat(objectTypePropertyCreate.fieldType()).isEqualTo("select")
        assertThat(objectTypePropertyCreate.label()).isEqualTo("My object property")
        assertThat(objectTypePropertyCreate.name()).isEqualTo("name")
        assertThat(objectTypePropertyCreate.type())
            .isEqualTo(ObjectTypePropertyCreate.Type.ENUMERATION)
        assertThat(objectTypePropertyCreate.description()).contains("description")
        assertThat(objectTypePropertyCreate.displayOrder()).contains(2)
        assertThat(objectTypePropertyCreate.formField()).contains(true)
        assertThat(objectTypePropertyCreate.groupName()).contains("my_object_information")
        assertThat(objectTypePropertyCreate.hasUniqueValue()).contains(false)
        assertThat(objectTypePropertyCreate.hidden()).contains(true)
        assertThat(objectTypePropertyCreate.numberDisplayHint())
            .contains(ObjectTypePropertyCreate.NumberDisplayHint.UNFORMATTED)
        assertThat(objectTypePropertyCreate.options().getOrNull())
            .containsExactly(
                OptionInput.builder()
                    .displayOrder(1)
                    .hidden(true)
                    .label("Option A")
                    .value("A")
                    .description("Choice number one")
                    .build(),
                OptionInput.builder()
                    .displayOrder(2)
                    .hidden(true)
                    .label("Option B")
                    .value("B")
                    .description("Choice number two")
                    .build(),
            )
        assertThat(objectTypePropertyCreate.optionSortStrategy())
            .contains(ObjectTypePropertyCreate.OptionSortStrategy.DISPLAY_ORDER)
        assertThat(objectTypePropertyCreate.referencedObjectType()).contains("referencedObjectType")
        assertThat(objectTypePropertyCreate.searchableInGlobalSearch()).contains(true)
        assertThat(objectTypePropertyCreate.showCurrencySymbol()).contains(true)
        assertThat(objectTypePropertyCreate.textDisplayHint())
            .contains(ObjectTypePropertyCreate.TextDisplayHint.UNFORMATTED_SINGLE_LINE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val objectTypePropertyCreate =
            ObjectTypePropertyCreate.builder()
                .fieldType("select")
                .label("My object property")
                .name("name")
                .type(ObjectTypePropertyCreate.Type.ENUMERATION)
                .description("description")
                .displayOrder(2)
                .formField(true)
                .groupName("my_object_information")
                .hasUniqueValue(false)
                .hidden(true)
                .numberDisplayHint(ObjectTypePropertyCreate.NumberDisplayHint.UNFORMATTED)
                .addOption(
                    OptionInput.builder()
                        .displayOrder(1)
                        .hidden(true)
                        .label("Option A")
                        .value("A")
                        .description("Choice number one")
                        .build()
                )
                .addOption(
                    OptionInput.builder()
                        .displayOrder(2)
                        .hidden(true)
                        .label("Option B")
                        .value("B")
                        .description("Choice number two")
                        .build()
                )
                .optionSortStrategy(ObjectTypePropertyCreate.OptionSortStrategy.DISPLAY_ORDER)
                .referencedObjectType("referencedObjectType")
                .searchableInGlobalSearch(true)
                .showCurrencySymbol(true)
                .textDisplayHint(ObjectTypePropertyCreate.TextDisplayHint.UNFORMATTED_SINGLE_LINE)
                .build()

        val roundtrippedObjectTypePropertyCreate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(objectTypePropertyCreate),
                jacksonTypeRef<ObjectTypePropertyCreate>(),
            )

        assertThat(roundtrippedObjectTypePropertyCreate).isEqualTo(objectTypePropertyCreate)
    }
}
