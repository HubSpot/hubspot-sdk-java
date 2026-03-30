// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.hubdb

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BoundedNextPageTest {

    @Test
    fun create() {
        val boundedNextPage = BoundedNextPage.builder().offset(0).link("link").build()

        assertThat(boundedNextPage.offset()).isEqualTo(0)
        assertThat(boundedNextPage.link()).contains("link")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val boundedNextPage = BoundedNextPage.builder().offset(0).link("link").build()

        val roundtrippedBoundedNextPage =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(boundedNextPage),
                jacksonTypeRef<BoundedNextPage>(),
            )

        assertThat(roundtrippedBoundedNextPage).isEqualTo(boundedNextPage)
    }
}
