// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HasEmailReplyTest {

    @Test
    fun create() {
        val hasEmailReply =
            HasEmailReply.builder()
                .operator(HasEmailReply.Operator.HAS_EMAIL_REPLY)
                .addInput(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .propertyName("propertyName")
                .value(true)
                .build()

        assertThat(hasEmailReply.operator()).isEqualTo(HasEmailReply.Operator.HAS_EMAIL_REPLY)
        assertThat(hasEmailReply.inputs().getOrNull())
            .containsExactly(
                HasEmailReply.Input.ofConstantBoolean(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
            )
        assertThat(hasEmailReply.propertyName()).contains("propertyName")
        assertThat(hasEmailReply.value()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val hasEmailReply =
            HasEmailReply.builder()
                .operator(HasEmailReply.Operator.HAS_EMAIL_REPLY)
                .addInput(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .propertyName("propertyName")
                .value(true)
                .build()

        val roundtrippedHasEmailReply =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(hasEmailReply),
                jacksonTypeRef<HasEmailReply>(),
            )

        assertThat(roundtrippedHasEmailReply).isEqualTo(hasEmailReply)
    }
}
