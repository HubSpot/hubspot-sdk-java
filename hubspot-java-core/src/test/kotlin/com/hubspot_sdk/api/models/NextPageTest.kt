// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NextPageTest {

    @Test
    fun create() {
        val nextPage = NextPage.builder().after("after").link("link").build()

        assertThat(nextPage.after()).isEqualTo("after")
        assertThat(nextPage.link()).contains("link")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val nextPage = NextPage.builder().after("after").link("link").build()

        val roundtrippedNextPage =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(nextPage),
                jacksonTypeRef<NextPage>(),
            )

        assertThat(roundtrippedNextPage).isEqualTo(nextPage)
    }
}
