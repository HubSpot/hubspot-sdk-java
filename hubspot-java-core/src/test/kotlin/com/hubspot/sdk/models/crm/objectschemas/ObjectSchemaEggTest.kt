// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.objectschemas

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import com.hubspot.sdk.models.ObjectTypeDefinitionLabels
import com.hubspot.sdk.models.OptionInput
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ObjectSchemaEggTest {

    @Test
    fun create() {
        val objectSchemaEgg =
            ObjectSchemaEgg.builder()
                .allowsSensitiveProperties(true)
                .addAssociatedObject("string")
                .labels(
                    ObjectTypeDefinitionLabels.builder()
                        .plural("plural")
                        .singular("singular")
                        .build()
                )
                .name("name")
                .addProperty(
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
                        .optionSortStrategy(
                            ObjectTypePropertyCreate.OptionSortStrategy.ALPHABETICAL
                        )
                        .referencedObjectType("referencedObjectType")
                        .searchableInGlobalSearch(true)
                        .showCurrencySymbol(true)
                        .textDisplayHint(ObjectTypePropertyCreate.TextDisplayHint.DOMAIN_NAME)
                        .build()
                )
                .addRequiredProperty("string")
                .addSearchableProperty("string")
                .addSecondaryDisplayProperty("string")
                .description("description")
                .primaryDisplayProperty("primaryDisplayProperty")
                .build()

        assertThat(objectSchemaEgg.allowsSensitiveProperties()).isEqualTo(true)
        assertThat(objectSchemaEgg.associatedObjects()).containsExactly("string")
        assertThat(objectSchemaEgg.labels())
            .isEqualTo(
                ObjectTypeDefinitionLabels.builder().plural("plural").singular("singular").build()
            )
        assertThat(objectSchemaEgg.name()).isEqualTo("name")
        assertThat(objectSchemaEgg.properties())
            .containsExactly(
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
            )
        assertThat(objectSchemaEgg.requiredProperties()).containsExactly("string")
        assertThat(objectSchemaEgg.searchableProperties()).containsExactly("string")
        assertThat(objectSchemaEgg.secondaryDisplayProperties()).containsExactly("string")
        assertThat(objectSchemaEgg.description()).contains("description")
        assertThat(objectSchemaEgg.primaryDisplayProperty()).contains("primaryDisplayProperty")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val objectSchemaEgg =
            ObjectSchemaEgg.builder()
                .allowsSensitiveProperties(true)
                .addAssociatedObject("string")
                .labels(
                    ObjectTypeDefinitionLabels.builder()
                        .plural("plural")
                        .singular("singular")
                        .build()
                )
                .name("name")
                .addProperty(
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
                        .optionSortStrategy(
                            ObjectTypePropertyCreate.OptionSortStrategy.ALPHABETICAL
                        )
                        .referencedObjectType("referencedObjectType")
                        .searchableInGlobalSearch(true)
                        .showCurrencySymbol(true)
                        .textDisplayHint(ObjectTypePropertyCreate.TextDisplayHint.DOMAIN_NAME)
                        .build()
                )
                .addRequiredProperty("string")
                .addSearchableProperty("string")
                .addSecondaryDisplayProperty("string")
                .description("description")
                .primaryDisplayProperty("primaryDisplayProperty")
                .build()

        val roundtrippedObjectSchemaEgg =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(objectSchemaEgg),
                jacksonTypeRef<ObjectSchemaEgg>(),
            )

        assertThat(roundtrippedObjectSchemaEgg).isEqualTo(objectSchemaEgg)
    }
}
