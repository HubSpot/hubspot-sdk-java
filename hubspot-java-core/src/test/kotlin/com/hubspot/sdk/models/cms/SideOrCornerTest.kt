// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SideOrCornerTest {

    @Test
    fun create() {
        val sideOrCorner =
            SideOrCorner.builder()
                .horizontalSide(SideOrCorner.HorizontalSide.CENTER)
                .verticalSide(SideOrCorner.VerticalSide.BOTTOM)
                .build()

        assertThat(sideOrCorner.horizontalSide()).isEqualTo(SideOrCorner.HorizontalSide.CENTER)
        assertThat(sideOrCorner.verticalSide()).isEqualTo(SideOrCorner.VerticalSide.BOTTOM)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sideOrCorner =
            SideOrCorner.builder()
                .horizontalSide(SideOrCorner.HorizontalSide.CENTER)
                .verticalSide(SideOrCorner.VerticalSide.BOTTOM)
                .build()

        val roundtrippedSideOrCorner =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sideOrCorner),
                jacksonTypeRef<SideOrCorner>(),
            )

        assertThat(roundtrippedSideOrCorner).isEqualTo(sideOrCorner)
    }
}
