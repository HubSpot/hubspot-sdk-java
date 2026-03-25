// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.datastudio.datasource

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MultiPartTest {

    @Test
    fun create() {
        val multiPart =
            MultiPart.builder()
                .addBodyPart(
                    BodyPart.builder()
                        .contentDisposition(
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
                        )
                        .entity(JsonValue.from(mapOf<String, Any>()))
                        .headers(
                            BodyPart.Headers.builder()
                                .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                                .build()
                        )
                        .mediaType(
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
                        )
                        .messageBodyWorkers(JsonValue.from(mapOf<String, Any>()))
                        .parameterizedHeaders(
                            BodyPart.ParameterizedHeaders.builder()
                                .putAdditionalProperty(
                                    "foo",
                                    JsonValue.from(
                                        listOf(
                                            mapOf(
                                                "parameters" to mapOf("foo" to "string"),
                                                "value" to "value",
                                            )
                                        )
                                    ),
                                )
                                .build()
                        )
                        .providers(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .contentDisposition(
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
                )
                .entity(JsonValue.from(mapOf<String, Any>()))
                .headers(
                    MultiPart.Headers.builder()
                        .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                        .build()
                )
                .mediaType(
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
                )
                .messageBodyWorkers(JsonValue.from(mapOf<String, Any>()))
                .parameterizedHeaders(
                    MultiPart.ParameterizedHeaders.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(
                                listOf(
                                    mapOf(
                                        "parameters" to mapOf("foo" to "string"),
                                        "value" to "value",
                                    )
                                )
                            ),
                        )
                        .build()
                )
                .providers(JsonValue.from(mapOf<String, Any>()))
                .build()

        assertThat(multiPart.bodyParts())
            .containsExactly(
                BodyPart.builder()
                    .contentDisposition(
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
                    )
                    .entity(JsonValue.from(mapOf<String, Any>()))
                    .headers(
                        BodyPart.Headers.builder()
                            .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                            .build()
                    )
                    .mediaType(
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
                    )
                    .messageBodyWorkers(JsonValue.from(mapOf<String, Any>()))
                    .parameterizedHeaders(
                        BodyPart.ParameterizedHeaders.builder()
                            .putAdditionalProperty(
                                "foo",
                                JsonValue.from(
                                    listOf(
                                        mapOf(
                                            "parameters" to mapOf("foo" to "string"),
                                            "value" to "value",
                                        )
                                    )
                                ),
                            )
                            .build()
                    )
                    .providers(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
        assertThat(multiPart.contentDisposition())
            .isEqualTo(
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
            )
        assertThat(multiPart._entity()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(multiPart.headers())
            .isEqualTo(
                MultiPart.Headers.builder()
                    .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                    .build()
            )
        assertThat(multiPart.mediaType())
            .isEqualTo(
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
            )
        assertThat(multiPart._messageBodyWorkers()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(multiPart.parameterizedHeaders())
            .isEqualTo(
                MultiPart.ParameterizedHeaders.builder()
                    .putAdditionalProperty(
                        "foo",
                        JsonValue.from(
                            listOf(
                                mapOf("parameters" to mapOf("foo" to "string"), "value" to "value")
                            )
                        ),
                    )
                    .build()
            )
        assertThat(multiPart._providers()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val multiPart =
            MultiPart.builder()
                .addBodyPart(
                    BodyPart.builder()
                        .contentDisposition(
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
                        )
                        .entity(JsonValue.from(mapOf<String, Any>()))
                        .headers(
                            BodyPart.Headers.builder()
                                .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                                .build()
                        )
                        .mediaType(
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
                        )
                        .messageBodyWorkers(JsonValue.from(mapOf<String, Any>()))
                        .parameterizedHeaders(
                            BodyPart.ParameterizedHeaders.builder()
                                .putAdditionalProperty(
                                    "foo",
                                    JsonValue.from(
                                        listOf(
                                            mapOf(
                                                "parameters" to mapOf("foo" to "string"),
                                                "value" to "value",
                                            )
                                        )
                                    ),
                                )
                                .build()
                        )
                        .providers(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .contentDisposition(
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
                )
                .entity(JsonValue.from(mapOf<String, Any>()))
                .headers(
                    MultiPart.Headers.builder()
                        .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                        .build()
                )
                .mediaType(
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
                )
                .messageBodyWorkers(JsonValue.from(mapOf<String, Any>()))
                .parameterizedHeaders(
                    MultiPart.ParameterizedHeaders.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(
                                listOf(
                                    mapOf(
                                        "parameters" to mapOf("foo" to "string"),
                                        "value" to "value",
                                    )
                                )
                            ),
                        )
                        .build()
                )
                .providers(JsonValue.from(mapOf<String, Any>()))
                .build()

        val roundtrippedMultiPart =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(multiPart),
                jacksonTypeRef<MultiPart>(),
            )

        assertThat(roundtrippedMultiPart).isEqualTo(multiPart)
    }
}
