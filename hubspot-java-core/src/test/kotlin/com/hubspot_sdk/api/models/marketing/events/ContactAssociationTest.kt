// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.events

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContactAssociationTest {

    @Test
    fun create() {
        val contactAssociation =
            ContactAssociation.builder()
                .contactId("contactId")
                .email("email")
                .firstname("firstname")
                .lastname("lastname")
                .build()

        assertThat(contactAssociation.contactId()).isEqualTo("contactId")
        assertThat(contactAssociation.email()).isEqualTo("email")
        assertThat(contactAssociation.firstname()).contains("firstname")
        assertThat(contactAssociation.lastname()).contains("lastname")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val contactAssociation =
            ContactAssociation.builder()
                .contactId("contactId")
                .email("email")
                .firstname("firstname")
                .lastname("lastname")
                .build()

        val roundtrippedContactAssociation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(contactAssociation),
                jacksonTypeRef<ContactAssociation>(),
            )

        assertThat(roundtrippedContactAssociation).isEqualTo(contactAssociation)
    }
}
