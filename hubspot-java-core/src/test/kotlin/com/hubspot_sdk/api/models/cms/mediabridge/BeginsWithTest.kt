// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BeginsWithTest {

    @Test
    fun create() {
        val beginsWith =
            BeginsWith.builder()
                .operator(BeginsWith.Operator.BEGINS_WITH)
                .stringToCheck(
                    BeginsWith.StringToCheck.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .addInput(
                    BeginsWith.Input.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .propertyName("propertyName")
                .value(true)
                .build()

        assertThat(beginsWith.operator()).isEqualTo(BeginsWith.Operator.BEGINS_WITH)
        assertThat(beginsWith.stringToCheck())
            .isEqualTo(
                BeginsWith.StringToCheck.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(beginsWith.inputs().getOrNull())
            .containsExactly(
                BeginsWith.Input.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(beginsWith.propertyName()).contains("propertyName")
        assertThat(beginsWith.value()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val beginsWith =
            BeginsWith.builder()
                .operator(BeginsWith.Operator.BEGINS_WITH)
                .stringToCheck(
                    BeginsWith.StringToCheck.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .addInput(
                    BeginsWith.Input.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .propertyName("propertyName")
                .value(true)
                .build()

        val roundtrippedBeginsWith =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(beginsWith),
                jacksonTypeRef<BeginsWith>(),
            )

        assertThat(roundtrippedBeginsWith).isEqualTo(beginsWith)
    }
}
