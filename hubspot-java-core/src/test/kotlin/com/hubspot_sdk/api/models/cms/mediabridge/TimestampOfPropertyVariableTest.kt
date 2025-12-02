// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TimestampOfPropertyVariableTest {

    @Test
    fun create() {
        val timestampOfPropertyVariable =
            TimestampOfPropertyVariable.builder()
                .operator(TimestampOfPropertyVariable.Operator.TIMESTAMP_OF_PROPERTY_VARIABLE)
                .addInput(
                    TimestampOfPropertyVariable.Input.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .propertyName("propertyName")
                .value("value")
                .build()

        assertThat(timestampOfPropertyVariable.operator())
            .isEqualTo(TimestampOfPropertyVariable.Operator.TIMESTAMP_OF_PROPERTY_VARIABLE)
        assertThat(timestampOfPropertyVariable.inputs().getOrNull())
            .containsExactly(
                TimestampOfPropertyVariable.Input.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(timestampOfPropertyVariable.propertyName()).contains("propertyName")
        assertThat(timestampOfPropertyVariable.value()).contains("value")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val timestampOfPropertyVariable =
            TimestampOfPropertyVariable.builder()
                .operator(TimestampOfPropertyVariable.Operator.TIMESTAMP_OF_PROPERTY_VARIABLE)
                .addInput(
                    TimestampOfPropertyVariable.Input.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
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
