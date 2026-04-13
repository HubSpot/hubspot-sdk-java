// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GradientTest {

    @Test
    fun create() {
        val gradient =
            Gradient.builder()
                .angle(Angle.builder().units(Angle.Units.DEG).value(0.0).build())
                .addColor(
                    ColorStop.builder()
                        .color(RgbaColor.builder().a(0.0).b(0).g(0).r(0).build())
                        .build()
                )
                .sideOrCorner(
                    SideOrCorner.builder()
                        .horizontalSide(SideOrCorner.HorizontalSide.CENTER)
                        .verticalSide(SideOrCorner.VerticalSide.BOTTOM)
                        .build()
                )
                .build()

        assertThat(gradient.angle())
            .isEqualTo(Angle.builder().units(Angle.Units.DEG).value(0.0).build())
        assertThat(gradient.colors())
            .containsExactly(
                ColorStop.builder().color(RgbaColor.builder().a(0.0).b(0).g(0).r(0).build()).build()
            )
        assertThat(gradient.sideOrCorner())
            .isEqualTo(
                SideOrCorner.builder()
                    .horizontalSide(SideOrCorner.HorizontalSide.CENTER)
                    .verticalSide(SideOrCorner.VerticalSide.BOTTOM)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val gradient =
            Gradient.builder()
                .angle(Angle.builder().units(Angle.Units.DEG).value(0.0).build())
                .addColor(
                    ColorStop.builder()
                        .color(RgbaColor.builder().a(0.0).b(0).g(0).r(0).build())
                        .build()
                )
                .sideOrCorner(
                    SideOrCorner.builder()
                        .horizontalSide(SideOrCorner.HorizontalSide.CENTER)
                        .verticalSide(SideOrCorner.VerticalSide.BOTTOM)
                        .build()
                )
                .build()

        val roundtrippedGradient =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(gradient),
                jacksonTypeRef<Gradient>(),
            )

        assertThat(roundtrippedGradient).isEqualTo(gradient)
    }
}
