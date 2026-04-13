// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.JsonValue
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StylesTest {

    @Test
    fun create() {
        val styles =
            Styles.builder()
                .backgroundColor(RgbaColor.builder().a(0.0).b(0).g(0).r(0).build())
                .backgroundGradient(
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
                )
                .backgroundImage(
                    BackgroundImage.builder()
                        .backgroundPosition("backgroundPosition")
                        .backgroundSize("backgroundSize")
                        .imageUrl("imageUrl")
                        .build()
                )
                .flexboxPositioning(Styles.FlexboxPositioning.BOTTOM_CENTER)
                .forceFullWidthSection(true)
                .maxWidthSectionCentering(0)
                .verticalAlignment(Styles.VerticalAlignment.BOTTOM)
                .breakpointStyles(
                    Styles.BreakpointStyles.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(
                                mapOf(
                                    "hidden" to true,
                                    "margin" to
                                        mapOf(
                                            "bottom" to mapOf("units" to "%", "value" to 0),
                                            "top" to mapOf("units" to "%", "value" to 0),
                                        ),
                                    "padding" to
                                        mapOf(
                                            "bottom" to mapOf("units" to "%", "value" to 0),
                                            "left" to mapOf("units" to "%", "value" to 0),
                                            "right" to mapOf("units" to "%", "value" to 0),
                                            "top" to mapOf("units" to "%", "value" to 0),
                                        ),
                                )
                            ),
                        )
                        .build()
                )
                .build()

        assertThat(styles.backgroundColor())
            .isEqualTo(RgbaColor.builder().a(0.0).b(0).g(0).r(0).build())
        assertThat(styles.backgroundGradient())
            .isEqualTo(
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
            )
        assertThat(styles.backgroundImage())
            .isEqualTo(
                BackgroundImage.builder()
                    .backgroundPosition("backgroundPosition")
                    .backgroundSize("backgroundSize")
                    .imageUrl("imageUrl")
                    .build()
            )
        assertThat(styles.flexboxPositioning()).isEqualTo(Styles.FlexboxPositioning.BOTTOM_CENTER)
        assertThat(styles.forceFullWidthSection()).isEqualTo(true)
        assertThat(styles.maxWidthSectionCentering()).isEqualTo(0)
        assertThat(styles.verticalAlignment()).isEqualTo(Styles.VerticalAlignment.BOTTOM)
        assertThat(styles.breakpointStyles())
            .contains(
                Styles.BreakpointStyles.builder()
                    .putAdditionalProperty(
                        "foo",
                        JsonValue.from(
                            mapOf(
                                "hidden" to true,
                                "margin" to
                                    mapOf(
                                        "bottom" to mapOf("units" to "%", "value" to 0),
                                        "top" to mapOf("units" to "%", "value" to 0),
                                    ),
                                "padding" to
                                    mapOf(
                                        "bottom" to mapOf("units" to "%", "value" to 0),
                                        "left" to mapOf("units" to "%", "value" to 0),
                                        "right" to mapOf("units" to "%", "value" to 0),
                                        "top" to mapOf("units" to "%", "value" to 0),
                                    ),
                            )
                        ),
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val styles =
            Styles.builder()
                .backgroundColor(RgbaColor.builder().a(0.0).b(0).g(0).r(0).build())
                .backgroundGradient(
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
                )
                .backgroundImage(
                    BackgroundImage.builder()
                        .backgroundPosition("backgroundPosition")
                        .backgroundSize("backgroundSize")
                        .imageUrl("imageUrl")
                        .build()
                )
                .flexboxPositioning(Styles.FlexboxPositioning.BOTTOM_CENTER)
                .forceFullWidthSection(true)
                .maxWidthSectionCentering(0)
                .verticalAlignment(Styles.VerticalAlignment.BOTTOM)
                .breakpointStyles(
                    Styles.BreakpointStyles.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(
                                mapOf(
                                    "hidden" to true,
                                    "margin" to
                                        mapOf(
                                            "bottom" to mapOf("units" to "%", "value" to 0),
                                            "top" to mapOf("units" to "%", "value" to 0),
                                        ),
                                    "padding" to
                                        mapOf(
                                            "bottom" to mapOf("units" to "%", "value" to 0),
                                            "left" to mapOf("units" to "%", "value" to 0),
                                            "right" to mapOf("units" to "%", "value" to 0),
                                            "top" to mapOf("units" to "%", "value" to 0),
                                        ),
                                )
                            ),
                        )
                        .build()
                )
                .build()

        val roundtrippedStyles =
            jsonMapper.readValue(jsonMapper.writeValueAsString(styles), jacksonTypeRef<Styles>())

        assertThat(roundtrippedStyles).isEqualTo(styles)
    }
}
