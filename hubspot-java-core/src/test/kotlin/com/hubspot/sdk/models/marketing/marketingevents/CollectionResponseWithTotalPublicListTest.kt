// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.marketing.marketingevents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import com.hubspot.sdk.models.NextPage
import com.hubspot.sdk.models.Paging
import com.hubspot.sdk.models.PreviousPage
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponseWithTotalPublicListTest {

    @Test
    fun create() {
        val collectionResponseWithTotalPublicList =
            CollectionResponseWithTotalPublicList.builder()
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
                .paging(
                    Paging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
                        .prev(PreviousPage.builder().before("before").link("link").build())
                        .build()
                )
                .build()

        assertThat(collectionResponseWithTotalPublicList.results())
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
        assertThat(collectionResponseWithTotalPublicList.total()).isEqualTo(0)
        assertThat(collectionResponseWithTotalPublicList.paging())
            .contains(
                Paging.builder()
                    .next(NextPage.builder().after("after").link("link").build())
                    .prev(PreviousPage.builder().before("before").link("link").build())
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionResponseWithTotalPublicList =
            CollectionResponseWithTotalPublicList.builder()
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
                .paging(
                    Paging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
                        .prev(PreviousPage.builder().before("before").link("link").build())
                        .build()
                )
                .build()

        val roundtrippedCollectionResponseWithTotalPublicList =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(collectionResponseWithTotalPublicList),
                jacksonTypeRef<CollectionResponseWithTotalPublicList>(),
            )

        assertThat(roundtrippedCollectionResponseWithTotalPublicList)
            .isEqualTo(collectionResponseWithTotalPublicList)
    }
}
