// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.events

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriberVidResponseTest {

    @Test
    fun create() {
        val subscriberVidResponse = SubscriberVidResponse.builder().vid(0).build()

        assertThat(subscriberVidResponse.vid()).isEqualTo(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subscriberVidResponse = SubscriberVidResponse.builder().vid(0).build()

        val roundtrippedSubscriberVidResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subscriberVidResponse),
                jacksonTypeRef<SubscriberVidResponse>(),
            )

        assertThat(roundtrippedSubscriberVidResponse).isEqualTo(subscriberVidResponse)
    }
}
