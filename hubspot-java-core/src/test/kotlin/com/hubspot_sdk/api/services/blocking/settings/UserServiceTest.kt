// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.settings

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.models.settings.users.PublicUserUpdate
import com.hubspot_sdk.api.models.settings.users.UserDeleteParams
import com.hubspot_sdk.api.models.settings.users.UserGetParams
import com.hubspot_sdk.api.models.settings.users.UserProvisionRequest
import com.hubspot_sdk.api.models.settings.users.UserUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class UserServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val userService = client.settings().users()

        val publicUser =
            userService.create(
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

        publicUser.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val userService = client.settings().users()

        val publicUser =
            userService.update(
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

        publicUser.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val userService = client.settings().users()

        val page = userService.list()

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val userService = client.settings().users()

        userService.delete(
            UserDeleteParams.builder()
                .userId("userId")
                .idProperty(UserDeleteParams.IdProperty.USER_ID)
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val userService = client.settings().users()

        val publicUser =
            userService.get(
                UserGetParams.builder()
                    .userId("userId")
                    .idProperty(UserGetParams.IdProperty.USER_ID)
                    .build()
            )

        publicUser.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listRoles() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val userService = client.settings().users()

        val collectionResponsePublicPermissionSetNoPaging = userService.listRoles()

        collectionResponsePublicPermissionSetNoPaging.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listTeams() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val userService = client.settings().users()

        val collectionResponsePublicTeamNoPaging = userService.listTeams()

        collectionResponsePublicTeamNoPaging.validate()
    }
}
