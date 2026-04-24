// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.marketing.campaigns

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchResponsePublicCampaignTest {

    @Test
    fun create() {
        val batchResponsePublicCampaign =
            BatchResponsePublicCampaign.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addResult(
                    PublicCampaign.builder()
                        .id("id")
                        .addBusinessUnit(PublicBusinessUnit.builder().id(0L).build())
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .properties(
                            PublicCampaign.Properties.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(BatchResponsePublicCampaign.Status.CANCELED)
                .links(
                    BatchResponsePublicCampaign.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(batchResponsePublicCampaign.completedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchResponsePublicCampaign.results())
            .containsExactly(
                PublicCampaign.builder()
                    .id("id")
                    .addBusinessUnit(PublicBusinessUnit.builder().id(0L).build())
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .properties(
                        PublicCampaign.Properties.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(batchResponsePublicCampaign.startedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchResponsePublicCampaign.status())
            .isEqualTo(BatchResponsePublicCampaign.Status.CANCELED)
        assertThat(batchResponsePublicCampaign.links())
            .contains(
                BatchResponsePublicCampaign.Links.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(batchResponsePublicCampaign.requestedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchResponsePublicCampaign =
            BatchResponsePublicCampaign.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addResult(
                    PublicCampaign.builder()
                        .id("id")
                        .addBusinessUnit(PublicBusinessUnit.builder().id(0L).build())
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .properties(
                            PublicCampaign.Properties.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(BatchResponsePublicCampaign.Status.CANCELED)
                .links(
                    BatchResponsePublicCampaign.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedBatchResponsePublicCampaign =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchResponsePublicCampaign),
                jacksonTypeRef<BatchResponsePublicCampaign>(),
            )

        assertThat(roundtrippedBatchResponsePublicCampaign).isEqualTo(batchResponsePublicCampaign)
    }
}
