// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import com.hubspot.sdk.models.OptionInput
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MediaBridgePropertyUpdateTest {

    @Test
    fun create() {
        val mediaBridgePropertyUpdate =
            MediaBridgePropertyUpdate.builder()
                .calculationFormula("calculationFormula")
                .currencyPropertyName("currencyPropertyName")
                .description("description")
                .displayOrder(0)
                .fieldType(MediaBridgePropertyUpdate.FieldType.BOOLEANCHECKBOX)
                .formField(true)
                .groupName("groupName")
                .hasUniqueValue(true)
                .hidden(true)
                .label("label")
                .numberDisplayHint(MediaBridgePropertyUpdate.NumberDisplayHint.CURRENCY)
                .addOption(
                    OptionInput.builder()
                        .displayOrder(0)
                        .hidden(true)
                        .label("label")
                        .value("value")
                        .description("description")
                        .build()
                )
                .showCurrencySymbol(true)
                .type(MediaBridgePropertyUpdate.Type.BOOL)
                .build()

        assertThat(mediaBridgePropertyUpdate.calculationFormula()).contains("calculationFormula")
        assertThat(mediaBridgePropertyUpdate.currencyPropertyName())
            .contains("currencyPropertyName")
        assertThat(mediaBridgePropertyUpdate.description()).contains("description")
        assertThat(mediaBridgePropertyUpdate.displayOrder()).contains(0)
        assertThat(mediaBridgePropertyUpdate.fieldType())
            .contains(MediaBridgePropertyUpdate.FieldType.BOOLEANCHECKBOX)
        assertThat(mediaBridgePropertyUpdate.formField()).contains(true)
        assertThat(mediaBridgePropertyUpdate.groupName()).contains("groupName")
        assertThat(mediaBridgePropertyUpdate.hasUniqueValue()).contains(true)
        assertThat(mediaBridgePropertyUpdate.hidden()).contains(true)
        assertThat(mediaBridgePropertyUpdate.label()).contains("label")
        assertThat(mediaBridgePropertyUpdate.numberDisplayHint())
            .contains(MediaBridgePropertyUpdate.NumberDisplayHint.CURRENCY)
        assertThat(mediaBridgePropertyUpdate.options().getOrNull())
            .containsExactly(
                OptionInput.builder()
                    .displayOrder(0)
                    .hidden(true)
                    .label("label")
                    .value("value")
                    .description("description")
                    .build()
            )
        assertThat(mediaBridgePropertyUpdate.showCurrencySymbol()).contains(true)
        assertThat(mediaBridgePropertyUpdate.type()).contains(MediaBridgePropertyUpdate.Type.BOOL)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val mediaBridgePropertyUpdate =
            MediaBridgePropertyUpdate.builder()
                .calculationFormula("calculationFormula")
                .currencyPropertyName("currencyPropertyName")
                .description("description")
                .displayOrder(0)
                .fieldType(MediaBridgePropertyUpdate.FieldType.BOOLEANCHECKBOX)
                .formField(true)
                .groupName("groupName")
                .hasUniqueValue(true)
                .hidden(true)
                .label("label")
                .numberDisplayHint(MediaBridgePropertyUpdate.NumberDisplayHint.CURRENCY)
                .addOption(
                    OptionInput.builder()
                        .displayOrder(0)
                        .hidden(true)
                        .label("label")
                        .value("value")
                        .description("description")
                        .build()
                )
                .showCurrencySymbol(true)
                .type(MediaBridgePropertyUpdate.Type.BOOL)
                .build()

        val roundtrippedMediaBridgePropertyUpdate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(mediaBridgePropertyUpdate),
                jacksonTypeRef<MediaBridgePropertyUpdate>(),
            )

        assertThat(roundtrippedMediaBridgePropertyUpdate).isEqualTo(mediaBridgePropertyUpdate)
    }
}
