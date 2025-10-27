// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.sequences

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.ForwardPaging
import com.hubspot_sdk.api.models.NextPage
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponseWithTotalPublicSequenceLiteResponseForwardPagingTest {

    @Test
    fun create() {
        val collectionResponseWithTotalPublicSequenceLiteResponseForwardPaging =
            CollectionResponseWithTotalPublicSequenceLiteResponseForwardPaging.builder()
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
                    ForwardPaging.builder()
                        .next(NextPage.builder().after("").link("").build())
                        .build()
                )
                .build()

        assertThat(collectionResponseWithTotalPublicSequenceLiteResponseForwardPaging.results())
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
        assertThat(collectionResponseWithTotalPublicSequenceLiteResponseForwardPaging.total())
            .isEqualTo(0)
        assertThat(collectionResponseWithTotalPublicSequenceLiteResponseForwardPaging.paging())
            .contains(
                ForwardPaging.builder().next(NextPage.builder().after("").link("").build()).build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionResponseWithTotalPublicSequenceLiteResponseForwardPaging =
            CollectionResponseWithTotalPublicSequenceLiteResponseForwardPaging.builder()
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
                    ForwardPaging.builder()
                        .next(NextPage.builder().after("").link("").build())
                        .build()
                )
                .build()

        val roundtrippedCollectionResponseWithTotalPublicSequenceLiteResponseForwardPaging =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(
                    collectionResponseWithTotalPublicSequenceLiteResponseForwardPaging
                ),
                jacksonTypeRef<CollectionResponseWithTotalPublicSequenceLiteResponseForwardPaging>(),
            )

        assertThat(roundtrippedCollectionResponseWithTotalPublicSequenceLiteResponseForwardPaging)
            .isEqualTo(collectionResponseWithTotalPublicSequenceLiteResponseForwardPaging)
    }
}
