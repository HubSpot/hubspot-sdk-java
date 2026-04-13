// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.JsonValue
import com.hubspot.core.jsonMapper
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
                        .putAdditionalProperty("0", JsonValue.from(listOf("string")))
                        .putAdditionalProperty("1", JsonValue.from(listOf("string")))
                        .putAdditionalProperty("2", JsonValue.from(listOf("string")))
                        .putAdditionalProperty("3", JsonValue.from(listOf("string")))
                        .putAdditionalProperty("4", JsonValue.from(listOf("string")))
                        .putAdditionalProperty("5", JsonValue.from(listOf("string")))
                        .putAdditionalProperty("6", JsonValue.from(listOf("string")))
                        .putAdditionalProperty("7", JsonValue.from(listOf("string")))
                        .putAdditionalProperty("8", JsonValue.from(listOf("string")))
                        .putAdditionalProperty("9", JsonValue.from(listOf("string")))
                        .putAdditionalProperty("10", JsonValue.from(listOf("string")))
                        .putAdditionalProperty("11", JsonValue.from(listOf("string")))
                        .putAdditionalProperty("12", JsonValue.from(listOf("string")))
                        .putAdditionalProperty("13", JsonValue.from(listOf("string")))
                        .putAdditionalProperty("14", JsonValue.from(listOf("string")))
                        .putAdditionalProperty("15", JsonValue.from(listOf("string")))
                        .putAdditionalProperty("16", JsonValue.from(listOf("string")))
                        .putAdditionalProperty("17", JsonValue.from(listOf("string")))
                        .putAdditionalProperty("18", JsonValue.from(listOf("string")))
                        .putAdditionalProperty("19", JsonValue.from(listOf("string")))
                        .putAdditionalProperty("20", JsonValue.from(listOf("string")))
                        .putAdditionalProperty("21", JsonValue.from(listOf("string")))
                        .putAdditionalProperty("22", JsonValue.from(listOf("string")))
                        .putAdditionalProperty("23", JsonValue.from(listOf("string")))
                        .putAdditionalProperty("24", JsonValue.from(listOf("string")))
                        .putAdditionalProperty("25", JsonValue.from(listOf("string")))
                        .putAdditionalProperty("26", JsonValue.from(listOf("string")))
                        .putAdditionalProperty("27", JsonValue.from(listOf("string")))
                        .putAdditionalProperty("28", JsonValue.from(listOf("string")))
                        .putAdditionalProperty("29", JsonValue.from(listOf("string")))
                        .putAdditionalProperty("30", JsonValue.from(listOf("string")))
                        .putAdditionalProperty("31", JsonValue.from(listOf("string")))
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
                    .putAdditionalProperty("0", JsonValue.from(listOf("string")))
                    .putAdditionalProperty("1", JsonValue.from(listOf("string")))
                    .putAdditionalProperty("2", JsonValue.from(listOf("string")))
                    .putAdditionalProperty("3", JsonValue.from(listOf("string")))
                    .putAdditionalProperty("4", JsonValue.from(listOf("string")))
                    .putAdditionalProperty("5", JsonValue.from(listOf("string")))
                    .putAdditionalProperty("6", JsonValue.from(listOf("string")))
                    .putAdditionalProperty("7", JsonValue.from(listOf("string")))
                    .putAdditionalProperty("8", JsonValue.from(listOf("string")))
                    .putAdditionalProperty("9", JsonValue.from(listOf("string")))
                    .putAdditionalProperty("10", JsonValue.from(listOf("string")))
                    .putAdditionalProperty("11", JsonValue.from(listOf("string")))
                    .putAdditionalProperty("12", JsonValue.from(listOf("string")))
                    .putAdditionalProperty("13", JsonValue.from(listOf("string")))
                    .putAdditionalProperty("14", JsonValue.from(listOf("string")))
                    .putAdditionalProperty("15", JsonValue.from(listOf("string")))
                    .putAdditionalProperty("16", JsonValue.from(listOf("string")))
                    .putAdditionalProperty("17", JsonValue.from(listOf("string")))
                    .putAdditionalProperty("18", JsonValue.from(listOf("string")))
                    .putAdditionalProperty("19", JsonValue.from(listOf("string")))
                    .putAdditionalProperty("20", JsonValue.from(listOf("string")))
                    .putAdditionalProperty("21", JsonValue.from(listOf("string")))
                    .putAdditionalProperty("22", JsonValue.from(listOf("string")))
                    .putAdditionalProperty("23", JsonValue.from(listOf("string")))
                    .putAdditionalProperty("24", JsonValue.from(listOf("string")))
                    .putAdditionalProperty("25", JsonValue.from(listOf("string")))
                    .putAdditionalProperty("26", JsonValue.from(listOf("string")))
                    .putAdditionalProperty("27", JsonValue.from(listOf("string")))
                    .putAdditionalProperty("28", JsonValue.from(listOf("string")))
                    .putAdditionalProperty("29", JsonValue.from(listOf("string")))
                    .putAdditionalProperty("30", JsonValue.from(listOf("string")))
                    .putAdditionalProperty("31", JsonValue.from(listOf("string")))
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
                        .putAdditionalProperty("0", JsonValue.from(listOf("string")))
                        .putAdditionalProperty("1", JsonValue.from(listOf("string")))
                        .putAdditionalProperty("2", JsonValue.from(listOf("string")))
                        .putAdditionalProperty("3", JsonValue.from(listOf("string")))
                        .putAdditionalProperty("4", JsonValue.from(listOf("string")))
                        .putAdditionalProperty("5", JsonValue.from(listOf("string")))
                        .putAdditionalProperty("6", JsonValue.from(listOf("string")))
                        .putAdditionalProperty("7", JsonValue.from(listOf("string")))
                        .putAdditionalProperty("8", JsonValue.from(listOf("string")))
                        .putAdditionalProperty("9", JsonValue.from(listOf("string")))
                        .putAdditionalProperty("10", JsonValue.from(listOf("string")))
                        .putAdditionalProperty("11", JsonValue.from(listOf("string")))
                        .putAdditionalProperty("12", JsonValue.from(listOf("string")))
                        .putAdditionalProperty("13", JsonValue.from(listOf("string")))
                        .putAdditionalProperty("14", JsonValue.from(listOf("string")))
                        .putAdditionalProperty("15", JsonValue.from(listOf("string")))
                        .putAdditionalProperty("16", JsonValue.from(listOf("string")))
                        .putAdditionalProperty("17", JsonValue.from(listOf("string")))
                        .putAdditionalProperty("18", JsonValue.from(listOf("string")))
                        .putAdditionalProperty("19", JsonValue.from(listOf("string")))
                        .putAdditionalProperty("20", JsonValue.from(listOf("string")))
                        .putAdditionalProperty("21", JsonValue.from(listOf("string")))
                        .putAdditionalProperty("22", JsonValue.from(listOf("string")))
                        .putAdditionalProperty("23", JsonValue.from(listOf("string")))
                        .putAdditionalProperty("24", JsonValue.from(listOf("string")))
                        .putAdditionalProperty("25", JsonValue.from(listOf("string")))
                        .putAdditionalProperty("26", JsonValue.from(listOf("string")))
                        .putAdditionalProperty("27", JsonValue.from(listOf("string")))
                        .putAdditionalProperty("28", JsonValue.from(listOf("string")))
                        .putAdditionalProperty("29", JsonValue.from(listOf("string")))
                        .putAdditionalProperty("30", JsonValue.from(listOf("string")))
                        .putAdditionalProperty("31", JsonValue.from(listOf("string")))
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
