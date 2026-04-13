// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.properties

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.JsonValue
import com.hubspot.core.jsonMapper
import com.hubspot.models.Option
import com.hubspot.models.PropertyModificationMetadata
import com.hubspot.models.crm.Property
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchResponsePropertyTest {

    @Test
    fun create() {
        val batchResponseProperty =
            BatchResponseProperty.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addResult(
                    Property.builder()
                        .description("description")
                        .fieldType("fieldType")
                        .groupName("groupName")
                        .label("label")
                        .name("name")
                        .addOption(
                            Option.builder()
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
                        .dataSensitivity(Property.DataSensitivity.HIGHLY_SENSITIVE)
                        .dateDisplayHint(Property.DateDisplayHint.ABSOLUTE)
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
                        .referencedObjectType("referencedObjectType")
                        .addSensitiveDataCategory("string")
                        .showCurrencySymbol(true)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .updatedUserId("updatedUserId")
                        .build()
                )
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(BatchResponseProperty.Status.CANCELED)
                .links(
                    BatchResponseProperty.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(batchResponseProperty.completedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchResponseProperty.results())
            .containsExactly(
                Property.builder()
                    .description("description")
                    .fieldType("fieldType")
                    .groupName("groupName")
                    .label("label")
                    .name("name")
                    .addOption(
                        Option.builder()
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
                    .dataSensitivity(Property.DataSensitivity.HIGHLY_SENSITIVE)
                    .dateDisplayHint(Property.DateDisplayHint.ABSOLUTE)
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
                    .referencedObjectType("referencedObjectType")
                    .addSensitiveDataCategory("string")
                    .showCurrencySymbol(true)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .updatedUserId("updatedUserId")
                    .build()
            )
        assertThat(batchResponseProperty.startedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchResponseProperty.status()).isEqualTo(BatchResponseProperty.Status.CANCELED)
        assertThat(batchResponseProperty.links())
            .contains(
                BatchResponseProperty.Links.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(batchResponseProperty.requestedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchResponseProperty =
            BatchResponseProperty.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addResult(
                    Property.builder()
                        .description("description")
                        .fieldType("fieldType")
                        .groupName("groupName")
                        .label("label")
                        .name("name")
                        .addOption(
                            Option.builder()
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
                        .dataSensitivity(Property.DataSensitivity.HIGHLY_SENSITIVE)
                        .dateDisplayHint(Property.DateDisplayHint.ABSOLUTE)
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
                        .referencedObjectType("referencedObjectType")
                        .addSensitiveDataCategory("string")
                        .showCurrencySymbol(true)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .updatedUserId("updatedUserId")
                        .build()
                )
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(BatchResponseProperty.Status.CANCELED)
                .links(
                    BatchResponseProperty.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedBatchResponseProperty =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchResponseProperty),
                jacksonTypeRef<BatchResponseProperty>(),
            )

        assertThat(roundtrippedBatchResponseProperty).isEqualTo(batchResponseProperty)
    }
}
