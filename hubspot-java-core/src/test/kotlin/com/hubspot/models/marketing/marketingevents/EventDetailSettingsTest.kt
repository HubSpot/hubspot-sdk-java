// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.marketing.marketingevents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventDetailSettingsTest {

    @Test
    fun create() {
        val eventDetailSettings =
            EventDetailSettings.builder().appId(0).eventDetailsUrl("eventDetailsUrl").build()

        assertThat(eventDetailSettings.appId()).isEqualTo(0)
        assertThat(eventDetailSettings.eventDetailsUrl()).isEqualTo("eventDetailsUrl")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val eventDetailSettings =
            EventDetailSettings.builder().appId(0).eventDetailsUrl("eventDetailsUrl").build()

        val roundtrippedEventDetailSettings =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(eventDetailSettings),
                jacksonTypeRef<EventDetailSettings>(),
            )

        assertThat(roundtrippedEventDetailSettings).isEqualTo(eventDetailSettings)
    }
}
