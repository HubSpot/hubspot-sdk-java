// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.scheduler.meetings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalTimeRangeTest {

    @Test
    fun create() {
        val externalTimeRange = ExternalTimeRange.builder().end(0L).start(0L).build()

        assertThat(externalTimeRange.end()).isEqualTo(0L)
        assertThat(externalTimeRange.start()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalTimeRange = ExternalTimeRange.builder().end(0L).start(0L).build()

        val roundtrippedExternalTimeRange =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalTimeRange),
                jacksonTypeRef<ExternalTimeRange>(),
            )

        assertThat(roundtrippedExternalTimeRange).isEqualTo(externalTimeRange)
    }
}
