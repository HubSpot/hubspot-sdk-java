// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.customchannels

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.conversations.PublicDeliveryIdentifier
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicChannelAccountStagingTokenTest {

    @Test
    fun create() {
        val publicChannelAccountStagingToken =
            PublicChannelAccountStagingToken.builder()
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

        assertThat(publicChannelAccountStagingToken.accountToken()).isEqualTo("accountToken")
        assertThat(publicChannelAccountStagingToken.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(publicChannelAccountStagingToken.genericChannelId()).isEqualTo(0)
        assertThat(publicChannelAccountStagingToken.inboxId()).isEqualTo(0)
        assertThat(publicChannelAccountStagingToken.userId()).isEqualTo(0)
        assertThat(publicChannelAccountStagingToken.accountName()).contains("accountName")
        assertThat(publicChannelAccountStagingToken.deliveryIdentifier())
            .contains(PublicDeliveryIdentifier.builder().type("type").value("value").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicChannelAccountStagingToken =
            PublicChannelAccountStagingToken.builder()
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

        val roundtrippedPublicChannelAccountStagingToken =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicChannelAccountStagingToken),
                jacksonTypeRef<PublicChannelAccountStagingToken>(),
            )

        assertThat(roundtrippedPublicChannelAccountStagingToken)
            .isEqualTo(publicChannelAccountStagingToken)
    }
}
