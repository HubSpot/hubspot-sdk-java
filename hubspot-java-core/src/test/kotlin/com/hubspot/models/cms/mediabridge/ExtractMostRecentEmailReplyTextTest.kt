// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
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
                .addInput(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .propertyName("propertyName")
                .value("value")
                .build()

        assertThat(extractMostRecentEmailReplyText.operator())
            .isEqualTo(
                ExtractMostRecentEmailReplyText.Operator.EXTRACT_MOST_RECENT_EMAIL_REPLY_TEXT
            )
        assertThat(extractMostRecentEmailReplyText.inputs().getOrNull())
            .containsExactly(
                ExtractMostRecentEmailReplyText.Input.ofConstantBoolean(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
            )
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
                .addInput(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
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
