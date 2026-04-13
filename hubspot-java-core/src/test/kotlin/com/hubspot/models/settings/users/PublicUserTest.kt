// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.settings.users

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicUserTest {

    @Test
    fun create() {
        val publicUser =
            PublicUser.builder()
                .id("id")
                .email("email")
                .addRoleId("string")
                .superAdmin(true)
                .firstName("firstName")
                .lastName("lastName")
                .primaryTeamId("primaryTeamId")
                .roleId("roleId")
                .addSecondaryTeamId("string")
                .sendWelcomeEmail(true)
                .build()

        assertThat(publicUser.id()).isEqualTo("id")
        assertThat(publicUser.email()).isEqualTo("email")
        assertThat(publicUser.roleIds()).containsExactly("string")
        assertThat(publicUser.superAdmin()).isEqualTo(true)
        assertThat(publicUser.firstName()).contains("firstName")
        assertThat(publicUser.lastName()).contains("lastName")
        assertThat(publicUser.primaryTeamId()).contains("primaryTeamId")
        assertThat(publicUser.roleId()).contains("roleId")
        assertThat(publicUser.secondaryTeamIds().getOrNull()).containsExactly("string")
        assertThat(publicUser.sendWelcomeEmail()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicUser =
            PublicUser.builder()
                .id("id")
                .email("email")
                .addRoleId("string")
                .superAdmin(true)
                .firstName("firstName")
                .lastName("lastName")
                .primaryTeamId("primaryTeamId")
                .roleId("roleId")
                .addSecondaryTeamId("string")
                .sendWelcomeEmail(true)
                .build()

        val roundtrippedPublicUser =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicUser),
                jacksonTypeRef<PublicUser>(),
            )

        assertThat(roundtrippedPublicUser).isEqualTo(publicUser)
    }
}
