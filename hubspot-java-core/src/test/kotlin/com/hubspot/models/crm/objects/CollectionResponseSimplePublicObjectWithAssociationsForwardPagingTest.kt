// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.objects

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.JsonValue
import com.hubspot.core.jsonMapper
import com.hubspot.models.ForwardPaging
import com.hubspot.models.NextPage
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponseSimplePublicObjectWithAssociationsForwardPagingTest {

    @Test
    fun create() {
        val collectionResponseSimplePublicObjectWithAssociationsForwardPaging =
            CollectionResponseSimplePublicObjectWithAssociationsForwardPaging.builder()
                .addResult(
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
                                                    mapOf("id" to "id", "type" to "deal_to_contact")
                                                ),
                                            "paging" to
                                                mapOf(
                                                    "next" to
                                                        mapOf("after" to "after", "link" to "link"),
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
                        .url("url")
                        .build()
                )
                .paging(
                    ForwardPaging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
                        .build()
                )
                .build()

        assertThat(collectionResponseSimplePublicObjectWithAssociationsForwardPaging.results())
            .containsExactly(
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
                                                mapOf("id" to "id", "type" to "deal_to_contact")
                                            ),
                                        "paging" to
                                            mapOf(
                                                "next" to
                                                    mapOf("after" to "after", "link" to "link"),
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
                    .url("url")
                    .build()
            )
        assertThat(collectionResponseSimplePublicObjectWithAssociationsForwardPaging.paging())
            .contains(
                ForwardPaging.builder()
                    .next(NextPage.builder().after("after").link("link").build())
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionResponseSimplePublicObjectWithAssociationsForwardPaging =
            CollectionResponseSimplePublicObjectWithAssociationsForwardPaging.builder()
                .addResult(
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
                                                    mapOf("id" to "id", "type" to "deal_to_contact")
                                                ),
                                            "paging" to
                                                mapOf(
                                                    "next" to
                                                        mapOf("after" to "after", "link" to "link"),
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
                        .url("url")
                        .build()
                )
                .paging(
                    ForwardPaging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
                        .build()
                )
                .build()

        val roundtrippedCollectionResponseSimplePublicObjectWithAssociationsForwardPaging =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(
                    collectionResponseSimplePublicObjectWithAssociationsForwardPaging
                ),
                jacksonTypeRef<CollectionResponseSimplePublicObjectWithAssociationsForwardPaging>(),
            )

        assertThat(roundtrippedCollectionResponseSimplePublicObjectWithAssociationsForwardPaging)
            .isEqualTo(collectionResponseSimplePublicObjectWithAssociationsForwardPaging)
    }
}
