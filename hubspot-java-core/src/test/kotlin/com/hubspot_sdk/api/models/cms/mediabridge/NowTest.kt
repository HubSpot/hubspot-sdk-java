// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NowTest {

    @Test
    fun create() {
        val now =
            Now.builder()
                .operator(Now.Operator.NOW)
                .addInput(
                    Now.Input.builder().putAdditionalProperty("foo", JsonValue.from("bar")).build()
                )
                .propertyName("propertyName")
                .value(0.0)
                .build()

        assertThat(now.operator()).isEqualTo(Now.Operator.NOW)
        assertThat(now.inputs().getOrNull())
            .containsExactly(
                Now.Input.builder().putAdditionalProperty("foo", JsonValue.from("bar")).build()
            )
        assertThat(now.propertyName()).contains("propertyName")
        assertThat(now.value()).contains(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val now =
            Now.builder()
                .operator(Now.Operator.NOW)
                .addInput(
                    Now.Input.builder().putAdditionalProperty("foo", JsonValue.from("bar")).build()
                )
                .propertyName("propertyName")
                .value(0.0)
                .build()

        val roundtrippedNow =
            jsonMapper.readValue(jsonMapper.writeValueAsString(now), jacksonTypeRef<Now>())

        assertThat(roundtrippedNow).isEqualTo(now)
    }
}
