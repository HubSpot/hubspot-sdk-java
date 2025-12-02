// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class YearTest {

    @Test
    fun create() {
        val year =
            Year.builder()
                .operator(Year.Operator.YEAR)
                .addInput(JsonValue.from(mapOf<String, Any>()))
                .propertyName("propertyName")
                .value(0.0)
                .build()

        assertThat(year.operator()).isEqualTo(Year.Operator.YEAR)
        assertThat(year.inputs().getOrNull()).containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(year.propertyName()).contains("propertyName")
        assertThat(year.value()).contains(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val year =
            Year.builder()
                .operator(Year.Operator.YEAR)
                .addInput(JsonValue.from(mapOf<String, Any>()))
                .propertyName("propertyName")
                .value(0.0)
                .build()

        val roundtrippedYear =
            jsonMapper.readValue(jsonMapper.writeValueAsString(year), jacksonTypeRef<Year>())

        assertThat(roundtrippedYear).isEqualTo(year)
    }
}
