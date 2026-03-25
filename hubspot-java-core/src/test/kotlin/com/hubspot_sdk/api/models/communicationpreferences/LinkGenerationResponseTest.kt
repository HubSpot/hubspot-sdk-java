// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.communicationpreferences

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LinkGenerationResponseTest {

    @Test
    fun create() {
        val linkGenerationResponse =
            LinkGenerationResponse.builder()
                .managePreferencesUrl("managePreferencesUrl")
                .subscriberIdString("subscriberIdString")
                .unsubscribeAllUrl("unsubscribeAllUrl")
                .unsubscribeSingleUrl("unsubscribeSingleUrl")
                .build()

        assertThat(linkGenerationResponse.managePreferencesUrl()).isEqualTo("managePreferencesUrl")
        assertThat(linkGenerationResponse.subscriberIdString()).isEqualTo("subscriberIdString")
        assertThat(linkGenerationResponse.unsubscribeAllUrl()).isEqualTo("unsubscribeAllUrl")
        assertThat(linkGenerationResponse.unsubscribeSingleUrl()).contains("unsubscribeSingleUrl")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val linkGenerationResponse =
            LinkGenerationResponse.builder()
                .managePreferencesUrl("managePreferencesUrl")
                .subscriberIdString("subscriberIdString")
                .unsubscribeAllUrl("unsubscribeAllUrl")
                .unsubscribeSingleUrl("unsubscribeSingleUrl")
                .build()

        val roundtrippedLinkGenerationResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(linkGenerationResponse),
                jacksonTypeRef<LinkGenerationResponse>(),
            )

        assertThat(roundtrippedLinkGenerationResponse).isEqualTo(linkGenerationResponse)
    }
}
