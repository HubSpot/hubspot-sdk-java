// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.hubdb

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.Error
import com.hubspot_sdk.api.models.ErrorDetail
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ImportResultTest {

    @Test
    fun create() {
        val importResult =
            ImportResult.builder()
                .duplicateRows(0)
                .addError(
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
                )
                .rowLimitExceeded(true)
                .rowsImported(0)
                .build()

        assertThat(importResult.duplicateRows()).isEqualTo(0)
        assertThat(importResult.errors())
            .containsExactly(
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
            )
        assertThat(importResult.rowLimitExceeded()).isEqualTo(true)
        assertThat(importResult.rowsImported()).isEqualTo(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val importResult =
            ImportResult.builder()
                .duplicateRows(0)
                .addError(
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
                )
                .rowLimitExceeded(true)
                .rowsImported(0)
                .build()

        val roundtrippedImportResult =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(importResult),
                jacksonTypeRef<ImportResult>(),
            )

        assertThat(roundtrippedImportResult).isEqualTo(importResult)
    }
}
