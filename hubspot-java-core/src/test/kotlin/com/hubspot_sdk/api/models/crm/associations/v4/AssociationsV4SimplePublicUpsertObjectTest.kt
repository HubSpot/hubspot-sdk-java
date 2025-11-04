// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.associations.v4

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AssociationsV4SimplePublicUpsertObjectTest {

    @Test
    fun create() {
        val associationsV4SimplePublicUpsertObject =
            AssociationsV4SimplePublicUpsertObject.builder()
                .id("id")
                .archived(true)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .new_(true)
                .properties(
                    AssociationsV4SimplePublicUpsertObject.Properties.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .objectWriteTraceId("objectWriteTraceId")
                .propertiesWithHistory(
                    AssociationsV4SimplePublicUpsertObject.PropertiesWithHistory.builder()
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

        assertThat(associationsV4SimplePublicUpsertObject.id()).isEqualTo("id")
        assertThat(associationsV4SimplePublicUpsertObject.archived()).isEqualTo(true)
        assertThat(associationsV4SimplePublicUpsertObject.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(associationsV4SimplePublicUpsertObject.new_()).isEqualTo(true)
        assertThat(associationsV4SimplePublicUpsertObject.properties())
            .isEqualTo(
                AssociationsV4SimplePublicUpsertObject.Properties.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(associationsV4SimplePublicUpsertObject.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(associationsV4SimplePublicUpsertObject.archivedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(associationsV4SimplePublicUpsertObject.objectWriteTraceId())
            .contains("objectWriteTraceId")
        assertThat(associationsV4SimplePublicUpsertObject.propertiesWithHistory())
            .contains(
                AssociationsV4SimplePublicUpsertObject.PropertiesWithHistory.builder()
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
        val associationsV4SimplePublicUpsertObject =
            AssociationsV4SimplePublicUpsertObject.builder()
                .id("id")
                .archived(true)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .new_(true)
                .properties(
                    AssociationsV4SimplePublicUpsertObject.Properties.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .objectWriteTraceId("objectWriteTraceId")
                .propertiesWithHistory(
                    AssociationsV4SimplePublicUpsertObject.PropertiesWithHistory.builder()
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

        val roundtrippedAssociationsV4SimplePublicUpsertObject =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(associationsV4SimplePublicUpsertObject),
                jacksonTypeRef<AssociationsV4SimplePublicUpsertObject>(),
            )

        assertThat(roundtrippedAssociationsV4SimplePublicUpsertObject)
            .isEqualTo(associationsV4SimplePublicUpsertObject)
    }
}
