// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicThreadAssociationsTest {

    @Test
    fun create() {
        val publicThreadAssociations =
            PublicThreadAssociations.builder().associatedTicketId("associatedTicketId").build()

        assertThat(publicThreadAssociations.associatedTicketId()).contains("associatedTicketId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicThreadAssociations =
            PublicThreadAssociations.builder().associatedTicketId("associatedTicketId").build()

        val roundtrippedPublicThreadAssociations =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicThreadAssociations),
                jacksonTypeRef<PublicThreadAssociations>(),
            )

        assertThat(roundtrippedPublicThreadAssociations).isEqualTo(publicThreadAssociations)
    }
}
