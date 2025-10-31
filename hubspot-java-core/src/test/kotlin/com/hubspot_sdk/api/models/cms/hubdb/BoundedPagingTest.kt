// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.hubdb

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BoundedPagingTest {

    @Test
    fun create() {
        val boundedPaging =
            BoundedPaging.builder()
                .next(BoundedNextPage.builder().offset(0).link("link").build())
                .build()

        assertThat(boundedPaging.next())
            .contains(BoundedNextPage.builder().offset(0).link("link").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val boundedPaging =
            BoundedPaging.builder()
                .next(BoundedNextPage.builder().offset(0).link("link").build())
                .build()

        val roundtrippedBoundedPaging =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(boundedPaging),
                jacksonTypeRef<BoundedPaging>(),
            )

        assertThat(roundtrippedBoundedPaging).isEqualTo(boundedPaging)
    }
}
