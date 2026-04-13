// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.conversations.customchannels

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContactPhoneTest {

    @Test
    fun create() {
        val contactPhone =
            ContactPhone.builder().phone("phone").type(ContactPhone.Type.CELL).build()

        assertThat(contactPhone.phone()).isEqualTo("phone")
        assertThat(contactPhone.type()).contains(ContactPhone.Type.CELL)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val contactPhone =
            ContactPhone.builder().phone("phone").type(ContactPhone.Type.CELL).build()

        val roundtrippedContactPhone =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(contactPhone),
                jacksonTypeRef<ContactPhone>(),
            )

        assertThat(roundtrippedContactPhone).isEqualTo(contactPhone)
    }
}
