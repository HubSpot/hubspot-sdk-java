// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.NextPage
import com.hubspot_sdk.api.models.PreviousPage
import com.hubspot_sdk.api.models.marketing.emails.Paging
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponseSimplePublicObjectWithAssociationsTest {

    @Test
    fun create() {
        val collectionResponseSimplePublicObjectWithAssociations =
            CollectionResponseSimplePublicObjectWithAssociations.builder()
                .addResult(
                    SimplePublicObjectWithAssociations.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .properties(
                            SimplePublicObjectWithAssociations.Properties.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .archived(true)
                        .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .associations(
                            SimplePublicObjectWithAssociations.Associations.builder()
                                .putAdditionalProperty(
                                    "foo",
                                    JsonValue.from(
                                        mapOf(
                                            "results" to
                                                listOf(
                                                    mapOf(
                                                        "id" to "172859",
                                                        "type" to "contact_to_company",
                                                    )
                                                ),
                                            "paging" to
                                                mapOf(
                                                    "next" to mapOf("after" to "", "link" to ""),
                                                    "prev" to
                                                        mapOf(
                                                            "before" to "before",
                                                            "link" to "link",
                                                        ),
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
                        .build()
                )
                .paging(
                    Paging.builder()
                        .next(NextPage.builder().after("").link("").build())
                        .prev(PreviousPage.builder().before("before").link("link").build())
                        .build()
                )
                .build()

        assertThat(collectionResponseSimplePublicObjectWithAssociations.results())
            .containsExactly(
                SimplePublicObjectWithAssociations.builder()
                    .id("id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .properties(
                        SimplePublicObjectWithAssociations.Properties.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .archived(true)
                    .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .associations(
                        SimplePublicObjectWithAssociations.Associations.builder()
                            .putAdditionalProperty(
                                "foo",
                                JsonValue.from(
                                    mapOf(
                                        "results" to
                                            listOf(
                                                mapOf(
                                                    "id" to "172859",
                                                    "type" to "contact_to_company",
                                                )
                                            ),
                                        "paging" to
                                            mapOf(
                                                "next" to mapOf("after" to "", "link" to ""),
                                                "prev" to
                                                    mapOf("before" to "before", "link" to "link"),
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
                    .build()
            )
        assertThat(collectionResponseSimplePublicObjectWithAssociations.paging())
            .contains(
                Paging.builder()
                    .next(NextPage.builder().after("").link("").build())
                    .prev(PreviousPage.builder().before("before").link("link").build())
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionResponseSimplePublicObjectWithAssociations =
            CollectionResponseSimplePublicObjectWithAssociations.builder()
                .addResult(
                    SimplePublicObjectWithAssociations.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .properties(
                            SimplePublicObjectWithAssociations.Properties.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .archived(true)
                        .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .associations(
                            SimplePublicObjectWithAssociations.Associations.builder()
                                .putAdditionalProperty(
                                    "foo",
                                    JsonValue.from(
                                        mapOf(
                                            "results" to
                                                listOf(
                                                    mapOf(
                                                        "id" to "172859",
                                                        "type" to "contact_to_company",
                                                    )
                                                ),
                                            "paging" to
                                                mapOf(
                                                    "next" to mapOf("after" to "", "link" to ""),
                                                    "prev" to
                                                        mapOf(
                                                            "before" to "before",
                                                            "link" to "link",
                                                        ),
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
                        .build()
                )
                .paging(
                    Paging.builder()
                        .next(NextPage.builder().after("").link("").build())
                        .prev(PreviousPage.builder().before("before").link("link").build())
                        .build()
                )
                .build()

        val roundtrippedCollectionResponseSimplePublicObjectWithAssociations =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(collectionResponseSimplePublicObjectWithAssociations),
                jacksonTypeRef<CollectionResponseSimplePublicObjectWithAssociations>(),
            )

        assertThat(roundtrippedCollectionResponseSimplePublicObjectWithAssociations)
            .isEqualTo(collectionResponseSimplePublicObjectWithAssociations)
    }
}
