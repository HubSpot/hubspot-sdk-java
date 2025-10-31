// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.emails

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicFontStyleTest {

    @Test
    fun create() {
        val publicFontStyle =
            PublicFontStyle.builder()
                .bold(true)
                .color("color")
                .font("font")
                .italic(true)
                .size(0)
                .underline(true)
                .build()

        assertThat(publicFontStyle.bold()).contains(true)
        assertThat(publicFontStyle.color()).contains("color")
        assertThat(publicFontStyle.font()).contains("font")
        assertThat(publicFontStyle.italic()).contains(true)
        assertThat(publicFontStyle.size()).contains(0)
        assertThat(publicFontStyle.underline()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicFontStyle =
            PublicFontStyle.builder()
                .bold(true)
                .color("color")
                .font("font")
                .italic(true)
                .size(0)
                .underline(true)
                .build()

        val roundtrippedPublicFontStyle =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicFontStyle),
                jacksonTypeRef<PublicFontStyle>(),
            )

        assertThat(roundtrippedPublicFontStyle).isEqualTo(publicFontStyle)
    }
}
