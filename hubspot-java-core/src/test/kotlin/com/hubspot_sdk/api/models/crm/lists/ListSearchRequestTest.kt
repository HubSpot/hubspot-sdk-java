// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.lists

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ListSearchRequestTest {

    @Test
    fun create() {
        val listSearchRequest =
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

        assertThat(listSearchRequest.additionalProperties()).containsExactly("string")
        assertThat(listSearchRequest.listIds()).containsExactly("string")
        assertThat(listSearchRequest.offset()).isEqualTo(0)
        assertThat(listSearchRequest.processingTypes()).containsExactly("string")
        assertThat(listSearchRequest.count()).contains(0)
        assertThat(listSearchRequest.objectTypeId()).contains("objectTypeId")
        assertThat(listSearchRequest.query()).contains("query")
        assertThat(listSearchRequest.sort()).contains("sort")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val listSearchRequest =
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

        val roundtrippedListSearchRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(listSearchRequest),
                jacksonTypeRef<ListSearchRequest>(),
            )

        assertThat(roundtrippedListSearchRequest).isEqualTo(listSearchRequest)
    }
}
