// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UpperCaseTest {

    @Test
    fun create() {
        val upperCase =
            UpperCase.builder()
                .operator(UpperCase.Operator.UPPER_CASE)
                .addInput(
                    UpperCase.Input.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .propertyName("propertyName")
                .value("value")
                .build()

        assertThat(upperCase.operator()).isEqualTo(UpperCase.Operator.UPPER_CASE)
        assertThat(upperCase.inputs().getOrNull())
            .containsExactly(
                UpperCase.Input.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(upperCase.propertyName()).contains("propertyName")
        assertThat(upperCase.value()).contains("value")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val upperCase =
            UpperCase.builder()
                .operator(UpperCase.Operator.UPPER_CASE)
                .addInput(
                    UpperCase.Input.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .propertyName("propertyName")
                .value("value")
                .build()

        val roundtrippedUpperCase =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(upperCase),
                jacksonTypeRef<UpperCase>(),
            )

        assertThat(roundtrippedUpperCase).isEqualTo(upperCase)
    }
}
