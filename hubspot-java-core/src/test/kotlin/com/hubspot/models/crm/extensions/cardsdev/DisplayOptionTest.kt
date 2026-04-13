// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.extensions.cardsdev

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DisplayOptionTest {

    @Test
    fun create() {
        val displayOption =
            DisplayOption.builder()
                .label("label")
                .name("name")
                .type(DisplayOption.Type.DANGER)
                .build()

        assertThat(displayOption.label()).isEqualTo("label")
        assertThat(displayOption.name()).isEqualTo("name")
        assertThat(displayOption.type()).isEqualTo(DisplayOption.Type.DANGER)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val displayOption =
            DisplayOption.builder()
                .label("label")
                .name("name")
                .type(DisplayOption.Type.DANGER)
                .build()

        val roundtrippedDisplayOption =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(displayOption),
                jacksonTypeRef<DisplayOption>(),
            )

        assertThat(roundtrippedDisplayOption).isEqualTo(displayOption)
    }
}
