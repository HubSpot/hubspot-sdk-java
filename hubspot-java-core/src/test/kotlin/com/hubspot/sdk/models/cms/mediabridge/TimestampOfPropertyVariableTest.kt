// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TimestampOfPropertyVariableTest {

    @Test
    fun create() {
        val timestampOfPropertyVariable =
            TimestampOfPropertyVariable.builder()
                .operator(TimestampOfPropertyVariable.Operator.TIMESTAMP_OF_PROPERTY_VARIABLE)
                .propertyName("propertyName")
                .value("value")
                .build()

        assertThat(timestampOfPropertyVariable.operator())
            .isEqualTo(TimestampOfPropertyVariable.Operator.TIMESTAMP_OF_PROPERTY_VARIABLE)
        assertThat(timestampOfPropertyVariable.propertyName()).contains("propertyName")
        assertThat(timestampOfPropertyVariable.value()).contains("value")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val timestampOfPropertyVariable =
            TimestampOfPropertyVariable.builder()
                .operator(TimestampOfPropertyVariable.Operator.TIMESTAMP_OF_PROPERTY_VARIABLE)
                .propertyName("propertyName")
                .value("value")
                .build()

        val roundtrippedTimestampOfPropertyVariable =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(timestampOfPropertyVariable),
                jacksonTypeRef<TimestampOfPropertyVariable>(),
            )

        assertThat(roundtrippedTimestampOfPropertyVariable).isEqualTo(timestampOfPropertyVariable)
    }
}
