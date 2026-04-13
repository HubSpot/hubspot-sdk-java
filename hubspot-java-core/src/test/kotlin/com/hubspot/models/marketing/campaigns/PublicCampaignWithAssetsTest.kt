// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.marketing.campaigns

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.JsonValue
import com.hubspot.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicCampaignWithAssetsTest {

    @Test
    fun create() {
        val publicCampaignWithAssets =
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
                                            "next" to mapOf("after" to "after", "link" to "link"),
                                            "prev" to mapOf("before" to "before", "link" to "link"),
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

        assertThat(publicCampaignWithAssets.id()).isEqualTo("id")
        assertThat(publicCampaignWithAssets.assets())
            .isEqualTo(
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
                                        "next" to mapOf("after" to "after", "link" to "link"),
                                        "prev" to mapOf("before" to "before", "link" to "link"),
                                    ),
                            )
                        ),
                    )
                    .build()
            )
        assertThat(publicCampaignWithAssets.businessUnits())
            .containsExactly(PublicBusinessUnit.builder().id(0).build())
        assertThat(publicCampaignWithAssets.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(publicCampaignWithAssets.properties())
            .isEqualTo(
                PublicCampaignWithAssets.Properties.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(publicCampaignWithAssets.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicCampaignWithAssets =
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
                                            "next" to mapOf("after" to "after", "link" to "link"),
                                            "prev" to mapOf("before" to "before", "link" to "link"),
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

        val roundtrippedPublicCampaignWithAssets =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicCampaignWithAssets),
                jacksonTypeRef<PublicCampaignWithAssets>(),
            )

        assertThat(roundtrippedPublicCampaignWithAssets).isEqualTo(publicCampaignWithAssets)
    }
}
