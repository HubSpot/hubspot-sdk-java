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
                        .id("101")
                        .createdAt(OffsetDateTime.parse("2024-01-08T17:00:52.832+00:00"))
                        .flowType("flowType")
                        .isEnabled(false)
                        .objectTypeId("0-1")
                        .revisionId("revisionId")
                        .updatedAt(OffsetDateTime.parse("2024-02-26T19:59:04.618+00:00"))
                        .name("My example workfow")
                        .uuid("my-test-workflow-01")
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
                    .id("101")
                    .createdAt(OffsetDateTime.parse("2024-01-08T17:00:52.832+00:00"))
                    .flowType("flowType")
                    .isEnabled(false)
                    .objectTypeId("0-1")
                    .revisionId("revisionId")
                    .updatedAt(OffsetDateTime.parse("2024-02-26T19:59:04.618+00:00"))
                    .name("My example workfow")
                    .uuid("my-test-workflow-01")
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
                        .id("101")
                        .createdAt(OffsetDateTime.parse("2024-01-08T17:00:52.832+00:00"))
                        .flowType("flowType")
                        .isEnabled(false)
                        .objectTypeId("0-1")
                        .revisionId("revisionId")
                        .updatedAt(OffsetDateTime.parse("2024-02-26T19:59:04.618+00:00"))
                        .name("My example workfow")
                        .uuid("my-test-workflow-01")
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
