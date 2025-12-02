// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HasPlainTextEmailReplyTest {

    @Test
    fun create() {
        val hasPlainTextEmailReply =
            HasPlainTextEmailReply.builder()
                .operator(HasPlainTextEmailReply.Operator.HAS_PLAIN_TEXT_EMAIL_REPLY)
                .addInput(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .propertyName("propertyName")
                .value(true)
                .build()

        assertThat(hasPlainTextEmailReply.operator())
            .isEqualTo(HasPlainTextEmailReply.Operator.HAS_PLAIN_TEXT_EMAIL_REPLY)
        assertThat(hasPlainTextEmailReply.inputs().getOrNull())
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
        assertThat(hasPlainTextEmailReply.propertyName()).contains("propertyName")
        assertThat(hasPlainTextEmailReply.value()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val hasPlainTextEmailReply =
            HasPlainTextEmailReply.builder()
                .operator(HasPlainTextEmailReply.Operator.HAS_PLAIN_TEXT_EMAIL_REPLY)
                .addInput(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .propertyName("propertyName")
                .value(true)
                .build()

        val roundtrippedHasPlainTextEmailReply =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(hasPlainTextEmailReply),
                jacksonTypeRef<HasPlainTextEmailReply>(),
            )

        assertThat(roundtrippedHasPlainTextEmailReply).isEqualTo(hasPlainTextEmailReply)
    }
}
