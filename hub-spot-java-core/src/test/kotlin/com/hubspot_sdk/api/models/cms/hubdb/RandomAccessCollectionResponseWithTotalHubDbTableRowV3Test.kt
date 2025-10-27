// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.hubdb

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.HubDbTableRowV3Wrapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RandomAccessCollectionResponseWithTotalHubDbTableRowV3Test {

    @Test
    fun create() {
        val randomAccessCollectionResponseWithTotalHubDbTableRowV3 =
            RandomAccessCollectionResponseWithTotalHubDbTableRowV3.builder()
                .addResult(HubDbTableRowV3Wrapper.builder().build())
                .total(0)
                .type(RandomAccessCollectionResponseWithTotalHubDbTableRowV3.Type.RANDOM_ACCESS)
                .paging(
                    BoundedPaging.builder()
                        .next(BoundedNextPage.builder().offset(0).link("link").build())
                        .build()
                )
                .build()

        assertThat(randomAccessCollectionResponseWithTotalHubDbTableRowV3.results())
            .containsExactly(HubDbTableRowV3Wrapper.builder().build())
        assertThat(randomAccessCollectionResponseWithTotalHubDbTableRowV3.total()).isEqualTo(0)
        assertThat(randomAccessCollectionResponseWithTotalHubDbTableRowV3.type())
            .isEqualTo(RandomAccessCollectionResponseWithTotalHubDbTableRowV3.Type.RANDOM_ACCESS)
        assertThat(randomAccessCollectionResponseWithTotalHubDbTableRowV3.paging())
            .contains(
                BoundedPaging.builder()
                    .next(BoundedNextPage.builder().offset(0).link("link").build())
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val randomAccessCollectionResponseWithTotalHubDbTableRowV3 =
            RandomAccessCollectionResponseWithTotalHubDbTableRowV3.builder()
                .addResult(HubDbTableRowV3Wrapper.builder().build())
                .total(0)
                .type(RandomAccessCollectionResponseWithTotalHubDbTableRowV3.Type.RANDOM_ACCESS)
                .paging(
                    BoundedPaging.builder()
                        .next(BoundedNextPage.builder().offset(0).link("link").build())
                        .build()
                )
                .build()

        val roundtrippedRandomAccessCollectionResponseWithTotalHubDbTableRowV3 =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(
                    randomAccessCollectionResponseWithTotalHubDbTableRowV3
                ),
                jacksonTypeRef<RandomAccessCollectionResponseWithTotalHubDbTableRowV3>(),
            )

        assertThat(roundtrippedRandomAccessCollectionResponseWithTotalHubDbTableRowV3)
            .isEqualTo(randomAccessCollectionResponseWithTotalHubDbTableRowV3)
    }
}
