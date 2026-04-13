// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.conversations.customchannels

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PreResolvedContactsTest {

    @Test
    fun create() {
        val preResolvedContacts =
            PreResolvedContacts.builder()
                .addContact(
                    PreResolvedContact.builder()
                        .addContactPropertiesLeadingToMatch(
                            PreResolvedContact.ContactPropertiesLeadingToMatch.ADDRESS
                        )
                        .contactVid(0)
                        .build()
                )
                .build()

        assertThat(preResolvedContacts.contacts())
            .containsExactly(
                PreResolvedContact.builder()
                    .addContactPropertiesLeadingToMatch(
                        PreResolvedContact.ContactPropertiesLeadingToMatch.ADDRESS
                    )
                    .contactVid(0)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val preResolvedContacts =
            PreResolvedContacts.builder()
                .addContact(
                    PreResolvedContact.builder()
                        .addContactPropertiesLeadingToMatch(
                            PreResolvedContact.ContactPropertiesLeadingToMatch.ADDRESS
                        )
                        .contactVid(0)
                        .build()
                )
                .build()

        val roundtrippedPreResolvedContacts =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(preResolvedContacts),
                jacksonTypeRef<PreResolvedContacts>(),
            )

        assertThat(roundtrippedPreResolvedContacts).isEqualTo(preResolvedContacts)
    }
}
