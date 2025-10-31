// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.workflows

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.ForwardPaging
import com.hubspot_sdk.api.models.NextPage
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponseApiFlowListingForwardPagingTest {

    @Test
    fun create() {
        val collectionResponseApiFlowListingForwardPaging =
            CollectionResponseApiFlowListingForwardPaging.builder()
                .addResult(
                    ApiFlowListing.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .flowType("flowType")
                        .isEnabled(true)
                        .objectTypeId("objectTypeId")
                        .revisionId("revisionId")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .name("name")
                        .uuid("uuid")
                        .build()
                )
                .paging(
                    ForwardPaging.builder()
                        .next(NextPage.builder().after("").link("").build())
                        .build()
                )
                .build()

        assertThat(collectionResponseApiFlowListingForwardPaging.results())
            .containsExactly(
                ApiFlowListing.builder()
                    .id("id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .flowType("flowType")
                    .isEnabled(true)
                    .objectTypeId("objectTypeId")
                    .revisionId("revisionId")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .name("name")
                    .uuid("uuid")
                    .build()
            )
        assertThat(collectionResponseApiFlowListingForwardPaging.paging())
            .contains(
                ForwardPaging.builder().next(NextPage.builder().after("").link("").build()).build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionResponseApiFlowListingForwardPaging =
            CollectionResponseApiFlowListingForwardPaging.builder()
                .addResult(
                    ApiFlowListing.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .flowType("flowType")
                        .isEnabled(true)
                        .objectTypeId("objectTypeId")
                        .revisionId("revisionId")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .name("name")
                        .uuid("uuid")
                        .build()
                )
                .paging(
                    ForwardPaging.builder()
                        .next(NextPage.builder().after("").link("").build())
                        .build()
                )
                .build()

        val roundtrippedCollectionResponseApiFlowListingForwardPaging =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(collectionResponseApiFlowListingForwardPaging),
                jacksonTypeRef<CollectionResponseApiFlowListingForwardPaging>(),
            )

        assertThat(roundtrippedCollectionResponseApiFlowListingForwardPaging)
            .isEqualTo(collectionResponseApiFlowListingForwardPaging)
    }
}
