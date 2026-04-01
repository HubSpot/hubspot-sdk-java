// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.campaigns

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchResponsePublicCampaignWithAssetsTest {

    @Test
    fun create() {
        val batchResponsePublicCampaignWithAssets =
            BatchResponsePublicCampaignWithAssets.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addResult(
                    PublicCampaignWithAssets.builder()
                        .id("id")
                        .assets(
                            PublicCampaignWithAssets.Assets.builder()
                                .putAdditionalProperty(
                                    "foo",
                                    JsonValue.from(
                                        mapOf(
                                            "results" to
                                                listOf(
                                                    mapOf(
                                                        "id" to "id",
                                                        "metrics" to mapOf("foo" to 0),
                                                        "name" to "name",
                                                    )
                                                ),
                                            "paging" to
                                                mapOf(
                                                    "next" to
                                                        mapOf("after" to "after", "link" to "link"),
                                                    "prev" to
                                                        mapOf(
                                                            "before" to "before",
                                                            "link" to "link",
                                                        ),
                                                ),
                                        )
                                    ),
                                )
                                .build()
                        )
                        .addBusinessUnit(PublicBusinessUnit.builder().id(0).build())
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .properties(
                            PublicCampaignWithAssets.Properties.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(BatchResponsePublicCampaignWithAssets.Status.CANCELED)
                .links(
                    BatchResponsePublicCampaignWithAssets.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(batchResponsePublicCampaignWithAssets.completedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchResponsePublicCampaignWithAssets.results())
            .containsExactly(
                PublicCampaignWithAssets.builder()
                    .id("id")
                    .assets(
                        PublicCampaignWithAssets.Assets.builder()
                            .putAdditionalProperty(
                                "foo",
                                JsonValue.from(
                                    mapOf(
                                        "results" to
                                            listOf(
                                                mapOf(
                                                    "id" to "id",
                                                    "metrics" to mapOf("foo" to 0),
                                                    "name" to "name",
                                                )
                                            ),
                                        "paging" to
                                            mapOf(
                                                "next" to
                                                    mapOf("after" to "after", "link" to "link"),
                                                "prev" to
                                                    mapOf("before" to "before", "link" to "link"),
                                            ),
                                    )
                                ),
                            )
                            .build()
                    )
                    .addBusinessUnit(PublicBusinessUnit.builder().id(0).build())
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .properties(
                        PublicCampaignWithAssets.Properties.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(batchResponsePublicCampaignWithAssets.startedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchResponsePublicCampaignWithAssets.status())
            .isEqualTo(BatchResponsePublicCampaignWithAssets.Status.CANCELED)
        assertThat(batchResponsePublicCampaignWithAssets.links())
            .contains(
                BatchResponsePublicCampaignWithAssets.Links.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(batchResponsePublicCampaignWithAssets.requestedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchResponsePublicCampaignWithAssets =
            BatchResponsePublicCampaignWithAssets.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addResult(
                    PublicCampaignWithAssets.builder()
                        .id("id")
                        .assets(
                            PublicCampaignWithAssets.Assets.builder()
                                .putAdditionalProperty(
                                    "foo",
                                    JsonValue.from(
                                        mapOf(
                                            "results" to
                                                listOf(
                                                    mapOf(
                                                        "id" to "id",
                                                        "metrics" to mapOf("foo" to 0),
                                                        "name" to "name",
                                                    )
                                                ),
                                            "paging" to
                                                mapOf(
                                                    "next" to
                                                        mapOf("after" to "after", "link" to "link"),
                                                    "prev" to
                                                        mapOf(
                                                            "before" to "before",
                                                            "link" to "link",
                                                        ),
                                                ),
                                        )
                                    ),
                                )
                                .build()
                        )
                        .addBusinessUnit(PublicBusinessUnit.builder().id(0).build())
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .properties(
                            PublicCampaignWithAssets.Properties.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(BatchResponsePublicCampaignWithAssets.Status.CANCELED)
                .links(
                    BatchResponsePublicCampaignWithAssets.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedBatchResponsePublicCampaignWithAssets =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchResponsePublicCampaignWithAssets),
                jacksonTypeRef<BatchResponsePublicCampaignWithAssets>(),
            )

        assertThat(roundtrippedBatchResponsePublicCampaignWithAssets)
            .isEqualTo(batchResponsePublicCampaignWithAssets)
    }
}
