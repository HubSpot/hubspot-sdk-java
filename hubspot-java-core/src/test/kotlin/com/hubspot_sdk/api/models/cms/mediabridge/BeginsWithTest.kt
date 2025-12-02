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
                .stringToCheck(JsonValue.from(mapOf<String, Any>()))
                .addInput(JsonValue.from(mapOf<String, Any>()))
                .propertyName("propertyName")
                .value(true)
                .build()

        assertThat(beginsWith.operator()).isEqualTo(BeginsWith.Operator.BEGINS_WITH)
        assertThat(beginsWith._stringToCheck()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(beginsWith.inputs().getOrNull())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(beginsWith.propertyName()).contains("propertyName")
        assertThat(beginsWith.value()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val beginsWith =
            BeginsWith.builder()
                .operator(BeginsWith.Operator.BEGINS_WITH)
                .stringToCheck(JsonValue.from(mapOf<String, Any>()))
                .addInput(JsonValue.from(mapOf<String, Any>()))
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
