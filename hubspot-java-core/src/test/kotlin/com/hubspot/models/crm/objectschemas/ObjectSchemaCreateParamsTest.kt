// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.objectschemas

import com.hubspot.models.ObjectTypeDefinitionLabels
import com.hubspot.models.OptionInput
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ObjectSchemaCreateParamsTest {

    @Test
    fun create() {
        ObjectSchemaCreateParams.builder()
            .objectSchemaEgg(
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
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            ObjectSchemaCreateParams.builder()
                .objectSchemaEgg(
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
                                .numberDisplayHint(
                                    ObjectTypePropertyCreate.NumberDisplayHint.CURRENCY
                                )
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
                                .textDisplayHint(
                                    ObjectTypePropertyCreate.TextDisplayHint.DOMAIN_NAME
                                )
                                .build()
                        )
                        .addRequiredProperty("string")
                        .addSearchableProperty("string")
                        .addSecondaryDisplayProperty("string")
                        .description("description")
                        .primaryDisplayProperty("primaryDisplayProperty")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ObjectSchemaCreateParams.builder()
                .objectSchemaEgg(
                    ObjectSchemaEgg.builder()
                        .allowsSensitiveProperties(true)
                        .addAssociatedObject("string")
                        .labels(ObjectTypeDefinitionLabels.builder().build())
                        .name("name")
                        .addProperty(
                            ObjectTypePropertyCreate.builder()
                                .fieldType("fieldType")
                                .label("label")
                                .name("name")
                                .type(ObjectTypePropertyCreate.Type.BOOL)
                                .build()
                        )
                        .addRequiredProperty("string")
                        .addSearchableProperty("string")
                        .addSecondaryDisplayProperty("string")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                ObjectSchemaEgg.builder()
                    .allowsSensitiveProperties(true)
                    .addAssociatedObject("string")
                    .labels(ObjectTypeDefinitionLabels.builder().build())
                    .name("name")
                    .addProperty(
                        ObjectTypePropertyCreate.builder()
                            .fieldType("fieldType")
                            .label("label")
                            .name("name")
                            .type(ObjectTypePropertyCreate.Type.BOOL)
                            .build()
                    )
                    .addRequiredProperty("string")
                    .addSearchableProperty("string")
                    .addSecondaryDisplayProperty("string")
                    .build()
            )
    }
}
