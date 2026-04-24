// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.properties

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import com.hubspot.sdk.models.BaseOption
import com.hubspot.sdk.models.BaseProperty
import com.hubspot.sdk.models.PropertyModificationMetadata
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponsePropertyNoPagingTest {

    @Test
    fun create() {
        val collectionResponsePropertyNoPaging =
            CollectionResponsePropertyNoPaging.builder()
                .addResult(
                    BaseProperty.builder()
                        .description("description")
                        .fieldType("fieldType")
                        .groupName("groupName")
                        .label("label")
                        .name("name")
                        .addOption(
                            BaseOption.builder()
                                .hidden(true)
                                .label("label")
                                .value("value")
                                .description("description")
                                .displayOrder(0)
                                .build()
                        )
                        .type("type")
                        .archived(true)
                        .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .calculated(true)
                        .calculationFormula("calculationFormula")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .createdUserId("createdUserId")
                        .currencyPropertyName("currencyPropertyName")
                        .dataSensitivity(BaseProperty.DataSensitivity.HIGHLY_SENSITIVE)
                        .dateDisplayHint(BaseProperty.DateDisplayHint.ABSOLUTE)
                        .displayOrder(0)
                        .externalOptions(true)
                        .formField(true)
                        .hasUniqueValue(true)
                        .hidden(false)
                        .hubSpotDefined(true)
                        .modificationMetadata(
                            PropertyModificationMetadata.builder()
                                .archivable(true)
                                .readOnlyDefinition(true)
                                .readOnlyValue(true)
                                .readOnlyOptions(true)
                                .build()
                        )
                        .numberDisplayHint(BaseProperty.NumberDisplayHint.CURRENCY)
                        .referencedObjectType("referencedObjectType")
                        .addSensitiveDataCategory("string")
                        .showCurrencySymbol(true)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .updatedUserId("updatedUserId")
                        .build()
                )
                .build()

        assertThat(collectionResponsePropertyNoPaging.results())
            .containsExactly(
                BaseProperty.builder()
                    .description("description")
                    .fieldType("fieldType")
                    .groupName("groupName")
                    .label("label")
                    .name("name")
                    .addOption(
                        BaseOption.builder()
                            .hidden(true)
                            .label("label")
                            .value("value")
                            .description("description")
                            .displayOrder(0)
                            .build()
                    )
                    .type("type")
                    .archived(true)
                    .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .calculated(true)
                    .calculationFormula("calculationFormula")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .createdUserId("createdUserId")
                    .currencyPropertyName("currencyPropertyName")
                    .dataSensitivity(BaseProperty.DataSensitivity.HIGHLY_SENSITIVE)
                    .dateDisplayHint(BaseProperty.DateDisplayHint.ABSOLUTE)
                    .displayOrder(0)
                    .externalOptions(true)
                    .formField(true)
                    .hasUniqueValue(true)
                    .hidden(false)
                    .hubSpotDefined(true)
                    .modificationMetadata(
                        PropertyModificationMetadata.builder()
                            .archivable(true)
                            .readOnlyDefinition(true)
                            .readOnlyValue(true)
                            .readOnlyOptions(true)
                            .build()
                    )
                    .numberDisplayHint(BaseProperty.NumberDisplayHint.CURRENCY)
                    .referencedObjectType("referencedObjectType")
                    .addSensitiveDataCategory("string")
                    .showCurrencySymbol(true)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .updatedUserId("updatedUserId")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionResponsePropertyNoPaging =
            CollectionResponsePropertyNoPaging.builder()
                .addResult(
                    BaseProperty.builder()
                        .description("description")
                        .fieldType("fieldType")
                        .groupName("groupName")
                        .label("label")
                        .name("name")
                        .addOption(
                            BaseOption.builder()
                                .hidden(true)
                                .label("label")
                                .value("value")
                                .description("description")
                                .displayOrder(0)
                                .build()
                        )
                        .type("type")
                        .archived(true)
                        .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .calculated(true)
                        .calculationFormula("calculationFormula")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .createdUserId("createdUserId")
                        .currencyPropertyName("currencyPropertyName")
                        .dataSensitivity(BaseProperty.DataSensitivity.HIGHLY_SENSITIVE)
                        .dateDisplayHint(BaseProperty.DateDisplayHint.ABSOLUTE)
                        .displayOrder(0)
                        .externalOptions(true)
                        .formField(true)
                        .hasUniqueValue(true)
                        .hidden(false)
                        .hubSpotDefined(true)
                        .modificationMetadata(
                            PropertyModificationMetadata.builder()
                                .archivable(true)
                                .readOnlyDefinition(true)
                                .readOnlyValue(true)
                                .readOnlyOptions(true)
                                .build()
                        )
                        .numberDisplayHint(BaseProperty.NumberDisplayHint.CURRENCY)
                        .referencedObjectType("referencedObjectType")
                        .addSensitiveDataCategory("string")
                        .showCurrencySymbol(true)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .updatedUserId("updatedUserId")
                        .build()
                )
                .build()

        val roundtrippedCollectionResponsePropertyNoPaging =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(collectionResponsePropertyNoPaging),
                jacksonTypeRef<CollectionResponsePropertyNoPaging>(),
            )

        assertThat(roundtrippedCollectionResponsePropertyNoPaging)
            .isEqualTo(collectionResponsePropertyNoPaging)
    }
}
