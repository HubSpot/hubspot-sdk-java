// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IfNumberTest {

    @Test
    fun create() {
        val ifNumber =
            IfNumber.builder()
                .enclosedInParentheses(true)
                .ifExpression(
                    IfNumber.IfExpression.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .operator(IfNumber.Operator.IF_NUMBER)
                .elseExpression(
                    IfNumber.ElseExpression.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .addInput(
                    IfNumber.Input.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .propertyName("propertyName")
                .value(0.0)
                .build()

        assertThat(ifNumber.enclosedInParentheses()).isEqualTo(true)
        assertThat(ifNumber.ifExpression())
            .isEqualTo(
                IfNumber.IfExpression.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(ifNumber.operator()).isEqualTo(IfNumber.Operator.IF_NUMBER)
        assertThat(ifNumber.elseExpression())
            .contains(
                IfNumber.ElseExpression.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(ifNumber.inputs().getOrNull())
            .containsExactly(
                IfNumber.Input.builder().putAdditionalProperty("foo", JsonValue.from("bar")).build()
            )
        assertThat(ifNumber.propertyName()).contains("propertyName")
        assertThat(ifNumber.value()).contains(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ifNumber =
            IfNumber.builder()
                .enclosedInParentheses(true)
                .ifExpression(
                    IfNumber.IfExpression.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .operator(IfNumber.Operator.IF_NUMBER)
                .elseExpression(
                    IfNumber.ElseExpression.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .addInput(
                    IfNumber.Input.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .propertyName("propertyName")
                .value(0.0)
                .build()

        val roundtrippedIfNumber =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ifNumber),
                jacksonTypeRef<IfNumber>(),
            )

        assertThat(roundtrippedIfNumber).isEqualTo(ifNumber)
    }
}
