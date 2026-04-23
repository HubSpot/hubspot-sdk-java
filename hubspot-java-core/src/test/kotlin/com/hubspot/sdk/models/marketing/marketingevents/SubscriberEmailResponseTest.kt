// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.marketing.marketingevents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriberEmailResponseTest {

    @Test
    fun create() {
        val subscriberEmailResponse =
            SubscriberEmailResponse.builder().email("email").vid(0L).build()

        assertThat(subscriberEmailResponse.email()).isEqualTo("email")
        assertThat(subscriberEmailResponse.vid()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subscriberEmailResponse =
            SubscriberEmailResponse.builder().email("email").vid(0L).build()

        val roundtrippedSubscriberEmailResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subscriberEmailResponse),
                jacksonTypeRef<SubscriberEmailResponse>(),
            )

        assertThat(roundtrippedSubscriberEmailResponse).isEqualTo(subscriberEmailResponse)
    }
}
