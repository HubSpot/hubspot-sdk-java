// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.marketing.campaigns

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MetricsCountersTest {

    @Test
    fun create() {
        val metricsCounters =
            MetricsCounters.builder()
                .influencedContacts(0)
                .newContactsFirstTouch(0)
                .newContactsLastTouch(0)
                .sessions(0)
                .build()

        assertThat(metricsCounters.influencedContacts()).isEqualTo(0)
        assertThat(metricsCounters.newContactsFirstTouch()).isEqualTo(0)
        assertThat(metricsCounters.newContactsLastTouch()).isEqualTo(0)
        assertThat(metricsCounters.sessions()).isEqualTo(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val metricsCounters =
            MetricsCounters.builder()
                .influencedContacts(0)
                .newContactsFirstTouch(0)
                .newContactsLastTouch(0)
                .sessions(0)
                .build()

        val roundtrippedMetricsCounters =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(metricsCounters),
                jacksonTypeRef<MetricsCounters>(),
            )

        assertThat(roundtrippedMetricsCounters).isEqualTo(metricsCounters)
    }
}
