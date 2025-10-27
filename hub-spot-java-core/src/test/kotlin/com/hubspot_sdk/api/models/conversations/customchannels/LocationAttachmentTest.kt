// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.customchannels

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LocationAttachmentTest {

    @Test
    fun create() {
        val locationAttachment =
            LocationAttachment.builder()
                .latitude(0.0)
                .longitude(0.0)
                .type(LocationAttachment.Type.LOCATION)
                .address("address")
                .name("name")
                .url("url")
                .build()

        assertThat(locationAttachment.latitude()).isEqualTo(0.0)
        assertThat(locationAttachment.longitude()).isEqualTo(0.0)
        assertThat(locationAttachment.type()).isEqualTo(LocationAttachment.Type.LOCATION)
        assertThat(locationAttachment.address()).contains("address")
        assertThat(locationAttachment.name()).contains("name")
        assertThat(locationAttachment.url()).contains("url")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val locationAttachment =
            LocationAttachment.builder()
                .latitude(0.0)
                .longitude(0.0)
                .type(LocationAttachment.Type.LOCATION)
                .address("address")
                .name("name")
                .url("url")
                .build()

        val roundtrippedLocationAttachment =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(locationAttachment),
                jacksonTypeRef<LocationAttachment>(),
            )

        assertThat(roundtrippedLocationAttachment).isEqualTo(locationAttachment)
    }
}
