// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ErrorDetailTest {

    @Test
    fun create() {
        val errorDetail =
            ErrorDetail.builder()
                .message("message")
                .code("code")
                .context(
                    ErrorDetail.Context.builder()
                        .putAdditionalProperty(
                            "missingScopes",
                            JsonValue.from(listOf("scope1", "scope2")),
                        )
                        .build()
                )
                .in_("in")
                .subCategory("subCategory")
                .build()

        assertThat(errorDetail.message()).isEqualTo("message")
        assertThat(errorDetail.code()).contains("code")
        assertThat(errorDetail.context())
            .contains(
                ErrorDetail.Context.builder()
                    .putAdditionalProperty(
                        "missingScopes",
                        JsonValue.from(listOf("scope1", "scope2")),
                    )
                    .build()
            )
        assertThat(errorDetail.in_()).contains("in")
        assertThat(errorDetail.subCategory()).contains("subCategory")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val errorDetail =
            ErrorDetail.builder()
                .message("message")
                .code("code")
                .context(
                    ErrorDetail.Context.builder()
                        .putAdditionalProperty(
                            "missingScopes",
                            JsonValue.from(listOf("scope1", "scope2")),
                        )
                        .build()
                )
                .in_("in")
                .subCategory("subCategory")
                .build()

        val roundtrippedErrorDetail =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(errorDetail),
                jacksonTypeRef<ErrorDetail>(),
            )

        assertThat(roundtrippedErrorDetail).isEqualTo(errorDetail)
    }
}
