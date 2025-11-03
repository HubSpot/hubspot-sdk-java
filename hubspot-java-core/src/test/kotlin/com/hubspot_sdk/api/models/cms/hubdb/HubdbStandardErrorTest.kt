// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.hubdb

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.ErrorDetail
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HubdbStandardErrorTest {

    @Test
    fun create() {
        val hubdbStandardError =
            HubdbStandardError.builder()
                .category("")
                .context(
                    HubdbStandardError.Context.builder()
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
                    HubdbStandardError.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .message("")
                .status("")
                .subCategory(JsonValue.from(""))
                .id("")
                .build()

        assertThat(hubdbStandardError.category()).isEqualTo("")
        assertThat(hubdbStandardError.context())
            .isEqualTo(
                HubdbStandardError.Context.builder()
                    .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                    .build()
            )
        assertThat(hubdbStandardError.errors())
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
        assertThat(hubdbStandardError.links())
            .isEqualTo(
                HubdbStandardError.Links.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(hubdbStandardError.message()).isEqualTo("")
        assertThat(hubdbStandardError.status()).isEqualTo("")
        assertThat(hubdbStandardError._subCategory()).isEqualTo(JsonValue.from(""))
        assertThat(hubdbStandardError.id()).contains("")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val hubdbStandardError =
            HubdbStandardError.builder()
                .category("")
                .context(
                    HubdbStandardError.Context.builder()
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
                    HubdbStandardError.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .message("")
                .status("")
                .subCategory(JsonValue.from(""))
                .id("")
                .build()

        val roundtrippedHubdbStandardError =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(hubdbStandardError),
                jacksonTypeRef<HubdbStandardError>(),
            )

        assertThat(roundtrippedHubdbStandardError).isEqualTo(hubdbStandardError)
    }
}
