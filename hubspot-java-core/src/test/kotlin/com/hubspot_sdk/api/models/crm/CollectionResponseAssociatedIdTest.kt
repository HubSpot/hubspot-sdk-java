// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.NextPage
import com.hubspot_sdk.api.models.Paging
import com.hubspot_sdk.api.models.PreviousPage
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponseAssociatedIdTest {

    @Test
    fun create() {
        val collectionResponseAssociatedId =
            CollectionResponseAssociatedId.builder()
                .addResult(AssociatedId.builder().id("172859").type("contact_to_company").build())
                .paging(
                    Paging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
                        .prev(PreviousPage.builder().before("before").link("link").build())
                        .build()
                )
                .build()

        assertThat(collectionResponseAssociatedId.results())
            .containsExactly(AssociatedId.builder().id("172859").type("contact_to_company").build())
        assertThat(collectionResponseAssociatedId.paging())
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
        val collectionResponseAssociatedId =
            CollectionResponseAssociatedId.builder()
                .addResult(AssociatedId.builder().id("172859").type("contact_to_company").build())
                .paging(
                    Paging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
                        .prev(PreviousPage.builder().before("before").link("link").build())
                        .build()
                )
                .build()

        val roundtrippedCollectionResponseAssociatedId =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(collectionResponseAssociatedId),
                jacksonTypeRef<CollectionResponseAssociatedId>(),
            )

        assertThat(roundtrippedCollectionResponseAssociatedId)
            .isEqualTo(collectionResponseAssociatedId)
    }
}
