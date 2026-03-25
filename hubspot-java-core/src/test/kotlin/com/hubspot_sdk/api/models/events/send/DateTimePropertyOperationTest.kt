// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.events.send

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DateTimePropertyOperationTest {

    @Test
    fun create() {
        val dateTimePropertyOperation =
            DateTimePropertyOperation.builder()
                .includeObjectsWithNoValueSet(true)
                .operationType("operationType")
                .operator(DateTimePropertyOperation.Operator.IS_AFTER)
                .operatorName("operatorName")
                .propertyType(DateTimePropertyOperation.PropertyType.DATETIME)
                .requiresTimeZoneConversion(true)
                .timestamp(0)
                .defaultValue("defaultValue")
                .renderSpec("renderSpec")
                .build()

        assertThat(dateTimePropertyOperation.includeObjectsWithNoValueSet()).isEqualTo(true)
        assertThat(dateTimePropertyOperation.operationType()).isEqualTo("operationType")
        assertThat(dateTimePropertyOperation.operator())
            .isEqualTo(DateTimePropertyOperation.Operator.IS_AFTER)
        assertThat(dateTimePropertyOperation.operatorName()).isEqualTo("operatorName")
        assertThat(dateTimePropertyOperation.propertyType())
            .isEqualTo(DateTimePropertyOperation.PropertyType.DATETIME)
        assertThat(dateTimePropertyOperation.requiresTimeZoneConversion()).isEqualTo(true)
        assertThat(dateTimePropertyOperation.timestamp()).isEqualTo(0)
        assertThat(dateTimePropertyOperation.defaultValue()).contains("defaultValue")
        assertThat(dateTimePropertyOperation.renderSpec()).contains("renderSpec")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dateTimePropertyOperation =
            DateTimePropertyOperation.builder()
                .includeObjectsWithNoValueSet(true)
                .operationType("operationType")
                .operator(DateTimePropertyOperation.Operator.IS_AFTER)
                .operatorName("operatorName")
                .propertyType(DateTimePropertyOperation.PropertyType.DATETIME)
                .requiresTimeZoneConversion(true)
                .timestamp(0)
                .defaultValue("defaultValue")
                .renderSpec("renderSpec")
                .build()

        val roundtrippedDateTimePropertyOperation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dateTimePropertyOperation),
                jacksonTypeRef<DateTimePropertyOperation>(),
            )

        assertThat(roundtrippedDateTimePropertyOperation).isEqualTo(dateTimePropertyOperation)
    }
}
