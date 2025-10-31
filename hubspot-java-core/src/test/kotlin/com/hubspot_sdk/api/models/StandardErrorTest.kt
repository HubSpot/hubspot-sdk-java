// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StandardErrorTest {

    @Test
    fun create() {
        val standardError =
            StandardError.builder()
                .category("")
                .context(
                    StandardError.Context.builder()
                        .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                        .build()
                )
                .addError(
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
                )
                .links(
                    StandardError.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .message("")
                .status("")
                .id("")
                .subCategory(JsonValue.from(""))
                .build()

        assertThat(standardError.category()).isEqualTo("")
        assertThat(standardError.context())
            .isEqualTo(
                StandardError.Context.builder()
                    .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                    .build()
            )
        assertThat(standardError.errors())
            .containsExactly(
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
            )
        assertThat(standardError.links())
            .isEqualTo(
                StandardError.Links.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(standardError.message()).isEqualTo("")
        assertThat(standardError.status()).isEqualTo("")
        assertThat(standardError.id()).contains("")
        assertThat(standardError._subCategory()).isEqualTo(JsonValue.from(""))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val standardError =
            StandardError.builder()
                .category("")
                .context(
                    StandardError.Context.builder()
                        .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                        .build()
                )
                .addError(
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
                )
                .links(
                    StandardError.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .message("")
                .status("")
                .id("")
                .subCategory(JsonValue.from(""))
                .build()

        val roundtrippedStandardError =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(standardError),
                jacksonTypeRef<StandardError>(),
            )

        assertThat(roundtrippedStandardError).isEqualTo(standardError)
    }
}
