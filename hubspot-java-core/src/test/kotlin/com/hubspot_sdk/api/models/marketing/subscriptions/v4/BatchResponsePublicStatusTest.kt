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

internal class BatchResponsePublicStatusTest {

    @Test
    fun create() {
        val batchResponsePublicStatus =
            BatchResponsePublicStatus.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addResult(
                    PublicStatus.builder()
                        .channel(PublicStatus.Channel.EMAIL)
                        .source("source")
                        .status(PublicStatus.Status.SUBSCRIBED)
                        .subscriberIdString("subscriberIdString")
                        .subscriptionId(0)
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .businessUnitId(0L)
                        .legalBasis(PublicStatus.LegalBasis.LEGITIMATE_INTEREST_PQL)
                        .legalBasisExplanation("legalBasisExplanation")
                        .setStatusSuccessReason(
                            PublicStatus.SetStatusSuccessReason.RESUBSCRIBE_OCCURRED
                        )
                        .subscriptionName("subscriptionName")
                        .build()
                )
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(BatchResponsePublicStatus.Status.PENDING)
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
                    BatchResponsePublicStatus.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .numErrors(0)
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(batchResponsePublicStatus.completedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchResponsePublicStatus.results())
            .containsExactly(
                PublicStatus.builder()
                    .channel(PublicStatus.Channel.EMAIL)
                    .source("source")
                    .status(PublicStatus.Status.SUBSCRIBED)
                    .subscriberIdString("subscriberIdString")
                    .subscriptionId(0)
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .businessUnitId(0L)
                    .legalBasis(PublicStatus.LegalBasis.LEGITIMATE_INTEREST_PQL)
                    .legalBasisExplanation("legalBasisExplanation")
                    .setStatusSuccessReason(
                        PublicStatus.SetStatusSuccessReason.RESUBSCRIBE_OCCURRED
                    )
                    .subscriptionName("subscriptionName")
                    .build()
            )
        assertThat(batchResponsePublicStatus.startedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchResponsePublicStatus.status())
            .isEqualTo(BatchResponsePublicStatus.Status.PENDING)
        assertThat(batchResponsePublicStatus.errors().getOrNull())
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
        assertThat(batchResponsePublicStatus.links())
            .contains(
                BatchResponsePublicStatus.Links.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(batchResponsePublicStatus.numErrors()).contains(0)
        assertThat(batchResponsePublicStatus.requestedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchResponsePublicStatus =
            BatchResponsePublicStatus.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addResult(
                    PublicStatus.builder()
                        .channel(PublicStatus.Channel.EMAIL)
                        .source("source")
                        .status(PublicStatus.Status.SUBSCRIBED)
                        .subscriberIdString("subscriberIdString")
                        .subscriptionId(0)
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .businessUnitId(0L)
                        .legalBasis(PublicStatus.LegalBasis.LEGITIMATE_INTEREST_PQL)
                        .legalBasisExplanation("legalBasisExplanation")
                        .setStatusSuccessReason(
                            PublicStatus.SetStatusSuccessReason.RESUBSCRIBE_OCCURRED
                        )
                        .subscriptionName("subscriptionName")
                        .build()
                )
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(BatchResponsePublicStatus.Status.PENDING)
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
                    BatchResponsePublicStatus.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .numErrors(0)
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedBatchResponsePublicStatus =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchResponsePublicStatus),
                jacksonTypeRef<BatchResponsePublicStatus>(),
            )

        assertThat(roundtrippedBatchResponsePublicStatus).isEqualTo(batchResponsePublicStatus)
    }
}
