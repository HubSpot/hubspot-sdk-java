// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.datastudio.datasource

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BodyPartTest {

    @Test
    fun create() {
        val bodyPart =
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
                .parent(
                    MultiPart.builder()
                        .bodyParts(listOf())
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
                )
                .build()

        assertThat(bodyPart.contentDisposition())
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
        assertThat(bodyPart._entity()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(bodyPart.headers())
            .isEqualTo(
                BodyPart.Headers.builder()
                    .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                    .build()
            )
        assertThat(bodyPart.mediaType())
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
        assertThat(bodyPart._messageBodyWorkers()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(bodyPart.parameterizedHeaders())
            .isEqualTo(
                BodyPart.ParameterizedHeaders.builder()
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
        assertThat(bodyPart._providers()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(bodyPart.parent())
            .contains(
                MultiPart.builder()
                    .bodyParts(listOf())
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val bodyPart =
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
                .parent(
                    MultiPart.builder()
                        .bodyParts(listOf())
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
                )
                .build()

        val roundtrippedBodyPart =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(bodyPart),
                jacksonTypeRef<BodyPart>(),
            )

        assertThat(roundtrippedBodyPart).isEqualTo(bodyPart)
    }
}
