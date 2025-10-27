// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.owners

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicTeamTest {

    @Test
    fun create() {
        val publicTeam = PublicTeam.builder().id("7177840").name("TEAM_NAME").primary(false).build()

        assertThat(publicTeam.id()).isEqualTo("7177840")
        assertThat(publicTeam.name()).isEqualTo("TEAM_NAME")
        assertThat(publicTeam.primary()).isEqualTo(false)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicTeam = PublicTeam.builder().id("7177840").name("TEAM_NAME").primary(false).build()

        val roundtrippedPublicTeam =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicTeam),
                jacksonTypeRef<PublicTeam>(),
            )

        assertThat(roundtrippedPublicTeam).isEqualTo(publicTeam)
    }
}
