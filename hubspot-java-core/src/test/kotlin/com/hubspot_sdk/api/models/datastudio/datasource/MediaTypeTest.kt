// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.datastudio.datasource

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MediaTypeTest {

    @Test
    fun create() {
        val mediaType =
            MediaType.builder()
                .parameters(
                    MediaType.Parameters.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .subtype("subtype")
                .type("type")
                .wildcardSubtype(true)
                .wildcardType(true)
                .build()

        assertThat(mediaType.parameters())
            .isEqualTo(
                MediaType.Parameters.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(mediaType.subtype()).isEqualTo("subtype")
        assertThat(mediaType.type()).isEqualTo("type")
        assertThat(mediaType.wildcardSubtype()).isEqualTo(true)
        assertThat(mediaType.wildcardType()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val mediaType =
            MediaType.builder()
                .parameters(
                    MediaType.Parameters.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .subtype("subtype")
                .type("type")
                .wildcardSubtype(true)
                .wildcardType(true)
                .build()

        val roundtrippedMediaType =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(mediaType),
                jacksonTypeRef<MediaType>(),
            )

        assertThat(roundtrippedMediaType).isEqualTo(mediaType)
    }
}
