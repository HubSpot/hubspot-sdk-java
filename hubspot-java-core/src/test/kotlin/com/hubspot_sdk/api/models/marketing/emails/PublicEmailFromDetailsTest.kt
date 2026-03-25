// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.emails

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicEmailFromDetailsTest {

    @Test
    fun create() {
        val publicEmailFromDetails =
            PublicEmailFromDetails.builder()
                .customReplyTo("customReplyTo")
                .fromName("fromName")
                .replyTo("replyTo")
                .build()

        assertThat(publicEmailFromDetails.customReplyTo()).contains("customReplyTo")
        assertThat(publicEmailFromDetails.fromName()).contains("fromName")
        assertThat(publicEmailFromDetails.replyTo()).contains("replyTo")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicEmailFromDetails =
            PublicEmailFromDetails.builder()
                .customReplyTo("customReplyTo")
                .fromName("fromName")
                .replyTo("replyTo")
                .build()

        val roundtrippedPublicEmailFromDetails =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicEmailFromDetails),
                jacksonTypeRef<PublicEmailFromDetails>(),
            )

        assertThat(roundtrippedPublicEmailFromDetails).isEqualTo(publicEmailFromDetails)
    }
}
