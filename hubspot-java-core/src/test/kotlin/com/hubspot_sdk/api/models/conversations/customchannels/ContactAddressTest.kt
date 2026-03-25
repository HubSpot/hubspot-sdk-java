// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.customchannels

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContactAddressTest {

    @Test
    fun create() {
        val contactAddress =
            ContactAddress.builder()
                .city("city")
                .country("country")
                .countryCode("countryCode")
                .state("state")
                .street("street")
                .type(ContactAddress.Type.HOME)
                .zip("zip")
                .build()

        assertThat(contactAddress.city()).contains("city")
        assertThat(contactAddress.country()).contains("country")
        assertThat(contactAddress.countryCode()).contains("countryCode")
        assertThat(contactAddress.state()).contains("state")
        assertThat(contactAddress.street()).contains("street")
        assertThat(contactAddress.type()).contains(ContactAddress.Type.HOME)
        assertThat(contactAddress.zip()).contains("zip")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val contactAddress =
            ContactAddress.builder()
                .city("city")
                .country("country")
                .countryCode("countryCode")
                .state("state")
                .street("street")
                .type(ContactAddress.Type.HOME)
                .zip("zip")
                .build()

        val roundtrippedContactAddress =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(contactAddress),
                jacksonTypeRef<ContactAddress>(),
            )

        assertThat(roundtrippedContactAddress).isEqualTo(contactAddress)
    }
}
