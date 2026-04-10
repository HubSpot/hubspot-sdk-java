// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.settings

import com.hubspot_sdk.api.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot_sdk.api.models.settings.users.PublicUserUpdate
import com.hubspot_sdk.api.models.settings.users.UserDeleteParams
import com.hubspot_sdk.api.models.settings.users.UserGetParams
import com.hubspot_sdk.api.models.settings.users.UserProvisionRequest
import com.hubspot_sdk.api.models.settings.users.UserUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UserServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val userServiceAsync = client.settings().users()

        val publicUserFuture =
            userServiceAsync.create(
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

        val publicUser = publicUserFuture.get()
        publicUser.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val userServiceAsync = client.settings().users()

        val publicUserFuture =
            userServiceAsync.update(
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

        val publicUser = publicUserFuture.get()
        publicUser.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val userServiceAsync = client.settings().users()

        val pageFuture = userServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val userServiceAsync = client.settings().users()

        val future =
            userServiceAsync.delete(
                UserDeleteParams.builder()
                    .userId("userId")
                    .idProperty(UserDeleteParams.IdProperty.EMAIL)
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val userServiceAsync = client.settings().users()

        val publicUserFuture =
            userServiceAsync.get(
                UserGetParams.builder()
                    .userId("userId")
                    .idProperty(UserGetParams.IdProperty.EMAIL)
                    .build()
            )

        val publicUser = publicUserFuture.get()
        publicUser.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listRoles() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val userServiceAsync = client.settings().users()

        val collectionResponsePublicPermissionSetNoPagingFuture = userServiceAsync.listRoles()

        val collectionResponsePublicPermissionSetNoPaging =
            collectionResponsePublicPermissionSetNoPagingFuture.get()
        collectionResponsePublicPermissionSetNoPaging.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listTeams() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val userServiceAsync = client.settings().users()

        val collectionResponsePublicTeamNoPagingFuture = userServiceAsync.listTeams()

        val collectionResponsePublicTeamNoPaging = collectionResponsePublicTeamNoPagingFuture.get()
        collectionResponsePublicTeamNoPaging.validate()
    }
}
