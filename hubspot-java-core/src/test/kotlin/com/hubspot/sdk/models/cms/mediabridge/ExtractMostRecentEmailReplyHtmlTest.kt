// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExtractMostRecentEmailReplyHtmlTest {

    @Test
    fun create() {
        val extractMostRecentEmailReplyHtml =
            ExtractMostRecentEmailReplyHtml.builder()
                .operator(
                    ExtractMostRecentEmailReplyHtml.Operator.EXTRACT_MOST_RECENT_EMAIL_REPLY_HTML
                )
                .addInput(JsonValue.from(mapOf<String, Any>()))
                .propertyName("propertyName")
                .value("value")
                .build()

        assertThat(extractMostRecentEmailReplyHtml.operator())
            .isEqualTo(
                ExtractMostRecentEmailReplyHtml.Operator.EXTRACT_MOST_RECENT_EMAIL_REPLY_HTML
            )
        assertThat(extractMostRecentEmailReplyHtml.inputs().getOrNull())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(extractMostRecentEmailReplyHtml.propertyName()).contains("propertyName")
        assertThat(extractMostRecentEmailReplyHtml.value()).contains("value")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val extractMostRecentEmailReplyHtml =
            ExtractMostRecentEmailReplyHtml.builder()
                .operator(
                    ExtractMostRecentEmailReplyHtml.Operator.EXTRACT_MOST_RECENT_EMAIL_REPLY_HTML
                )
                .addInput(JsonValue.from(mapOf<String, Any>()))
                .propertyName("propertyName")
                .value("value")
                .build()

        val roundtrippedExtractMostRecentEmailReplyHtml =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(extractMostRecentEmailReplyHtml),
                jacksonTypeRef<ExtractMostRecentEmailReplyHtml>(),
            )

        assertThat(roundtrippedExtractMostRecentEmailReplyHtml)
            .isEqualTo(extractMostRecentEmailReplyHtml)
    }
}
