// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FilteringMetaDataTest {

    @Test
    fun create() {
        val filteringMetaData =
            FilteringMetaData.builder()
                .includeUnconfirmedUsers(true)
                .addPipelineId("string")
                .build()

        assertThat(filteringMetaData.includeUnconfirmedUsers()).isEqualTo(true)
        assertThat(filteringMetaData.pipelineIds()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val filteringMetaData =
            FilteringMetaData.builder()
                .includeUnconfirmedUsers(true)
                .addPipelineId("string")
                .build()

        val roundtrippedFilteringMetaData =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(filteringMetaData),
                jacksonTypeRef<FilteringMetaData>(),
            )

        assertThat(roundtrippedFilteringMetaData).isEqualTo(filteringMetaData)
    }
}
