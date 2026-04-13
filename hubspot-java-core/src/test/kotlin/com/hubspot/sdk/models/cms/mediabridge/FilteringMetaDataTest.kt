// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FilteringMetaDataTest {

    @Test
    fun create() {
        val filteringMetaData =
            FilteringMetaData.builder()
                .includeHelpdeskRoutableTeamsOnly(true)
                .includeUnconfirmedUsers(true)
                .addListProcessingType("string")
                .addPipelineId("string")
                .build()

        assertThat(filteringMetaData.includeHelpdeskRoutableTeamsOnly()).isEqualTo(true)
        assertThat(filteringMetaData.includeUnconfirmedUsers()).isEqualTo(true)
        assertThat(filteringMetaData.listProcessingTypes()).containsExactly("string")
        assertThat(filteringMetaData.pipelineIds()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val filteringMetaData =
            FilteringMetaData.builder()
                .includeHelpdeskRoutableTeamsOnly(true)
                .includeUnconfirmedUsers(true)
                .addListProcessingType("string")
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
