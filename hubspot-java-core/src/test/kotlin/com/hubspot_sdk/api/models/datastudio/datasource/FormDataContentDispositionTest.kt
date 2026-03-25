// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.datastudio.datasource

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FormDataContentDispositionTest {

    @Test
    fun create() {
        val formDataContentDisposition =
            FormDataContentDisposition.builder()
                .creationDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .fileName("fileName")
                .modificationDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .parameters(
                    FormDataContentDisposition.Parameters.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .readDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .size(0)
                .type("type")
                .build()

        assertThat(formDataContentDisposition.creationDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(formDataContentDisposition.fileName()).isEqualTo("fileName")
        assertThat(formDataContentDisposition.modificationDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(formDataContentDisposition.name()).isEqualTo("name")
        assertThat(formDataContentDisposition.parameters())
            .isEqualTo(
                FormDataContentDisposition.Parameters.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(formDataContentDisposition.readDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(formDataContentDisposition.size()).isEqualTo(0)
        assertThat(formDataContentDisposition.type()).isEqualTo("type")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val formDataContentDisposition =
            FormDataContentDisposition.builder()
                .creationDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .fileName("fileName")
                .modificationDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .parameters(
                    FormDataContentDisposition.Parameters.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .readDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .size(0)
                .type("type")
                .build()

        val roundtrippedFormDataContentDisposition =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(formDataContentDisposition),
                jacksonTypeRef<FormDataContentDisposition>(),
            )

        assertThat(roundtrippedFormDataContentDisposition).isEqualTo(formDataContentDisposition)
    }
}
