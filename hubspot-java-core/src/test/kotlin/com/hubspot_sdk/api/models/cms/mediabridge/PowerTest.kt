// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PowerTest {

    @Test
    fun create() {
        val power =
            Power.builder()
                .operator(Power.Operator.POWER)
                .addInput(
                    Power.Input.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .propertyName("propertyName")
                .value(0.0)
                .build()

        assertThat(power.operator()).isEqualTo(Power.Operator.POWER)
        assertThat(power.inputs().getOrNull())
            .containsExactly(
                Power.Input.builder().putAdditionalProperty("foo", JsonValue.from("bar")).build()
            )
        assertThat(power.propertyName()).contains("propertyName")
        assertThat(power.value()).contains(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val power =
            Power.builder()
                .operator(Power.Operator.POWER)
                .addInput(
                    Power.Input.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .propertyName("propertyName")
                .value(0.0)
                .build()

        val roundtrippedPower =
            jsonMapper.readValue(jsonMapper.writeValueAsString(power), jacksonTypeRef<Power>())

        assertThat(roundtrippedPower).isEqualTo(power)
    }
}
