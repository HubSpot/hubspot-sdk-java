// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConcatStringsTest {

    @Test
    fun create() {
        val concatStrings =
            ConcatStrings.builder()
                .operator(ConcatStrings.Operator.CONCAT_STRINGS)
                .addInput(JsonValue.from(mapOf<String, Any>()))
                .propertyName("propertyName")
                .value("value")
                .build()

        assertThat(concatStrings.operator()).isEqualTo(ConcatStrings.Operator.CONCAT_STRINGS)
        assertThat(concatStrings.inputs().getOrNull())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(concatStrings.propertyName()).contains("propertyName")
        assertThat(concatStrings.value()).contains("value")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val concatStrings =
            ConcatStrings.builder()
                .operator(ConcatStrings.Operator.CONCAT_STRINGS)
                .addInput(JsonValue.from(mapOf<String, Any>()))
                .propertyName("propertyName")
                .value("value")
                .build()

        val roundtrippedConcatStrings =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(concatStrings),
                jacksonTypeRef<ConcatStrings>(),
            )

        assertThat(roundtrippedConcatStrings).isEqualTo(concatStrings)
    }
}
