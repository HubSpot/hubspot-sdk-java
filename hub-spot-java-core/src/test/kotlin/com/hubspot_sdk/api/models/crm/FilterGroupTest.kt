// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FilterGroupTest {

    @Test
    fun create() {
        val filterGroup =
            FilterGroup.builder()
                .addFilter(
                    Filter.builder()
                        .operator(Filter.Operator.EQ)
                        .propertyName("")
                        .highValue("")
                        .value("")
                        .addValue("string")
                        .build()
                )
                .build()

        assertThat(filterGroup.filters())
            .containsExactly(
                Filter.builder()
                    .operator(Filter.Operator.EQ)
                    .propertyName("")
                    .highValue("")
                    .value("")
                    .addValue("string")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val filterGroup =
            FilterGroup.builder()
                .addFilter(
                    Filter.builder()
                        .operator(Filter.Operator.EQ)
                        .propertyName("")
                        .highValue("")
                        .value("")
                        .addValue("string")
                        .build()
                )
                .build()

        val roundtrippedFilterGroup =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(filterGroup),
                jacksonTypeRef<FilterGroup>(),
            )

        assertThat(roundtrippedFilterGroup).isEqualTo(filterGroup)
    }
}
