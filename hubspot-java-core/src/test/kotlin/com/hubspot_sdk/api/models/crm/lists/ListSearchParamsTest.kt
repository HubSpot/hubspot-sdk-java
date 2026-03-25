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
                    .addAdditionalProperty("string")
                    .addListId("string")
                    .offset(0)
                    .addProcessingType("string")
                    .count(0)
                    .objectTypeId("objectTypeId")
                    .query("query")
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
                        .addAdditionalProperty("string")
                        .addListId("string")
                        .offset(0)
                        .addProcessingType("string")
                        .count(0)
                        .objectTypeId("objectTypeId")
                        .query("query")
                        .sort("sort")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                ListSearchRequest.builder()
                    .addAdditionalProperty("string")
                    .addListId("string")
                    .offset(0)
                    .addProcessingType("string")
                    .count(0)
                    .objectTypeId("objectTypeId")
                    .query("query")
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
                        .addAdditionalProperty("string")
                        .addListId("string")
                        .offset(0)
                        .addProcessingType("string")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                ListSearchRequest.builder()
                    .addAdditionalProperty("string")
                    .addListId("string")
                    .offset(0)
                    .addProcessingType("string")
                    .build()
            )
    }
}
