// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.scheduler.meetings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalTimeRangeTest {

    @Test
    fun create() {
        val externalTimeRange = ExternalTimeRange.builder().end(0).start(0).build()

        assertThat(externalTimeRange.end()).isEqualTo(0)
        assertThat(externalTimeRange.start()).isEqualTo(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalTimeRange = ExternalTimeRange.builder().end(0).start(0).build()

        val roundtrippedExternalTimeRange =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalTimeRange),
                jacksonTypeRef<ExternalTimeRange>(),
            )

        assertThat(roundtrippedExternalTimeRange).isEqualTo(externalTimeRange)
    }
}
