// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LayoutSectionTest {

    @Test
    fun create() {
        val layoutSection =
            LayoutSection.builder()
                .cells(listOf())
                .cssClass("cssClass")
                .cssId("cssId")
                .cssStyle("cssStyle")
                .label("label")
                .name("name")
                .params(
                    LayoutSection.Params.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .addRowMetaData(
                    RowMetaData.builder()
                        .cssClass("cssClass")
                        .styles(
                            Styles.builder()
                                .backgroundColor(RgbaColor.builder().a(0.0).b(0).g(0).r(0).build())
                                .backgroundGradient(
                                    Gradient.builder()
                                        .angle(Angle.builder().units("units").value(0.0).build())
                                        .addColor(
                                            ColorStop.builder()
                                                .color(
                                                    RgbaColor.builder()
                                                        .a(0.0)
                                                        .b(0)
                                                        .g(0)
                                                        .r(0)
                                                        .build()
                                                )
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
                        )
                        .build()
                )
                .addRow(LayoutSection.Row.builder().build())
                .styles(
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
                )
                .type("type")
                .w(0)
                .x(0)
                .build()

        assertThat(layoutSection.cells()).containsExactly()
        assertThat(layoutSection.cssClass()).isEqualTo("cssClass")
        assertThat(layoutSection.cssId()).isEqualTo("cssId")
        assertThat(layoutSection.cssStyle()).isEqualTo("cssStyle")
        assertThat(layoutSection.label()).isEqualTo("label")
        assertThat(layoutSection.name()).isEqualTo("name")
        assertThat(layoutSection.params())
            .isEqualTo(
                LayoutSection.Params.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
        assertThat(layoutSection.rowMetaData())
            .containsExactly(
                RowMetaData.builder()
                    .cssClass("cssClass")
                    .styles(
                        Styles.builder()
                            .backgroundColor(RgbaColor.builder().a(0.0).b(0).g(0).r(0).build())
                            .backgroundGradient(
                                Gradient.builder()
                                    .angle(Angle.builder().units("units").value(0.0).build())
                                    .addColor(
                                        ColorStop.builder()
                                            .color(
                                                RgbaColor.builder().a(0.0).b(0).g(0).r(0).build()
                                            )
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
                    )
                    .build()
            )
        assertThat(layoutSection.rows()).containsExactly(LayoutSection.Row.builder().build())
        assertThat(layoutSection.styles())
            .isEqualTo(
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
            )
        assertThat(layoutSection.type()).isEqualTo("type")
        assertThat(layoutSection.w()).isEqualTo(0)
        assertThat(layoutSection.x()).isEqualTo(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val layoutSection =
            LayoutSection.builder()
                .cells(listOf())
                .cssClass("cssClass")
                .cssId("cssId")
                .cssStyle("cssStyle")
                .label("label")
                .name("name")
                .params(
                    LayoutSection.Params.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .addRowMetaData(
                    RowMetaData.builder()
                        .cssClass("cssClass")
                        .styles(
                            Styles.builder()
                                .backgroundColor(RgbaColor.builder().a(0.0).b(0).g(0).r(0).build())
                                .backgroundGradient(
                                    Gradient.builder()
                                        .angle(Angle.builder().units("units").value(0.0).build())
                                        .addColor(
                                            ColorStop.builder()
                                                .color(
                                                    RgbaColor.builder()
                                                        .a(0.0)
                                                        .b(0)
                                                        .g(0)
                                                        .r(0)
                                                        .build()
                                                )
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
                        )
                        .build()
                )
                .addRow(LayoutSection.Row.builder().build())
                .styles(
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
                )
                .type("type")
                .w(0)
                .x(0)
                .build()

        val roundtrippedLayoutSection =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(layoutSection),
                jacksonTypeRef<LayoutSection>(),
            )

        assertThat(roundtrippedLayoutSection).isEqualTo(layoutSection)
    }
}
