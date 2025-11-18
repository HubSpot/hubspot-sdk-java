// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objects.dealsplits

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ObjectsDealSplitsSimplePublicObjectTest {

    @Test
    fun create() {
        val objectsDealSplitsSimplePublicObject =
            ObjectsDealSplitsSimplePublicObject.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .properties(
                    ObjectsDealSplitsSimplePublicObject.Properties.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .archived(true)
                .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .propertiesWithHistory(
                    ObjectsDealSplitsSimplePublicObject.PropertiesWithHistory.builder()
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
                .build()

        assertThat(objectsDealSplitsSimplePublicObject.id()).isEqualTo("id")
        assertThat(objectsDealSplitsSimplePublicObject.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(objectsDealSplitsSimplePublicObject.properties())
            .isEqualTo(
                ObjectsDealSplitsSimplePublicObject.Properties.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(objectsDealSplitsSimplePublicObject.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(objectsDealSplitsSimplePublicObject.archived()).contains(true)
        assertThat(objectsDealSplitsSimplePublicObject.archivedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(objectsDealSplitsSimplePublicObject.propertiesWithHistory())
            .contains(
                ObjectsDealSplitsSimplePublicObject.PropertiesWithHistory.builder()
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
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val objectsDealSplitsSimplePublicObject =
            ObjectsDealSplitsSimplePublicObject.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .properties(
                    ObjectsDealSplitsSimplePublicObject.Properties.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .archived(true)
                .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .propertiesWithHistory(
                    ObjectsDealSplitsSimplePublicObject.PropertiesWithHistory.builder()
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
                .build()

        val roundtrippedObjectsDealSplitsSimplePublicObject =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(objectsDealSplitsSimplePublicObject),
                jacksonTypeRef<ObjectsDealSplitsSimplePublicObject>(),
            )

        assertThat(roundtrippedObjectsDealSplitsSimplePublicObject)
            .isEqualTo(objectsDealSplitsSimplePublicObject)
    }
}
