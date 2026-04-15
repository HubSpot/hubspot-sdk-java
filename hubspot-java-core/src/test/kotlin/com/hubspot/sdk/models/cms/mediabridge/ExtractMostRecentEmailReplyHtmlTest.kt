// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
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

        assertThat(extractMostRecentEmailReplyHtml.operator())
            .isEqualTo(
                ExtractMostRecentEmailReplyHtml.Operator.EXTRACT_MOST_RECENT_EMAIL_REPLY_HTML
            )
        assertThat(extractMostRecentEmailReplyHtml.inputs().getOrNull())
            .containsExactly(
                ExtractMostRecentEmailReplyHtml.Input.ofConstantBoolean(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
            )
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

        val roundtrippedExtractMostRecentEmailReplyHtml =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(extractMostRecentEmailReplyHtml),
                jacksonTypeRef<ExtractMostRecentEmailReplyHtml>(),
            )

        assertThat(roundtrippedExtractMostRecentEmailReplyHtml)
            .isEqualTo(extractMostRecentEmailReplyHtml)
    }
}
