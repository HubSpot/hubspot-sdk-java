// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubtractTimeTest {

    @Test
    fun create() {
        val subtractTime =
            SubtractTime.builder()
                .operator(SubtractTime.Operator.SUBTRACT_TIME)
                .stringToCheck(
                    SubtractTime.StringToCheck.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .addInput(
                    SubtractTime.Input.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .propertyName("propertyName")
                .value(0.0)
                .build()

        assertThat(subtractTime.operator()).isEqualTo(SubtractTime.Operator.SUBTRACT_TIME)
        assertThat(subtractTime.stringToCheck())
            .isEqualTo(
                SubtractTime.StringToCheck.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(subtractTime.inputs().getOrNull())
            .containsExactly(
                SubtractTime.Input.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(subtractTime.propertyName()).contains("propertyName")
        assertThat(subtractTime.value()).contains(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subtractTime =
            SubtractTime.builder()
                .operator(SubtractTime.Operator.SUBTRACT_TIME)
                .stringToCheck(
                    SubtractTime.StringToCheck.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .addInput(
                    SubtractTime.Input.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .propertyName("propertyName")
                .value(0.0)
                .build()

        val roundtrippedSubtractTime =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subtractTime),
                jacksonTypeRef<SubtractTime>(),
            )

        assertThat(roundtrippedSubtractTime).isEqualTo(subtractTime)
    }
}
