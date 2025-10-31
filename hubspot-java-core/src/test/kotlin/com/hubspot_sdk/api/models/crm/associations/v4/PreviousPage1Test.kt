// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.associations.v4

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PreviousPage1Test {

    @Test
    fun create() {
        val previousPage1 = PreviousPage1.builder().before("before").link("link").build()

        assertThat(previousPage1.before()).isEqualTo("before")
        assertThat(previousPage1.link()).contains("link")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val previousPage1 = PreviousPage1.builder().before("before").link("link").build()

        val roundtrippedPreviousPage1 =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(previousPage1),
                jacksonTypeRef<PreviousPage1>(),
            )

        assertThat(roundtrippedPreviousPage1).isEqualTo(previousPage1)
    }
}
