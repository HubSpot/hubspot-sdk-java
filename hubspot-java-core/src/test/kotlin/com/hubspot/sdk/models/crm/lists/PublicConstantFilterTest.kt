// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.lists

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicConstantFilterTest {

    @Test
    fun create() {
        val publicConstantFilter =
            PublicConstantFilter.builder()
                .filterType(PublicConstantFilter.FilterType.CONSTANT)
                .shouldAccept(true)
                .source("source")
                .build()

        assertThat(publicConstantFilter.filterType())
            .isEqualTo(PublicConstantFilter.FilterType.CONSTANT)
        assertThat(publicConstantFilter.shouldAccept()).isEqualTo(true)
        assertThat(publicConstantFilter.source()).contains("source")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicConstantFilter =
            PublicConstantFilter.builder()
                .filterType(PublicConstantFilter.FilterType.CONSTANT)
                .shouldAccept(true)
                .source("source")
                .build()

        val roundtrippedPublicConstantFilter =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicConstantFilter),
                jacksonTypeRef<PublicConstantFilter>(),
            )

        assertThat(roundtrippedPublicConstantFilter).isEqualTo(publicConstantFilter)
    }
}
