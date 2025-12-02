// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StringEqualsTest {

    @Test
    fun create() {
        val stringEquals =
            StringEquals.builder()
                .operator(StringEquals.Operator.STRING_EQUALS)
                .addInput(
                    StringEquals.Input.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .propertyName("propertyName")
                .value(true)
                .build()

        assertThat(stringEquals.operator()).isEqualTo(StringEquals.Operator.STRING_EQUALS)
        assertThat(stringEquals.inputs().getOrNull())
            .containsExactly(
                StringEquals.Input.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(stringEquals.propertyName()).contains("propertyName")
        assertThat(stringEquals.value()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val stringEquals =
            StringEquals.builder()
                .operator(StringEquals.Operator.STRING_EQUALS)
                .addInput(
                    StringEquals.Input.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .propertyName("propertyName")
                .value(true)
                .build()

        val roundtrippedStringEquals =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(stringEquals),
                jacksonTypeRef<StringEquals>(),
            )

        assertThat(roundtrippedStringEquals).isEqualTo(stringEquals)
    }
}
