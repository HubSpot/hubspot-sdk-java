// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ForwardPagingTest {

    @Test
    fun create() {
        val forwardPaging =
            ForwardPaging.builder()
                .next(NextPage.builder().after("after").link("link").build())
                .build()

        assertThat(forwardPaging.next())
            .contains(NextPage.builder().after("after").link("link").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val forwardPaging =
            ForwardPaging.builder()
                .next(NextPage.builder().after("after").link("link").build())
                .build()

        val roundtrippedForwardPaging =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(forwardPaging),
                jacksonTypeRef<ForwardPaging>(),
            )

        assertThat(roundtrippedForwardPaging).isEqualTo(forwardPaging)
    }
}
