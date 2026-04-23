// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.marketing.marketingevents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriberVidResponseTest {

    @Test
    fun create() {
        val subscriberVidResponse = SubscriberVidResponse.builder().vid(0L).build()

        assertThat(subscriberVidResponse.vid()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subscriberVidResponse = SubscriberVidResponse.builder().vid(0L).build()

        val roundtrippedSubscriberVidResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subscriberVidResponse),
                jacksonTypeRef<SubscriberVidResponse>(),
            )

        assertThat(roundtrippedSubscriberVidResponse).isEqualTo(subscriberVidResponse)
    }
}
