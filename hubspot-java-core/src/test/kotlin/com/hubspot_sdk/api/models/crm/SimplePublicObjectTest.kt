// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SimplePublicObjectTest {

    @Test
    fun create() {
        val simplePublicObject =
            SimplePublicObject.builder()
                .id("id")
                .archived(true)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .properties(
                    SimplePublicObject.Properties.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .objectWriteTraceId("objectWriteTraceId")
                .propertiesWithHistory(
                    SimplePublicObject.PropertiesWithHistory.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(
                                listOf(
                                    mapOf(
                                        "sourceType" to "sourceType",
                                        "timestamp" to "2019-12-27T18:11:19.117Z",
                                        "value" to "value",
                                        "sourceId" to "sourceId",
                                        "sourceLabel" to "sourceLabel",
                                        "updatedByUserId" to 0,
                                    )
                                )
                            ),
                        )
                        .build()
                )
                .url("url")
                .build()

        assertThat(simplePublicObject.id()).isEqualTo("id")
        assertThat(simplePublicObject.archived()).isEqualTo(true)
        assertThat(simplePublicObject.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(simplePublicObject.properties())
            .isEqualTo(
                SimplePublicObject.Properties.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(simplePublicObject.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(simplePublicObject.archivedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(simplePublicObject.objectWriteTraceId()).contains("objectWriteTraceId")
        assertThat(simplePublicObject.propertiesWithHistory())
            .contains(
                SimplePublicObject.PropertiesWithHistory.builder()
                    .putAdditionalProperty(
                        "foo",
                        JsonValue.from(
                            listOf(
                                mapOf(
                                    "sourceType" to "sourceType",
                                    "timestamp" to "2019-12-27T18:11:19.117Z",
                                    "value" to "value",
                                    "sourceId" to "sourceId",
                                    "sourceLabel" to "sourceLabel",
                                    "updatedByUserId" to 0,
                                )
                            )
                        ),
                    )
                    .build()
            )
        assertThat(simplePublicObject.url()).contains("url")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val simplePublicObject =
            SimplePublicObject.builder()
                .id("id")
                .archived(true)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .properties(
                    SimplePublicObject.Properties.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .objectWriteTraceId("objectWriteTraceId")
                .propertiesWithHistory(
                    SimplePublicObject.PropertiesWithHistory.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(
                                listOf(
                                    mapOf(
                                        "sourceType" to "sourceType",
                                        "timestamp" to "2019-12-27T18:11:19.117Z",
                                        "value" to "value",
                                        "sourceId" to "sourceId",
                                        "sourceLabel" to "sourceLabel",
                                        "updatedByUserId" to 0,
                                    )
                                )
                            ),
                        )
                        .build()
                )
                .url("url")
                .build()

        val roundtrippedSimplePublicObject =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(simplePublicObject),
                jacksonTypeRef<SimplePublicObject>(),
            )

        assertThat(roundtrippedSimplePublicObject).isEqualTo(simplePublicObject)
    }
}
