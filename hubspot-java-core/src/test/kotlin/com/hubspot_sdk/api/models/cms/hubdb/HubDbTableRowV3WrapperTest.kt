// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.hubdb

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HubDbTableRowV3WrapperTest {

    @Test
    fun create() {
        val hubDbTableRowV3Wrapper = HubDbTableRowV3Wrapper.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val hubDbTableRowV3Wrapper = HubDbTableRowV3Wrapper.builder().build()

        val roundtrippedHubDbTableRowV3Wrapper =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(hubDbTableRowV3Wrapper),
                jacksonTypeRef<HubDbTableRowV3Wrapper>(),
            )

        assertThat(roundtrippedHubDbTableRowV3Wrapper).isEqualTo(hubDbTableRowV3Wrapper)
    }
}
