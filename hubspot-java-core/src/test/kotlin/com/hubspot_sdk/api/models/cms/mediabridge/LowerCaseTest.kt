// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LowerCaseTest {

    @Test
    fun create() {
        val lowerCase =
            LowerCase.builder()
                .operator(LowerCase.Operator.LOWER_CASE)
                .addInput(
                    LowerCase.Input.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .propertyName("propertyName")
                .value("value")
                .build()

        assertThat(lowerCase.operator()).isEqualTo(LowerCase.Operator.LOWER_CASE)
        assertThat(lowerCase.inputs().getOrNull())
            .containsExactly(
                LowerCase.Input.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(lowerCase.propertyName()).contains("propertyName")
        assertThat(lowerCase.value()).contains("value")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val lowerCase =
            LowerCase.builder()
                .operator(LowerCase.Operator.LOWER_CASE)
                .addInput(
                    LowerCase.Input.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .propertyName("propertyName")
                .value("value")
                .build()

        val roundtrippedLowerCase =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(lowerCase),
                jacksonTypeRef<LowerCase>(),
            )

        assertThat(roundtrippedLowerCase).isEqualTo(lowerCase)
    }
}
