// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OptionDecoratorsExtensionDataTest {

    @Test
    fun create() {
        val optionDecoratorsExtensionData =
            OptionDecoratorsExtensionData.builder()
                .optionDecorators(
                    OptionDecoratorsExtensionData.OptionDecorators.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf("color" to "color")))
                        .build()
                )
                .optionDecoratorStyle("optionDecoratorStyle")
                .build()

        assertThat(optionDecoratorsExtensionData.optionDecorators())
            .isEqualTo(
                OptionDecoratorsExtensionData.OptionDecorators.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf("color" to "color")))
                    .build()
            )
        assertThat(optionDecoratorsExtensionData.optionDecoratorStyle())
            .isEqualTo("optionDecoratorStyle")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val optionDecoratorsExtensionData =
            OptionDecoratorsExtensionData.builder()
                .optionDecorators(
                    OptionDecoratorsExtensionData.OptionDecorators.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf("color" to "color")))
                        .build()
                )
                .optionDecoratorStyle("optionDecoratorStyle")
                .build()

        val roundtrippedOptionDecoratorsExtensionData =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(optionDecoratorsExtensionData),
                jacksonTypeRef<OptionDecoratorsExtensionData>(),
            )

        assertThat(roundtrippedOptionDecoratorsExtensionData)
            .isEqualTo(optionDecoratorsExtensionData)
    }
}
