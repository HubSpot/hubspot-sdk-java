// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.timeline

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventDetailTest {

    @Test
    fun create() {
        val eventDetail =
            EventDetail.builder()
                .details(
                    "<p>Registration occurred at Jan 30, 2020, 1:13:25 PM</p><h4>Questions</h4><p><strong>Who&#x27;s a good kitty?</strong>: Purr...</p><p><strong>Will you stop playing with that?</strong>: Meow!</p><p>EDIT</p>"
                )
                .build()

        assertThat(eventDetail.details())
            .isEqualTo(
                "<p>Registration occurred at Jan 30, 2020, 1:13:25 PM</p><h4>Questions</h4><p><strong>Who&#x27;s a good kitty?</strong>: Purr...</p><p><strong>Will you stop playing with that?</strong>: Meow!</p><p>EDIT</p>"
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val eventDetail =
            EventDetail.builder()
                .details(
                    "<p>Registration occurred at Jan 30, 2020, 1:13:25 PM</p><h4>Questions</h4><p><strong>Who&#x27;s a good kitty?</strong>: Purr...</p><p><strong>Will you stop playing with that?</strong>: Meow!</p><p>EDIT</p>"
                )
                .build()

        val roundtrippedEventDetail =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(eventDetail),
                jacksonTypeRef<EventDetail>(),
            )

        assertThat(roundtrippedEventDetail).isEqualTo(eventDetail)
    }
}
