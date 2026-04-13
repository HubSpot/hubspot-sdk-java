// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EndpointsTest {

    @Test
    fun create() {
        val endpoints = Endpoints.builder().discovery(true).addScheme("string").url("url").build()

        assertThat(endpoints.discovery()).isEqualTo(true)
        assertThat(endpoints.schemes()).containsExactly("string")
        assertThat(endpoints.url()).isEqualTo("url")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val endpoints = Endpoints.builder().discovery(true).addScheme("string").url("url").build()

        val roundtrippedEndpoints =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(endpoints),
                jacksonTypeRef<Endpoints>(),
            )

        assertThat(roundtrippedEndpoints).isEqualTo(endpoints)
    }
}
