// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.events

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ComparativeBoolPropertyOperationTest {

    @Test
    fun create() {
        val comparativeBoolPropertyOperation =
            ComparativeBoolPropertyOperation.builder()
                .comparisonPropertyName("comparisonPropertyName")
                .includeObjectsWithNoValueSet(true)
                .operationType("operationType")
                .operator(ComparativeBoolPropertyOperation.Operator.IS_EQUAL_TO)
                .operatorName("operatorName")
                .propertyType(ComparativeBoolPropertyOperation.PropertyType.BOOL_COMPARATIVE)
                .defaultValue("defaultValue")
                .renderSpec("renderSpec")
                .build()

        assertThat(comparativeBoolPropertyOperation.comparisonPropertyName())
            .isEqualTo("comparisonPropertyName")
        assertThat(comparativeBoolPropertyOperation.includeObjectsWithNoValueSet()).isEqualTo(true)
        assertThat(comparativeBoolPropertyOperation.operationType()).isEqualTo("operationType")
        assertThat(comparativeBoolPropertyOperation.operator())
            .isEqualTo(ComparativeBoolPropertyOperation.Operator.IS_EQUAL_TO)
        assertThat(comparativeBoolPropertyOperation.operatorName()).isEqualTo("operatorName")
        assertThat(comparativeBoolPropertyOperation.propertyType())
            .isEqualTo(ComparativeBoolPropertyOperation.PropertyType.BOOL_COMPARATIVE)
        assertThat(comparativeBoolPropertyOperation.defaultValue()).contains("defaultValue")
        assertThat(comparativeBoolPropertyOperation.renderSpec()).contains("renderSpec")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val comparativeBoolPropertyOperation =
            ComparativeBoolPropertyOperation.builder()
                .comparisonPropertyName("comparisonPropertyName")
                .includeObjectsWithNoValueSet(true)
                .operationType("operationType")
                .operator(ComparativeBoolPropertyOperation.Operator.IS_EQUAL_TO)
                .operatorName("operatorName")
                .propertyType(ComparativeBoolPropertyOperation.PropertyType.BOOL_COMPARATIVE)
                .defaultValue("defaultValue")
                .renderSpec("renderSpec")
                .build()

        val roundtrippedComparativeBoolPropertyOperation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(comparativeBoolPropertyOperation),
                jacksonTypeRef<ComparativeBoolPropertyOperation>(),
            )

        assertThat(roundtrippedComparativeBoolPropertyOperation)
            .isEqualTo(comparativeBoolPropertyOperation)
    }
}
