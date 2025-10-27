// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.account.activity

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.ForwardPaging
import com.hubspot_sdk.api.models.NextPage
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
                        .id("5432653")
                        .actingUser(
                            ActingUser.builder()
                                .userId(2931299)
                                .userEmail("pgibbons@initech.com")
                                .build()
                        )
                        .action("PERFORM")
                        .category("LOGIN")
                        .occurredAt(OffsetDateTime.parse("2025-01-09T16:05:32.387+00:00"))
                        .subCategory("LOGIN_SUCCEEDED")
                        .targetObjectId("1")
                        .build()
                )
                .paging(
                    ForwardPaging.builder()
                        .next(NextPage.builder().after("").link("").build())
                        .build()
                )
                .build()

        assertThat(collectionResponsePublicApiUserActionEventForwardPaging.results())
            .containsExactly(
                PublicApiUserActionEvent.builder()
                    .id("5432653")
                    .actingUser(
                        ActingUser.builder()
                            .userId(2931299)
                            .userEmail("pgibbons@initech.com")
                            .build()
                    )
                    .action("PERFORM")
                    .category("LOGIN")
                    .occurredAt(OffsetDateTime.parse("2025-01-09T16:05:32.387+00:00"))
                    .subCategory("LOGIN_SUCCEEDED")
                    .targetObjectId("1")
                    .build()
            )
        assertThat(collectionResponsePublicApiUserActionEventForwardPaging.paging())
            .contains(
                ForwardPaging.builder().next(NextPage.builder().after("").link("").build()).build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionResponsePublicApiUserActionEventForwardPaging =
            CollectionResponsePublicApiUserActionEventForwardPaging.builder()
                .addResult(
                    PublicApiUserActionEvent.builder()
                        .id("5432653")
                        .actingUser(
                            ActingUser.builder()
                                .userId(2931299)
                                .userEmail("pgibbons@initech.com")
                                .build()
                        )
                        .action("PERFORM")
                        .category("LOGIN")
                        .occurredAt(OffsetDateTime.parse("2025-01-09T16:05:32.387+00:00"))
                        .subCategory("LOGIN_SUCCEEDED")
                        .targetObjectId("1")
                        .build()
                )
                .paging(
                    ForwardPaging.builder()
                        .next(NextPage.builder().after("").link("").build())
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
