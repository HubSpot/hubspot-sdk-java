// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicSingleSendEmailTest {

    @Test
    fun create() {
        val publicSingleSendEmail =
            PublicSingleSendEmail.builder()
                .to("to")
                .addBcc("string")
                .addCc("string")
                .from("from")
                .addReplyTo("string")
                .sendId("sendId")
                .build()

        assertThat(publicSingleSendEmail.to()).isEqualTo("to")
        assertThat(publicSingleSendEmail.bcc().getOrNull()).containsExactly("string")
        assertThat(publicSingleSendEmail.cc().getOrNull()).containsExactly("string")
        assertThat(publicSingleSendEmail.from()).contains("from")
        assertThat(publicSingleSendEmail.replyTo().getOrNull()).containsExactly("string")
        assertThat(publicSingleSendEmail.sendId()).contains("sendId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicSingleSendEmail =
            PublicSingleSendEmail.builder()
                .to("to")
                .addBcc("string")
                .addCc("string")
                .from("from")
                .addReplyTo("string")
                .sendId("sendId")
                .build()

        val roundtrippedPublicSingleSendEmail =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicSingleSendEmail),
                jacksonTypeRef<PublicSingleSendEmail>(),
            )

        assertThat(roundtrippedPublicSingleSendEmail).isEqualTo(publicSingleSendEmail)
    }
}
