// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExtensionDataTest {

    @Test
    fun create() {
        val extensionData =
            ExtensionData.builder()
                .extensionStatusMap(
                    ExtensionData.ExtensionStatusMap.builder()
                        .putAdditionalProperty("foo", JsonValue.from("OK"))
                        .build()
                )
                .addTag("string")
                .caseChangeTestExtensionData(
                    CaseChangeTestExtensionData.builder()
                        .mood(CaseChangeTestExtensionData.Mood.ANGRY)
                        .build()
                )
                .optionDecoratorsExtensionData(
                    OptionDecoratorsExtensionData.builder()
                        .optionDecorators(
                            OptionDecoratorsExtensionData.OptionDecorators.builder()
                                .putAdditionalProperty(
                                    "foo",
                                    JsonValue.from(mapOf("color" to "BLACK")),
                                )
                                .build()
                        )
                        .optionDecoratorStyle(
                            OptionDecoratorsExtensionData.OptionDecoratorStyle.LABEL_ONLY
                        )
                        .build()
                )
                .requiredPropertiesExtensionData(
                    RequiredPropertiesExtensionData.builder().isRequiredProperty(true).build()
                )
                .softRequiredPropertiesExtensionData(
                    SoftRequiredPropertiesExtensionData.builder()
                        .isSoftRequiredProperty(true)
                        .build()
                )
                .build()

        assertThat(extensionData.extensionStatusMap())
            .isEqualTo(
                ExtensionData.ExtensionStatusMap.builder()
                    .putAdditionalProperty("foo", JsonValue.from("OK"))
                    .build()
            )
        assertThat(extensionData.tags()).containsExactly("string")
        assertThat(extensionData.caseChangeTestExtensionData())
            .contains(
                CaseChangeTestExtensionData.builder()
                    .mood(CaseChangeTestExtensionData.Mood.ANGRY)
                    .build()
            )
        assertThat(extensionData.optionDecoratorsExtensionData())
            .contains(
                OptionDecoratorsExtensionData.builder()
                    .optionDecorators(
                        OptionDecoratorsExtensionData.OptionDecorators.builder()
                            .putAdditionalProperty("foo", JsonValue.from(mapOf("color" to "BLACK")))
                            .build()
                    )
                    .optionDecoratorStyle(
                        OptionDecoratorsExtensionData.OptionDecoratorStyle.LABEL_ONLY
                    )
                    .build()
            )
        assertThat(extensionData.requiredPropertiesExtensionData())
            .contains(RequiredPropertiesExtensionData.builder().isRequiredProperty(true).build())
        assertThat(extensionData.softRequiredPropertiesExtensionData())
            .contains(
                SoftRequiredPropertiesExtensionData.builder().isSoftRequiredProperty(true).build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val extensionData =
            ExtensionData.builder()
                .extensionStatusMap(
                    ExtensionData.ExtensionStatusMap.builder()
                        .putAdditionalProperty("foo", JsonValue.from("OK"))
                        .build()
                )
                .addTag("string")
                .caseChangeTestExtensionData(
                    CaseChangeTestExtensionData.builder()
                        .mood(CaseChangeTestExtensionData.Mood.ANGRY)
                        .build()
                )
                .optionDecoratorsExtensionData(
                    OptionDecoratorsExtensionData.builder()
                        .optionDecorators(
                            OptionDecoratorsExtensionData.OptionDecorators.builder()
                                .putAdditionalProperty(
                                    "foo",
                                    JsonValue.from(mapOf("color" to "BLACK")),
                                )
                                .build()
                        )
                        .optionDecoratorStyle(
                            OptionDecoratorsExtensionData.OptionDecoratorStyle.LABEL_ONLY
                        )
                        .build()
                )
                .requiredPropertiesExtensionData(
                    RequiredPropertiesExtensionData.builder().isRequiredProperty(true).build()
                )
                .softRequiredPropertiesExtensionData(
                    SoftRequiredPropertiesExtensionData.builder()
                        .isSoftRequiredProperty(true)
                        .build()
                )
                .build()

        val roundtrippedExtensionData =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(extensionData),
                jacksonTypeRef<ExtensionData>(),
            )

        assertThat(roundtrippedExtensionData).isEqualTo(extensionData)
    }
}
