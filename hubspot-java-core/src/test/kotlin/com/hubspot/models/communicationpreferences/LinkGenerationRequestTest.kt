// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.communicationpreferences

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LinkGenerationRequestTest {

    @Test
    fun create() {
        val linkGenerationRequest =
            LinkGenerationRequest.builder()
                .subscriberIdString("subscriberIdString")
                .language("language")
                .subscriptionId(0L)
                .build()

        assertThat(linkGenerationRequest.subscriberIdString()).isEqualTo("subscriberIdString")
        assertThat(linkGenerationRequest.language()).contains("language")
        assertThat(linkGenerationRequest.subscriptionId()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val linkGenerationRequest =
            LinkGenerationRequest.builder()
                .subscriberIdString("subscriberIdString")
                .language("language")
                .subscriptionId(0L)
                .build()

        val roundtrippedLinkGenerationRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(linkGenerationRequest),
                jacksonTypeRef<LinkGenerationRequest>(),
            )

        assertThat(roundtrippedLinkGenerationRequest).isEqualTo(linkGenerationRequest)
    }
}
