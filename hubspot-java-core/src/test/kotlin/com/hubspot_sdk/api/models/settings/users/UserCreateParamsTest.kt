// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.settings.users

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserCreateParamsTest {

    @Test
    fun create() {
        UserCreateParams.builder()
            .userProvisionRequest(
                UserProvisionRequest.builder()
                    .email("newUser@email.com")
                    .firstName("firstName")
                    .lastName("lastName")
                    .primaryTeamId("101")
                    .roleId("100")
                    .addSecondaryTeamId("102")
                    .sendWelcomeEmail(true)
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
                        .email("newUser@email.com")
                        .firstName("firstName")
                        .lastName("lastName")
                        .primaryTeamId("101")
                        .roleId("100")
                        .addSecondaryTeamId("102")
                        .sendWelcomeEmail(true)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                UserProvisionRequest.builder()
                    .email("newUser@email.com")
                    .firstName("firstName")
                    .lastName("lastName")
                    .primaryTeamId("101")
                    .roleId("100")
                    .addSecondaryTeamId("102")
                    .sendWelcomeEmail(true)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            UserCreateParams.builder()
                .userProvisionRequest(
                    UserProvisionRequest.builder().email("newUser@email.com").build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(UserProvisionRequest.builder().email("newUser@email.com").build())
    }
}
