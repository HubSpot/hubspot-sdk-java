// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.events

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponseWithTotalPublicListNoPagingTest {

    @Test
    fun create() {
        val collectionResponseWithTotalPublicListNoPaging =
            CollectionResponseWithTotalPublicListNoPaging.builder()
                .addResult(
                    PublicList.builder()
                        .listId("listId")
                        .listVersion(0)
                        .name("name")
                        .objectTypeId("objectTypeId")
                        .processingStatus("processingStatus")
                        .processingType("processingType")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .createdById("createdById")
                        .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .filtersUpdatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .size(0L)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .updatedById("updatedById")
                        .build()
                )
                .total(0)
                .build()

        assertThat(collectionResponseWithTotalPublicListNoPaging.results())
            .containsExactly(
                PublicList.builder()
                    .listId("listId")
                    .listVersion(0)
                    .name("name")
                    .objectTypeId("objectTypeId")
                    .processingStatus("processingStatus")
                    .processingType("processingType")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .createdById("createdById")
                    .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .filtersUpdatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .size(0L)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .updatedById("updatedById")
                    .build()
            )
        assertThat(collectionResponseWithTotalPublicListNoPaging.total()).isEqualTo(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionResponseWithTotalPublicListNoPaging =
            CollectionResponseWithTotalPublicListNoPaging.builder()
                .addResult(
                    PublicList.builder()
                        .listId("listId")
                        .listVersion(0)
                        .name("name")
                        .objectTypeId("objectTypeId")
                        .processingStatus("processingStatus")
                        .processingType("processingType")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .createdById("createdById")
                        .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .filtersUpdatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .size(0L)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .updatedById("updatedById")
                        .build()
                )
                .total(0)
                .build()

        val roundtrippedCollectionResponseWithTotalPublicListNoPaging =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(collectionResponseWithTotalPublicListNoPaging),
                jacksonTypeRef<CollectionResponseWithTotalPublicListNoPaging>(),
            )

        assertThat(roundtrippedCollectionResponseWithTotalPublicListNoPaging)
            .isEqualTo(collectionResponseWithTotalPublicListNoPaging)
    }
}
