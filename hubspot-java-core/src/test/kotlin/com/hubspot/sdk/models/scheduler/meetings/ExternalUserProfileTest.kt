// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.scheduler.meetings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalUserProfileTest {

    @Test
    fun create() {
        val externalUserProfile =
            ExternalUserProfile.builder()
                .email("email")
                .firstName("firstName")
                .fullName("fullName")
                .lastName("lastName")
                .build()

        assertThat(externalUserProfile.email()).isEqualTo("email")
        assertThat(externalUserProfile.firstName()).contains("firstName")
        assertThat(externalUserProfile.fullName()).contains("fullName")
        assertThat(externalUserProfile.lastName()).contains("lastName")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalUserProfile =
            ExternalUserProfile.builder()
                .email("email")
                .firstName("firstName")
                .fullName("fullName")
                .lastName("lastName")
                .build()

        val roundtrippedExternalUserProfile =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalUserProfile),
                jacksonTypeRef<ExternalUserProfile>(),
            )

        assertThat(roundtrippedExternalUserProfile).isEqualTo(externalUserProfile)
    }
}
