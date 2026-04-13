// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.settings.users

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicTeamTest {

    @Test
    fun create() {
        val publicTeam =
            PublicTeam.builder()
                .id("id")
                .name("name")
                .addSecondaryUserId("string")
                .addUserId("string")
                .build()

        assertThat(publicTeam.id()).isEqualTo("id")
        assertThat(publicTeam.name()).isEqualTo("name")
        assertThat(publicTeam.secondaryUserIds()).containsExactly("string")
        assertThat(publicTeam.userIds()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicTeam =
            PublicTeam.builder()
                .id("id")
                .name("name")
                .addSecondaryUserId("string")
                .addUserId("string")
                .build()

        val roundtrippedPublicTeam =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicTeam),
                jacksonTypeRef<PublicTeam>(),
            )

        assertThat(roundtrippedPublicTeam).isEqualTo(publicTeam)
    }
}
