// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.cms.blogs.posts.Margin
import com.hubspot_sdk.api.models.cms.blogs.posts.Padding
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BreakpointStylesTest {

    @Test
    fun create() {
        val breakpointStyles =
            BreakpointStyles.builder()
                .hidden(true)
                .margin(Margin.builder().build())
                .padding(Padding.builder().build())
                .build()

        assertThat(breakpointStyles.hidden()).isEqualTo(true)
        assertThat(breakpointStyles.margin()).isEqualTo(Margin.builder().build())
        assertThat(breakpointStyles.padding()).isEqualTo(Padding.builder().build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val breakpointStyles =
            BreakpointStyles.builder()
                .hidden(true)
                .margin(Margin.builder().build())
                .padding(Padding.builder().build())
                .build()

        val roundtrippedBreakpointStyles =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(breakpointStyles),
                jacksonTypeRef<BreakpointStyles>(),
            )

        assertThat(roundtrippedBreakpointStyles).isEqualTo(breakpointStyles)
    }
}
