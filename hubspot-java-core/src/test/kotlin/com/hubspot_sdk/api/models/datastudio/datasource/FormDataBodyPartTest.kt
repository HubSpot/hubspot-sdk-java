// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.datastudio.datasource

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FormDataBodyPartTest {

    @Test
    fun create() {
        val formDataBodyPart =
            FormDataBodyPart.builder()
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
                .formDataContentDisposition(
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
                )
                .headers(
                    FormDataBodyPart.Headers.builder()
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
                .name("name")
                .parameterizedHeaders(
                    FormDataBodyPart.ParameterizedHeaders.builder()
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
                .simple(true)
                .value("value")
                .parent(
                    MultiPart.builder()
                        .addBodyPart(
                            BodyPart.builder()
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
                                    BodyPart.Headers.builder()
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
                )
                .build()

        assertThat(formDataBodyPart.contentDisposition())
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
        assertThat(formDataBodyPart._entity()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(formDataBodyPart.formDataContentDisposition())
            .isEqualTo(
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
            )
        assertThat(formDataBodyPart.headers())
            .isEqualTo(
                FormDataBodyPart.Headers.builder()
                    .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                    .build()
            )
        assertThat(formDataBodyPart.mediaType())
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
        assertThat(formDataBodyPart._messageBodyWorkers())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(formDataBodyPart.name()).isEqualTo("name")
        assertThat(formDataBodyPart.parameterizedHeaders())
            .isEqualTo(
                FormDataBodyPart.ParameterizedHeaders.builder()
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
        assertThat(formDataBodyPart._providers()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(formDataBodyPart.simple()).isEqualTo(true)
        assertThat(formDataBodyPart.value()).isEqualTo("value")
        assertThat(formDataBodyPart.parent())
            .contains(
                MultiPart.builder()
                    .addBodyPart(
                        BodyPart.builder()
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val formDataBodyPart =
            FormDataBodyPart.builder()
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
                .formDataContentDisposition(
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
                )
                .headers(
                    FormDataBodyPart.Headers.builder()
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
                .name("name")
                .parameterizedHeaders(
                    FormDataBodyPart.ParameterizedHeaders.builder()
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
                .simple(true)
                .value("value")
                .parent(
                    MultiPart.builder()
                        .addBodyPart(
                            BodyPart.builder()
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
                                    BodyPart.Headers.builder()
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
                )
                .build()

        val roundtrippedFormDataBodyPart =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(formDataBodyPart),
                jacksonTypeRef<FormDataBodyPart>(),
            )

        assertThat(roundtrippedFormDataBodyPart).isEqualTo(formDataBodyPart)
    }
}
