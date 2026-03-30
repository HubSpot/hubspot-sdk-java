// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.settings.users

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicUserUpdateTest {

    @Test
    fun create() {
        val publicUserUpdate =
            PublicUserUpdate.builder()
                .firstName("firstName")
                .lastName("lastName")
                .primaryTeamId("primaryTeamId")
                .roleId("roleId")
                .addSecondaryTeamId("string")
                .build()

        assertThat(publicUserUpdate.firstName()).contains("firstName")
        assertThat(publicUserUpdate.lastName()).contains("lastName")
        assertThat(publicUserUpdate.primaryTeamId()).contains("primaryTeamId")
        assertThat(publicUserUpdate.roleId()).contains("roleId")
        assertThat(publicUserUpdate.secondaryTeamIds().getOrNull()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicUserUpdate =
            PublicUserUpdate.builder()
                .firstName("firstName")
                .lastName("lastName")
                .primaryTeamId("primaryTeamId")
                .roleId("roleId")
                .addSecondaryTeamId("string")
                .build()

        val roundtrippedPublicUserUpdate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicUserUpdate),
                jacksonTypeRef<PublicUserUpdate>(),
            )

        assertThat(roundtrippedPublicUserUpdate).isEqualTo(publicUserUpdate)
    }
}
