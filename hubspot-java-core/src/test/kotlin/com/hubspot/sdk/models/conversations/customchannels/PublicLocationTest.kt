// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.conversations.customchannels

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicLocationTest {

    @Test
    fun create() {
        val publicLocation =
            PublicLocation.builder()
                .latitude(0.0)
                .longitude(0.0)
                .type(PublicLocation.Type.LOCATION)
                .address("address")
                .name("name")
                .url("url")
                .build()

        assertThat(publicLocation.latitude()).isEqualTo(0.0)
        assertThat(publicLocation.longitude()).isEqualTo(0.0)
        assertThat(publicLocation.type()).isEqualTo(PublicLocation.Type.LOCATION)
        assertThat(publicLocation.address()).contains("address")
        assertThat(publicLocation.name()).contains("name")
        assertThat(publicLocation.url()).contains("url")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicLocation =
            PublicLocation.builder()
                .latitude(0.0)
                .longitude(0.0)
                .type(PublicLocation.Type.LOCATION)
                .address("address")
                .name("name")
                .url("url")
                .build()

        val roundtrippedPublicLocation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicLocation),
                jacksonTypeRef<PublicLocation>(),
            )

        assertThat(roundtrippedPublicLocation).isEqualTo(publicLocation)
    }
}
