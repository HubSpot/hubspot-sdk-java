// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.associations.v4

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.ErrorDetail
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StandardError1Test {

    @Test
    fun create() {
        val standardError1 =
            StandardError1.builder()
                .category("category")
                .context(
                    StandardError1.Context.builder()
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
                    StandardError1.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .message("message")
                .status("status")
                .id("id")
                .subCategory(JsonValue.from(mapOf<String, Any>()))
                .build()

        assertThat(standardError1.category()).isEqualTo("category")
        assertThat(standardError1.context())
            .isEqualTo(
                StandardError1.Context.builder()
                    .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                    .build()
            )
        assertThat(standardError1.errors())
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
        assertThat(standardError1.links())
            .isEqualTo(
                StandardError1.Links.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(standardError1.message()).isEqualTo("message")
        assertThat(standardError1.status()).isEqualTo("status")
        assertThat(standardError1.id()).contains("id")
        assertThat(standardError1._subCategory()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val standardError1 =
            StandardError1.builder()
                .category("category")
                .context(
                    StandardError1.Context.builder()
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
                    StandardError1.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .message("message")
                .status("status")
                .id("id")
                .subCategory(JsonValue.from(mapOf<String, Any>()))
                .build()

        val roundtrippedStandardError1 =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(standardError1),
                jacksonTypeRef<StandardError1>(),
            )

        assertThat(roundtrippedStandardError1).isEqualTo(standardError1)
    }
}
