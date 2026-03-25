// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.datastudio.datasource

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ParameterizedHeaderTest {

    @Test
    fun create() {
        val parameterizedHeader =
            ParameterizedHeader.builder()
                .parameters(
                    ParameterizedHeader.Parameters.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .value("value")
                .build()

        assertThat(parameterizedHeader.parameters())
            .isEqualTo(
                ParameterizedHeader.Parameters.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(parameterizedHeader.value()).isEqualTo("value")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val parameterizedHeader =
            ParameterizedHeader.builder()
                .parameters(
                    ParameterizedHeader.Parameters.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .value("value")
                .build()

        val roundtrippedParameterizedHeader =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(parameterizedHeader),
                jacksonTypeRef<ParameterizedHeader>(),
            )

        assertThat(roundtrippedParameterizedHeader).isEqualTo(parameterizedHeader)
    }
}
