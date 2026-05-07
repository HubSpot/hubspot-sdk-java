// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AddTimeTest {

    @Test
    fun create() {
        val addTime =
            AddTime.builder()
                .operator(AddTime.Operator.ADD_TIME)
                .stringToCheck(JsonValue.from(mapOf<String, Any>()))
                .addInput(JsonValue.from(mapOf<String, Any>()))
                .propertyName("propertyName")
                .value(0.0)
                .build()

        assertThat(addTime.operator()).isEqualTo(AddTime.Operator.ADD_TIME)
        assertThat(addTime._stringToCheck()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(addTime.inputs().getOrNull())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(addTime.propertyName()).contains("propertyName")
        assertThat(addTime.value()).contains(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val addTime =
            AddTime.builder()
                .operator(AddTime.Operator.ADD_TIME)
                .stringToCheck(JsonValue.from(mapOf<String, Any>()))
                .addInput(JsonValue.from(mapOf<String, Any>()))
                .propertyName("propertyName")
                .value(0.0)
                .build()

        val roundtrippedAddTime =
            jsonMapper.readValue(jsonMapper.writeValueAsString(addTime), jacksonTypeRef<AddTime>())

        assertThat(roundtrippedAddTime).isEqualTo(addTime)
    }
}
