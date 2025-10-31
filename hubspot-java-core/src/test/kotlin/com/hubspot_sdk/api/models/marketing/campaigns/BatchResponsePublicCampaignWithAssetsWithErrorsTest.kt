// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.campaigns

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.ErrorDetail
import com.hubspot_sdk.api.models.StandardError
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
                                                    "next" to mapOf("after" to "", "link" to ""),
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
                .status(BatchResponsePublicCampaignWithAssetsWithErrors.Status.PENDING)
                .addError(
                    StandardError.builder()
                        .category("")
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
                                            "missingScopes",
                                            JsonValue.from(listOf("scope1", "scope2")),
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
                        .message("")
                        .status("")
                        .id("")
                        .subCategory(JsonValue.from(""))
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
                                                "next" to mapOf("after" to "", "link" to ""),
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
            .isEqualTo(BatchResponsePublicCampaignWithAssetsWithErrors.Status.PENDING)
        assertThat(batchResponsePublicCampaignWithAssetsWithErrors.errors().getOrNull())
            .containsExactly(
                StandardError.builder()
                    .category("")
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
                                        "missingScopes",
                                        JsonValue.from(listOf("scope1", "scope2")),
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
                    .message("")
                    .status("")
                    .id("")
                    .subCategory(JsonValue.from(""))
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
                                                    "next" to mapOf("after" to "", "link" to ""),
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
                .status(BatchResponsePublicCampaignWithAssetsWithErrors.Status.PENDING)
                .addError(
                    StandardError.builder()
                        .category("")
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
                                            "missingScopes",
                                            JsonValue.from(listOf("scope1", "scope2")),
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
                        .message("")
                        .status("")
                        .id("")
                        .subCategory(JsonValue.from(""))
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
