// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicMessageContentTest {

    @Test
    fun create() {
        val publicMessageContent =
            PublicMessageContent.builder().richText("richText").text("text").build()

        assertThat(publicMessageContent.richText()).contains("richText")
        assertThat(publicMessageContent.text()).contains("text")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicMessageContent =
            PublicMessageContent.builder().richText("richText").text("text").build()

        val roundtrippedPublicMessageContent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicMessageContent),
                jacksonTypeRef<PublicMessageContent>(),
            )

        assertThat(roundtrippedPublicMessageContent).isEqualTo(publicMessageContent)
    }
}
