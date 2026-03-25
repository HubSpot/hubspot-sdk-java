// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.owners

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicTeamTest {

    @Test
    fun create() {
        val publicTeam = PublicTeam.builder().id("id").name("name").primary(true).build()

        assertThat(publicTeam.id()).isEqualTo("id")
        assertThat(publicTeam.name()).isEqualTo("name")
        assertThat(publicTeam.primary()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicTeam = PublicTeam.builder().id("id").name("name").primary(true).build()

        val roundtrippedPublicTeam =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicTeam),
                jacksonTypeRef<PublicTeam>(),
            )

        assertThat(roundtrippedPublicTeam).isEqualTo(publicTeam)
    }
}
