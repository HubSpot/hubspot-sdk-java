// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.conversations.customchannels

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContactNameTest {

    @Test
    fun create() {
        val contactName =
            ContactName.builder()
                .firstName("firstName")
                .lastName("lastName")
                .middleName("middleName")
                .prefix("prefix")
                .suffix("suffix")
                .build()

        assertThat(contactName.firstName()).contains("firstName")
        assertThat(contactName.lastName()).contains("lastName")
        assertThat(contactName.middleName()).contains("middleName")
        assertThat(contactName.prefix()).contains("prefix")
        assertThat(contactName.suffix()).contains("suffix")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val contactName =
            ContactName.builder()
                .firstName("firstName")
                .lastName("lastName")
                .middleName("middleName")
                .prefix("prefix")
                .suffix("suffix")
                .build()

        val roundtrippedContactName =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(contactName),
                jacksonTypeRef<ContactName>(),
            )

        assertThat(roundtrippedContactName).isEqualTo(contactName)
    }
}
