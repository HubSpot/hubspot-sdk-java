// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.marketing.marketingevents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import com.hubspot.sdk.models.ForwardPaging
import com.hubspot.sdk.models.NextPage
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponseMarketingEventPublicReadResponseV2ForwardPagingTest {

    @Test
    fun create() {
        val collectionResponseMarketingEventPublicReadResponseV2ForwardPaging =
            CollectionResponseMarketingEventPublicReadResponseV2ForwardPaging.builder()
                .addResult(
                    MarketingEventPublicReadResponseV2.builder()
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addCustomProperty(
                            CrmPropertyWrapper.builder().name("name").value("value").build()
                        )
                        .eventName("eventName")
                        .objectId("objectId")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .appInfo(AppInfo.builder().id("id").name("name").build())
                        .attendees(0)
                        .cancellations(0)
                        .endDateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .eventCancelled(true)
                        .eventCompleted(true)
                        .eventDescription("eventDescription")
                        .eventOrganizer("eventOrganizer")
                        .eventStatus("eventStatus")
                        .eventStatusV2("eventStatusV2")
                        .eventType("eventType")
                        .eventUrl("eventUrl")
                        .externalEventId("externalEventId")
                        .noShows(0)
                        .registrants(0)
                        .startDateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .paging(
                    ForwardPaging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
                        .build()
                )
                .build()

        assertThat(collectionResponseMarketingEventPublicReadResponseV2ForwardPaging.results())
            .containsExactly(
                MarketingEventPublicReadResponseV2.builder()
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addCustomProperty(
                        CrmPropertyWrapper.builder().name("name").value("value").build()
                    )
                    .eventName("eventName")
                    .objectId("objectId")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .appInfo(AppInfo.builder().id("id").name("name").build())
                    .attendees(0)
                    .cancellations(0)
                    .endDateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .eventCancelled(true)
                    .eventCompleted(true)
                    .eventDescription("eventDescription")
                    .eventOrganizer("eventOrganizer")
                    .eventStatus("eventStatus")
                    .eventStatusV2("eventStatusV2")
                    .eventType("eventType")
                    .eventUrl("eventUrl")
                    .externalEventId("externalEventId")
                    .noShows(0)
                    .registrants(0)
                    .startDateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(collectionResponseMarketingEventPublicReadResponseV2ForwardPaging.paging())
            .contains(
                ForwardPaging.builder()
                    .next(NextPage.builder().after("after").link("link").build())
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionResponseMarketingEventPublicReadResponseV2ForwardPaging =
            CollectionResponseMarketingEventPublicReadResponseV2ForwardPaging.builder()
                .addResult(
                    MarketingEventPublicReadResponseV2.builder()
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addCustomProperty(
                            CrmPropertyWrapper.builder().name("name").value("value").build()
                        )
                        .eventName("eventName")
                        .objectId("objectId")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .appInfo(AppInfo.builder().id("id").name("name").build())
                        .attendees(0)
                        .cancellations(0)
                        .endDateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .eventCancelled(true)
                        .eventCompleted(true)
                        .eventDescription("eventDescription")
                        .eventOrganizer("eventOrganizer")
                        .eventStatus("eventStatus")
                        .eventStatusV2("eventStatusV2")
                        .eventType("eventType")
                        .eventUrl("eventUrl")
                        .externalEventId("externalEventId")
                        .noShows(0)
                        .registrants(0)
                        .startDateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .paging(
                    ForwardPaging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
                        .build()
                )
                .build()

        val roundtrippedCollectionResponseMarketingEventPublicReadResponseV2ForwardPaging =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(
                    collectionResponseMarketingEventPublicReadResponseV2ForwardPaging
                ),
                jacksonTypeRef<CollectionResponseMarketingEventPublicReadResponseV2ForwardPaging>(),
            )

        assertThat(roundtrippedCollectionResponseMarketingEventPublicReadResponseV2ForwardPaging)
            .isEqualTo(collectionResponseMarketingEventPublicReadResponseV2ForwardPaging)
    }
}
