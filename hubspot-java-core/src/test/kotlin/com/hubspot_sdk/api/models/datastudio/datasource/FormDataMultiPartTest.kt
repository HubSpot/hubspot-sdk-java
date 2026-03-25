// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.datastudio.datasource

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FormDataMultiPartTest {

    @Test
    fun create() {
        val formDataMultiPart =
            FormDataMultiPart.builder()
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
                        .parent(
                            MultiPart.builder()
                                .bodyParts(listOf())
                                .contentDisposition(
                                    ContentDisposition.builder()
                                        .creationDate(
                                            OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                        )
                                        .fileName("fileName")
                                        .modificationDate(
                                            OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                        )
                                        .parameters(
                                            ContentDisposition.Parameters.builder()
                                                .putAdditionalProperty(
                                                    "foo",
                                                    JsonValue.from("string"),
                                                )
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
                                        .putAdditionalProperty(
                                            "foo",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .build()
                                )
                                .mediaType(
                                    MediaType.builder()
                                        .parameters(
                                            MediaType.Parameters.builder()
                                                .putAdditionalProperty(
                                                    "foo",
                                                    JsonValue.from("string"),
                                                )
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
                .fields(
                    FormDataMultiPart.Fields.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(
                                listOf(
                                    mapOf(
                                        "contentDisposition" to
                                            mapOf(
                                                "creationDate" to "2019-12-27T18:11:19.117Z",
                                                "fileName" to "fileName",
                                                "modificationDate" to "2019-12-27T18:11:19.117Z",
                                                "parameters" to mapOf("foo" to "string"),
                                                "readDate" to "2019-12-27T18:11:19.117Z",
                                                "size" to 0,
                                                "type" to "type",
                                            ),
                                        "entity" to mapOf<String, Any>(),
                                        "formDataContentDisposition" to
                                            mapOf(
                                                "creationDate" to "2019-12-27T18:11:19.117Z",
                                                "fileName" to "fileName",
                                                "modificationDate" to "2019-12-27T18:11:19.117Z",
                                                "name" to "name",
                                                "parameters" to mapOf("foo" to "string"),
                                                "readDate" to "2019-12-27T18:11:19.117Z",
                                                "size" to 0,
                                                "type" to "type",
                                            ),
                                        "headers" to mapOf("foo" to listOf("string")),
                                        "mediaType" to
                                            mapOf(
                                                "parameters" to mapOf("foo" to "string"),
                                                "subtype" to "subtype",
                                                "type" to "type",
                                                "wildcardSubtype" to true,
                                                "wildcardType" to true,
                                            ),
                                        "messageBodyWorkers" to mapOf<String, Any>(),
                                        "name" to "name",
                                        "parameterizedHeaders" to
                                            mapOf(
                                                "foo" to
                                                    listOf(
                                                        mapOf(
                                                            "parameters" to
                                                                mapOf("foo" to "string"),
                                                            "value" to "value",
                                                        )
                                                    )
                                            ),
                                        "providers" to mapOf<String, Any>(),
                                        "simple" to true,
                                        "value" to "value",
                                        "parent" to
                                            mapOf(
                                                "bodyParts" to listOf<Any>(),
                                                "contentDisposition" to
                                                    mapOf(
                                                        "creationDate" to
                                                            "2019-12-27T18:11:19.117Z",
                                                        "fileName" to "fileName",
                                                        "modificationDate" to
                                                            "2019-12-27T18:11:19.117Z",
                                                        "parameters" to mapOf("foo" to "string"),
                                                        "readDate" to "2019-12-27T18:11:19.117Z",
                                                        "size" to 0,
                                                        "type" to "type",
                                                    ),
                                                "entity" to mapOf<String, Any>(),
                                                "headers" to mapOf("foo" to listOf("string")),
                                                "mediaType" to
                                                    mapOf(
                                                        "parameters" to mapOf("foo" to "string"),
                                                        "subtype" to "subtype",
                                                        "type" to "type",
                                                        "wildcardSubtype" to true,
                                                        "wildcardType" to true,
                                                    ),
                                                "messageBodyWorkers" to mapOf<String, Any>(),
                                                "parameterizedHeaders" to
                                                    mapOf(
                                                        "foo" to
                                                            listOf(
                                                                mapOf(
                                                                    "parameters" to
                                                                        mapOf("foo" to "string"),
                                                                    "value" to "value",
                                                                )
                                                            )
                                                    ),
                                                "providers" to mapOf<String, Any>(),
                                            ),
                                    )
                                )
                            ),
                        )
                        .build()
                )
                .headers(
                    FormDataMultiPart.Headers.builder()
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
                    FormDataMultiPart.ParameterizedHeaders.builder()
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

        assertThat(formDataMultiPart.bodyParts())
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
                    .parent(
                        MultiPart.builder()
                            .bodyParts(listOf())
                            .contentDisposition(
                                ContentDisposition.builder()
                                    .creationDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .fileName("fileName")
                                    .modificationDate(
                                        OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                    )
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
            )
        assertThat(formDataMultiPart.contentDisposition())
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
        assertThat(formDataMultiPart._entity()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(formDataMultiPart.fields())
            .isEqualTo(
                FormDataMultiPart.Fields.builder()
                    .putAdditionalProperty(
                        "foo",
                        JsonValue.from(
                            listOf(
                                mapOf(
                                    "contentDisposition" to
                                        mapOf(
                                            "creationDate" to "2019-12-27T18:11:19.117Z",
                                            "fileName" to "fileName",
                                            "modificationDate" to "2019-12-27T18:11:19.117Z",
                                            "parameters" to mapOf("foo" to "string"),
                                            "readDate" to "2019-12-27T18:11:19.117Z",
                                            "size" to 0,
                                            "type" to "type",
                                        ),
                                    "entity" to mapOf<String, Any>(),
                                    "formDataContentDisposition" to
                                        mapOf(
                                            "creationDate" to "2019-12-27T18:11:19.117Z",
                                            "fileName" to "fileName",
                                            "modificationDate" to "2019-12-27T18:11:19.117Z",
                                            "name" to "name",
                                            "parameters" to mapOf("foo" to "string"),
                                            "readDate" to "2019-12-27T18:11:19.117Z",
                                            "size" to 0,
                                            "type" to "type",
                                        ),
                                    "headers" to mapOf("foo" to listOf("string")),
                                    "mediaType" to
                                        mapOf(
                                            "parameters" to mapOf("foo" to "string"),
                                            "subtype" to "subtype",
                                            "type" to "type",
                                            "wildcardSubtype" to true,
                                            "wildcardType" to true,
                                        ),
                                    "messageBodyWorkers" to mapOf<String, Any>(),
                                    "name" to "name",
                                    "parameterizedHeaders" to
                                        mapOf(
                                            "foo" to
                                                listOf(
                                                    mapOf(
                                                        "parameters" to mapOf("foo" to "string"),
                                                        "value" to "value",
                                                    )
                                                )
                                        ),
                                    "providers" to mapOf<String, Any>(),
                                    "simple" to true,
                                    "value" to "value",
                                    "parent" to
                                        mapOf(
                                            "bodyParts" to listOf<Any>(),
                                            "contentDisposition" to
                                                mapOf(
                                                    "creationDate" to "2019-12-27T18:11:19.117Z",
                                                    "fileName" to "fileName",
                                                    "modificationDate" to
                                                        "2019-12-27T18:11:19.117Z",
                                                    "parameters" to mapOf("foo" to "string"),
                                                    "readDate" to "2019-12-27T18:11:19.117Z",
                                                    "size" to 0,
                                                    "type" to "type",
                                                ),
                                            "entity" to mapOf<String, Any>(),
                                            "headers" to mapOf("foo" to listOf("string")),
                                            "mediaType" to
                                                mapOf(
                                                    "parameters" to mapOf("foo" to "string"),
                                                    "subtype" to "subtype",
                                                    "type" to "type",
                                                    "wildcardSubtype" to true,
                                                    "wildcardType" to true,
                                                ),
                                            "messageBodyWorkers" to mapOf<String, Any>(),
                                            "parameterizedHeaders" to
                                                mapOf(
                                                    "foo" to
                                                        listOf(
                                                            mapOf(
                                                                "parameters" to
                                                                    mapOf("foo" to "string"),
                                                                "value" to "value",
                                                            )
                                                        )
                                                ),
                                            "providers" to mapOf<String, Any>(),
                                        ),
                                )
                            )
                        ),
                    )
                    .build()
            )
        assertThat(formDataMultiPart.headers())
            .isEqualTo(
                FormDataMultiPart.Headers.builder()
                    .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                    .build()
            )
        assertThat(formDataMultiPart.mediaType())
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
        assertThat(formDataMultiPart._messageBodyWorkers())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(formDataMultiPart.parameterizedHeaders())
            .isEqualTo(
                FormDataMultiPart.ParameterizedHeaders.builder()
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
        assertThat(formDataMultiPart._providers()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(formDataMultiPart.parent())
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
        val formDataMultiPart =
            FormDataMultiPart.builder()
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
                        .parent(
                            MultiPart.builder()
                                .bodyParts(listOf())
                                .contentDisposition(
                                    ContentDisposition.builder()
                                        .creationDate(
                                            OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                        )
                                        .fileName("fileName")
                                        .modificationDate(
                                            OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                        )
                                        .parameters(
                                            ContentDisposition.Parameters.builder()
                                                .putAdditionalProperty(
                                                    "foo",
                                                    JsonValue.from("string"),
                                                )
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
                                        .putAdditionalProperty(
                                            "foo",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .build()
                                )
                                .mediaType(
                                    MediaType.builder()
                                        .parameters(
                                            MediaType.Parameters.builder()
                                                .putAdditionalProperty(
                                                    "foo",
                                                    JsonValue.from("string"),
                                                )
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
                .fields(
                    FormDataMultiPart.Fields.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(
                                listOf(
                                    mapOf(
                                        "contentDisposition" to
                                            mapOf(
                                                "creationDate" to "2019-12-27T18:11:19.117Z",
                                                "fileName" to "fileName",
                                                "modificationDate" to "2019-12-27T18:11:19.117Z",
                                                "parameters" to mapOf("foo" to "string"),
                                                "readDate" to "2019-12-27T18:11:19.117Z",
                                                "size" to 0,
                                                "type" to "type",
                                            ),
                                        "entity" to mapOf<String, Any>(),
                                        "formDataContentDisposition" to
                                            mapOf(
                                                "creationDate" to "2019-12-27T18:11:19.117Z",
                                                "fileName" to "fileName",
                                                "modificationDate" to "2019-12-27T18:11:19.117Z",
                                                "name" to "name",
                                                "parameters" to mapOf("foo" to "string"),
                                                "readDate" to "2019-12-27T18:11:19.117Z",
                                                "size" to 0,
                                                "type" to "type",
                                            ),
                                        "headers" to mapOf("foo" to listOf("string")),
                                        "mediaType" to
                                            mapOf(
                                                "parameters" to mapOf("foo" to "string"),
                                                "subtype" to "subtype",
                                                "type" to "type",
                                                "wildcardSubtype" to true,
                                                "wildcardType" to true,
                                            ),
                                        "messageBodyWorkers" to mapOf<String, Any>(),
                                        "name" to "name",
                                        "parameterizedHeaders" to
                                            mapOf(
                                                "foo" to
                                                    listOf(
                                                        mapOf(
                                                            "parameters" to
                                                                mapOf("foo" to "string"),
                                                            "value" to "value",
                                                        )
                                                    )
                                            ),
                                        "providers" to mapOf<String, Any>(),
                                        "simple" to true,
                                        "value" to "value",
                                        "parent" to
                                            mapOf(
                                                "bodyParts" to listOf<Any>(),
                                                "contentDisposition" to
                                                    mapOf(
                                                        "creationDate" to
                                                            "2019-12-27T18:11:19.117Z",
                                                        "fileName" to "fileName",
                                                        "modificationDate" to
                                                            "2019-12-27T18:11:19.117Z",
                                                        "parameters" to mapOf("foo" to "string"),
                                                        "readDate" to "2019-12-27T18:11:19.117Z",
                                                        "size" to 0,
                                                        "type" to "type",
                                                    ),
                                                "entity" to mapOf<String, Any>(),
                                                "headers" to mapOf("foo" to listOf("string")),
                                                "mediaType" to
                                                    mapOf(
                                                        "parameters" to mapOf("foo" to "string"),
                                                        "subtype" to "subtype",
                                                        "type" to "type",
                                                        "wildcardSubtype" to true,
                                                        "wildcardType" to true,
                                                    ),
                                                "messageBodyWorkers" to mapOf<String, Any>(),
                                                "parameterizedHeaders" to
                                                    mapOf(
                                                        "foo" to
                                                            listOf(
                                                                mapOf(
                                                                    "parameters" to
                                                                        mapOf("foo" to "string"),
                                                                    "value" to "value",
                                                                )
                                                            )
                                                    ),
                                                "providers" to mapOf<String, Any>(),
                                            ),
                                    )
                                )
                            ),
                        )
                        .build()
                )
                .headers(
                    FormDataMultiPart.Headers.builder()
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
                    FormDataMultiPart.ParameterizedHeaders.builder()
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

        val roundtrippedFormDataMultiPart =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(formDataMultiPart),
                jacksonTypeRef<FormDataMultiPart>(),
            )

        assertThat(roundtrippedFormDataMultiPart).isEqualTo(formDataMultiPart)
    }
}
