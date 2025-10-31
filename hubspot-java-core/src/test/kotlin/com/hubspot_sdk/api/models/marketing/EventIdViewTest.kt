// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventIdViewTest {

    @Test
    fun create() {
        val eventIdView =
            EventIdView.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(eventIdView.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(eventIdView.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val eventIdView =
            EventIdView.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedEventIdView =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(eventIdView),
                jacksonTypeRef<EventIdView>(),
            )

        assertThat(roundtrippedEventIdView).isEqualTo(eventIdView)
    }
}
