// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SideOrCornerTest {

    @Test
    fun create() {
        val sideOrCorner =
            SideOrCorner.builder()
                .horizontalSide("horizontalSide")
                .verticalSide("verticalSide")
                .build()

        assertThat(sideOrCorner.horizontalSide()).isEqualTo("horizontalSide")
        assertThat(sideOrCorner.verticalSide()).isEqualTo("verticalSide")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sideOrCorner =
            SideOrCorner.builder()
                .horizontalSide("horizontalSide")
                .verticalSide("verticalSide")
                .build()

        val roundtrippedSideOrCorner =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sideOrCorner),
                jacksonTypeRef<SideOrCorner>(),
            )

        assertThat(roundtrippedSideOrCorner).isEqualTo(sideOrCorner)
    }
}
