// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.marketing.marketingevents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventDetailSettingsUrlTest {

    @Test
    fun create() {
        val eventDetailSettingsUrl =
            EventDetailSettingsUrl.builder().eventDetailsUrl("eventDetailsUrl").build()

        assertThat(eventDetailSettingsUrl.eventDetailsUrl()).isEqualTo("eventDetailsUrl")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val eventDetailSettingsUrl =
            EventDetailSettingsUrl.builder().eventDetailsUrl("eventDetailsUrl").build()

        val roundtrippedEventDetailSettingsUrl =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(eventDetailSettingsUrl),
                jacksonTypeRef<EventDetailSettingsUrl>(),
            )

        assertThat(roundtrippedEventDetailSettingsUrl).isEqualTo(eventDetailSettingsUrl)
    }
}
