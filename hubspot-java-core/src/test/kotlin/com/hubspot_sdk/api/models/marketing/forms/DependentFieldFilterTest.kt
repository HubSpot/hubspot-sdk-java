// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.forms

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DependentFieldFilterTest {

    @Test
    fun create() {
        val dependentFieldFilter =
            DependentFieldFilter.builder()
                .operator(DependentFieldFilter.Operator.EQ)
                .rangeEnd("rangeEnd")
                .rangeStart("rangeStart")
                .value("value")
                .addValue("string")
                .build()

        assertThat(dependentFieldFilter.operator()).isEqualTo(DependentFieldFilter.Operator.EQ)
        assertThat(dependentFieldFilter.rangeEnd()).isEqualTo("rangeEnd")
        assertThat(dependentFieldFilter.rangeStart()).isEqualTo("rangeStart")
        assertThat(dependentFieldFilter.value()).isEqualTo("value")
        assertThat(dependentFieldFilter.values()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dependentFieldFilter =
            DependentFieldFilter.builder()
                .operator(DependentFieldFilter.Operator.EQ)
                .rangeEnd("rangeEnd")
                .rangeStart("rangeStart")
                .value("value")
                .addValue("string")
                .build()

        val roundtrippedDependentFieldFilter =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dependentFieldFilter),
                jacksonTypeRef<DependentFieldFilter>(),
            )

        assertThat(roundtrippedDependentFieldFilter).isEqualTo(dependentFieldFilter)
    }
}
