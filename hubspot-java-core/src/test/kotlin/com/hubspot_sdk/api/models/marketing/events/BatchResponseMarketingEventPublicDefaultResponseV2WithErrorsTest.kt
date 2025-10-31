// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.events

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.ErrorDetail
import com.hubspot_sdk.api.models.StandardError
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchResponseMarketingEventPublicDefaultResponseV2WithErrorsTest {

    @Test
    fun create() {
        val batchResponseMarketingEventPublicDefaultResponseV2WithErrors =
            BatchResponseMarketingEventPublicDefaultResponseV2WithErrors.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addResult(
                    MarketingEventPublicDefaultResponseV2.builder()
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addCustomProperty(
                            CrmPropertyWrapper.builder().name("name").value("value").build()
                        )
                        .eventName("eventName")
                        .objectId("objectId")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .appInfo(AppInfo.builder().id("id").name("name").build())
                        .endDateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .eventCancelled(true)
                        .eventCompleted(true)
                        .eventDescription("eventDescription")
                        .eventOrganizer("eventOrganizer")
                        .eventType("eventType")
                        .eventUrl("eventUrl")
                        .startDateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(BatchResponseMarketingEventPublicDefaultResponseV2WithErrors.Status.PENDING)
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
                    BatchResponseMarketingEventPublicDefaultResponseV2WithErrors.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .numErrors(0)
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(batchResponseMarketingEventPublicDefaultResponseV2WithErrors.completedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchResponseMarketingEventPublicDefaultResponseV2WithErrors.results())
            .containsExactly(
                MarketingEventPublicDefaultResponseV2.builder()
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addCustomProperty(
                        CrmPropertyWrapper.builder().name("name").value("value").build()
                    )
                    .eventName("eventName")
                    .objectId("objectId")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .appInfo(AppInfo.builder().id("id").name("name").build())
                    .endDateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .eventCancelled(true)
                    .eventCompleted(true)
                    .eventDescription("eventDescription")
                    .eventOrganizer("eventOrganizer")
                    .eventType("eventType")
                    .eventUrl("eventUrl")
                    .startDateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(batchResponseMarketingEventPublicDefaultResponseV2WithErrors.startedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchResponseMarketingEventPublicDefaultResponseV2WithErrors.status())
            .isEqualTo(BatchResponseMarketingEventPublicDefaultResponseV2WithErrors.Status.PENDING)
        assertThat(
                batchResponseMarketingEventPublicDefaultResponseV2WithErrors.errors().getOrNull()
            )
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
        assertThat(batchResponseMarketingEventPublicDefaultResponseV2WithErrors.links())
            .contains(
                BatchResponseMarketingEventPublicDefaultResponseV2WithErrors.Links.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(batchResponseMarketingEventPublicDefaultResponseV2WithErrors.numErrors())
            .contains(0)
        assertThat(batchResponseMarketingEventPublicDefaultResponseV2WithErrors.requestedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchResponseMarketingEventPublicDefaultResponseV2WithErrors =
            BatchResponseMarketingEventPublicDefaultResponseV2WithErrors.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addResult(
                    MarketingEventPublicDefaultResponseV2.builder()
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addCustomProperty(
                            CrmPropertyWrapper.builder().name("name").value("value").build()
                        )
                        .eventName("eventName")
                        .objectId("objectId")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .appInfo(AppInfo.builder().id("id").name("name").build())
                        .endDateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .eventCancelled(true)
                        .eventCompleted(true)
                        .eventDescription("eventDescription")
                        .eventOrganizer("eventOrganizer")
                        .eventType("eventType")
                        .eventUrl("eventUrl")
                        .startDateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(BatchResponseMarketingEventPublicDefaultResponseV2WithErrors.Status.PENDING)
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
                    BatchResponseMarketingEventPublicDefaultResponseV2WithErrors.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .numErrors(0)
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedBatchResponseMarketingEventPublicDefaultResponseV2WithErrors =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(
                    batchResponseMarketingEventPublicDefaultResponseV2WithErrors
                ),
                jacksonTypeRef<BatchResponseMarketingEventPublicDefaultResponseV2WithErrors>(),
            )

        assertThat(roundtrippedBatchResponseMarketingEventPublicDefaultResponseV2WithErrors)
            .isEqualTo(batchResponseMarketingEventPublicDefaultResponseV2WithErrors)
    }
}
