// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.account.activity

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActingUserTest {

    @Test
    fun create() {
        val actingUser = ActingUser.builder().userId(0).userEmail("userEmail").build()

        assertThat(actingUser.userId()).isEqualTo(0)
        assertThat(actingUser.userEmail()).contains("userEmail")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actingUser = ActingUser.builder().userId(0).userEmail("userEmail").build()

        val roundtrippedActingUser =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actingUser),
                jacksonTypeRef<ActingUser>(),
            )

        assertThat(roundtrippedActingUser).isEqualTo(actingUser)
    }
}
