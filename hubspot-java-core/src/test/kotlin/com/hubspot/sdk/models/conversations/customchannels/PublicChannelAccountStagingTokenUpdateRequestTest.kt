// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.conversations.customchannels

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicChannelAccountStagingTokenUpdateRequestTest {

    @Test
    fun create() {
        val publicChannelAccountStagingTokenUpdateRequest =
            PublicChannelAccountStagingTokenUpdateRequest.builder()
                .accountName("accountName")
                .deliveryIdentifier(
                    PublicDeliveryIdentifier.builder()
                        .type(PublicDeliveryIdentifier.Type.CHANNEL_SPECIFIC_OPAQUE_ID)
                        .value("value")
                        .build()
                )
                .build()

        assertThat(publicChannelAccountStagingTokenUpdateRequest.accountName())
            .contains("accountName")
        assertThat(publicChannelAccountStagingTokenUpdateRequest.deliveryIdentifier())
            .contains(
                PublicDeliveryIdentifier.builder()
                    .type(PublicDeliveryIdentifier.Type.CHANNEL_SPECIFIC_OPAQUE_ID)
                    .value("value")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicChannelAccountStagingTokenUpdateRequest =
            PublicChannelAccountStagingTokenUpdateRequest.builder()
                .accountName("accountName")
                .deliveryIdentifier(
                    PublicDeliveryIdentifier.builder()
                        .type(PublicDeliveryIdentifier.Type.CHANNEL_SPECIFIC_OPAQUE_ID)
                        .value("value")
                        .build()
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
