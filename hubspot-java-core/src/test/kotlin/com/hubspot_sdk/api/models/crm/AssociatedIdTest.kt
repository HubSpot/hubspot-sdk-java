// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AssociatedIdTest {

    @Test
    fun create() {
        val associatedId = AssociatedId.builder().id("172859").type("contact_to_company").build()

        assertThat(associatedId.id()).isEqualTo("172859")
        assertThat(associatedId.type()).isEqualTo("contact_to_company")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val associatedId = AssociatedId.builder().id("172859").type("contact_to_company").build()

        val roundtrippedAssociatedId =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(associatedId),
                jacksonTypeRef<AssociatedId>(),
            )

        assertThat(roundtrippedAssociatedId).isEqualTo(associatedId)
    }
}
