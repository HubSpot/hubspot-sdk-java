// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.settings.users

import com.hubspot.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserUpdateParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun pathParams() {
        val params =
            UserUpdateParams.builder()
                .userId("userId")
                .publicUserUpdate(PublicUserUpdate.builder().build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("userId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
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

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("idProperty", "EMAIL").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            UserUpdateParams.builder()
                .userId("userId")
                .publicUserUpdate(PublicUserUpdate.builder().build())
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PublicUserUpdate.builder()
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
            UserUpdateParams.builder()
                .userId("userId")
                .publicUserUpdate(PublicUserUpdate.builder().build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(PublicUserUpdate.builder().build())
    }
}
