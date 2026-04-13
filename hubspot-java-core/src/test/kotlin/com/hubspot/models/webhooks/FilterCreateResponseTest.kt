// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FilterCreateResponseTest {

    @Test
    fun create() {
        val filterCreateResponse = FilterCreateResponse.builder().filterId(0L).build()

        assertThat(filterCreateResponse.filterId()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val filterCreateResponse = FilterCreateResponse.builder().filterId(0L).build()

        val roundtrippedFilterCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(filterCreateResponse),
                jacksonTypeRef<FilterCreateResponse>(),
            )

        assertThat(roundtrippedFilterCreateResponse).isEqualTo(filterCreateResponse)
    }
}
