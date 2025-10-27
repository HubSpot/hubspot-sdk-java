// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.emails

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicDividerStyleSettingsTest {

    @Test
    fun create() {
        val publicDividerStyleSettings =
            PublicDividerStyleSettings.builder()
                .color(JsonValue.from(mapOf<String, Any>()))
                .height(0)
                .lineType("lineType")
                .build()

        assertThat(publicDividerStyleSettings._color())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(publicDividerStyleSettings.height()).contains(0)
        assertThat(publicDividerStyleSettings.lineType()).contains("lineType")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicDividerStyleSettings =
            PublicDividerStyleSettings.builder()
                .color(JsonValue.from(mapOf<String, Any>()))
                .height(0)
                .lineType("lineType")
                .build()

        val roundtrippedPublicDividerStyleSettings =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicDividerStyleSettings),
                jacksonTypeRef<PublicDividerStyleSettings>(),
            )

        assertThat(roundtrippedPublicDividerStyleSettings).isEqualTo(publicDividerStyleSettings)
    }
}
