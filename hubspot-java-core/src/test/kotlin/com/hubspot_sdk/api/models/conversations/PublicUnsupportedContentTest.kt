// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicUnsupportedContentTest {

    @Test
    fun create() {
        val publicUnsupportedContent =
            PublicUnsupportedContent.builder()
                .type(PublicUnsupportedContent.Type.UNSUPPORTED_CONTENT)
                .build()

        assertThat(publicUnsupportedContent.type())
            .isEqualTo(PublicUnsupportedContent.Type.UNSUPPORTED_CONTENT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicUnsupportedContent =
            PublicUnsupportedContent.builder()
                .type(PublicUnsupportedContent.Type.UNSUPPORTED_CONTENT)
                .build()

        val roundtrippedPublicUnsupportedContent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicUnsupportedContent),
                jacksonTypeRef<PublicUnsupportedContent>(),
            )

        assertThat(roundtrippedPublicUnsupportedContent).isEqualTo(publicUnsupportedContent)
    }
}
