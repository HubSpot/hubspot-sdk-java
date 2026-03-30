// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.hubdb

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.NextPage
import com.hubspot_sdk.api.models.Paging
import com.hubspot_sdk.api.models.PreviousPage
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StreamingCollectionResponseWithTotalHubDbTableRowV3Test {

    @Test
    fun create() {
        val streamingCollectionResponseWithTotalHubDbTableRowV3 =
            StreamingCollectionResponseWithTotalHubDbTableRowV3.builder()
                .addResult(HubDbTableRowV3Wrapper.builder().build())
                .total(0)
                .type(StreamingCollectionResponseWithTotalHubDbTableRowV3.Type.STREAMING)
                .paging(
                    Paging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
                        .prev(PreviousPage.builder().before("before").link("link").build())
                        .build()
                )
                .build()

        assertThat(streamingCollectionResponseWithTotalHubDbTableRowV3.results())
            .containsExactly(HubDbTableRowV3Wrapper.builder().build())
        assertThat(streamingCollectionResponseWithTotalHubDbTableRowV3.total()).isEqualTo(0)
        assertThat(streamingCollectionResponseWithTotalHubDbTableRowV3.type())
            .isEqualTo(StreamingCollectionResponseWithTotalHubDbTableRowV3.Type.STREAMING)
        assertThat(streamingCollectionResponseWithTotalHubDbTableRowV3.paging())
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
        val streamingCollectionResponseWithTotalHubDbTableRowV3 =
            StreamingCollectionResponseWithTotalHubDbTableRowV3.builder()
                .addResult(HubDbTableRowV3Wrapper.builder().build())
                .total(0)
                .type(StreamingCollectionResponseWithTotalHubDbTableRowV3.Type.STREAMING)
                .paging(
                    Paging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
                        .prev(PreviousPage.builder().before("before").link("link").build())
                        .build()
                )
                .build()

        val roundtrippedStreamingCollectionResponseWithTotalHubDbTableRowV3 =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(streamingCollectionResponseWithTotalHubDbTableRowV3),
                jacksonTypeRef<StreamingCollectionResponseWithTotalHubDbTableRowV3>(),
            )

        assertThat(roundtrippedStreamingCollectionResponseWithTotalHubDbTableRowV3)
            .isEqualTo(streamingCollectionResponseWithTotalHubDbTableRowV3)
    }
}
