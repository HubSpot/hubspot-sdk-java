// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SimplePublicObjectWithAssociationsTest {

    @Test
    fun create() {
        val simplePublicObjectWithAssociations =
            SimplePublicObjectWithAssociations.builder()
                .id("id")
                .archived(true)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .properties(
                    SimplePublicObjectWithAssociations.Properties.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .associations(
                    SimplePublicObjectWithAssociations.Associations.builder()
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
                                            "next" to mapOf("after" to "after", "link" to "link"),
                                            "prev" to mapOf("before" to "before", "link" to "link"),
                                        ),
                                )
                            ),
                        )
                        .build()
                )
                .objectWriteTraceId("objectWriteTraceId")
                .propertiesWithHistory(
                    SimplePublicObjectWithAssociations.PropertiesWithHistory.builder()
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

        assertThat(simplePublicObjectWithAssociations.id()).isEqualTo("id")
        assertThat(simplePublicObjectWithAssociations.archived()).isEqualTo(true)
        assertThat(simplePublicObjectWithAssociations.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(simplePublicObjectWithAssociations.properties())
            .isEqualTo(
                SimplePublicObjectWithAssociations.Properties.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(simplePublicObjectWithAssociations.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(simplePublicObjectWithAssociations.archivedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(simplePublicObjectWithAssociations.associations())
            .contains(
                SimplePublicObjectWithAssociations.Associations.builder()
                    .putAdditionalProperty(
                        "foo",
                        JsonValue.from(
                            mapOf(
                                "results" to
                                    listOf(mapOf("id" to "172859", "type" to "contact_to_company")),
                                "paging" to
                                    mapOf(
                                        "next" to mapOf("after" to "after", "link" to "link"),
                                        "prev" to mapOf("before" to "before", "link" to "link"),
                                    ),
                            )
                        ),
                    )
                    .build()
            )
        assertThat(simplePublicObjectWithAssociations.objectWriteTraceId())
            .contains("objectWriteTraceId")
        assertThat(simplePublicObjectWithAssociations.propertiesWithHistory())
            .contains(
                SimplePublicObjectWithAssociations.PropertiesWithHistory.builder()
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
        assertThat(simplePublicObjectWithAssociations.url()).contains("url")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val simplePublicObjectWithAssociations =
            SimplePublicObjectWithAssociations.builder()
                .id("id")
                .archived(true)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .properties(
                    SimplePublicObjectWithAssociations.Properties.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .associations(
                    SimplePublicObjectWithAssociations.Associations.builder()
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
                                            "next" to mapOf("after" to "after", "link" to "link"),
                                            "prev" to mapOf("before" to "before", "link" to "link"),
                                        ),
                                )
                            ),
                        )
                        .build()
                )
                .objectWriteTraceId("objectWriteTraceId")
                .propertiesWithHistory(
                    SimplePublicObjectWithAssociations.PropertiesWithHistory.builder()
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

        val roundtrippedSimplePublicObjectWithAssociations =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(simplePublicObjectWithAssociations),
                jacksonTypeRef<SimplePublicObjectWithAssociations>(),
            )

        assertThat(roundtrippedSimplePublicObjectWithAssociations)
            .isEqualTo(simplePublicObjectWithAssociations)
    }
}
