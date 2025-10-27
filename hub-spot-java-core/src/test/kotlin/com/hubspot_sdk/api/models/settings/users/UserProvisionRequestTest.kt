// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.settings.users

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserProvisionRequestTest {

    @Test
    fun create() {
        val userProvisionRequest =
            UserProvisionRequest.builder()
                .email("newUser@email.com")
                .firstName("firstName")
                .lastName("lastName")
                .primaryTeamId("101")
                .roleId("100")
                .addSecondaryTeamId("102")
                .sendWelcomeEmail(true)
                .build()

        assertThat(userProvisionRequest.email()).isEqualTo("newUser@email.com")
        assertThat(userProvisionRequest.firstName()).contains("firstName")
        assertThat(userProvisionRequest.lastName()).contains("lastName")
        assertThat(userProvisionRequest.primaryTeamId()).contains("101")
        assertThat(userProvisionRequest.roleId()).contains("100")
        assertThat(userProvisionRequest.secondaryTeamIds().getOrNull()).containsExactly("102")
        assertThat(userProvisionRequest.sendWelcomeEmail()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val userProvisionRequest =
            UserProvisionRequest.builder()
                .email("newUser@email.com")
                .firstName("firstName")
                .lastName("lastName")
                .primaryTeamId("101")
                .roleId("100")
                .addSecondaryTeamId("102")
                .sendWelcomeEmail(true)
                .build()

        val roundtrippedUserProvisionRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(userProvisionRequest),
                jacksonTypeRef<UserProvisionRequest>(),
            )

        assertThat(roundtrippedUserProvisionRequest).isEqualTo(userProvisionRequest)
    }
}
