// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.customchannels

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PreResolvedContactTest {

    @Test
    fun create() {
        val preResolvedContact =
            PreResolvedContact.builder()
                .addContactPropertiesLeadingToMatch(
                    PreResolvedContact.ContactPropertiesLeadingToMatch.ADDRESS
                )
                .contactVid(0)
                .build()

        assertThat(preResolvedContact.contactPropertiesLeadingToMatch())
            .containsExactly(PreResolvedContact.ContactPropertiesLeadingToMatch.ADDRESS)
        assertThat(preResolvedContact.contactVid()).isEqualTo(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val preResolvedContact =
            PreResolvedContact.builder()
                .addContactPropertiesLeadingToMatch(
                    PreResolvedContact.ContactPropertiesLeadingToMatch.ADDRESS
                )
                .contactVid(0)
                .build()

        val roundtrippedPreResolvedContact =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(preResolvedContact),
                jacksonTypeRef<PreResolvedContact>(),
            )

        assertThat(roundtrippedPreResolvedContact).isEqualTo(preResolvedContact)
    }
}
