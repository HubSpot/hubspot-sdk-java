// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objects

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AssociatedIdTest {

    @Test
    fun create() {
        val associatedId = AssociatedId.builder().id("id").type("deal_to_contact").build()

        assertThat(associatedId.id()).isEqualTo("id")
        assertThat(associatedId.type()).isEqualTo("deal_to_contact")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val associatedId = AssociatedId.builder().id("id").type("deal_to_contact").build()

        val roundtrippedAssociatedId =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(associatedId),
                jacksonTypeRef<AssociatedId>(),
            )

        assertThat(roundtrippedAssociatedId).isEqualTo(associatedId)
    }
}
