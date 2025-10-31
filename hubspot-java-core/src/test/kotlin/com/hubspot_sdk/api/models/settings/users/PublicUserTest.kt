// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.settings.users

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicUserTest {

    @Test
    fun create() {
        val publicUser =
            PublicUser.builder()
                .id("123")
                .email("newUser@email.com")
                .firstName("firstName")
                .lastName("lastName")
                .primaryTeamId("101")
                .roleId("100")
                .addRoleId("string")
                .addSecondaryTeamId("102")
                .sendWelcomeEmail(true)
                .superAdmin(true)
                .build()

        assertThat(publicUser.id()).isEqualTo("123")
        assertThat(publicUser.email()).isEqualTo("newUser@email.com")
        assertThat(publicUser.firstName()).contains("firstName")
        assertThat(publicUser.lastName()).contains("lastName")
        assertThat(publicUser.primaryTeamId()).contains("101")
        assertThat(publicUser.roleId()).contains("100")
        assertThat(publicUser.roleIds().getOrNull()).containsExactly("string")
        assertThat(publicUser.secondaryTeamIds().getOrNull()).containsExactly("102")
        assertThat(publicUser.sendWelcomeEmail()).contains(true)
        assertThat(publicUser.superAdmin()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicUser =
            PublicUser.builder()
                .id("123")
                .email("newUser@email.com")
                .firstName("firstName")
                .lastName("lastName")
                .primaryTeamId("101")
                .roleId("100")
                .addRoleId("string")
                .addSecondaryTeamId("102")
                .sendWelcomeEmail(true)
                .superAdmin(true)
                .build()

        val roundtrippedPublicUser =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicUser),
                jacksonTypeRef<PublicUser>(),
            )

        assertThat(roundtrippedPublicUser).isEqualTo(publicUser)
    }
}
