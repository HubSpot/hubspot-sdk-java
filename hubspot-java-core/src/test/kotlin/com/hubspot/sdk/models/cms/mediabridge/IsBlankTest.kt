// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IsBlankTest {

    @Test
    fun create() {
        val isBlank =
            IsBlank.builder()
                .operator(IsBlank.Operator.IS_BLANK)
                .addInput(JsonValue.from(mapOf<String, Any>()))
                .propertyName("propertyName")
                .value(true)
                .build()

        assertThat(isBlank.operator()).isEqualTo(IsBlank.Operator.IS_BLANK)
        assertThat(isBlank.inputs().getOrNull())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(isBlank.propertyName()).contains("propertyName")
        assertThat(isBlank.value()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val isBlank =
            IsBlank.builder()
                .operator(IsBlank.Operator.IS_BLANK)
                .addInput(JsonValue.from(mapOf<String, Any>()))
                .propertyName("propertyName")
                .value(true)
                .build()

        val roundtrippedIsBlank =
            jsonMapper.readValue(jsonMapper.writeValueAsString(isBlank), jacksonTypeRef<IsBlank>())

        assertThat(roundtrippedIsBlank).isEqualTo(isBlank)
    }
}
