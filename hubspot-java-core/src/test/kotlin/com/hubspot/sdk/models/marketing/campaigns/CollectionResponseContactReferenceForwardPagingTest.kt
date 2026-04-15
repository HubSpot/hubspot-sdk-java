// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.marketing.campaigns

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import com.hubspot.sdk.models.ForwardPaging
import com.hubspot.sdk.models.NextPage
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponseContactReferenceForwardPagingTest {

    @Test
    fun create() {
        val collectionResponseContactReferenceForwardPaging =
            CollectionResponseContactReferenceForwardPaging.builder()
                .addResult(ContactReference.builder().id("id").build())
                .paging(
                    ForwardPaging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
                        .build()
                )
                .build()

        assertThat(collectionResponseContactReferenceForwardPaging.results())
            .containsExactly(ContactReference.builder().id("id").build())
        assertThat(collectionResponseContactReferenceForwardPaging.paging())
            .contains(
                ForwardPaging.builder()
                    .next(NextPage.builder().after("after").link("link").build())
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionResponseContactReferenceForwardPaging =
            CollectionResponseContactReferenceForwardPaging.builder()
                .addResult(ContactReference.builder().id("id").build())
                .paging(
                    ForwardPaging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
                        .build()
                )
                .build()

        val roundtrippedCollectionResponseContactReferenceForwardPaging =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(collectionResponseContactReferenceForwardPaging),
                jacksonTypeRef<CollectionResponseContactReferenceForwardPaging>(),
            )

        assertThat(roundtrippedCollectionResponseContactReferenceForwardPaging)
            .isEqualTo(collectionResponseContactReferenceForwardPaging)
    }
}
