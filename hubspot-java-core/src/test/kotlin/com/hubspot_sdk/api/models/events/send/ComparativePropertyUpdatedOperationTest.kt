// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.events.send

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ComparativePropertyUpdatedOperationTest {

    @Test
    fun create() {
        val comparativePropertyUpdatedOperation =
            ComparativePropertyUpdatedOperation.builder()
                .comparisonPropertyName("comparisonPropertyName")
                .includeObjectsWithNoValueSet(true)
                .operationType("operationType")
                .operator(ComparativePropertyUpdatedOperation.Operator.IS_AFTER)
                .operatorName("operatorName")
                .propertyType(
                    ComparativePropertyUpdatedOperation.PropertyType.PROPERTY_UPDATED_COMPARATIVE
                )
                .defaultComparisonValue("defaultComparisonValue")
                .defaultValue("defaultValue")
                .renderSpec("renderSpec")
                .build()

        assertThat(comparativePropertyUpdatedOperation.comparisonPropertyName())
            .isEqualTo("comparisonPropertyName")
        assertThat(comparativePropertyUpdatedOperation.includeObjectsWithNoValueSet())
            .isEqualTo(true)
        assertThat(comparativePropertyUpdatedOperation.operationType()).isEqualTo("operationType")
        assertThat(comparativePropertyUpdatedOperation.operator())
            .isEqualTo(ComparativePropertyUpdatedOperation.Operator.IS_AFTER)
        assertThat(comparativePropertyUpdatedOperation.operatorName()).isEqualTo("operatorName")
        assertThat(comparativePropertyUpdatedOperation.propertyType())
            .isEqualTo(
                ComparativePropertyUpdatedOperation.PropertyType.PROPERTY_UPDATED_COMPARATIVE
            )
        assertThat(comparativePropertyUpdatedOperation.defaultComparisonValue())
            .contains("defaultComparisonValue")
        assertThat(comparativePropertyUpdatedOperation.defaultValue()).contains("defaultValue")
        assertThat(comparativePropertyUpdatedOperation.renderSpec()).contains("renderSpec")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val comparativePropertyUpdatedOperation =
            ComparativePropertyUpdatedOperation.builder()
                .comparisonPropertyName("comparisonPropertyName")
                .includeObjectsWithNoValueSet(true)
                .operationType("operationType")
                .operator(ComparativePropertyUpdatedOperation.Operator.IS_AFTER)
                .operatorName("operatorName")
                .propertyType(
                    ComparativePropertyUpdatedOperation.PropertyType.PROPERTY_UPDATED_COMPARATIVE
                )
                .defaultComparisonValue("defaultComparisonValue")
                .defaultValue("defaultValue")
                .renderSpec("renderSpec")
                .build()

        val roundtrippedComparativePropertyUpdatedOperation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(comparativePropertyUpdatedOperation),
                jacksonTypeRef<ComparativePropertyUpdatedOperation>(),
            )

        assertThat(roundtrippedComparativePropertyUpdatedOperation)
            .isEqualTo(comparativePropertyUpdatedOperation)
    }
}
