// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.account.activity

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import com.hubspot.models.ForwardPaging
import com.hubspot.models.NextPage
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponsePublicApiUserActionEventForwardPagingTest {

    @Test
    fun create() {
        val collectionResponsePublicApiUserActionEventForwardPaging =
            CollectionResponsePublicApiUserActionEventForwardPaging.builder()
                .addResult(
                    PublicApiUserActionEvent.builder()
                        .id("id")
                        .actingUser(ActingUser.builder().userId(0).userEmail("userEmail").build())
                        .action("action")
                        .category("category")
                        .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .subCategory("subCategory")
                        .targetObjectId("targetObjectId")
                        .build()
                )
                .paging(
                    ForwardPaging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
                        .build()
                )
                .build()

        assertThat(collectionResponsePublicApiUserActionEventForwardPaging.results())
            .containsExactly(
                PublicApiUserActionEvent.builder()
                    .id("id")
                    .actingUser(ActingUser.builder().userId(0).userEmail("userEmail").build())
                    .action("action")
                    .category("category")
                    .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .subCategory("subCategory")
                    .targetObjectId("targetObjectId")
                    .build()
            )
        assertThat(collectionResponsePublicApiUserActionEventForwardPaging.paging())
            .contains(
                ForwardPaging.builder()
                    .next(NextPage.builder().after("after").link("link").build())
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionResponsePublicApiUserActionEventForwardPaging =
            CollectionResponsePublicApiUserActionEventForwardPaging.builder()
                .addResult(
                    PublicApiUserActionEvent.builder()
                        .id("id")
                        .actingUser(ActingUser.builder().userId(0).userEmail("userEmail").build())
                        .action("action")
                        .category("category")
                        .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .subCategory("subCategory")
                        .targetObjectId("targetObjectId")
                        .build()
                )
                .paging(
                    ForwardPaging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
                        .build()
                )
                .build()

        val roundtrippedCollectionResponsePublicApiUserActionEventForwardPaging =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(
                    collectionResponsePublicApiUserActionEventForwardPaging
                ),
                jacksonTypeRef<CollectionResponsePublicApiUserActionEventForwardPaging>(),
            )

        assertThat(roundtrippedCollectionResponsePublicApiUserActionEventForwardPaging)
            .isEqualTo(collectionResponsePublicApiUserActionEventForwardPaging)
    }
}
