// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.events.definitions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ComparativeNumberPropertyOperationTest {

    @Test
    fun create() {
        val comparativeNumberPropertyOperation =
            ComparativeNumberPropertyOperation.builder()
                .comparisonPropertyName("comparisonPropertyName")
                .includeObjectsWithNoValueSet(true)
                .operationType("operationType")
                .operator(ComparativeNumberPropertyOperation.Operator.IS_EQUAL_TO)
                .operatorName("operatorName")
                .propertyType(ComparativeNumberPropertyOperation.PropertyType.NUMBER_COMPARATIVE)
                .defaultValue("defaultValue")
                .renderSpec("renderSpec")
                .build()

        assertThat(comparativeNumberPropertyOperation.comparisonPropertyName())
            .isEqualTo("comparisonPropertyName")
        assertThat(comparativeNumberPropertyOperation.includeObjectsWithNoValueSet())
            .isEqualTo(true)
        assertThat(comparativeNumberPropertyOperation.operationType()).isEqualTo("operationType")
        assertThat(comparativeNumberPropertyOperation.operator())
            .isEqualTo(ComparativeNumberPropertyOperation.Operator.IS_EQUAL_TO)
        assertThat(comparativeNumberPropertyOperation.operatorName()).isEqualTo("operatorName")
        assertThat(comparativeNumberPropertyOperation.propertyType())
            .isEqualTo(ComparativeNumberPropertyOperation.PropertyType.NUMBER_COMPARATIVE)
        assertThat(comparativeNumberPropertyOperation.defaultValue()).contains("defaultValue")
        assertThat(comparativeNumberPropertyOperation.renderSpec()).contains("renderSpec")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val comparativeNumberPropertyOperation =
            ComparativeNumberPropertyOperation.builder()
                .comparisonPropertyName("comparisonPropertyName")
                .includeObjectsWithNoValueSet(true)
                .operationType("operationType")
                .operator(ComparativeNumberPropertyOperation.Operator.IS_EQUAL_TO)
                .operatorName("operatorName")
                .propertyType(ComparativeNumberPropertyOperation.PropertyType.NUMBER_COMPARATIVE)
                .defaultValue("defaultValue")
                .renderSpec("renderSpec")
                .build()

        val roundtrippedComparativeNumberPropertyOperation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(comparativeNumberPropertyOperation),
                jacksonTypeRef<ComparativeNumberPropertyOperation>(),
            )

        assertThat(roundtrippedComparativeNumberPropertyOperation)
            .isEqualTo(comparativeNumberPropertyOperation)
    }
}
