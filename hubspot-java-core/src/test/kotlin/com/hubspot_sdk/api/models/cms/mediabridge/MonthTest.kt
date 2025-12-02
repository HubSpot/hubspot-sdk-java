// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MonthTest {

    @Test
    fun create() {
        val month =
            Month.builder()
                .operator(Month.Operator.MONTH)
                .addInput(
                    Month.Input.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .propertyName("propertyName")
                .value(0.0)
                .build()

        assertThat(month.operator()).isEqualTo(Month.Operator.MONTH)
        assertThat(month.inputs().getOrNull())
            .containsExactly(
                Month.Input.builder().putAdditionalProperty("foo", JsonValue.from("bar")).build()
            )
        assertThat(month.propertyName()).contains("propertyName")
        assertThat(month.value()).contains(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val month =
            Month.builder()
                .operator(Month.Operator.MONTH)
                .addInput(
                    Month.Input.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .propertyName("propertyName")
                .value(0.0)
                .build()

        val roundtrippedMonth =
            jsonMapper.readValue(jsonMapper.writeValueAsString(month), jacksonTypeRef<Month>())

        assertThat(roundtrippedMonth).isEqualTo(month)
    }
}
