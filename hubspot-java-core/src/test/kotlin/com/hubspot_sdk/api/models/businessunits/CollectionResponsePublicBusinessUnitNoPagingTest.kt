// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.businessunits

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.marketing.campaigns.PublicBusinessUnit
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponsePublicBusinessUnitNoPagingTest {

    @Test
    fun create() {
        val collectionResponsePublicBusinessUnitNoPaging =
            CollectionResponsePublicBusinessUnitNoPaging.builder()
                .addResult(PublicBusinessUnit.builder().id(0).build())
                .build()

        assertThat(collectionResponsePublicBusinessUnitNoPaging.results())
            .containsExactly(PublicBusinessUnit.builder().id(0).build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionResponsePublicBusinessUnitNoPaging =
            CollectionResponsePublicBusinessUnitNoPaging.builder()
                .addResult(PublicBusinessUnit.builder().id(0).build())
                .build()

        val roundtrippedCollectionResponsePublicBusinessUnitNoPaging =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(collectionResponsePublicBusinessUnitNoPaging),
                jacksonTypeRef<CollectionResponsePublicBusinessUnitNoPaging>(),
            )

        assertThat(roundtrippedCollectionResponsePublicBusinessUnitNoPaging)
            .isEqualTo(collectionResponsePublicBusinessUnitNoPaging)
    }
}
