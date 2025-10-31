// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OptionDecorationsTest {

    @Test
    fun create() {
        val optionDecorations = OptionDecorations.builder().color("color").build()

        assertThat(optionDecorations.color()).isEqualTo("color")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val optionDecorations = OptionDecorations.builder().color("color").build()

        val roundtrippedOptionDecorations =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(optionDecorations),
                jacksonTypeRef<OptionDecorations>(),
            )

        assertThat(roundtrippedOptionDecorations).isEqualTo(optionDecorations)
    }
}
