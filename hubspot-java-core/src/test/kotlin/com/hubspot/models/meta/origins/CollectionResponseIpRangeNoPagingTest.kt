// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.meta.origins

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponseIpRangeNoPagingTest {

    @Test
    fun create() {
        val collectionResponseIpRangeNoPaging =
            CollectionResponseIpRangeNoPaging.builder()
                .addResult(
                    IpRange.builder()
                        .cidr("cidr")
                        .description("description")
                        .direction(IpRange.Direction.EGRESS)
                        .service(IpRange.Service.API)
                        .build()
                )
                .build()

        assertThat(collectionResponseIpRangeNoPaging.results())
            .containsExactly(
                IpRange.builder()
                    .cidr("cidr")
                    .description("description")
                    .direction(IpRange.Direction.EGRESS)
                    .service(IpRange.Service.API)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionResponseIpRangeNoPaging =
            CollectionResponseIpRangeNoPaging.builder()
                .addResult(
                    IpRange.builder()
                        .cidr("cidr")
                        .description("description")
                        .direction(IpRange.Direction.EGRESS)
                        .service(IpRange.Service.API)
                        .build()
                )
                .build()

        val roundtrippedCollectionResponseIpRangeNoPaging =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(collectionResponseIpRangeNoPaging),
                jacksonTypeRef<CollectionResponseIpRangeNoPaging>(),
            )

        assertThat(roundtrippedCollectionResponseIpRangeNoPaging)
            .isEqualTo(collectionResponseIpRangeNoPaging)
    }
}
