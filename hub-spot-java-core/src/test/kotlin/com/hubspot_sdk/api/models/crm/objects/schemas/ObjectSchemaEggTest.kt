// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objects.schemas

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.ObjectTypeDefinitionLabels
import com.hubspot_sdk.api.models.OptionInput
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ObjectSchemaEggTest {

    @Test
    fun create() {
        val objectSchemaEgg =
            ObjectSchemaEgg.builder()
                .addAssociatedObject("CONTACT")
                .labels(
                    ObjectTypeDefinitionLabels.builder()
                        .plural("My objects")
                        .singular("My object")
                        .build()
                )
                .name("my_object")
                .addProperty(
                    ObjectTypePropertyCreate.builder()
                        .fieldType("select")
                        .label("My object property")
                        .name("my_object_property")
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
                        .optionSortStrategy(
                            ObjectTypePropertyCreate.OptionSortStrategy.DISPLAY_ORDER
                        )
                        .referencedObjectType("referencedObjectType")
                        .searchableInGlobalSearch(true)
                        .showCurrencySymbol(true)
                        .textDisplayHint(
                            ObjectTypePropertyCreate.TextDisplayHint.UNFORMATTED_SINGLE_LINE
                        )
                        .build()
                )
                .addRequiredProperty("my_object_property")
                .description("description")
                .primaryDisplayProperty("my_object_property")
                .addSearchableProperty("string")
                .addSecondaryDisplayProperty("string")
                .build()

        assertThat(objectSchemaEgg.associatedObjects()).containsExactly("CONTACT")
        assertThat(objectSchemaEgg.labels())
            .isEqualTo(
                ObjectTypeDefinitionLabels.builder()
                    .plural("My objects")
                    .singular("My object")
                    .build()
            )
        assertThat(objectSchemaEgg.name()).isEqualTo("my_object")
        assertThat(objectSchemaEgg.properties())
            .containsExactly(
                ObjectTypePropertyCreate.builder()
                    .fieldType("select")
                    .label("My object property")
                    .name("my_object_property")
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
                    .textDisplayHint(
                        ObjectTypePropertyCreate.TextDisplayHint.UNFORMATTED_SINGLE_LINE
                    )
                    .build()
            )
        assertThat(objectSchemaEgg.requiredProperties()).containsExactly("my_object_property")
        assertThat(objectSchemaEgg.description()).contains("description")
        assertThat(objectSchemaEgg.primaryDisplayProperty()).contains("my_object_property")
        assertThat(objectSchemaEgg.searchableProperties().getOrNull()).containsExactly("string")
        assertThat(objectSchemaEgg.secondaryDisplayProperties().getOrNull())
            .containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val objectSchemaEgg =
            ObjectSchemaEgg.builder()
                .addAssociatedObject("CONTACT")
                .labels(
                    ObjectTypeDefinitionLabels.builder()
                        .plural("My objects")
                        .singular("My object")
                        .build()
                )
                .name("my_object")
                .addProperty(
                    ObjectTypePropertyCreate.builder()
                        .fieldType("select")
                        .label("My object property")
                        .name("my_object_property")
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
                        .optionSortStrategy(
                            ObjectTypePropertyCreate.OptionSortStrategy.DISPLAY_ORDER
                        )
                        .referencedObjectType("referencedObjectType")
                        .searchableInGlobalSearch(true)
                        .showCurrencySymbol(true)
                        .textDisplayHint(
                            ObjectTypePropertyCreate.TextDisplayHint.UNFORMATTED_SINGLE_LINE
                        )
                        .build()
                )
                .addRequiredProperty("my_object_property")
                .description("description")
                .primaryDisplayProperty("my_object_property")
                .addSearchableProperty("string")
                .addSecondaryDisplayProperty("string")
                .build()

        val roundtrippedObjectSchemaEgg =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(objectSchemaEgg),
                jacksonTypeRef<ObjectSchemaEgg>(),
            )

        assertThat(roundtrippedObjectSchemaEgg).isEqualTo(objectSchemaEgg)
    }
}
