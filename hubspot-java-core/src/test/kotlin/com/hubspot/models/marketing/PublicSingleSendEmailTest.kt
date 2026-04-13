// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.marketing

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicSingleSendEmailTest {

    @Test
    fun create() {
        val publicSingleSendEmail =
            PublicSingleSendEmail.builder()
                .addBcc("string")
                .addCc("string")
                .addReplyTo("string")
                .from("from")
                .sendId("sendId")
                .to("to")
                .build()

        assertThat(publicSingleSendEmail.bcc()).containsExactly("string")
        assertThat(publicSingleSendEmail.cc()).containsExactly("string")
        assertThat(publicSingleSendEmail.replyTo()).containsExactly("string")
        assertThat(publicSingleSendEmail.from()).contains("from")
        assertThat(publicSingleSendEmail.sendId()).contains("sendId")
        assertThat(publicSingleSendEmail.to()).contains("to")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicSingleSendEmail =
            PublicSingleSendEmail.builder()
                .addBcc("string")
                .addCc("string")
                .addReplyTo("string")
                .from("from")
                .sendId("sendId")
                .to("to")
                .build()

        val roundtrippedPublicSingleSendEmail =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicSingleSendEmail),
                jacksonTypeRef<PublicSingleSendEmail>(),
            )

        assertThat(roundtrippedPublicSingleSendEmail).isEqualTo(publicSingleSendEmail)
    }
}
