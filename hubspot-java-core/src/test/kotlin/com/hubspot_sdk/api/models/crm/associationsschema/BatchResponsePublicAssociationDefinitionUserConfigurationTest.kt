// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.associationsschema

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchResponsePublicAssociationDefinitionUserConfigurationTest {

    @Test
    fun create() {
        val batchResponsePublicAssociationDefinitionUserConfiguration =
            BatchResponsePublicAssociationDefinitionUserConfiguration.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addResult(
                    PublicAssociationDefinitionUserConfiguration.builder()
                        .category(
                            PublicAssociationDefinitionUserConfiguration.Category.HUBSPOT_DEFINED
                        )
                        .typeId(0)
                        .label("label")
                        .userEnforcedMaxToObjectIds(0)
                        .build()
                )
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(BatchResponsePublicAssociationDefinitionUserConfiguration.Status.CANCELED)
                .links(
                    BatchResponsePublicAssociationDefinitionUserConfiguration.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(batchResponsePublicAssociationDefinitionUserConfiguration.completedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchResponsePublicAssociationDefinitionUserConfiguration.results())
            .containsExactly(
                PublicAssociationDefinitionUserConfiguration.builder()
                    .category(PublicAssociationDefinitionUserConfiguration.Category.HUBSPOT_DEFINED)
                    .typeId(0)
                    .label("label")
                    .userEnforcedMaxToObjectIds(0)
                    .build()
            )
        assertThat(batchResponsePublicAssociationDefinitionUserConfiguration.startedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchResponsePublicAssociationDefinitionUserConfiguration.status())
            .isEqualTo(BatchResponsePublicAssociationDefinitionUserConfiguration.Status.CANCELED)
        assertThat(batchResponsePublicAssociationDefinitionUserConfiguration.links())
            .contains(
                BatchResponsePublicAssociationDefinitionUserConfiguration.Links.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(batchResponsePublicAssociationDefinitionUserConfiguration.requestedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchResponsePublicAssociationDefinitionUserConfiguration =
            BatchResponsePublicAssociationDefinitionUserConfiguration.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addResult(
                    PublicAssociationDefinitionUserConfiguration.builder()
                        .category(
                            PublicAssociationDefinitionUserConfiguration.Category.HUBSPOT_DEFINED
                        )
                        .typeId(0)
                        .label("label")
                        .userEnforcedMaxToObjectIds(0)
                        .build()
                )
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(BatchResponsePublicAssociationDefinitionUserConfiguration.Status.CANCELED)
                .links(
                    BatchResponsePublicAssociationDefinitionUserConfiguration.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedBatchResponsePublicAssociationDefinitionUserConfiguration =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(
                    batchResponsePublicAssociationDefinitionUserConfiguration
                ),
                jacksonTypeRef<BatchResponsePublicAssociationDefinitionUserConfiguration>(),
            )

        assertThat(roundtrippedBatchResponsePublicAssociationDefinitionUserConfiguration)
            .isEqualTo(batchResponsePublicAssociationDefinitionUserConfiguration)
    }
}
