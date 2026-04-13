// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.hubdb

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HubDbTableRowBatchCloneRequestTest {

    @Test
    fun create() {
        val hubDbTableRowBatchCloneRequest =
            HubDbTableRowBatchCloneRequest.builder().id("id").name("name").build()

        assertThat(hubDbTableRowBatchCloneRequest.id()).isEqualTo("id")
        assertThat(hubDbTableRowBatchCloneRequest.name()).contains("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val hubDbTableRowBatchCloneRequest =
            HubDbTableRowBatchCloneRequest.builder().id("id").name("name").build()

        val roundtrippedHubDbTableRowBatchCloneRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(hubDbTableRowBatchCloneRequest),
                jacksonTypeRef<HubDbTableRowBatchCloneRequest>(),
            )

        assertThat(roundtrippedHubDbTableRowBatchCloneRequest)
            .isEqualTo(hubDbTableRowBatchCloneRequest)
    }
}
