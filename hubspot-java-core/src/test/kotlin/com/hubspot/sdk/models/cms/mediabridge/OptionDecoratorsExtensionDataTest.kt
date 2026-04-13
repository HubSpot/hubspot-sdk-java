// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OptionDecoratorsExtensionDataTest {

    @Test
    fun create() {
        val optionDecoratorsExtensionData =
            OptionDecoratorsExtensionData.builder()
                .optionDecorators(
                    OptionDecoratorsExtensionData.OptionDecorators.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf("color" to "BLACK")))
                        .build()
                )
                .optionDecoratorStyle(OptionDecoratorsExtensionData.OptionDecoratorStyle.LABEL_ONLY)
                .build()

        assertThat(optionDecoratorsExtensionData.optionDecorators())
            .isEqualTo(
                OptionDecoratorsExtensionData.OptionDecorators.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf("color" to "BLACK")))
                    .build()
            )
        assertThat(optionDecoratorsExtensionData.optionDecoratorStyle())
            .isEqualTo(OptionDecoratorsExtensionData.OptionDecoratorStyle.LABEL_ONLY)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val optionDecoratorsExtensionData =
            OptionDecoratorsExtensionData.builder()
                .optionDecorators(
                    OptionDecoratorsExtensionData.OptionDecorators.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf("color" to "BLACK")))
                        .build()
                )
                .optionDecoratorStyle(OptionDecoratorsExtensionData.OptionDecoratorStyle.LABEL_ONLY)
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
