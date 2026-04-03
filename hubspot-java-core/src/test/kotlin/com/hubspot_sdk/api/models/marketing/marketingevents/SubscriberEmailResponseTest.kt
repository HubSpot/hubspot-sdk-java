// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.marketingevents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriberEmailResponseTest {

    @Test
    fun create() {
        val subscriberEmailResponse =
            SubscriberEmailResponse.builder().email("email").vid(0).build()

        assertThat(subscriberEmailResponse.email()).isEqualTo("email")
        assertThat(subscriberEmailResponse.vid()).isEqualTo(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subscriberEmailResponse =
            SubscriberEmailResponse.builder().email("email").vid(0).build()

        val roundtrippedSubscriberEmailResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subscriberEmailResponse),
                jacksonTypeRef<SubscriberEmailResponse>(),
            )

        assertThat(roundtrippedSubscriberEmailResponse).isEqualTo(subscriberEmailResponse)
    }
}
