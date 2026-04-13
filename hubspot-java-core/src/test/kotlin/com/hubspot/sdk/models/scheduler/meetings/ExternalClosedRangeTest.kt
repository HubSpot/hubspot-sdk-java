// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.scheduler.meetings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalClosedRangeTest {

    @Test
    fun create() {
        val externalClosedRange = ExternalClosedRange.builder().end(0).start(0).build()

        assertThat(externalClosedRange.end()).isEqualTo(0)
        assertThat(externalClosedRange.start()).isEqualTo(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalClosedRange = ExternalClosedRange.builder().end(0).start(0).build()

        val roundtrippedExternalClosedRange =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalClosedRange),
                jacksonTypeRef<ExternalClosedRange>(),
            )

        assertThat(roundtrippedExternalClosedRange).isEqualTo(externalClosedRange)
    }
}
