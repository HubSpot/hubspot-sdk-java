// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.automation.sequences

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import com.hubspot.models.NextPage
import com.hubspot.models.Paging
import com.hubspot.models.PreviousPage
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponseWithTotalPublicSequenceLiteResponseTest {

    @Test
    fun create() {
        val collectionResponseWithTotalPublicSequenceLiteResponse =
            CollectionResponseWithTotalPublicSequenceLiteResponse.builder()
                .addResult(
                    PublicSequenceLiteResponse.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .name("name")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .userId("userId")
                        .folderId("folderId")
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

        assertThat(collectionResponseWithTotalPublicSequenceLiteResponse.results())
            .containsExactly(
                PublicSequenceLiteResponse.builder()
                    .id("id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .name("name")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .userId("userId")
                    .folderId("folderId")
                    .build()
            )
        assertThat(collectionResponseWithTotalPublicSequenceLiteResponse.total()).isEqualTo(0)
        assertThat(collectionResponseWithTotalPublicSequenceLiteResponse.paging())
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
        val collectionResponseWithTotalPublicSequenceLiteResponse =
            CollectionResponseWithTotalPublicSequenceLiteResponse.builder()
                .addResult(
                    PublicSequenceLiteResponse.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .name("name")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .userId("userId")
                        .folderId("folderId")
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

        val roundtrippedCollectionResponseWithTotalPublicSequenceLiteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(
                    collectionResponseWithTotalPublicSequenceLiteResponse
                ),
                jacksonTypeRef<CollectionResponseWithTotalPublicSequenceLiteResponse>(),
            )

        assertThat(roundtrippedCollectionResponseWithTotalPublicSequenceLiteResponse)
            .isEqualTo(collectionResponseWithTotalPublicSequenceLiteResponse)
    }
}
