// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.events.definitions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ComparativeDatePropertyOperationTest {

    @Test
    fun create() {
        val comparativeDatePropertyOperation =
            ComparativeDatePropertyOperation.builder()
                .comparisonPropertyName("comparisonPropertyName")
                .includeObjectsWithNoValueSet(true)
                .operationType("operationType")
                .operator(ComparativeDatePropertyOperation.Operator.IS_AFTER)
                .operatorName("operatorName")
                .propertyType(ComparativeDatePropertyOperation.PropertyType.DATETIME_COMPARATIVE)
                .defaultComparisonValue("defaultComparisonValue")
                .defaultValue("defaultValue")
                .renderSpec("renderSpec")
                .build()

        assertThat(comparativeDatePropertyOperation.comparisonPropertyName())
            .isEqualTo("comparisonPropertyName")
        assertThat(comparativeDatePropertyOperation.includeObjectsWithNoValueSet()).isEqualTo(true)
        assertThat(comparativeDatePropertyOperation.operationType()).isEqualTo("operationType")
        assertThat(comparativeDatePropertyOperation.operator())
            .isEqualTo(ComparativeDatePropertyOperation.Operator.IS_AFTER)
        assertThat(comparativeDatePropertyOperation.operatorName()).isEqualTo("operatorName")
        assertThat(comparativeDatePropertyOperation.propertyType())
            .isEqualTo(ComparativeDatePropertyOperation.PropertyType.DATETIME_COMPARATIVE)
        assertThat(comparativeDatePropertyOperation.defaultComparisonValue())
            .contains("defaultComparisonValue")
        assertThat(comparativeDatePropertyOperation.defaultValue()).contains("defaultValue")
        assertThat(comparativeDatePropertyOperation.renderSpec()).contains("renderSpec")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val comparativeDatePropertyOperation =
            ComparativeDatePropertyOperation.builder()
                .comparisonPropertyName("comparisonPropertyName")
                .includeObjectsWithNoValueSet(true)
                .operationType("operationType")
                .operator(ComparativeDatePropertyOperation.Operator.IS_AFTER)
                .operatorName("operatorName")
                .propertyType(ComparativeDatePropertyOperation.PropertyType.DATETIME_COMPARATIVE)
                .defaultComparisonValue("defaultComparisonValue")
                .defaultValue("defaultValue")
                .renderSpec("renderSpec")
                .build()

        val roundtrippedComparativeDatePropertyOperation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(comparativeDatePropertyOperation),
                jacksonTypeRef<ComparativeDatePropertyOperation>(),
            )

        assertThat(roundtrippedComparativeDatePropertyOperation)
            .isEqualTo(comparativeDatePropertyOperation)
    }
}
