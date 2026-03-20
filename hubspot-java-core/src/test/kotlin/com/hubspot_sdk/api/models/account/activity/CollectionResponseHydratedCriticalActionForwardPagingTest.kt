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
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .type(HydratedCriticalAction.Type.ACCEPTANCE_TEST)
                        .userId(0)
                        .actingUser("actingUser")
                        .countryCode("countryCode")
                        .infoUrl("infoUrl")
                        .ipAddress("ipAddress")
                        .location("location")
                        .objectId("objectId")
                        .regionCode("regionCode")
                        .build()
                )
                .paging(
                    ForwardPaging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
                        .build()
                )
                .build()

        assertThat(collectionResponseHydratedCriticalActionForwardPaging.results())
            .containsExactly(
                HydratedCriticalAction.builder()
                    .id("id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .type(HydratedCriticalAction.Type.ACCEPTANCE_TEST)
                    .userId(0)
                    .actingUser("actingUser")
                    .countryCode("countryCode")
                    .infoUrl("infoUrl")
                    .ipAddress("ipAddress")
                    .location("location")
                    .objectId("objectId")
                    .regionCode("regionCode")
                    .build()
            )
        assertThat(collectionResponseHydratedCriticalActionForwardPaging.paging())
            .contains(
                ForwardPaging.builder()
                    .next(NextPage.builder().after("after").link("link").build())
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionResponseHydratedCriticalActionForwardPaging =
            CollectionResponseHydratedCriticalActionForwardPaging.builder()
                .addResult(
                    HydratedCriticalAction.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .type(HydratedCriticalAction.Type.ACCEPTANCE_TEST)
                        .userId(0)
                        .actingUser("actingUser")
                        .countryCode("countryCode")
                        .infoUrl("infoUrl")
                        .ipAddress("ipAddress")
                        .location("location")
                        .objectId("objectId")
                        .regionCode("regionCode")
                        .build()
                )
                .paging(
                    ForwardPaging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
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
