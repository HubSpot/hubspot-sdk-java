// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EulerTest {

    @Test
    fun create() {
        val euler =
            Euler.builder()
                .operator(Euler.Operator.EULER)
                .propertyName("propertyName")
                .value(0.0)
                .build()

        assertThat(euler.operator()).isEqualTo(Euler.Operator.EULER)
        assertThat(euler.propertyName()).contains("propertyName")
        assertThat(euler.value()).contains(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val euler =
            Euler.builder()
                .operator(Euler.Operator.EULER)
                .propertyName("propertyName")
                .value(0.0)
                .build()

        val roundtrippedEuler =
            jsonMapper.readValue(jsonMapper.writeValueAsString(euler), jacksonTypeRef<Euler>())

        assertThat(roundtrippedEuler).isEqualTo(euler)
    }
}
