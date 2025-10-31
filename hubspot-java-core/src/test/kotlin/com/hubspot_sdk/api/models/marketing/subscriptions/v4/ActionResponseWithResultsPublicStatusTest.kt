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

internal class ActionResponseWithResultsPublicStatusTest {

    @Test
    fun create() {
        val actionResponseWithResultsPublicStatus =
            ActionResponseWithResultsPublicStatus.builder()
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
                .status(ActionResponseWithResultsPublicStatus.Status.PENDING)
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
                    ActionResponseWithResultsPublicStatus.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .numErrors(0)
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(actionResponseWithResultsPublicStatus.completedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(actionResponseWithResultsPublicStatus.results())
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
        assertThat(actionResponseWithResultsPublicStatus.startedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(actionResponseWithResultsPublicStatus.status())
            .isEqualTo(ActionResponseWithResultsPublicStatus.Status.PENDING)
        assertThat(actionResponseWithResultsPublicStatus.errors().getOrNull())
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
        assertThat(actionResponseWithResultsPublicStatus.links())
            .contains(
                ActionResponseWithResultsPublicStatus.Links.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(actionResponseWithResultsPublicStatus.numErrors()).contains(0)
        assertThat(actionResponseWithResultsPublicStatus.requestedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionResponseWithResultsPublicStatus =
            ActionResponseWithResultsPublicStatus.builder()
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
                .status(ActionResponseWithResultsPublicStatus.Status.PENDING)
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
                    ActionResponseWithResultsPublicStatus.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .numErrors(0)
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedActionResponseWithResultsPublicStatus =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionResponseWithResultsPublicStatus),
                jacksonTypeRef<ActionResponseWithResultsPublicStatus>(),
            )

        assertThat(roundtrippedActionResponseWithResultsPublicStatus)
            .isEqualTo(actionResponseWithResultsPublicStatus)
    }
}
