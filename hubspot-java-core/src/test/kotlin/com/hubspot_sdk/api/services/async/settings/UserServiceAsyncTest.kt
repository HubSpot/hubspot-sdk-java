// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.settings

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.models.settings.users.PublicUserUpdate
import com.hubspot_sdk.api.models.settings.users.UserDeleteParams
import com.hubspot_sdk.api.models.settings.users.UserGetParams
import com.hubspot_sdk.api.models.settings.users.UserProvisionRequest
import com.hubspot_sdk.api.models.settings.users.UserUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class UserServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val userServiceAsync = client.settings().users()

        val publicUserFuture =
            userServiceAsync.create(
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

        val publicUser = publicUserFuture.get()
        publicUser.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val userServiceAsync = client.settings().users()

        val publicUserFuture =
            userServiceAsync.update(
                UserUpdateParams.builder()
                    .userId("userId")
                    .idProperty(UserUpdateParams.IdProperty.USER_ID)
                    .publicUserUpdate(
                        PublicUserUpdate.builder()
                            .firstName("firstName")
                            .lastName("lastName")
                            .primaryTeamId("101")
                            .roleId("100")
                            .addSecondaryTeamId("102")
                            .build()
                    )
                    .build()
            )

        val publicUser = publicUserFuture.get()
        publicUser.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val userServiceAsync = client.settings().users()

        val pageFuture = userServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val userServiceAsync = client.settings().users()

        val future =
            userServiceAsync.delete(
                UserDeleteParams.builder()
                    .userId("userId")
                    .idProperty(UserDeleteParams.IdProperty.USER_ID)
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val userServiceAsync = client.settings().users()

        val publicUserFuture =
            userServiceAsync.get(
                UserGetParams.builder()
                    .userId("userId")
                    .idProperty(UserGetParams.IdProperty.USER_ID)
                    .build()
            )

        val publicUser = publicUserFuture.get()
        publicUser.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listRoles() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val userServiceAsync = client.settings().users()

        val collectionResponsePublicPermissionSetNoPagingFuture = userServiceAsync.listRoles()

        val collectionResponsePublicPermissionSetNoPaging =
            collectionResponsePublicPermissionSetNoPagingFuture.get()
        collectionResponsePublicPermissionSetNoPaging.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listTeams() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val userServiceAsync = client.settings().users()

        val collectionResponsePublicTeamNoPagingFuture = userServiceAsync.listTeams()

        val collectionResponsePublicTeamNoPaging = collectionResponsePublicTeamNoPagingFuture.get()
        collectionResponsePublicTeamNoPaging.validate()
    }
}
