// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DateTest {

    @Test
    fun create() {
        val date =
            Date.builder()
                .operator(Date.Operator.DATE)
                .addInput(
                    Date.Input.builder().putAdditionalProperty("foo", JsonValue.from("bar")).build()
                )
                .propertyName("propertyName")
                .value(0.0)
                .build()

        assertThat(date.operator()).isEqualTo(Date.Operator.DATE)
        assertThat(date.inputs().getOrNull())
            .containsExactly(
                Date.Input.builder().putAdditionalProperty("foo", JsonValue.from("bar")).build()
            )
        assertThat(date.propertyName()).contains("propertyName")
        assertThat(date.value()).contains(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val date =
            Date.builder()
                .operator(Date.Operator.DATE)
                .addInput(
                    Date.Input.builder().putAdditionalProperty("foo", JsonValue.from("bar")).build()
                )
                .propertyName("propertyName")
                .value(0.0)
                .build()

        val roundtrippedDate =
            jsonMapper.readValue(jsonMapper.writeValueAsString(date), jacksonTypeRef<Date>())

        assertThat(roundtrippedDate).isEqualTo(date)
    }
}
