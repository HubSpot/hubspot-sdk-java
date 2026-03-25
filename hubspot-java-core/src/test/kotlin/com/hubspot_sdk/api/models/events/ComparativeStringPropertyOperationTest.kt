// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.events

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ComparativeStringPropertyOperationTest {

    @Test
    fun create() {
        val comparativeStringPropertyOperation =
            ComparativeStringPropertyOperation.builder()
                .comparisonPropertyName("comparisonPropertyName")
                .includeObjectsWithNoValueSet(true)
                .operationType("operationType")
                .operator(ComparativeStringPropertyOperation.Operator.CONTAINS)
                .operatorName("operatorName")
                .propertyType(ComparativeStringPropertyOperation.PropertyType.STRING_COMPARATIVE)
                .defaultValue("defaultValue")
                .renderSpec("renderSpec")
                .build()

        assertThat(comparativeStringPropertyOperation.comparisonPropertyName())
            .isEqualTo("comparisonPropertyName")
        assertThat(comparativeStringPropertyOperation.includeObjectsWithNoValueSet())
            .isEqualTo(true)
        assertThat(comparativeStringPropertyOperation.operationType()).isEqualTo("operationType")
        assertThat(comparativeStringPropertyOperation.operator())
            .isEqualTo(ComparativeStringPropertyOperation.Operator.CONTAINS)
        assertThat(comparativeStringPropertyOperation.operatorName()).isEqualTo("operatorName")
        assertThat(comparativeStringPropertyOperation.propertyType())
            .isEqualTo(ComparativeStringPropertyOperation.PropertyType.STRING_COMPARATIVE)
        assertThat(comparativeStringPropertyOperation.defaultValue()).contains("defaultValue")
        assertThat(comparativeStringPropertyOperation.renderSpec()).contains("renderSpec")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val comparativeStringPropertyOperation =
            ComparativeStringPropertyOperation.builder()
                .comparisonPropertyName("comparisonPropertyName")
                .includeObjectsWithNoValueSet(true)
                .operationType("operationType")
                .operator(ComparativeStringPropertyOperation.Operator.CONTAINS)
                .operatorName("operatorName")
                .propertyType(ComparativeStringPropertyOperation.PropertyType.STRING_COMPARATIVE)
                .defaultValue("defaultValue")
                .renderSpec("renderSpec")
                .build()

        val roundtrippedComparativeStringPropertyOperation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(comparativeStringPropertyOperation),
                jacksonTypeRef<ComparativeStringPropertyOperation>(),
            )

        assertThat(roundtrippedComparativeStringPropertyOperation)
            .isEqualTo(comparativeStringPropertyOperation)
    }
}
