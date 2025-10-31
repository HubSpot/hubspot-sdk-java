// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.hubdb

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.ErrorDetail
import com.hubspot_sdk.api.models.StandardError
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchResponseHubDbTableRowV3WithErrorsTest {

    @Test
    fun create() {
        val batchResponseHubDbTableRowV3WithErrors =
            BatchResponseHubDbTableRowV3WithErrors.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addResult(
                    HubDbTableRowV3.builder()
                        .values(
                            HubDbTableRowV3.Values.builder()
                                .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                                .build()
                        )
                        .id("id")
                        .childTableId("childTableId")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .name("name")
                        .path("path")
                        .publishedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(BatchResponseHubDbTableRowV3WithErrors.Status.PENDING)
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
                    BatchResponseHubDbTableRowV3WithErrors.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .numErrors(0)
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(batchResponseHubDbTableRowV3WithErrors.completedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchResponseHubDbTableRowV3WithErrors.results())
            .containsExactly(
                HubDbTableRowV3.builder()
                    .values(
                        HubDbTableRowV3.Values.builder()
                            .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                    .id("id")
                    .childTableId("childTableId")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .name("name")
                    .path("path")
                    .publishedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(batchResponseHubDbTableRowV3WithErrors.startedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchResponseHubDbTableRowV3WithErrors.status())
            .isEqualTo(BatchResponseHubDbTableRowV3WithErrors.Status.PENDING)
        assertThat(batchResponseHubDbTableRowV3WithErrors.errors().getOrNull())
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
        assertThat(batchResponseHubDbTableRowV3WithErrors.links())
            .contains(
                BatchResponseHubDbTableRowV3WithErrors.Links.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(batchResponseHubDbTableRowV3WithErrors.numErrors()).contains(0)
        assertThat(batchResponseHubDbTableRowV3WithErrors.requestedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchResponseHubDbTableRowV3WithErrors =
            BatchResponseHubDbTableRowV3WithErrors.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addResult(
                    HubDbTableRowV3.builder()
                        .values(
                            HubDbTableRowV3.Values.builder()
                                .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                                .build()
                        )
                        .id("id")
                        .childTableId("childTableId")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .name("name")
                        .path("path")
                        .publishedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(BatchResponseHubDbTableRowV3WithErrors.Status.PENDING)
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
                    BatchResponseHubDbTableRowV3WithErrors.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .numErrors(0)
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedBatchResponseHubDbTableRowV3WithErrors =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchResponseHubDbTableRowV3WithErrors),
                jacksonTypeRef<BatchResponseHubDbTableRowV3WithErrors>(),
            )

        assertThat(roundtrippedBatchResponseHubDbTableRowV3WithErrors)
            .isEqualTo(batchResponseHubDbTableRowV3WithErrors)
    }
}
