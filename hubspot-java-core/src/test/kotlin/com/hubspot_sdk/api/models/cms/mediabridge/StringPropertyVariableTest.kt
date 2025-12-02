// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StringPropertyVariableTest {

    @Test
    fun create() {
        val stringPropertyVariable =
            StringPropertyVariable.builder()
                .operator(StringPropertyVariable.Operator.STRING_PROPERTY_VARIABLE)
                .addInput(
                    StringPropertyVariable.Input.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .propertyName("propertyName")
                .value("value")
                .build()

        assertThat(stringPropertyVariable.operator())
            .isEqualTo(StringPropertyVariable.Operator.STRING_PROPERTY_VARIABLE)
        assertThat(stringPropertyVariable.inputs().getOrNull())
            .containsExactly(
                StringPropertyVariable.Input.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(stringPropertyVariable.propertyName()).contains("propertyName")
        assertThat(stringPropertyVariable.value()).contains("value")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val stringPropertyVariable =
            StringPropertyVariable.builder()
                .operator(StringPropertyVariable.Operator.STRING_PROPERTY_VARIABLE)
                .addInput(
                    StringPropertyVariable.Input.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .propertyName("propertyName")
                .value("value")
                .build()

        val roundtrippedStringPropertyVariable =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(stringPropertyVariable),
                jacksonTypeRef<StringPropertyVariable>(),
            )

        assertThat(roundtrippedStringPropertyVariable).isEqualTo(stringPropertyVariable)
    }
}
