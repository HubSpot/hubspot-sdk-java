// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.associations.v4

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AssociationsV4SimplePublicObjectTest {

    @Test
    fun create() {
        val associationsV4SimplePublicObject =
            AssociationsV4SimplePublicObject.builder()
                .id("id")
                .archived(true)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .properties(
                    AssociationsV4SimplePublicObject.Properties.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .objectWriteTraceId("objectWriteTraceId")
                .propertiesWithHistory(
                    AssociationsV4SimplePublicObject.PropertiesWithHistory.builder()
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

        assertThat(associationsV4SimplePublicObject.id()).isEqualTo("id")
        assertThat(associationsV4SimplePublicObject.archived()).isEqualTo(true)
        assertThat(associationsV4SimplePublicObject.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(associationsV4SimplePublicObject.properties())
            .isEqualTo(
                AssociationsV4SimplePublicObject.Properties.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(associationsV4SimplePublicObject.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(associationsV4SimplePublicObject.archivedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(associationsV4SimplePublicObject.objectWriteTraceId())
            .contains("objectWriteTraceId")
        assertThat(associationsV4SimplePublicObject.propertiesWithHistory())
            .contains(
                AssociationsV4SimplePublicObject.PropertiesWithHistory.builder()
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
        val associationsV4SimplePublicObject =
            AssociationsV4SimplePublicObject.builder()
                .id("id")
                .archived(true)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .properties(
                    AssociationsV4SimplePublicObject.Properties.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .objectWriteTraceId("objectWriteTraceId")
                .propertiesWithHistory(
                    AssociationsV4SimplePublicObject.PropertiesWithHistory.builder()
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

        val roundtrippedAssociationsV4SimplePublicObject =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(associationsV4SimplePublicObject),
                jacksonTypeRef<AssociationsV4SimplePublicObject>(),
            )

        assertThat(roundtrippedAssociationsV4SimplePublicObject)
            .isEqualTo(associationsV4SimplePublicObject)
    }
}
