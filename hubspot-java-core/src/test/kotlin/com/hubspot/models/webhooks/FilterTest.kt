// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FilterTest {

    @Test
    fun create() {
        val filter =
            Filter.builder()
                .addCondition(
                    Condition.builder()
                        .filterType(Condition.FilterType.CRM_OBJECT_PROPERTY)
                        .operator(Condition.Operator.CONTAINS)
                        .property("property")
                        .value("value")
                        .addValue("string")
                        .build()
                )
                .build()

        assertThat(filter.conditions())
            .containsExactly(
                Condition.builder()
                    .filterType(Condition.FilterType.CRM_OBJECT_PROPERTY)
                    .operator(Condition.Operator.CONTAINS)
                    .property("property")
                    .value("value")
                    .addValue("string")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val filter =
            Filter.builder()
                .addCondition(
                    Condition.builder()
                        .filterType(Condition.FilterType.CRM_OBJECT_PROPERTY)
                        .operator(Condition.Operator.CONTAINS)
                        .property("property")
                        .value("value")
                        .addValue("string")
                        .build()
                )
                .build()

        val roundtrippedFilter =
            jsonMapper.readValue(jsonMapper.writeValueAsString(filter), jacksonTypeRef<Filter>())

        assertThat(roundtrippedFilter).isEqualTo(filter)
    }
}
