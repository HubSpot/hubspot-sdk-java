// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.lists

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ListSearchParamsTest {

    @Test
    fun create() {
        ListSearchParams.builder()
            .listSearchRequest(
                ListSearchRequest.builder()
                    .addAdditionalProperty("hs_list_size_week_delta")
                    .offset(0)
                    .count(100)
                    .addListId("string")
                    .addProcessingType("string")
                    .query("Test")
                    .sort("sort")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            ListSearchParams.builder()
                .listSearchRequest(
                    ListSearchRequest.builder()
                        .addAdditionalProperty("hs_list_size_week_delta")
                        .offset(0)
                        .count(100)
                        .addListId("string")
                        .addProcessingType("string")
                        .query("Test")
                        .sort("sort")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                ListSearchRequest.builder()
                    .addAdditionalProperty("hs_list_size_week_delta")
                    .offset(0)
                    .count(100)
                    .addListId("string")
                    .addProcessingType("string")
                    .query("Test")
                    .sort("sort")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ListSearchParams.builder()
                .listSearchRequest(
                    ListSearchRequest.builder()
                        .addAdditionalProperty("hs_list_size_week_delta")
                        .offset(0)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                ListSearchRequest.builder()
                    .addAdditionalProperty("hs_list_size_week_delta")
                    .offset(0)
                    .build()
            )
    }
}
