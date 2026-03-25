// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.events

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DatePropertyOperationTest {

    @Test
    fun create() {
        val datePropertyOperation =
            DatePropertyOperation.builder()
                .day(0)
                .includeObjectsWithNoValueSet(true)
                .month(DatePropertyOperation.Month.APR)
                .operationType("operationType")
                .operator(DatePropertyOperation.Operator.AFTER)
                .operatorName("operatorName")
                .propertyType(DatePropertyOperation.PropertyType.DATE)
                .year(0)
                .defaultValue("defaultValue")
                .renderSpec("renderSpec")
                .build()

        assertThat(datePropertyOperation.day()).isEqualTo(0)
        assertThat(datePropertyOperation.includeObjectsWithNoValueSet()).isEqualTo(true)
        assertThat(datePropertyOperation.month()).isEqualTo(DatePropertyOperation.Month.APR)
        assertThat(datePropertyOperation.operationType()).isEqualTo("operationType")
        assertThat(datePropertyOperation.operator()).isEqualTo(DatePropertyOperation.Operator.AFTER)
        assertThat(datePropertyOperation.operatorName()).isEqualTo("operatorName")
        assertThat(datePropertyOperation.propertyType())
            .isEqualTo(DatePropertyOperation.PropertyType.DATE)
        assertThat(datePropertyOperation.year()).isEqualTo(0)
        assertThat(datePropertyOperation.defaultValue()).contains("defaultValue")
        assertThat(datePropertyOperation.renderSpec()).contains("renderSpec")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val datePropertyOperation =
            DatePropertyOperation.builder()
                .day(0)
                .includeObjectsWithNoValueSet(true)
                .month(DatePropertyOperation.Month.APR)
                .operationType("operationType")
                .operator(DatePropertyOperation.Operator.AFTER)
                .operatorName("operatorName")
                .propertyType(DatePropertyOperation.PropertyType.DATE)
                .year(0)
                .defaultValue("defaultValue")
                .renderSpec("renderSpec")
                .build()

        val roundtrippedDatePropertyOperation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(datePropertyOperation),
                jacksonTypeRef<DatePropertyOperation>(),
            )

        assertThat(roundtrippedDatePropertyOperation).isEqualTo(datePropertyOperation)
    }
}
