// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HasPlainTextEmailReplyTest {

    @Test
    fun create() {
        val hasPlainTextEmailReply =
            HasPlainTextEmailReply.builder()
                .operator(HasPlainTextEmailReply.Operator.HAS_PLAIN_TEXT_EMAIL_REPLY)
                .addInput(JsonValue.from(mapOf<String, Any>()))
                .propertyName("propertyName")
                .value(true)
                .build()

        assertThat(hasPlainTextEmailReply.operator())
            .isEqualTo(HasPlainTextEmailReply.Operator.HAS_PLAIN_TEXT_EMAIL_REPLY)
        assertThat(hasPlainTextEmailReply.inputs().getOrNull())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(hasPlainTextEmailReply.propertyName()).contains("propertyName")
        assertThat(hasPlainTextEmailReply.value()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val hasPlainTextEmailReply =
            HasPlainTextEmailReply.builder()
                .operator(HasPlainTextEmailReply.Operator.HAS_PLAIN_TEXT_EMAIL_REPLY)
                .addInput(JsonValue.from(mapOf<String, Any>()))
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
