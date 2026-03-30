// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.events.definitions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RegexPropertyOperationTest {

    @Test
    fun create() {
        val regexPropertyOperation =
            RegexPropertyOperation.builder()
                .caseSensitive(true)
                .includeObjectsWithNoValueSet(true)
                .operationType("operationType")
                .operator(RegexPropertyOperation.Operator.DOES_NOT_MATCH_REGEX)
                .operatorName("operatorName")
                .pattern("pattern")
                .propertyType(RegexPropertyOperation.PropertyType.REGEX)
                .defaultValue("defaultValue")
                .renderSpec("renderSpec")
                .build()

        assertThat(regexPropertyOperation.caseSensitive()).isEqualTo(true)
        assertThat(regexPropertyOperation.includeObjectsWithNoValueSet()).isEqualTo(true)
        assertThat(regexPropertyOperation.operationType()).isEqualTo("operationType")
        assertThat(regexPropertyOperation.operator())
            .isEqualTo(RegexPropertyOperation.Operator.DOES_NOT_MATCH_REGEX)
        assertThat(regexPropertyOperation.operatorName()).isEqualTo("operatorName")
        assertThat(regexPropertyOperation.pattern()).isEqualTo("pattern")
        assertThat(regexPropertyOperation.propertyType())
            .isEqualTo(RegexPropertyOperation.PropertyType.REGEX)
        assertThat(regexPropertyOperation.defaultValue()).contains("defaultValue")
        assertThat(regexPropertyOperation.renderSpec()).contains("renderSpec")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val regexPropertyOperation =
            RegexPropertyOperation.builder()
                .caseSensitive(true)
                .includeObjectsWithNoValueSet(true)
                .operationType("operationType")
                .operator(RegexPropertyOperation.Operator.DOES_NOT_MATCH_REGEX)
                .operatorName("operatorName")
                .pattern("pattern")
                .propertyType(RegexPropertyOperation.PropertyType.REGEX)
                .defaultValue("defaultValue")
                .renderSpec("renderSpec")
                .build()

        val roundtrippedRegexPropertyOperation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(regexPropertyOperation),
                jacksonTypeRef<RegexPropertyOperation>(),
            )

        assertThat(roundtrippedRegexPropertyOperation).isEqualTo(regexPropertyOperation)
    }
}
