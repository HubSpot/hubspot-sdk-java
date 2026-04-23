// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IsPresentTest {

    @Test
    fun create() {
        val isPresent =
            IsPresent.builder()
                .expressionToEvaluate(JsonValue.from(mapOf<String, Any>()))
                .operator(IsPresent.Operator.IS_PRESENT)
                .propertyName("propertyName")
                .value(true)
                .build()

        assertThat(isPresent._expressionToEvaluate())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(isPresent.operator()).isEqualTo(IsPresent.Operator.IS_PRESENT)
        assertThat(isPresent.propertyName()).contains("propertyName")
        assertThat(isPresent.value()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val isPresent =
            IsPresent.builder()
                .expressionToEvaluate(JsonValue.from(mapOf<String, Any>()))
                .operator(IsPresent.Operator.IS_PRESENT)
                .propertyName("propertyName")
                .value(true)
                .build()

        val roundtrippedIsPresent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(isPresent),
                jacksonTypeRef<IsPresent>(),
            )

        assertThat(roundtrippedIsPresent).isEqualTo(isPresent)
    }
}
