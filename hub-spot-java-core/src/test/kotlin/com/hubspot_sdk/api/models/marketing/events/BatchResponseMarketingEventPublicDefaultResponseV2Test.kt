// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.events

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchResponseMarketingEventPublicDefaultResponseV2Test {

    @Test
    fun create() {
        val batchResponseMarketingEventPublicDefaultResponseV2 =
            BatchResponseMarketingEventPublicDefaultResponseV2.builder()
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
                .status(BatchResponseMarketingEventPublicDefaultResponseV2.Status.PENDING)
                .links(
                    BatchResponseMarketingEventPublicDefaultResponseV2.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(batchResponseMarketingEventPublicDefaultResponseV2.completedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchResponseMarketingEventPublicDefaultResponseV2.results())
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
        assertThat(batchResponseMarketingEventPublicDefaultResponseV2.startedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchResponseMarketingEventPublicDefaultResponseV2.status())
            .isEqualTo(BatchResponseMarketingEventPublicDefaultResponseV2.Status.PENDING)
        assertThat(batchResponseMarketingEventPublicDefaultResponseV2.links())
            .contains(
                BatchResponseMarketingEventPublicDefaultResponseV2.Links.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(batchResponseMarketingEventPublicDefaultResponseV2.requestedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchResponseMarketingEventPublicDefaultResponseV2 =
            BatchResponseMarketingEventPublicDefaultResponseV2.builder()
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
                .status(BatchResponseMarketingEventPublicDefaultResponseV2.Status.PENDING)
                .links(
                    BatchResponseMarketingEventPublicDefaultResponseV2.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedBatchResponseMarketingEventPublicDefaultResponseV2 =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchResponseMarketingEventPublicDefaultResponseV2),
                jacksonTypeRef<BatchResponseMarketingEventPublicDefaultResponseV2>(),
            )

        assertThat(roundtrippedBatchResponseMarketingEventPublicDefaultResponseV2)
            .isEqualTo(batchResponseMarketingEventPublicDefaultResponseV2)
    }
}
