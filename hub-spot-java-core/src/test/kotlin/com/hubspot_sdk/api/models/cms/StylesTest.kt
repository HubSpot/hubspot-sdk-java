// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
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
                        .angle(Angle.builder().units("units").value(0.0).build())
                        .addColor(
                            ColorStop.builder()
                                .color(RgbaColor.builder().a(0.0).b(0).g(0).r(0).build())
                                .build()
                        )
                        .sideOrCorner(
                            SideOrCorner.builder()
                                .horizontalSide("horizontalSide")
                                .verticalSide("verticalSide")
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
                .flexboxPositioning("flexboxPositioning")
                .forceFullWidthSection(true)
                .maxWidthSectionCentering(0)
                .verticalAlignment("verticalAlignment")
                .breakpointStyles(
                    Styles.BreakpointStyles.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(
                                mapOf(
                                    "hidden" to true,
                                    "margin" to mapOf<String, Any>(),
                                    "padding" to mapOf<String, Any>(),
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
                    .angle(Angle.builder().units("units").value(0.0).build())
                    .addColor(
                        ColorStop.builder()
                            .color(RgbaColor.builder().a(0.0).b(0).g(0).r(0).build())
                            .build()
                    )
                    .sideOrCorner(
                        SideOrCorner.builder()
                            .horizontalSide("horizontalSide")
                            .verticalSide("verticalSide")
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
        assertThat(styles.flexboxPositioning()).isEqualTo("flexboxPositioning")
        assertThat(styles.forceFullWidthSection()).isEqualTo(true)
        assertThat(styles.maxWidthSectionCentering()).isEqualTo(0)
        assertThat(styles.verticalAlignment()).isEqualTo("verticalAlignment")
        assertThat(styles.breakpointStyles())
            .contains(
                Styles.BreakpointStyles.builder()
                    .putAdditionalProperty(
                        "foo",
                        JsonValue.from(
                            mapOf(
                                "hidden" to true,
                                "margin" to mapOf<String, Any>(),
                                "padding" to mapOf<String, Any>(),
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
                        .angle(Angle.builder().units("units").value(0.0).build())
                        .addColor(
                            ColorStop.builder()
                                .color(RgbaColor.builder().a(0.0).b(0).g(0).r(0).build())
                                .build()
                        )
                        .sideOrCorner(
                            SideOrCorner.builder()
                                .horizontalSide("horizontalSide")
                                .verticalSide("verticalSide")
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
                .flexboxPositioning("flexboxPositioning")
                .forceFullWidthSection(true)
                .maxWidthSectionCentering(0)
                .verticalAlignment("verticalAlignment")
                .breakpointStyles(
                    Styles.BreakpointStyles.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(
                                mapOf(
                                    "hidden" to true,
                                    "margin" to mapOf<String, Any>(),
                                    "padding" to mapOf<String, Any>(),
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
