// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SimplePublicUpsertObjectTest {

    @Test
    fun create() {
        val simplePublicUpsertObject =
            SimplePublicUpsertObject.builder()
                .id("id")
                .archived(true)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .new_(true)
                .properties(
                    SimplePublicUpsertObject.Properties.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .objectWriteTraceId("objectWriteTraceId")
                .propertiesWithHistory(
                    SimplePublicUpsertObject.PropertiesWithHistory.builder()
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

        assertThat(simplePublicUpsertObject.id()).isEqualTo("id")
        assertThat(simplePublicUpsertObject.archived()).isEqualTo(true)
        assertThat(simplePublicUpsertObject.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(simplePublicUpsertObject.new_()).isEqualTo(true)
        assertThat(simplePublicUpsertObject.properties())
            .isEqualTo(
                SimplePublicUpsertObject.Properties.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(simplePublicUpsertObject.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(simplePublicUpsertObject.archivedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(simplePublicUpsertObject.objectWriteTraceId()).contains("objectWriteTraceId")
        assertThat(simplePublicUpsertObject.propertiesWithHistory())
            .contains(
                SimplePublicUpsertObject.PropertiesWithHistory.builder()
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
        assertThat(simplePublicUpsertObject.url()).contains("url")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val simplePublicUpsertObject =
            SimplePublicUpsertObject.builder()
                .id("id")
                .archived(true)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .new_(true)
                .properties(
                    SimplePublicUpsertObject.Properties.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .objectWriteTraceId("objectWriteTraceId")
                .propertiesWithHistory(
                    SimplePublicUpsertObject.PropertiesWithHistory.builder()
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

        val roundtrippedSimplePublicUpsertObject =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(simplePublicUpsertObject),
                jacksonTypeRef<SimplePublicUpsertObject>(),
            )

        assertThat(roundtrippedSimplePublicUpsertObject).isEqualTo(simplePublicUpsertObject)
    }
}
