// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.marketing.emails

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IntervalTest {

    @Test
    fun create() {
        val interval =
            Interval.builder()
                .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .start(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(interval.end()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(interval.start()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val interval =
            Interval.builder()
                .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .start(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedInterval =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(interval),
                jacksonTypeRef<Interval>(),
            )

        assertThat(roundtrippedInterval).isEqualTo(interval)
    }
}
