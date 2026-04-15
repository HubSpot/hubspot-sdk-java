// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.conversations.customchannels

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContactOrgTest {

    @Test
    fun create() {
        val contactOrg =
            ContactOrg.builder().company("company").department("department").title("title").build()

        assertThat(contactOrg.company()).contains("company")
        assertThat(contactOrg.department()).contains("department")
        assertThat(contactOrg.title()).contains("title")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val contactOrg =
            ContactOrg.builder().company("company").department("department").title("title").build()

        val roundtrippedContactOrg =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(contactOrg),
                jacksonTypeRef<ContactOrg>(),
            )

        assertThat(roundtrippedContactOrg).isEqualTo(contactOrg)
    }
}
