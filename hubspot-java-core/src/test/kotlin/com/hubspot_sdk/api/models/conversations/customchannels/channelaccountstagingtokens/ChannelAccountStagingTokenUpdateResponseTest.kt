// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.customchannels.channelaccountstagingtokens

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.conversations.PublicDeliveryIdentifier
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChannelAccountStagingTokenUpdateResponseTest {

    @Test
    fun create() {
        val channelAccountStagingTokenUpdateResponse =
            ChannelAccountStagingTokenUpdateResponse.builder()
                .accountToken("accountToken")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .genericChannelId(0)
                .inboxId(0)
                .userId(0)
                .accountName("accountName")
                .deliveryIdentifier(
                    PublicDeliveryIdentifier.builder().type("type").value("value").build()
                )
                .build()

        assertThat(channelAccountStagingTokenUpdateResponse.accountToken())
            .isEqualTo("accountToken")
        assertThat(channelAccountStagingTokenUpdateResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(channelAccountStagingTokenUpdateResponse.genericChannelId()).isEqualTo(0)
        assertThat(channelAccountStagingTokenUpdateResponse.inboxId()).isEqualTo(0)
        assertThat(channelAccountStagingTokenUpdateResponse.userId()).isEqualTo(0)
        assertThat(channelAccountStagingTokenUpdateResponse.accountName()).contains("accountName")
        assertThat(channelAccountStagingTokenUpdateResponse.deliveryIdentifier())
            .contains(PublicDeliveryIdentifier.builder().type("type").value("value").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val channelAccountStagingTokenUpdateResponse =
            ChannelAccountStagingTokenUpdateResponse.builder()
                .accountToken("accountToken")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .genericChannelId(0)
                .inboxId(0)
                .userId(0)
                .accountName("accountName")
                .deliveryIdentifier(
                    PublicDeliveryIdentifier.builder().type("type").value("value").build()
                )
                .build()

        val roundtrippedChannelAccountStagingTokenUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(channelAccountStagingTokenUpdateResponse),
                jacksonTypeRef<ChannelAccountStagingTokenUpdateResponse>(),
            )

        assertThat(roundtrippedChannelAccountStagingTokenUpdateResponse)
            .isEqualTo(channelAccountStagingTokenUpdateResponse)
    }
}
