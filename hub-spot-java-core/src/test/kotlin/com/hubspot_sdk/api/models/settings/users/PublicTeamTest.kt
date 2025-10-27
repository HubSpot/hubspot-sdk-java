// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.settings.users

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicTeamTest {

    @Test
    fun create() {
        val publicTeam =
            PublicTeam.builder()
                .id("100")
                .name("Test Team")
                .addSecondaryUserId("124")
                .addUserId("123")
                .build()

        assertThat(publicTeam.id()).isEqualTo("100")
        assertThat(publicTeam.name()).isEqualTo("Test Team")
        assertThat(publicTeam.secondaryUserIds()).containsExactly("124")
        assertThat(publicTeam.userIds()).containsExactly("123")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicTeam =
            PublicTeam.builder()
                .id("100")
                .name("Test Team")
                .addSecondaryUserId("124")
                .addUserId("123")
                .build()

        val roundtrippedPublicTeam =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicTeam),
                jacksonTypeRef<PublicTeam>(),
            )

        assertThat(roundtrippedPublicTeam).isEqualTo(publicTeam)
    }
}
