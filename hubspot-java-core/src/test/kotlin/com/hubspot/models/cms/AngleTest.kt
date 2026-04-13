// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AngleTest {

    @Test
    fun create() {
        val angle = Angle.builder().units(Angle.Units.DEG).value(0.0).build()

        assertThat(angle.units()).isEqualTo(Angle.Units.DEG)
        assertThat(angle.value()).isEqualTo(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val angle = Angle.builder().units(Angle.Units.DEG).value(0.0).build()

        val roundtrippedAngle =
            jsonMapper.readValue(jsonMapper.writeValueAsString(angle), jacksonTypeRef<Angle>())

        assertThat(roundtrippedAngle).isEqualTo(angle)
    }
}
