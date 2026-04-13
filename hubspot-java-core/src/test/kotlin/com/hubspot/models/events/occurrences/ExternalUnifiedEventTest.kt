// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.events.occurrences

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.JsonValue
import com.hubspot.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalUnifiedEventTest {

    @Test
    fun create() {
        val externalUnifiedEvent =
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

        assertThat(externalUnifiedEvent.id()).isEqualTo("id")
        assertThat(externalUnifiedEvent.eventType()).isEqualTo("eventType")
        assertThat(externalUnifiedEvent.objectId()).isEqualTo("objectId")
        assertThat(externalUnifiedEvent.objectType()).isEqualTo("objectType")
        assertThat(externalUnifiedEvent.occurredAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(externalUnifiedEvent.properties())
            .isEqualTo(
                ExternalUnifiedEvent.Properties.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalUnifiedEvent =
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

        val roundtrippedExternalUnifiedEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalUnifiedEvent),
                jacksonTypeRef<ExternalUnifiedEvent>(),
            )

        assertThat(roundtrippedExternalUnifiedEvent).isEqualTo(externalUnifiedEvent)
    }
}
