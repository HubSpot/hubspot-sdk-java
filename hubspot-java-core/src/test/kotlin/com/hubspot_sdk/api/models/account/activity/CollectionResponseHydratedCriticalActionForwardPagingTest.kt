// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.account.activity

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.ForwardPaging
import com.hubspot_sdk.api.models.NextPage
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponseHydratedCriticalActionForwardPagingTest {

    @Test
    fun create() {
        val collectionResponseHydratedCriticalActionForwardPaging =
            CollectionResponseHydratedCriticalActionForwardPaging.builder()
                .addResult(
                    HydratedCriticalAction.builder()
                        .id("5432653")
                        .createdAt(OffsetDateTime.parse("2022-04-01T19:36:24.303Z"))
                        .type("ADD_USER")
                        .userId(876)
                        .actingUser("person3@testdomain.com")
                        .countryCode("ie")
                        .infoUrl("app.hubspot.com/settings/123/users")
                        .ipAddress("45.56.67.89")
                        .location("location")
                        .objectId("7654")
                        .regionCode("d")
                        .build()
                )
                .paging(
                    ForwardPaging.builder()
                        .next(NextPage.builder().after("").link("").build())
                        .build()
                )
                .build()

        assertThat(collectionResponseHydratedCriticalActionForwardPaging.results())
            .containsExactly(
                HydratedCriticalAction.builder()
                    .id("5432653")
                    .createdAt(OffsetDateTime.parse("2022-04-01T19:36:24.303Z"))
                    .type("ADD_USER")
                    .userId(876)
                    .actingUser("person3@testdomain.com")
                    .countryCode("ie")
                    .infoUrl("app.hubspot.com/settings/123/users")
                    .ipAddress("45.56.67.89")
                    .location("location")
                    .objectId("7654")
                    .regionCode("d")
                    .build()
            )
        assertThat(collectionResponseHydratedCriticalActionForwardPaging.paging())
            .contains(
                ForwardPaging.builder().next(NextPage.builder().after("").link("").build()).build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionResponseHydratedCriticalActionForwardPaging =
            CollectionResponseHydratedCriticalActionForwardPaging.builder()
                .addResult(
                    HydratedCriticalAction.builder()
                        .id("5432653")
                        .createdAt(OffsetDateTime.parse("2022-04-01T19:36:24.303Z"))
                        .type("ADD_USER")
                        .userId(876)
                        .actingUser("person3@testdomain.com")
                        .countryCode("ie")
                        .infoUrl("app.hubspot.com/settings/123/users")
                        .ipAddress("45.56.67.89")
                        .location("location")
                        .objectId("7654")
                        .regionCode("d")
                        .build()
                )
                .paging(
                    ForwardPaging.builder()
                        .next(NextPage.builder().after("").link("").build())
                        .build()
                )
                .build()

        val roundtrippedCollectionResponseHydratedCriticalActionForwardPaging =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(
                    collectionResponseHydratedCriticalActionForwardPaging
                ),
                jacksonTypeRef<CollectionResponseHydratedCriticalActionForwardPaging>(),
            )

        assertThat(roundtrippedCollectionResponseHydratedCriticalActionForwardPaging)
            .isEqualTo(collectionResponseHydratedCriticalActionForwardPaging)
    }
}
