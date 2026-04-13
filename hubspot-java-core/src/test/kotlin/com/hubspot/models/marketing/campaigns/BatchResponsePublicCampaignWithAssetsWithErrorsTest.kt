// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.marketing.campaigns

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.JsonValue
import com.hubspot.core.jsonMapper
import com.hubspot.models.ErrorDetail
import com.hubspot.models.StandardError
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchResponsePublicCampaignWithAssetsWithErrorsTest {

    @Test
    fun create() {
        val batchResponsePublicCampaignWithAssetsWithErrors =
            BatchResponsePublicCampaignWithAssetsWithErrors.builder()
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
                .status(BatchResponsePublicCampaignWithAssetsWithErrors.Status.CANCELED)
                .addError(
                    StandardError.builder()
                        .category("category")
                        .context(
                            StandardError.Context.builder()
                                .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                                .build()
                        )
                        .addError(
                            ErrorDetail.builder()
                                .message("message")
                                .code("code")
                                .context(
                                    ErrorDetail.Context.builder()
                                        .putAdditionalProperty(
                                            "0",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "1",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "2",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "3",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "4",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "5",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "6",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "7",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "8",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "9",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "10",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "11",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "12",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "13",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "14",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "15",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "16",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "17",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "18",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "19",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "20",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "21",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "22",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "23",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "24",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "25",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "26",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "27",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "28",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "29",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "30",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "31",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .build()
                                )
                                .in_("in")
                                .subCategory("subCategory")
                                .build()
                        )
                        .links(
                            StandardError.Links.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .message("message")
                        .status("status")
                        .id("id")
                        .subCategory(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .links(
                    BatchResponsePublicCampaignWithAssetsWithErrors.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .numErrors(0)
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(batchResponsePublicCampaignWithAssetsWithErrors.completedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchResponsePublicCampaignWithAssetsWithErrors.results())
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
        assertThat(batchResponsePublicCampaignWithAssetsWithErrors.startedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchResponsePublicCampaignWithAssetsWithErrors.status())
            .isEqualTo(BatchResponsePublicCampaignWithAssetsWithErrors.Status.CANCELED)
        assertThat(batchResponsePublicCampaignWithAssetsWithErrors.errors().getOrNull())
            .containsExactly(
                StandardError.builder()
                    .category("category")
                    .context(
                        StandardError.Context.builder()
                            .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                            .build()
                    )
                    .addError(
                        ErrorDetail.builder()
                            .message("message")
                            .code("code")
                            .context(
                                ErrorDetail.Context.builder()
                                    .putAdditionalProperty("0", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("1", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("2", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("3", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("4", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("5", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("6", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("7", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("8", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("9", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("10", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("11", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("12", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("13", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("14", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("15", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("16", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("17", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("18", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("19", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("20", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("21", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("22", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("23", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("24", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("25", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("26", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("27", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("28", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("29", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("30", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("31", JsonValue.from(listOf("string")))
                                    .build()
                            )
                            .in_("in")
                            .subCategory("subCategory")
                            .build()
                    )
                    .links(
                        StandardError.Links.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .message("message")
                    .status("status")
                    .id("id")
                    .subCategory(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
        assertThat(batchResponsePublicCampaignWithAssetsWithErrors.links())
            .contains(
                BatchResponsePublicCampaignWithAssetsWithErrors.Links.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(batchResponsePublicCampaignWithAssetsWithErrors.numErrors()).contains(0)
        assertThat(batchResponsePublicCampaignWithAssetsWithErrors.requestedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchResponsePublicCampaignWithAssetsWithErrors =
            BatchResponsePublicCampaignWithAssetsWithErrors.builder()
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
                .status(BatchResponsePublicCampaignWithAssetsWithErrors.Status.CANCELED)
                .addError(
                    StandardError.builder()
                        .category("category")
                        .context(
                            StandardError.Context.builder()
                                .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                                .build()
                        )
                        .addError(
                            ErrorDetail.builder()
                                .message("message")
                                .code("code")
                                .context(
                                    ErrorDetail.Context.builder()
                                        .putAdditionalProperty(
                                            "0",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "1",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "2",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "3",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "4",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "5",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "6",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "7",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "8",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "9",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "10",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "11",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "12",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "13",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "14",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "15",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "16",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "17",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "18",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "19",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "20",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "21",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "22",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "23",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "24",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "25",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "26",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "27",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "28",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "29",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "30",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "31",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .build()
                                )
                                .in_("in")
                                .subCategory("subCategory")
                                .build()
                        )
                        .links(
                            StandardError.Links.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .message("message")
                        .status("status")
                        .id("id")
                        .subCategory(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .links(
                    BatchResponsePublicCampaignWithAssetsWithErrors.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .numErrors(0)
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedBatchResponsePublicCampaignWithAssetsWithErrors =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchResponsePublicCampaignWithAssetsWithErrors),
                jacksonTypeRef<BatchResponsePublicCampaignWithAssetsWithErrors>(),
            )

        assertThat(roundtrippedBatchResponsePublicCampaignWithAssetsWithErrors)
            .isEqualTo(batchResponsePublicCampaignWithAssetsWithErrors)
    }
}
