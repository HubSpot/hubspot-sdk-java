// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.events

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.NextPage
import com.hubspot_sdk.api.models.PreviousPage
import com.hubspot_sdk.api.models.marketing.emails.EmailsPaging
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponseExternalUnifiedEventTest {

    @Test
    fun create() {
        val collectionResponseExternalUnifiedEvent =
            CollectionResponseExternalUnifiedEvent.builder()
                .addResult(
                    ExternalUnifiedEvent.builder()
                        .id("id")
                        .eventType("eventType")
                        .objectId("objectId")
                        .objectType("objectType")
                        .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .properties(
                            ExternalUnifiedEvent.Properties.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
                .paging(
                    EmailsPaging.builder()
                        .next(NextPage.builder().after("").link("").build())
                        .prev(PreviousPage.builder().before("before").link("link").build())
                        .build()
                )
                .build()

        assertThat(collectionResponseExternalUnifiedEvent.results())
            .containsExactly(
                ExternalUnifiedEvent.builder()
                    .id("id")
                    .eventType("eventType")
                    .objectId("objectId")
                    .objectType("objectType")
                    .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .properties(
                        ExternalUnifiedEvent.Properties.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )
        assertThat(collectionResponseExternalUnifiedEvent.paging())
            .contains(
                EmailsPaging.builder()
                    .next(NextPage.builder().after("").link("").build())
                    .prev(PreviousPage.builder().before("before").link("link").build())
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionResponseExternalUnifiedEvent =
            CollectionResponseExternalUnifiedEvent.builder()
                .addResult(
                    ExternalUnifiedEvent.builder()
                        .id("id")
                        .eventType("eventType")
                        .objectId("objectId")
                        .objectType("objectType")
                        .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .properties(
                            ExternalUnifiedEvent.Properties.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
                .paging(
                    EmailsPaging.builder()
                        .next(NextPage.builder().after("").link("").build())
                        .prev(PreviousPage.builder().before("before").link("link").build())
                        .build()
                )
                .build()

        val roundtrippedCollectionResponseExternalUnifiedEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(collectionResponseExternalUnifiedEvent),
                jacksonTypeRef<CollectionResponseExternalUnifiedEvent>(),
            )

        assertThat(roundtrippedCollectionResponseExternalUnifiedEvent)
            .isEqualTo(collectionResponseExternalUnifiedEvent)
    }
}
