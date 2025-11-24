// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.customchannels

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.conversations.PublicDeliveryIdentifier
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicChannelAccountStagingTokenUpdateRequestTest {

    @Test
    fun create() {
        val publicChannelAccountStagingTokenUpdateRequest =
            PublicChannelAccountStagingTokenUpdateRequest.builder()
                .accountName("accountName")
                .deliveryIdentifier(
                    PublicDeliveryIdentifier.builder().type("type").value("value").build()
                )
                .build()

        assertThat(publicChannelAccountStagingTokenUpdateRequest.accountName())
            .isEqualTo("accountName")
        assertThat(publicChannelAccountStagingTokenUpdateRequest.deliveryIdentifier())
            .isEqualTo(PublicDeliveryIdentifier.builder().type("type").value("value").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicChannelAccountStagingTokenUpdateRequest =
            PublicChannelAccountStagingTokenUpdateRequest.builder()
                .accountName("accountName")
                .deliveryIdentifier(
                    PublicDeliveryIdentifier.builder().type("type").value("value").build()
                )
                .build()

        val roundtrippedPublicChannelAccountStagingTokenUpdateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicChannelAccountStagingTokenUpdateRequest),
                jacksonTypeRef<PublicChannelAccountStagingTokenUpdateRequest>(),
            )

        assertThat(roundtrippedPublicChannelAccountStagingTokenUpdateRequest)
            .isEqualTo(publicChannelAccountStagingTokenUpdateRequest)
    }
}
