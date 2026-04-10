// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.settings

import com.hubspot_sdk.api.client.okhttp.HubSpotOkHttpClient
import com.hubspot_sdk.api.models.settings.users.PublicUserUpdate
import com.hubspot_sdk.api.models.settings.users.UserDeleteParams
import com.hubspot_sdk.api.models.settings.users.UserGetParams
import com.hubspot_sdk.api.models.settings.users.UserProvisionRequest
import com.hubspot_sdk.api.models.settings.users.UserUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UserServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val userService = client.settings().users()

        val publicUser =
            userService.create(
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

        publicUser.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val userService = client.settings().users()

        val publicUser =
            userService.update(
                UserUpdateParams.builder()
                    .userId("userId")
                    .idProperty(UserUpdateParams.IdProperty.EMAIL)
                    .publicUserUpdate(
                        PublicUserUpdate.builder()
                            .firstName("firstName")
                            .lastName("lastName")
                            .primaryTeamId("primaryTeamId")
                            .roleId("roleId")
                            .addSecondaryTeamId("string")
                            .build()
                    )
                    .build()
            )

        publicUser.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val userService = client.settings().users()

        val page = userService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val userService = client.settings().users()

        userService.delete(
            UserDeleteParams.builder()
                .userId("userId")
                .idProperty(UserDeleteParams.IdProperty.EMAIL)
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val userService = client.settings().users()

        val publicUser =
            userService.get(
                UserGetParams.builder()
                    .userId("userId")
                    .idProperty(UserGetParams.IdProperty.EMAIL)
                    .build()
            )

        publicUser.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listRoles() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val userService = client.settings().users()

        val collectionResponsePublicPermissionSetNoPaging = userService.listRoles()

        collectionResponsePublicPermissionSetNoPaging.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listTeams() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val userService = client.settings().users()

        val collectionResponsePublicTeamNoPaging = userService.listTeams()

        collectionResponsePublicTeamNoPaging.validate()
    }
}
