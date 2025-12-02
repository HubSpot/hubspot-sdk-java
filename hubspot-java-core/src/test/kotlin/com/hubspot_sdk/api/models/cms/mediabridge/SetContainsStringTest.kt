// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SetContainsStringTest {

    @Test
    fun create() {
        val setContainsString =
            SetContainsString.builder()
                .operator(SetContainsString.Operator.SET_CONTAINS_STRING)
                .stringToCheck(JsonValue.from(mapOf<String, Any>()))
                .addInput(JsonValue.from(mapOf<String, Any>()))
                .propertyName("propertyName")
                .value(true)
                .build()

        assertThat(setContainsString.operator())
            .isEqualTo(SetContainsString.Operator.SET_CONTAINS_STRING)
        assertThat(setContainsString._stringToCheck())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(setContainsString.inputs().getOrNull())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(setContainsString.propertyName()).contains("propertyName")
        assertThat(setContainsString.value()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val setContainsString =
            SetContainsString.builder()
                .operator(SetContainsString.Operator.SET_CONTAINS_STRING)
                .stringToCheck(JsonValue.from(mapOf<String, Any>()))
                .addInput(JsonValue.from(mapOf<String, Any>()))
                .propertyName("propertyName")
                .value(true)
                .build()

        val roundtrippedSetContainsString =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(setContainsString),
                jacksonTypeRef<SetContainsString>(),
            )

        assertThat(roundtrippedSetContainsString).isEqualTo(setContainsString)
    }
}
