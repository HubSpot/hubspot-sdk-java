// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.settings.users

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserCreateParamsTest {

    @Test
    fun create() {
        UserCreateParams.builder()
            .userProvisionRequest(
                UserProvisionRequest.builder()
                    .email("email")
                    .sendWelcomeEmail(true)
                    .firstName("firstName")
                    .lastName("lastName")
                    .primaryTeamId("primaryTeamId")
                    .roleId("roleId")
                    .addSecondaryTeamId("string")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            UserCreateParams.builder()
                .userProvisionRequest(
                    UserProvisionRequest.builder()
                        .email("email")
                        .sendWelcomeEmail(true)
                        .firstName("firstName")
                        .lastName("lastName")
                        .primaryTeamId("primaryTeamId")
                        .roleId("roleId")
                        .addSecondaryTeamId("string")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                UserProvisionRequest.builder()
                    .email("email")
                    .sendWelcomeEmail(true)
                    .firstName("firstName")
                    .lastName("lastName")
                    .primaryTeamId("primaryTeamId")
                    .roleId("roleId")
                    .addSecondaryTeamId("string")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            UserCreateParams.builder()
                .userProvisionRequest(
                    UserProvisionRequest.builder().email("email").sendWelcomeEmail(true).build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(UserProvisionRequest.builder().email("email").sendWelcomeEmail(true).build())
    }
}
