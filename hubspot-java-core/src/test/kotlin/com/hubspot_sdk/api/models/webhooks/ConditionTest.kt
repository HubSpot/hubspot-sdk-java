// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConditionTest {

    @Test
    fun create() {
        val condition =
            Condition.builder()
                .filterType(Condition.FilterType.CRM_OBJECT_PROPERTY)
                .operator(Condition.Operator.CONTAINS)
                .property("property")
                .value("value")
                .addValue("string")
                .build()

        assertThat(condition.filterType()).isEqualTo(Condition.FilterType.CRM_OBJECT_PROPERTY)
        assertThat(condition.operator()).isEqualTo(Condition.Operator.CONTAINS)
        assertThat(condition.property()).isEqualTo("property")
        assertThat(condition.value()).contains("value")
        assertThat(condition.values().getOrNull()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val condition =
            Condition.builder()
                .filterType(Condition.FilterType.CRM_OBJECT_PROPERTY)
                .operator(Condition.Operator.CONTAINS)
                .property("property")
                .value("value")
                .addValue("string")
                .build()

        val roundtrippedCondition =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(condition),
                jacksonTypeRef<Condition>(),
            )

        assertThat(roundtrippedCondition).isEqualTo(condition)
    }
}
