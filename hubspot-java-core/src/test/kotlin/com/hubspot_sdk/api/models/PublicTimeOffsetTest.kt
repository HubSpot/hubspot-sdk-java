// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicTimeOffsetTest {

    @Test
    fun create() {
        val publicTimeOffset =
            PublicTimeOffset.builder()
                .amount(0L)
                .offsetDirection("offsetDirection")
                .timeUnit("timeUnit")
                .build()

        assertThat(publicTimeOffset.amount()).isEqualTo(0L)
        assertThat(publicTimeOffset.offsetDirection()).isEqualTo("offsetDirection")
        assertThat(publicTimeOffset.timeUnit()).isEqualTo("timeUnit")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicTimeOffset =
            PublicTimeOffset.builder()
                .amount(0L)
                .offsetDirection("offsetDirection")
                .timeUnit("timeUnit")
                .build()

        val roundtrippedPublicTimeOffset =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicTimeOffset),
                jacksonTypeRef<PublicTimeOffset>(),
            )

        assertThat(roundtrippedPublicTimeOffset).isEqualTo(publicTimeOffset)
    }
}
