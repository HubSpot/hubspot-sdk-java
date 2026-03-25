// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VersionUserTest {

    @Test
    fun create() {
        val versionUser = VersionUser.builder().id("id").email("email").fullName("fullName").build()

        assertThat(versionUser.id()).isEqualTo("id")
        assertThat(versionUser.email()).isEqualTo("email")
        assertThat(versionUser.fullName()).isEqualTo("fullName")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val versionUser = VersionUser.builder().id("id").email("email").fullName("fullName").build()

        val roundtrippedVersionUser =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(versionUser),
                jacksonTypeRef<VersionUser>(),
            )

        assertThat(roundtrippedVersionUser).isEqualTo(versionUser)
    }
}
