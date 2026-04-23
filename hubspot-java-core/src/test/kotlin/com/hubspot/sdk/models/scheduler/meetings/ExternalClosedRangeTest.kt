// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.scheduler.meetings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalClosedRangeTest {

    @Test
    fun create() {
        val externalClosedRange = ExternalClosedRange.builder().end(0L).start(0L).build()

        assertThat(externalClosedRange.end()).isEqualTo(0L)
        assertThat(externalClosedRange.start()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalClosedRange = ExternalClosedRange.builder().end(0L).start(0L).build()

        val roundtrippedExternalClosedRange =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalClosedRange),
                jacksonTypeRef<ExternalClosedRange>(),
            )

        assertThat(roundtrippedExternalClosedRange).isEqualTo(externalClosedRange)
    }
}
