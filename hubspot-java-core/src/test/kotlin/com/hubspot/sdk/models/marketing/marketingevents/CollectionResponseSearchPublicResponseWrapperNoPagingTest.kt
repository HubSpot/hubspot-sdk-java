// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.marketing.marketingevents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponseSearchPublicResponseWrapperNoPagingTest {

    @Test
    fun create() {
        val collectionResponseSearchPublicResponseWrapperNoPaging =
            CollectionResponseSearchPublicResponseWrapperNoPaging.builder()
                .addResult(
                    SearchPublicResponseWrapper.builder()
                        .appId(0)
                        .externalAccountId("externalAccountId")
                        .externalEventId("externalEventId")
                        .objectId("objectId")
                        .build()
                )
                .build()

        assertThat(collectionResponseSearchPublicResponseWrapperNoPaging.results())
            .containsExactly(
                SearchPublicResponseWrapper.builder()
                    .appId(0)
                    .externalAccountId("externalAccountId")
                    .externalEventId("externalEventId")
                    .objectId("objectId")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionResponseSearchPublicResponseWrapperNoPaging =
            CollectionResponseSearchPublicResponseWrapperNoPaging.builder()
                .addResult(
                    SearchPublicResponseWrapper.builder()
                        .appId(0)
                        .externalAccountId("externalAccountId")
                        .externalEventId("externalEventId")
                        .objectId("objectId")
                        .build()
                )
                .build()

        val roundtrippedCollectionResponseSearchPublicResponseWrapperNoPaging =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(
                    collectionResponseSearchPublicResponseWrapperNoPaging
                ),
                jacksonTypeRef<CollectionResponseSearchPublicResponseWrapperNoPaging>(),
            )

        assertThat(roundtrippedCollectionResponseSearchPublicResponseWrapperNoPaging)
            .isEqualTo(collectionResponseSearchPublicResponseWrapperNoPaging)
    }
}
