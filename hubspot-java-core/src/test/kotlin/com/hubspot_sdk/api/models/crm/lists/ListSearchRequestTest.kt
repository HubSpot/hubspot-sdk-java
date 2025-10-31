// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.lists

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ListSearchRequestTest {

    @Test
    fun create() {
        val listSearchRequest =
            ListSearchRequest.builder()
                .addAdditionalProperty("hs_list_size_week_delta")
                .count(100)
                .addListId("string")
                .offset(0)
                .addProcessingType("string")
                .query("Test")
                .sort("sort")
                .build()

        assertThat(listSearchRequest.additionalProperties().getOrNull())
            .containsExactly("hs_list_size_week_delta")
        assertThat(listSearchRequest.count()).contains(100)
        assertThat(listSearchRequest.listIds().getOrNull()).containsExactly("string")
        assertThat(listSearchRequest.offset()).contains(0)
        assertThat(listSearchRequest.processingTypes().getOrNull()).containsExactly("string")
        assertThat(listSearchRequest.query()).contains("Test")
        assertThat(listSearchRequest.sort()).contains("sort")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val listSearchRequest =
            ListSearchRequest.builder()
                .addAdditionalProperty("hs_list_size_week_delta")
                .count(100)
                .addListId("string")
                .offset(0)
                .addProcessingType("string")
                .query("Test")
                .sort("sort")
                .build()

        val roundtrippedListSearchRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(listSearchRequest),
                jacksonTypeRef<ListSearchRequest>(),
            )

        assertThat(roundtrippedListSearchRequest).isEqualTo(listSearchRequest)
    }
}
