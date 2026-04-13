// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.associationsschema

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.JsonValue
import com.hubspot.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchResponsePublicAssociationDefinitionConfigurationUpdateResultTest {

    @Test
    fun create() {
        val batchResponsePublicAssociationDefinitionConfigurationUpdateResult =
            BatchResponsePublicAssociationDefinitionConfigurationUpdateResult.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addResult(
                    PublicAssociationDefinitionConfigurationUpdateResult.builder()
                        .category(
                            PublicAssociationDefinitionConfigurationUpdateResult.Category
                                .HUBSPOT_DEFINED
                        )
                        .typeId(0)
                        .userEnforcedMaxToObjectIds(0)
                        .build()
                )
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(
                    BatchResponsePublicAssociationDefinitionConfigurationUpdateResult.Status
                        .CANCELED
                )
                .links(
                    BatchResponsePublicAssociationDefinitionConfigurationUpdateResult.Links
                        .builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(batchResponsePublicAssociationDefinitionConfigurationUpdateResult.completedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchResponsePublicAssociationDefinitionConfigurationUpdateResult.results())
            .containsExactly(
                PublicAssociationDefinitionConfigurationUpdateResult.builder()
                    .category(
                        PublicAssociationDefinitionConfigurationUpdateResult.Category
                            .HUBSPOT_DEFINED
                    )
                    .typeId(0)
                    .userEnforcedMaxToObjectIds(0)
                    .build()
            )
        assertThat(batchResponsePublicAssociationDefinitionConfigurationUpdateResult.startedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchResponsePublicAssociationDefinitionConfigurationUpdateResult.status())
            .isEqualTo(
                BatchResponsePublicAssociationDefinitionConfigurationUpdateResult.Status.CANCELED
            )
        assertThat(batchResponsePublicAssociationDefinitionConfigurationUpdateResult.links())
            .contains(
                BatchResponsePublicAssociationDefinitionConfigurationUpdateResult.Links.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(batchResponsePublicAssociationDefinitionConfigurationUpdateResult.requestedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchResponsePublicAssociationDefinitionConfigurationUpdateResult =
            BatchResponsePublicAssociationDefinitionConfigurationUpdateResult.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addResult(
                    PublicAssociationDefinitionConfigurationUpdateResult.builder()
                        .category(
                            PublicAssociationDefinitionConfigurationUpdateResult.Category
                                .HUBSPOT_DEFINED
                        )
                        .typeId(0)
                        .userEnforcedMaxToObjectIds(0)
                        .build()
                )
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(
                    BatchResponsePublicAssociationDefinitionConfigurationUpdateResult.Status
                        .CANCELED
                )
                .links(
                    BatchResponsePublicAssociationDefinitionConfigurationUpdateResult.Links
                        .builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedBatchResponsePublicAssociationDefinitionConfigurationUpdateResult =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(
                    batchResponsePublicAssociationDefinitionConfigurationUpdateResult
                ),
                jacksonTypeRef<BatchResponsePublicAssociationDefinitionConfigurationUpdateResult>(),
            )

        assertThat(roundtrippedBatchResponsePublicAssociationDefinitionConfigurationUpdateResult)
            .isEqualTo(batchResponsePublicAssociationDefinitionConfigurationUpdateResult)
    }
}
