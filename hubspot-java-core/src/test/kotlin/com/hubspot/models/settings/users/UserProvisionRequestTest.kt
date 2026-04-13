// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.settings.users

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserProvisionRequestTest {

    @Test
    fun create() {
        val userProvisionRequest =
            UserProvisionRequest.builder()
                .email("email")
                .sendWelcomeEmail(true)
                .firstName("firstName")
                .lastName("lastName")
                .primaryTeamId("primaryTeamId")
                .roleId("roleId")
                .addSecondaryTeamId("string")
                .build()

        assertThat(userProvisionRequest.email()).isEqualTo("email")
        assertThat(userProvisionRequest.sendWelcomeEmail()).isEqualTo(true)
        assertThat(userProvisionRequest.firstName()).contains("firstName")
        assertThat(userProvisionRequest.lastName()).contains("lastName")
        assertThat(userProvisionRequest.primaryTeamId()).contains("primaryTeamId")
        assertThat(userProvisionRequest.roleId()).contains("roleId")
        assertThat(userProvisionRequest.secondaryTeamIds().getOrNull()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val userProvisionRequest =
            UserProvisionRequest.builder()
                .email("email")
                .sendWelcomeEmail(true)
                .firstName("firstName")
                .lastName("lastName")
                .primaryTeamId("primaryTeamId")
                .roleId("roleId")
                .addSecondaryTeamId("string")
                .build()

        val roundtrippedUserProvisionRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(userProvisionRequest),
                jacksonTypeRef<UserProvisionRequest>(),
            )

        assertThat(roundtrippedUserProvisionRequest).isEqualTo(userProvisionRequest)
    }
}
