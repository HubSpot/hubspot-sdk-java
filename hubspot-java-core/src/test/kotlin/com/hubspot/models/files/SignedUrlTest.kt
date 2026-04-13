// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.files

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SignedUrlTest {

    @Test
    fun create() {
        val signedUrl =
            SignedUrl.builder()
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .url("url")
                .extension("extension")
                .height(0)
                .name("name")
                .size(0L)
                .type("type")
                .width(0)
                .build()

        assertThat(signedUrl.expiresAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(signedUrl.url()).isEqualTo("url")
        assertThat(signedUrl.extension()).contains("extension")
        assertThat(signedUrl.height()).contains(0)
        assertThat(signedUrl.name()).contains("name")
        assertThat(signedUrl.size()).contains(0L)
        assertThat(signedUrl.type()).contains("type")
        assertThat(signedUrl.width()).contains(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val signedUrl =
            SignedUrl.builder()
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .url("url")
                .extension("extension")
                .height(0)
                .name("name")
                .size(0L)
                .type("type")
                .width(0)
                .build()

        val roundtrippedSignedUrl =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(signedUrl),
                jacksonTypeRef<SignedUrl>(),
            )

        assertThat(roundtrippedSignedUrl).isEqualTo(signedUrl)
    }
}
