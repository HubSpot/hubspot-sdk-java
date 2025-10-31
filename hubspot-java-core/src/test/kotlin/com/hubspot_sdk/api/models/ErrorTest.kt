// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ErrorTest {

    @Test
    fun create() {
        val error =
            Error.builder()
                .category("VALIDATION_ERROR")
                .correlationId("aeb5f871-7f07-4993-9211-075dc63e7cbf")
                .message("Invalid input (details will vary based on the error)")
                .context(
                    Error.Context.builder()
                        .putAdditionalProperty(
                            "invalidPropertyName",
                            JsonValue.from(listOf("propertyValue")),
                        )
                        .putAdditionalProperty(
                            "missingScopes",
                            JsonValue.from(listOf("scope1", "scope2")),
                        )
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
                    Error.Links.builder()
                        .putAdditionalProperty(
                            "knowledge-base",
                            JsonValue.from(
                                "https://www.hubspot.com/products/service/knowledge-base"
                            ),
                        )
                        .build()
                )
                .subCategory("subCategory")
                .build()

        assertThat(error.category()).isEqualTo("VALIDATION_ERROR")
        assertThat(error.correlationId()).isEqualTo("aeb5f871-7f07-4993-9211-075dc63e7cbf")
        assertThat(error.message())
            .isEqualTo("Invalid input (details will vary based on the error)")
        assertThat(error.context())
            .contains(
                Error.Context.builder()
                    .putAdditionalProperty(
                        "invalidPropertyName",
                        JsonValue.from(listOf("propertyValue")),
                    )
                    .putAdditionalProperty(
                        "missingScopes",
                        JsonValue.from(listOf("scope1", "scope2")),
                    )
                    .build()
            )
        assertThat(error.errors().getOrNull())
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
        assertThat(error.links())
            .contains(
                Error.Links.builder()
                    .putAdditionalProperty(
                        "knowledge-base",
                        JsonValue.from("https://www.hubspot.com/products/service/knowledge-base"),
                    )
                    .build()
            )
        assertThat(error.subCategory()).contains("subCategory")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val error =
            Error.builder()
                .category("VALIDATION_ERROR")
                .correlationId("aeb5f871-7f07-4993-9211-075dc63e7cbf")
                .message("Invalid input (details will vary based on the error)")
                .context(
                    Error.Context.builder()
                        .putAdditionalProperty(
                            "invalidPropertyName",
                            JsonValue.from(listOf("propertyValue")),
                        )
                        .putAdditionalProperty(
                            "missingScopes",
                            JsonValue.from(listOf("scope1", "scope2")),
                        )
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
                    Error.Links.builder()
                        .putAdditionalProperty(
                            "knowledge-base",
                            JsonValue.from(
                                "https://www.hubspot.com/products/service/knowledge-base"
                            ),
                        )
                        .build()
                )
                .subCategory("subCategory")
                .build()

        val roundtrippedError =
            jsonMapper.readValue(jsonMapper.writeValueAsString(error), jacksonTypeRef<Error>())

        assertThat(roundtrippedError).isEqualTo(error)
    }
}
