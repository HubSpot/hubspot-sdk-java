// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExtractMostRecentEmailReplyTextTest {

    @Test
    fun create() {
        val extractMostRecentEmailReplyText =
            ExtractMostRecentEmailReplyText.builder()
                .operator(
                    ExtractMostRecentEmailReplyText.Operator.EXTRACT_MOST_RECENT_EMAIL_REPLY_TEXT
                )
                .addInput(JsonValue.from(mapOf<String, Any>()))
                .propertyName("propertyName")
                .value("value")
                .build()

        assertThat(extractMostRecentEmailReplyText.operator())
            .isEqualTo(
                ExtractMostRecentEmailReplyText.Operator.EXTRACT_MOST_RECENT_EMAIL_REPLY_TEXT
            )
        assertThat(extractMostRecentEmailReplyText.inputs().getOrNull())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(extractMostRecentEmailReplyText.propertyName()).contains("propertyName")
        assertThat(extractMostRecentEmailReplyText.value()).contains("value")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val extractMostRecentEmailReplyText =
            ExtractMostRecentEmailReplyText.builder()
                .operator(
                    ExtractMostRecentEmailReplyText.Operator.EXTRACT_MOST_RECENT_EMAIL_REPLY_TEXT
                )
                .addInput(JsonValue.from(mapOf<String, Any>()))
                .propertyName("propertyName")
                .value("value")
                .build()

        val roundtrippedExtractMostRecentEmailReplyText =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(extractMostRecentEmailReplyText),
                jacksonTypeRef<ExtractMostRecentEmailReplyText>(),
            )

        assertThat(roundtrippedExtractMostRecentEmailReplyText)
            .isEqualTo(extractMostRecentEmailReplyText)
    }
}
