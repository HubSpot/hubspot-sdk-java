// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.datastudio

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.delete
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.models.datastudio.datasource.BodyPart
import com.hubspot_sdk.api.models.datastudio.datasource.ContentDisposition
import com.hubspot_sdk.api.models.datastudio.datasource.DatasourceUpdateParams
import com.hubspot_sdk.api.models.datastudio.datasource.FormDataMultiPart
import com.hubspot_sdk.api.models.datastudio.datasource.MediaType
import com.hubspot_sdk.api.models.datastudio.datasource.MultiPart
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class DatasourceServiceAsyncTest {

    @Test
    fun create(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val datasourceServiceAsync = client.dataStudio().datasource()
        stubFor(post(anyUrl()).willReturn(ok().withBody("abc")))

        val datasourceFuture =
            datasourceServiceAsync.create(
                FormDataMultiPart.builder()
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
                                            .readDate(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
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
                                                            "parameters" to
                                                                mapOf("foo" to "string"),
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
                                                    "modificationDate" to
                                                        "2019-12-27T18:11:19.117Z",
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
                                                    "modificationDate" to
                                                        "2019-12-27T18:11:19.117Z",
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
                                                            "parameters" to
                                                                mapOf("foo" to "string"),
                                                            "readDate" to
                                                                "2019-12-27T18:11:19.117Z",
                                                            "size" to 0,
                                                            "type" to "type",
                                                        ),
                                                    "entity" to mapOf<String, Any>(),
                                                    "headers" to mapOf("foo" to listOf("string")),
                                                    "mediaType" to
                                                        mapOf(
                                                            "parameters" to
                                                                mapOf("foo" to "string"),
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
                                                                            mapOf(
                                                                                "foo" to "string"
                                                                            ),
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

        val datasource = datasourceFuture.get()
        assertThat(datasource.body()).hasContent("abc")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val datasourceServiceAsync = client.dataStudio().datasource()

        val dataSourceUpdateResponseFuture =
            datasourceServiceAsync.update(
                DatasourceUpdateParams.builder()
                    .datasourceId(0L)
                    .formDataMultiPart(
                        FormDataMultiPart.builder()
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
                                            .readDate(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
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
                                                            "parameters" to
                                                                mapOf("foo" to "string"),
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
                                                        OffsetDateTime.parse(
                                                            "2019-12-27T18:11:19.117Z"
                                                        )
                                                    )
                                                    .fileName("fileName")
                                                    .modificationDate(
                                                        OffsetDateTime.parse(
                                                            "2019-12-27T18:11:19.117Z"
                                                        )
                                                    )
                                                    .parameters(
                                                        ContentDisposition.Parameters.builder()
                                                            .putAdditionalProperty(
                                                                "foo",
                                                                JsonValue.from("string"),
                                                            )
                                                            .build()
                                                    )
                                                    .readDate(
                                                        OffsetDateTime.parse(
                                                            "2019-12-27T18:11:19.117Z"
                                                        )
                                                    )
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
                                            .messageBodyWorkers(
                                                JsonValue.from(mapOf<String, Any>())
                                            )
                                            .parameterizedHeaders(
                                                MultiPart.ParameterizedHeaders.builder()
                                                    .putAdditionalProperty(
                                                        "foo",
                                                        JsonValue.from(
                                                            listOf(
                                                                mapOf(
                                                                    "parameters" to
                                                                        mapOf("foo" to "string"),
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
                            .fields(
                                FormDataMultiPart.Fields.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(
                                            listOf(
                                                mapOf(
                                                    "contentDisposition" to
                                                        mapOf(
                                                            "creationDate" to
                                                                "2019-12-27T18:11:19.117Z",
                                                            "fileName" to "fileName",
                                                            "modificationDate" to
                                                                "2019-12-27T18:11:19.117Z",
                                                            "parameters" to
                                                                mapOf("foo" to "string"),
                                                            "readDate" to
                                                                "2019-12-27T18:11:19.117Z",
                                                            "size" to 0,
                                                            "type" to "type",
                                                        ),
                                                    "entity" to mapOf<String, Any>(),
                                                    "formDataContentDisposition" to
                                                        mapOf(
                                                            "creationDate" to
                                                                "2019-12-27T18:11:19.117Z",
                                                            "fileName" to "fileName",
                                                            "modificationDate" to
                                                                "2019-12-27T18:11:19.117Z",
                                                            "name" to "name",
                                                            "parameters" to
                                                                mapOf("foo" to "string"),
                                                            "readDate" to
                                                                "2019-12-27T18:11:19.117Z",
                                                            "size" to 0,
                                                            "type" to "type",
                                                        ),
                                                    "headers" to mapOf("foo" to listOf("string")),
                                                    "mediaType" to
                                                        mapOf(
                                                            "parameters" to
                                                                mapOf("foo" to "string"),
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
                                                                            mapOf(
                                                                                "foo" to "string"
                                                                            ),
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
                                                                    "parameters" to
                                                                        mapOf("foo" to "string"),
                                                                    "readDate" to
                                                                        "2019-12-27T18:11:19.117Z",
                                                                    "size" to 0,
                                                                    "type" to "type",
                                                                ),
                                                            "entity" to mapOf<String, Any>(),
                                                            "headers" to
                                                                mapOf("foo" to listOf("string")),
                                                            "mediaType" to
                                                                mapOf(
                                                                    "parameters" to
                                                                        mapOf("foo" to "string"),
                                                                    "subtype" to "subtype",
                                                                    "type" to "type",
                                                                    "wildcardSubtype" to true,
                                                                    "wildcardType" to true,
                                                                ),
                                                            "messageBodyWorkers" to
                                                                mapOf<String, Any>(),
                                                            "parameterizedHeaders" to
                                                                mapOf(
                                                                    "foo" to
                                                                        listOf(
                                                                            mapOf(
                                                                                "parameters" to
                                                                                    mapOf(
                                                                                        "foo" to
                                                                                            "string"
                                                                                    ),
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
                                            .readDate(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
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
                                                            "parameters" to
                                                                mapOf("foo" to "string"),
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
                    .build()
            )

        val dataSourceUpdateResponse = dataSourceUpdateResponseFuture.get()
        dataSourceUpdateResponse.validate()
    }

    @Test
    fun delete(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val datasourceServiceAsync = client.dataStudio().datasource()
        stubFor(delete(anyUrl()).willReturn(ok().withBody("abc")))

        val datasourceFuture = datasourceServiceAsync.delete(0L)

        val datasource = datasourceFuture.get()
        assertThat(datasource.body()).hasContent("abc")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val datasourceServiceAsync = client.dataStudio().datasource()

        val dataSourceGetResponseFuture = datasourceServiceAsync.get(0L)

        val dataSourceGetResponse = dataSourceGetResponseFuture.get()
        dataSourceGetResponse.validate()
    }
}
