// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BackgroundImageTest {

    @Test
    fun create() {
        val backgroundImage =
            BackgroundImage.builder()
                .backgroundPosition("backgroundPosition")
                .backgroundSize("backgroundSize")
                .imageUrl("imageUrl")
                .build()

        assertThat(backgroundImage.backgroundPosition()).isEqualTo("backgroundPosition")
        assertThat(backgroundImage.backgroundSize()).isEqualTo("backgroundSize")
        assertThat(backgroundImage.imageUrl()).isEqualTo("imageUrl")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val backgroundImage =
            BackgroundImage.builder()
                .backgroundPosition("backgroundPosition")
                .backgroundSize("backgroundSize")
                .imageUrl("imageUrl")
                .build()

        val roundtrippedBackgroundImage =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(backgroundImage),
                jacksonTypeRef<BackgroundImage>(),
            )

        assertThat(roundtrippedBackgroundImage).isEqualTo(backgroundImage)
    }
}
