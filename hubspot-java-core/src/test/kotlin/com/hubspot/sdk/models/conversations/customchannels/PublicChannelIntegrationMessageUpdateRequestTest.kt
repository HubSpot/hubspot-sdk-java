// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.conversations.customchannels

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicChannelIntegrationMessageUpdateRequestTest {

    @Test
    fun create() {
        val publicChannelIntegrationMessageUpdateRequest =
            PublicChannelIntegrationMessageUpdateRequest.builder()
                .statusType(PublicChannelIntegrationMessageUpdateRequest.StatusType.FAILED)
                .errorMessage("errorMessage")
                .build()

        assertThat(publicChannelIntegrationMessageUpdateRequest.statusType())
            .isEqualTo(PublicChannelIntegrationMessageUpdateRequest.StatusType.FAILED)
        assertThat(publicChannelIntegrationMessageUpdateRequest.errorMessage())
            .contains("errorMessage")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicChannelIntegrationMessageUpdateRequest =
            PublicChannelIntegrationMessageUpdateRequest.builder()
                .statusType(PublicChannelIntegrationMessageUpdateRequest.StatusType.FAILED)
                .errorMessage("errorMessage")
                .build()

        val roundtrippedPublicChannelIntegrationMessageUpdateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicChannelIntegrationMessageUpdateRequest),
                jacksonTypeRef<PublicChannelIntegrationMessageUpdateRequest>(),
            )

        assertThat(roundtrippedPublicChannelIntegrationMessageUpdateRequest)
            .isEqualTo(publicChannelIntegrationMessageUpdateRequest)
    }
}
