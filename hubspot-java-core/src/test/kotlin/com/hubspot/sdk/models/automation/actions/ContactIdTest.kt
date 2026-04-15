// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.automation.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContactIdTest {

    @Test
    fun create() {
        val contactId = ContactId.builder().portalId(0).email("email").vid(0L).build()

        assertThat(contactId.portalId()).isEqualTo(0)
        assertThat(contactId.email()).contains("email")
        assertThat(contactId.vid()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val contactId = ContactId.builder().portalId(0).email("email").vid(0L).build()

        val roundtrippedContactId =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(contactId),
                jacksonTypeRef<ContactId>(),
            )

        assertThat(roundtrippedContactId).isEqualTo(contactId)
    }
}
