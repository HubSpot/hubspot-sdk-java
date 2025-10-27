// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PagingTest {

    @Test
    fun create() {
        val paging =
            Paging.builder()
                .next(NextPage.builder().after("").link("").build())
                .prev(PreviousPage.builder().before("before").link("link").build())
                .build()

        assertThat(paging.next()).contains(NextPage.builder().after("").link("").build())
        assertThat(paging.prev())
            .contains(PreviousPage.builder().before("before").link("link").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val paging =
            Paging.builder()
                .next(NextPage.builder().after("").link("").build())
                .prev(PreviousPage.builder().before("before").link("link").build())
                .build()

        val roundtrippedPaging =
            jsonMapper.readValue(jsonMapper.writeValueAsString(paging), jacksonTypeRef<Paging>())

        assertThat(roundtrippedPaging).isEqualTo(paging)
    }
}
