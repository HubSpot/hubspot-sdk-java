// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.events.eventdefinitions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BoolPropertyOperationTest {

    @Test
    fun create() {
        val boolPropertyOperation =
            BoolPropertyOperation.builder()
                .includeObjectsWithNoValueSet(true)
                .operationType("operationType")
                .operator(BoolPropertyOperation.Operator.IS_EQUAL_TO)
                .operatorName("operatorName")
                .propertyType(BoolPropertyOperation.PropertyType.BOOL)
                .value(true)
                .defaultValue("defaultValue")
                .build()

        assertThat(boolPropertyOperation.includeObjectsWithNoValueSet()).isEqualTo(true)
        assertThat(boolPropertyOperation.operationType()).isEqualTo("operationType")
        assertThat(boolPropertyOperation.operator())
            .isEqualTo(BoolPropertyOperation.Operator.IS_EQUAL_TO)
        assertThat(boolPropertyOperation.operatorName()).isEqualTo("operatorName")
        assertThat(boolPropertyOperation.propertyType())
            .isEqualTo(BoolPropertyOperation.PropertyType.BOOL)
        assertThat(boolPropertyOperation.value()).isEqualTo(true)
        assertThat(boolPropertyOperation.defaultValue()).contains("defaultValue")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val boolPropertyOperation =
            BoolPropertyOperation.builder()
                .includeObjectsWithNoValueSet(true)
                .operationType("operationType")
                .operator(BoolPropertyOperation.Operator.IS_EQUAL_TO)
                .operatorName("operatorName")
                .propertyType(BoolPropertyOperation.PropertyType.BOOL)
                .value(true)
                .defaultValue("defaultValue")
                .build()

        val roundtrippedBoolPropertyOperation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(boolPropertyOperation),
                jacksonTypeRef<BoolPropertyOperation>(),
            )

        assertThat(roundtrippedBoolPropertyOperation).isEqualTo(boolPropertyOperation)
    }
}
