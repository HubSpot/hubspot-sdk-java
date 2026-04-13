// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.conversations.customchannels

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContactUrlTest {

    @Test
    fun create() {
        val contactUrl = ContactUrl.builder().url("url").type(ContactUrl.Type.HOME).build()

        assertThat(contactUrl.url()).isEqualTo("url")
        assertThat(contactUrl.type()).contains(ContactUrl.Type.HOME)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val contactUrl = ContactUrl.builder().url("url").type(ContactUrl.Type.HOME).build()

        val roundtrippedContactUrl =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(contactUrl),
                jacksonTypeRef<ContactUrl>(),
            )

        assertThat(roundtrippedContactUrl).isEqualTo(contactUrl)
    }
}
