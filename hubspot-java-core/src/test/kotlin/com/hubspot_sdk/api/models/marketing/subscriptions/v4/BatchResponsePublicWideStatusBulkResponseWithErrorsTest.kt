// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.subscriptions.v4

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.ErrorDetail
import com.hubspot_sdk.api.models.StandardError
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchResponsePublicWideStatusBulkResponseWithErrorsTest {

    @Test
    fun create() {
        val batchResponsePublicWideStatusBulkResponseWithErrors =
            BatchResponsePublicWideStatusBulkResponseWithErrors.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addResult(
                    PublicWideStatusBulkResponse.builder()
                        .subscriberIdString("subscriberIdString")
                        .addWideStatus(
                            PublicWideStatus.builder()
                                .channel(PublicWideStatus.Channel.EMAIL)
                                .status(PublicWideStatus.Status.SUBSCRIBED)
                                .subscriberIdString("subscriberIdString")
                                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .wideStatusType(PublicWideStatus.WideStatusType.PORTAL_WIDE)
                                .businessUnitId(0L)
                                .build()
                        )
                        .build()
                )
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(BatchResponsePublicWideStatusBulkResponseWithErrors.Status.PENDING)
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
                    BatchResponsePublicWideStatusBulkResponseWithErrors.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .numErrors(0)
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(batchResponsePublicWideStatusBulkResponseWithErrors.completedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchResponsePublicWideStatusBulkResponseWithErrors.results())
            .containsExactly(
                PublicWideStatusBulkResponse.builder()
                    .subscriberIdString("subscriberIdString")
                    .addWideStatus(
                        PublicWideStatus.builder()
                            .channel(PublicWideStatus.Channel.EMAIL)
                            .status(PublicWideStatus.Status.SUBSCRIBED)
                            .subscriberIdString("subscriberIdString")
                            .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .wideStatusType(PublicWideStatus.WideStatusType.PORTAL_WIDE)
                            .businessUnitId(0L)
                            .build()
                    )
                    .build()
            )
        assertThat(batchResponsePublicWideStatusBulkResponseWithErrors.startedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchResponsePublicWideStatusBulkResponseWithErrors.status())
            .isEqualTo(BatchResponsePublicWideStatusBulkResponseWithErrors.Status.PENDING)
        assertThat(batchResponsePublicWideStatusBulkResponseWithErrors.errors().getOrNull())
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
        assertThat(batchResponsePublicWideStatusBulkResponseWithErrors.links())
            .contains(
                BatchResponsePublicWideStatusBulkResponseWithErrors.Links.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(batchResponsePublicWideStatusBulkResponseWithErrors.numErrors()).contains(0)
        assertThat(batchResponsePublicWideStatusBulkResponseWithErrors.requestedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchResponsePublicWideStatusBulkResponseWithErrors =
            BatchResponsePublicWideStatusBulkResponseWithErrors.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addResult(
                    PublicWideStatusBulkResponse.builder()
                        .subscriberIdString("subscriberIdString")
                        .addWideStatus(
                            PublicWideStatus.builder()
                                .channel(PublicWideStatus.Channel.EMAIL)
                                .status(PublicWideStatus.Status.SUBSCRIBED)
                                .subscriberIdString("subscriberIdString")
                                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .wideStatusType(PublicWideStatus.WideStatusType.PORTAL_WIDE)
                                .businessUnitId(0L)
                                .build()
                        )
                        .build()
                )
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(BatchResponsePublicWideStatusBulkResponseWithErrors.Status.PENDING)
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
                    BatchResponsePublicWideStatusBulkResponseWithErrors.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .numErrors(0)
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedBatchResponsePublicWideStatusBulkResponseWithErrors =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchResponsePublicWideStatusBulkResponseWithErrors),
                jacksonTypeRef<BatchResponsePublicWideStatusBulkResponseWithErrors>(),
            )

        assertThat(roundtrippedBatchResponsePublicWideStatusBulkResponseWithErrors)
            .isEqualTo(batchResponsePublicWideStatusBulkResponseWithErrors)
    }
}
