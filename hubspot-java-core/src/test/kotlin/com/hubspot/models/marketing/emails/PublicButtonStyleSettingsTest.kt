// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.marketing.emails

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.JsonValue
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicButtonStyleSettingsTest {

    @Test
    fun create() {
        val publicButtonStyleSettings =
            PublicButtonStyleSettings.builder()
                .backgroundColor(JsonValue.from(mapOf<String, Any>()))
                .cornerRadius(0)
                .fontStyle(
                    PublicFontStyle.builder()
                        .bold(true)
                        .color("color")
                        .font("font")
                        .italic(true)
                        .size(0)
                        .underline(true)
                        .build()
                )
                .build()

        assertThat(publicButtonStyleSettings._backgroundColor())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(publicButtonStyleSettings.cornerRadius()).contains(0)
        assertThat(publicButtonStyleSettings.fontStyle())
            .contains(
                PublicFontStyle.builder()
                    .bold(true)
                    .color("color")
                    .font("font")
                    .italic(true)
                    .size(0)
                    .underline(true)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicButtonStyleSettings =
            PublicButtonStyleSettings.builder()
                .backgroundColor(JsonValue.from(mapOf<String, Any>()))
                .cornerRadius(0)
                .fontStyle(
                    PublicFontStyle.builder()
                        .bold(true)
                        .color("color")
                        .font("font")
                        .italic(true)
                        .size(0)
                        .underline(true)
                        .build()
                )
                .build()

        val roundtrippedPublicButtonStyleSettings =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicButtonStyleSettings),
                jacksonTypeRef<PublicButtonStyleSettings>(),
            )

        assertThat(roundtrippedPublicButtonStyleSettings).isEqualTo(publicButtonStyleSettings)
    }
}
