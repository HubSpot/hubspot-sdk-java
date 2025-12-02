// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
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
                .addInput(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .propertyName("propertyName")
                .value("value")
                .build()

        assertThat(extractMostRecentPlainTextEmailReply.operator())
            .isEqualTo(
                ExtractMostRecentPlainTextEmailReply.Operator
                    .EXTRACT_MOST_RECENT_PLAIN_TEXT_EMAIL_REPLY
            )
        assertThat(extractMostRecentPlainTextEmailReply.inputs().getOrNull())
            .containsExactly(
                Expression.ofConstantBoolean(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
            )
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
                .addInput(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
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
