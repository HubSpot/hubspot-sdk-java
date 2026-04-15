// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PreviousPageTest {

    @Test
    fun create() {
        val previousPage = PreviousPage.builder().before("before").link("link").build()

        assertThat(previousPage.before()).isEqualTo("before")
        assertThat(previousPage.link()).contains("link")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val previousPage = PreviousPage.builder().before("before").link("link").build()

        val roundtrippedPreviousPage =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(previousPage),
                jacksonTypeRef<PreviousPage>(),
            )

        assertThat(roundtrippedPreviousPage).isEqualTo(previousPage)
    }
}
