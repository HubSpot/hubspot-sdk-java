// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SquareRootTest {

    @Test
    fun create() {
        val squareRoot =
            SquareRoot.builder()
                .operator(SquareRoot.Operator.SQUARE_ROOT)
                .addInput(
                    SquareRoot.Input.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .propertyName("propertyName")
                .value(0.0)
                .build()

        assertThat(squareRoot.operator()).isEqualTo(SquareRoot.Operator.SQUARE_ROOT)
        assertThat(squareRoot.inputs().getOrNull())
            .containsExactly(
                SquareRoot.Input.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(squareRoot.propertyName()).contains("propertyName")
        assertThat(squareRoot.value()).contains(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val squareRoot =
            SquareRoot.builder()
                .operator(SquareRoot.Operator.SQUARE_ROOT)
                .addInput(
                    SquareRoot.Input.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .propertyName("propertyName")
                .value(0.0)
                .build()

        val roundtrippedSquareRoot =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(squareRoot),
                jacksonTypeRef<SquareRoot>(),
            )

        assertThat(roundtrippedSquareRoot).isEqualTo(squareRoot)
    }
}
