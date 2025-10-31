// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.account.activity

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActingUserTest {

    @Test
    fun create() {
        val actingUser =
            ActingUser.builder().userId(2931299).userEmail("pgibbons@initech.com").build()

        assertThat(actingUser.userId()).isEqualTo(2931299)
        assertThat(actingUser.userEmail()).contains("pgibbons@initech.com")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actingUser =
            ActingUser.builder().userId(2931299).userEmail("pgibbons@initech.com").build()

        val roundtrippedActingUser =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actingUser),
                jacksonTypeRef<ActingUser>(),
            )

        assertThat(roundtrippedActingUser).isEqualTo(actingUser)
    }
}
