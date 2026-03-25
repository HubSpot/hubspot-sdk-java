// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.datastudio.datasource

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContentDispositionTest {

    @Test
    fun create() {
        val contentDisposition =
            ContentDisposition.builder()
                .creationDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .fileName("fileName")
                .modificationDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .parameters(
                    ContentDisposition.Parameters.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .readDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .size(0)
                .type("type")
                .build()

        assertThat(contentDisposition.creationDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(contentDisposition.fileName()).isEqualTo("fileName")
        assertThat(contentDisposition.modificationDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(contentDisposition.parameters())
            .isEqualTo(
                ContentDisposition.Parameters.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(contentDisposition.readDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(contentDisposition.size()).isEqualTo(0)
        assertThat(contentDisposition.type()).isEqualTo("type")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val contentDisposition =
            ContentDisposition.builder()
                .creationDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .fileName("fileName")
                .modificationDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .parameters(
                    ContentDisposition.Parameters.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .readDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .size(0)
                .type("type")
                .build()

        val roundtrippedContentDisposition =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(contentDisposition),
                jacksonTypeRef<ContentDisposition>(),
            )

        assertThat(roundtrippedContentDisposition).isEqualTo(contentDisposition)
    }
}
