// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.campaigns

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContactReferenceTest {

    @Test
    fun create() {
        val contactReference = ContactReference.builder().id("id").build()

        assertThat(contactReference.id()).isEqualTo("id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val contactReference = ContactReference.builder().id("id").build()

        val roundtrippedContactReference =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(contactReference),
                jacksonTypeRef<ContactReference>(),
            )

        assertThat(roundtrippedContactReference).isEqualTo(contactReference)
    }
}
