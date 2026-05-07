// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RegexMatchesTest {

    @Test
    fun create() {
        val regexMatches =
            RegexMatches.builder()
                .operator(RegexMatches.Operator.REGEX_MATCHES)
                .addInput(JsonValue.from(mapOf<String, Any>()))
                .propertyName("propertyName")
                .value(true)
                .build()

        assertThat(regexMatches.operator()).isEqualTo(RegexMatches.Operator.REGEX_MATCHES)
        assertThat(regexMatches.inputs().getOrNull())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(regexMatches.propertyName()).contains("propertyName")
        assertThat(regexMatches.value()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val regexMatches =
            RegexMatches.builder()
                .operator(RegexMatches.Operator.REGEX_MATCHES)
                .addInput(JsonValue.from(mapOf<String, Any>()))
                .propertyName("propertyName")
                .value(true)
                .build()

        val roundtrippedRegexMatches =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(regexMatches),
                jacksonTypeRef<RegexMatches>(),
            )

        assertThat(roundtrippedRegexMatches).isEqualTo(regexMatches)
    }
}
