// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objects.schemas

import com.hubspot_sdk.api.models.ObjectTypeDefinitionLabels
import com.hubspot_sdk.api.models.OptionInput
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SchemaCreateParamsTest {

    @Test
    fun create() {
        SchemaCreateParams.builder()
            .objectSchemaEgg(
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
                            .numberDisplayHint(ObjectTypePropertyCreate.NumberDisplayHint.CURRENCY)
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
                                ObjectTypePropertyCreate.OptionSortStrategy.ALPHABETICAL
                            )
                            .referencedObjectType("referencedObjectType")
                            .searchableInGlobalSearch(true)
                            .showCurrencySymbol(true)
                            .textDisplayHint(ObjectTypePropertyCreate.TextDisplayHint.DOMAIN_NAME)
                            .build()
                    )
                    .addRequiredProperty("my_object_property")
                    .description("description")
                    .primaryDisplayProperty("my_object_property")
                    .addSearchableProperty("string")
                    .addSecondaryDisplayProperty("string")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            SchemaCreateParams.builder()
                .objectSchemaEgg(
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
                                .numberDisplayHint(
                                    ObjectTypePropertyCreate.NumberDisplayHint.CURRENCY
                                )
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
                                    ObjectTypePropertyCreate.OptionSortStrategy.ALPHABETICAL
                                )
                                .referencedObjectType("referencedObjectType")
                                .searchableInGlobalSearch(true)
                                .showCurrencySymbol(true)
                                .textDisplayHint(
                                    ObjectTypePropertyCreate.TextDisplayHint.DOMAIN_NAME
                                )
                                .build()
                        )
                        .addRequiredProperty("my_object_property")
                        .description("description")
                        .primaryDisplayProperty("my_object_property")
                        .addSearchableProperty("string")
                        .addSecondaryDisplayProperty("string")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
                            .numberDisplayHint(ObjectTypePropertyCreate.NumberDisplayHint.CURRENCY)
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
                                ObjectTypePropertyCreate.OptionSortStrategy.ALPHABETICAL
                            )
                            .referencedObjectType("referencedObjectType")
                            .searchableInGlobalSearch(true)
                            .showCurrencySymbol(true)
                            .textDisplayHint(ObjectTypePropertyCreate.TextDisplayHint.DOMAIN_NAME)
                            .build()
                    )
                    .addRequiredProperty("my_object_property")
                    .description("description")
                    .primaryDisplayProperty("my_object_property")
                    .addSearchableProperty("string")
                    .addSecondaryDisplayProperty("string")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SchemaCreateParams.builder()
                .objectSchemaEgg(
                    ObjectSchemaEgg.builder()
                        .addAssociatedObject("CONTACT")
                        .labels(ObjectTypeDefinitionLabels.builder().build())
                        .name("my_object")
                        .addProperty(
                            ObjectTypePropertyCreate.builder()
                                .fieldType("select")
                                .label("My object property")
                                .name("my_object_property")
                                .type(ObjectTypePropertyCreate.Type.ENUMERATION)
                                .build()
                        )
                        .addRequiredProperty("my_object_property")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                ObjectSchemaEgg.builder()
                    .addAssociatedObject("CONTACT")
                    .labels(ObjectTypeDefinitionLabels.builder().build())
                    .name("my_object")
                    .addProperty(
                        ObjectTypePropertyCreate.builder()
                            .fieldType("select")
                            .label("My object property")
                            .name("my_object_property")
                            .type(ObjectTypePropertyCreate.Type.ENUMERATION)
                            .build()
                    )
                    .addRequiredProperty("my_object_property")
                    .build()
            )
    }
}
