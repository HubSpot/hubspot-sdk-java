// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreatedResponseSimplePublicObjectTest {

    @Test
    fun create() {
        val createdResponseSimplePublicObject =
            CreatedResponseSimplePublicObject.builder()
                .createdResourceId("createdResourceId")
                .entity(
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
                )
                .location("location")
                .build()

        assertThat(createdResponseSimplePublicObject.createdResourceId())
            .isEqualTo("createdResourceId")
        assertThat(createdResponseSimplePublicObject.entity())
            .isEqualTo(
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
            )
        assertThat(createdResponseSimplePublicObject.location()).contains("location")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val createdResponseSimplePublicObject =
            CreatedResponseSimplePublicObject.builder()
                .createdResourceId("createdResourceId")
                .entity(
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
                )
                .location("location")
                .build()

        val roundtrippedCreatedResponseSimplePublicObject =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(createdResponseSimplePublicObject),
                jacksonTypeRef<CreatedResponseSimplePublicObject>(),
            )

        assertThat(roundtrippedCreatedResponseSimplePublicObject)
            .isEqualTo(createdResponseSimplePublicObject)
    }
}
