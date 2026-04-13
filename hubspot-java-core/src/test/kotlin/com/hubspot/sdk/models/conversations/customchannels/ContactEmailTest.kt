// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.conversations.customchannels

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContactEmailTest {

    @Test
    fun create() {
        val contactEmail =
            ContactEmail.builder().email("email").type(ContactEmail.Type.HOME).build()

        assertThat(contactEmail.email()).isEqualTo("email")
        assertThat(contactEmail.type()).contains(ContactEmail.Type.HOME)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val contactEmail =
            ContactEmail.builder().email("email").type(ContactEmail.Type.HOME).build()

        val roundtrippedContactEmail =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(contactEmail),
                jacksonTypeRef<ContactEmail>(),
            )

        assertThat(roundtrippedContactEmail).isEqualTo(contactEmail)
    }
}
