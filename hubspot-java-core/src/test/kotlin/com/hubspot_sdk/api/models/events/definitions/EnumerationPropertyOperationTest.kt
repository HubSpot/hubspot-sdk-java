// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.events.definitions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EnumerationPropertyOperationTest {

    @Test
    fun create() {
        val enumerationPropertyOperation =
            EnumerationPropertyOperation.builder()
                .includeObjectsWithNoValueSet(true)
                .operationType("operationType")
                .operator(EnumerationPropertyOperation.Operator.CONTAINS_ALL)
                .operatorName("operatorName")
                .propertyType(EnumerationPropertyOperation.PropertyType.ENUMERATION)
                .addValue("string")
                .defaultValue("defaultValue")
                .renderSpec("renderSpec")
                .build()

        assertThat(enumerationPropertyOperation.includeObjectsWithNoValueSet()).isEqualTo(true)
        assertThat(enumerationPropertyOperation.operationType()).isEqualTo("operationType")
        assertThat(enumerationPropertyOperation.operator())
            .isEqualTo(EnumerationPropertyOperation.Operator.CONTAINS_ALL)
        assertThat(enumerationPropertyOperation.operatorName()).isEqualTo("operatorName")
        assertThat(enumerationPropertyOperation.propertyType())
            .isEqualTo(EnumerationPropertyOperation.PropertyType.ENUMERATION)
        assertThat(enumerationPropertyOperation.values()).containsExactly("string")
        assertThat(enumerationPropertyOperation.defaultValue()).contains("defaultValue")
        assertThat(enumerationPropertyOperation.renderSpec()).contains("renderSpec")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val enumerationPropertyOperation =
            EnumerationPropertyOperation.builder()
                .includeObjectsWithNoValueSet(true)
                .operationType("operationType")
                .operator(EnumerationPropertyOperation.Operator.CONTAINS_ALL)
                .operatorName("operatorName")
                .propertyType(EnumerationPropertyOperation.PropertyType.ENUMERATION)
                .addValue("string")
                .defaultValue("defaultValue")
                .renderSpec("renderSpec")
                .build()

        val roundtrippedEnumerationPropertyOperation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(enumerationPropertyOperation),
                jacksonTypeRef<EnumerationPropertyOperation>(),
            )

        assertThat(roundtrippedEnumerationPropertyOperation).isEqualTo(enumerationPropertyOperation)
    }
}
