// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.objects

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SimplePublicObjectInputTest {

    @Test
    fun create() {
        val simplePublicObjectInput =
            SimplePublicObjectInput.builder()
                .properties(
                    SimplePublicObjectInput.Properties.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(simplePublicObjectInput.properties())
            .isEqualTo(
                SimplePublicObjectInput.Properties.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val simplePublicObjectInput =
            SimplePublicObjectInput.builder()
                .properties(
                    SimplePublicObjectInput.Properties.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedSimplePublicObjectInput =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(simplePublicObjectInput),
                jacksonTypeRef<SimplePublicObjectInput>(),
            )

        assertThat(roundtrippedSimplePublicObjectInput).isEqualTo(simplePublicObjectInput)
    }
}
