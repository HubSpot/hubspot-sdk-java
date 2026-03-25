// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objectschemas

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
                .fieldType("fieldType")
                .label("label")
                .name("name")
                .type(ObjectTypePropertyCreate.Type.BOOL)
                .description("description")
                .displayOrder(0)
                .externalOptionsReferenceType("externalOptionsReferenceType")
                .formField(true)
                .groupName("groupName")
                .hasUniqueValue(true)
                .hidden(true)
                .numberDisplayHint(ObjectTypePropertyCreate.NumberDisplayHint.CURRENCY)
                .addOption(
                    OptionInput.builder()
                        .displayOrder(0)
                        .hidden(true)
                        .label("label")
                        .value("value")
                        .description("description")
                        .build()
                )
                .optionSortStrategy(ObjectTypePropertyCreate.OptionSortStrategy.ALPHABETICAL)
                .referencedObjectType("referencedObjectType")
                .searchableInGlobalSearch(true)
                .showCurrencySymbol(true)
                .textDisplayHint(ObjectTypePropertyCreate.TextDisplayHint.DOMAIN_NAME)
                .build()

        assertThat(objectTypePropertyCreate.fieldType()).isEqualTo("fieldType")
        assertThat(objectTypePropertyCreate.label()).isEqualTo("label")
        assertThat(objectTypePropertyCreate.name()).isEqualTo("name")
        assertThat(objectTypePropertyCreate.type()).isEqualTo(ObjectTypePropertyCreate.Type.BOOL)
        assertThat(objectTypePropertyCreate.description()).contains("description")
        assertThat(objectTypePropertyCreate.displayOrder()).contains(0)
        assertThat(objectTypePropertyCreate.externalOptionsReferenceType())
            .contains("externalOptionsReferenceType")
        assertThat(objectTypePropertyCreate.formField()).contains(true)
        assertThat(objectTypePropertyCreate.groupName()).contains("groupName")
        assertThat(objectTypePropertyCreate.hasUniqueValue()).contains(true)
        assertThat(objectTypePropertyCreate.hidden()).contains(true)
        assertThat(objectTypePropertyCreate.numberDisplayHint())
            .contains(ObjectTypePropertyCreate.NumberDisplayHint.CURRENCY)
        assertThat(objectTypePropertyCreate.options().getOrNull())
            .containsExactly(
                OptionInput.builder()
                    .displayOrder(0)
                    .hidden(true)
                    .label("label")
                    .value("value")
                    .description("description")
                    .build()
            )
        assertThat(objectTypePropertyCreate.optionSortStrategy())
            .contains(ObjectTypePropertyCreate.OptionSortStrategy.ALPHABETICAL)
        assertThat(objectTypePropertyCreate.referencedObjectType()).contains("referencedObjectType")
        assertThat(objectTypePropertyCreate.searchableInGlobalSearch()).contains(true)
        assertThat(objectTypePropertyCreate.showCurrencySymbol()).contains(true)
        assertThat(objectTypePropertyCreate.textDisplayHint())
            .contains(ObjectTypePropertyCreate.TextDisplayHint.DOMAIN_NAME)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val objectTypePropertyCreate =
            ObjectTypePropertyCreate.builder()
                .fieldType("fieldType")
                .label("label")
                .name("name")
                .type(ObjectTypePropertyCreate.Type.BOOL)
                .description("description")
                .displayOrder(0)
                .externalOptionsReferenceType("externalOptionsReferenceType")
                .formField(true)
                .groupName("groupName")
                .hasUniqueValue(true)
                .hidden(true)
                .numberDisplayHint(ObjectTypePropertyCreate.NumberDisplayHint.CURRENCY)
                .addOption(
                    OptionInput.builder()
                        .displayOrder(0)
                        .hidden(true)
                        .label("label")
                        .value("value")
                        .description("description")
                        .build()
                )
                .optionSortStrategy(ObjectTypePropertyCreate.OptionSortStrategy.ALPHABETICAL)
                .referencedObjectType("referencedObjectType")
                .searchableInGlobalSearch(true)
                .showCurrencySymbol(true)
                .textDisplayHint(ObjectTypePropertyCreate.TextDisplayHint.DOMAIN_NAME)
                .build()

        val roundtrippedObjectTypePropertyCreate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(objectTypePropertyCreate),
                jacksonTypeRef<ObjectTypePropertyCreate>(),
            )

        assertThat(roundtrippedObjectTypePropertyCreate).isEqualTo(objectTypePropertyCreate)
    }
}
