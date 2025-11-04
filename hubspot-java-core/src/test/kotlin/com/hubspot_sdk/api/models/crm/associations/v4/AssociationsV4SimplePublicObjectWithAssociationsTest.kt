// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.associations.v4

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AssociationsV4SimplePublicObjectWithAssociationsTest {

    @Test
    fun create() {
        val associationsV4SimplePublicObjectWithAssociations =
            AssociationsV4SimplePublicObjectWithAssociations.builder()
                .id("id")
                .archived(true)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .properties(
                    AssociationsV4SimplePublicObjectWithAssociations.Properties.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .associations(
                    AssociationsV4SimplePublicObjectWithAssociations.Associations.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(
                                mapOf(
                                    "results" to
                                        listOf(
                                            mapOf("id" to "172859", "type" to "contact_to_company")
                                        ),
                                    "paging" to
                                        mapOf(
                                            "next" to mapOf("after" to "", "link" to ""),
                                            "prev" to mapOf("before" to "before", "link" to "link"),
                                        ),
                                )
                            ),
                        )
                        .build()
                )
                .objectWriteTraceId("objectWriteTraceId")
                .propertiesWithHistory(
                    AssociationsV4SimplePublicObjectWithAssociations.PropertiesWithHistory.builder()
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

        assertThat(associationsV4SimplePublicObjectWithAssociations.id()).isEqualTo("id")
        assertThat(associationsV4SimplePublicObjectWithAssociations.archived()).isEqualTo(true)
        assertThat(associationsV4SimplePublicObjectWithAssociations.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(associationsV4SimplePublicObjectWithAssociations.properties())
            .isEqualTo(
                AssociationsV4SimplePublicObjectWithAssociations.Properties.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(associationsV4SimplePublicObjectWithAssociations.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(associationsV4SimplePublicObjectWithAssociations.archivedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(associationsV4SimplePublicObjectWithAssociations.associations())
            .contains(
                AssociationsV4SimplePublicObjectWithAssociations.Associations.builder()
                    .putAdditionalProperty(
                        "foo",
                        JsonValue.from(
                            mapOf(
                                "results" to
                                    listOf(mapOf("id" to "172859", "type" to "contact_to_company")),
                                "paging" to
                                    mapOf(
                                        "next" to mapOf("after" to "", "link" to ""),
                                        "prev" to mapOf("before" to "before", "link" to "link"),
                                    ),
                            )
                        ),
                    )
                    .build()
            )
        assertThat(associationsV4SimplePublicObjectWithAssociations.objectWriteTraceId())
            .contains("objectWriteTraceId")
        assertThat(associationsV4SimplePublicObjectWithAssociations.propertiesWithHistory())
            .contains(
                AssociationsV4SimplePublicObjectWithAssociations.PropertiesWithHistory.builder()
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
        val associationsV4SimplePublicObjectWithAssociations =
            AssociationsV4SimplePublicObjectWithAssociations.builder()
                .id("id")
                .archived(true)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .properties(
                    AssociationsV4SimplePublicObjectWithAssociations.Properties.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .associations(
                    AssociationsV4SimplePublicObjectWithAssociations.Associations.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(
                                mapOf(
                                    "results" to
                                        listOf(
                                            mapOf("id" to "172859", "type" to "contact_to_company")
                                        ),
                                    "paging" to
                                        mapOf(
                                            "next" to mapOf("after" to "", "link" to ""),
                                            "prev" to mapOf("before" to "before", "link" to "link"),
                                        ),
                                )
                            ),
                        )
                        .build()
                )
                .objectWriteTraceId("objectWriteTraceId")
                .propertiesWithHistory(
                    AssociationsV4SimplePublicObjectWithAssociations.PropertiesWithHistory.builder()
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

        val roundtrippedAssociationsV4SimplePublicObjectWithAssociations =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(associationsV4SimplePublicObjectWithAssociations),
                jacksonTypeRef<AssociationsV4SimplePublicObjectWithAssociations>(),
            )

        assertThat(roundtrippedAssociationsV4SimplePublicObjectWithAssociations)
            .isEqualTo(associationsV4SimplePublicObjectWithAssociations)
    }
}
