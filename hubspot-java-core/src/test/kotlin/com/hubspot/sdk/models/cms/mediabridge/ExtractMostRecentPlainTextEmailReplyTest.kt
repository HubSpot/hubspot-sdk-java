// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExtractMostRecentPlainTextEmailReplyTest {

    @Test
    fun create() {
        val extractMostRecentPlainTextEmailReply =
            ExtractMostRecentPlainTextEmailReply.builder()
                .operator(
                    ExtractMostRecentPlainTextEmailReply.Operator
                        .EXTRACT_MOST_RECENT_PLAIN_TEXT_EMAIL_REPLY
                )
                .addInput(JsonValue.from(mapOf<String, Any>()))
                .propertyName("propertyName")
                .value("value")
                .build()

        assertThat(extractMostRecentPlainTextEmailReply.operator())
            .isEqualTo(
                ExtractMostRecentPlainTextEmailReply.Operator
                    .EXTRACT_MOST_RECENT_PLAIN_TEXT_EMAIL_REPLY
            )
        assertThat(extractMostRecentPlainTextEmailReply.inputs().getOrNull())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(extractMostRecentPlainTextEmailReply.propertyName()).contains("propertyName")
        assertThat(extractMostRecentPlainTextEmailReply.value()).contains("value")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val extractMostRecentPlainTextEmailReply =
            ExtractMostRecentPlainTextEmailReply.builder()
                .operator(
                    ExtractMostRecentPlainTextEmailReply.Operator
                        .EXTRACT_MOST_RECENT_PLAIN_TEXT_EMAIL_REPLY
                )
                .addInput(JsonValue.from(mapOf<String, Any>()))
                .propertyName("propertyName")
                .value("value")
                .build()

        val roundtrippedExtractMostRecentPlainTextEmailReply =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(extractMostRecentPlainTextEmailReply),
                jacksonTypeRef<ExtractMostRecentPlainTextEmailReply>(),
            )

        assertThat(roundtrippedExtractMostRecentPlainTextEmailReply)
            .isEqualTo(extractMostRecentPlainTextEmailReply)
    }
}
