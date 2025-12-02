// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
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
                    HasPlainTextEmailReply.Input.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .propertyName("propertyName")
                .value(true)
                .build()

        assertThat(hasPlainTextEmailReply.operator())
            .isEqualTo(HasPlainTextEmailReply.Operator.HAS_PLAIN_TEXT_EMAIL_REPLY)
        assertThat(hasPlainTextEmailReply.inputs().getOrNull())
            .containsExactly(
                HasPlainTextEmailReply.Input.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
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
                    HasPlainTextEmailReply.Input.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
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
