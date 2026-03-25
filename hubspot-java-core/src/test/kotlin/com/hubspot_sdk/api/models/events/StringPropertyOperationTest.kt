// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.events

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StringPropertyOperationTest {

    @Test
    fun create() {
        val stringPropertyOperation =
            StringPropertyOperation.builder()
                .includeObjectsWithNoValueSet(true)
                .operationType("operationType")
                .operator(StringPropertyOperation.Operator.CONTAINS)
                .operatorName("operatorName")
                .propertyType(StringPropertyOperation.PropertyType.STRING)
                .value("value")
                .defaultValue("defaultValue")
                .renderSpec("renderSpec")
                .build()

        assertThat(stringPropertyOperation.includeObjectsWithNoValueSet()).isEqualTo(true)
        assertThat(stringPropertyOperation.operationType()).isEqualTo("operationType")
        assertThat(stringPropertyOperation.operator())
            .isEqualTo(StringPropertyOperation.Operator.CONTAINS)
        assertThat(stringPropertyOperation.operatorName()).isEqualTo("operatorName")
        assertThat(stringPropertyOperation.propertyType())
            .isEqualTo(StringPropertyOperation.PropertyType.STRING)
        assertThat(stringPropertyOperation.value()).isEqualTo("value")
        assertThat(stringPropertyOperation.defaultValue()).contains("defaultValue")
        assertThat(stringPropertyOperation.renderSpec()).contains("renderSpec")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val stringPropertyOperation =
            StringPropertyOperation.builder()
                .includeObjectsWithNoValueSet(true)
                .operationType("operationType")
                .operator(StringPropertyOperation.Operator.CONTAINS)
                .operatorName("operatorName")
                .propertyType(StringPropertyOperation.PropertyType.STRING)
                .value("value")
                .defaultValue("defaultValue")
                .renderSpec("renderSpec")
                .build()

        val roundtrippedStringPropertyOperation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(stringPropertyOperation),
                jacksonTypeRef<StringPropertyOperation>(),
            )

        assertThat(roundtrippedStringPropertyOperation).isEqualTo(stringPropertyOperation)
    }
}
