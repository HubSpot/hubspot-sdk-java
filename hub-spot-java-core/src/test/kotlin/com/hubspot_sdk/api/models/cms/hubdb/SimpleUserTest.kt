// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.hubdb

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SimpleUserTest {

    @Test
    fun create() {
        val simpleUser =
            SimpleUser.builder()
                .id("id")
                .email("email")
                .firstName("firstName")
                .lastName("lastName")
                .build()

        assertThat(simpleUser.id()).isEqualTo("id")
        assertThat(simpleUser.email()).isEqualTo("email")
        assertThat(simpleUser.firstName()).isEqualTo("firstName")
        assertThat(simpleUser.lastName()).isEqualTo("lastName")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val simpleUser =
            SimpleUser.builder()
                .id("id")
                .email("email")
                .firstName("firstName")
                .lastName("lastName")
                .build()

        val roundtrippedSimpleUser =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(simpleUser),
                jacksonTypeRef<SimpleUser>(),
            )

        assertThat(roundtrippedSimpleUser).isEqualTo(simpleUser)
    }
}
