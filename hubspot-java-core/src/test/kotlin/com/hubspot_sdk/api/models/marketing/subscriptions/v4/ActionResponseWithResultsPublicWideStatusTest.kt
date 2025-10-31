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

internal class ActionResponseWithResultsPublicWideStatusTest {

    @Test
    fun create() {
        val actionResponseWithResultsPublicWideStatus =
            ActionResponseWithResultsPublicWideStatus.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addResult(
                    PublicWideStatus.builder()
                        .channel(PublicWideStatus.Channel.EMAIL)
                        .status(PublicWideStatus.Status.SUBSCRIBED)
                        .subscriberIdString("subscriberIdString")
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .wideStatusType(PublicWideStatus.WideStatusType.PORTAL_WIDE)
                        .businessUnitId(0L)
                        .build()
                )
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(ActionResponseWithResultsPublicWideStatus.Status.PENDING)
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
                    ActionResponseWithResultsPublicWideStatus.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .numErrors(0)
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(actionResponseWithResultsPublicWideStatus.completedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(actionResponseWithResultsPublicWideStatus.results())
            .containsExactly(
                PublicWideStatus.builder()
                    .channel(PublicWideStatus.Channel.EMAIL)
                    .status(PublicWideStatus.Status.SUBSCRIBED)
                    .subscriberIdString("subscriberIdString")
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .wideStatusType(PublicWideStatus.WideStatusType.PORTAL_WIDE)
                    .businessUnitId(0L)
                    .build()
            )
        assertThat(actionResponseWithResultsPublicWideStatus.startedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(actionResponseWithResultsPublicWideStatus.status())
            .isEqualTo(ActionResponseWithResultsPublicWideStatus.Status.PENDING)
        assertThat(actionResponseWithResultsPublicWideStatus.errors().getOrNull())
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
        assertThat(actionResponseWithResultsPublicWideStatus.links())
            .contains(
                ActionResponseWithResultsPublicWideStatus.Links.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(actionResponseWithResultsPublicWideStatus.numErrors()).contains(0)
        assertThat(actionResponseWithResultsPublicWideStatus.requestedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionResponseWithResultsPublicWideStatus =
            ActionResponseWithResultsPublicWideStatus.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addResult(
                    PublicWideStatus.builder()
                        .channel(PublicWideStatus.Channel.EMAIL)
                        .status(PublicWideStatus.Status.SUBSCRIBED)
                        .subscriberIdString("subscriberIdString")
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .wideStatusType(PublicWideStatus.WideStatusType.PORTAL_WIDE)
                        .businessUnitId(0L)
                        .build()
                )
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(ActionResponseWithResultsPublicWideStatus.Status.PENDING)
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
                    ActionResponseWithResultsPublicWideStatus.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .numErrors(0)
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedActionResponseWithResultsPublicWideStatus =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionResponseWithResultsPublicWideStatus),
                jacksonTypeRef<ActionResponseWithResultsPublicWideStatus>(),
            )

        assertThat(roundtrippedActionResponseWithResultsPublicWideStatus)
            .isEqualTo(actionResponseWithResultsPublicWideStatus)
    }
}
