// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FilterTest {

    @Test
    fun create() {
        val filter =
            Filter.builder()
                .operator(Filter.Operator.BETWEEN)
                .propertyName("propertyName")
                .highValue("highValue")
                .value("value")
                .addValue("string")
                .build()

        assertThat(filter.operator()).isEqualTo(Filter.Operator.BETWEEN)
        assertThat(filter.propertyName()).isEqualTo("propertyName")
        assertThat(filter.highValue()).contains("highValue")
        assertThat(filter.value()).contains("value")
        assertThat(filter.values().getOrNull()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val filter =
            Filter.builder()
                .operator(Filter.Operator.BETWEEN)
                .propertyName("propertyName")
                .highValue("highValue")
                .value("value")
                .addValue("string")
                .build()

        val roundtrippedFilter =
            jsonMapper.readValue(jsonMapper.writeValueAsString(filter), jacksonTypeRef<Filter>())

        assertThat(roundtrippedFilter).isEqualTo(filter)
    }
}
