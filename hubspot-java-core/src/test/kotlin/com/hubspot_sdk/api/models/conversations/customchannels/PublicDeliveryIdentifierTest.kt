// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.customchannels

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicDeliveryIdentifierTest {

    @Test
    fun create() {
        val publicDeliveryIdentifier =
            PublicDeliveryIdentifier.builder()
                .type(PublicDeliveryIdentifier.Type.CHANNEL_SPECIFIC_OPAQUE_ID)
                .value("value")
                .build()

        assertThat(publicDeliveryIdentifier.type())
            .isEqualTo(PublicDeliveryIdentifier.Type.CHANNEL_SPECIFIC_OPAQUE_ID)
        assertThat(publicDeliveryIdentifier.value()).isEqualTo("value")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicDeliveryIdentifier =
            PublicDeliveryIdentifier.builder()
                .type(PublicDeliveryIdentifier.Type.CHANNEL_SPECIFIC_OPAQUE_ID)
                .value("value")
                .build()

        val roundtrippedPublicDeliveryIdentifier =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicDeliveryIdentifier),
                jacksonTypeRef<PublicDeliveryIdentifier>(),
            )

        assertThat(roundtrippedPublicDeliveryIdentifier).isEqualTo(publicDeliveryIdentifier)
    }
}
