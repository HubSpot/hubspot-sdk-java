// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.events.occurrences

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VisibleExternalEventTypeNamesTest {

    @Test
    fun create() {
        val visibleExternalEventTypeNames =
            VisibleExternalEventTypeNames.builder().addEventType("string").build()

        assertThat(visibleExternalEventTypeNames.eventTypes()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val visibleExternalEventTypeNames =
            VisibleExternalEventTypeNames.builder().addEventType("string").build()

        val roundtrippedVisibleExternalEventTypeNames =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(visibleExternalEventTypeNames),
                jacksonTypeRef<VisibleExternalEventTypeNames>(),
            )

        assertThat(roundtrippedVisibleExternalEventTypeNames)
            .isEqualTo(visibleExternalEventTypeNames)
    }
}
