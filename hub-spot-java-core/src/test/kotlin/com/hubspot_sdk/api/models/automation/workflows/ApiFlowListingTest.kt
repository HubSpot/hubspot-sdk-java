// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.workflows

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiFlowListingTest {

    @Test
    fun create() {
        val apiFlowListing =
            ApiFlowListing.builder()
                .id("101")
                .createdAt(OffsetDateTime.parse("2024-01-08T17:00:52.832+00:00"))
                .flowType("flowType")
                .isEnabled(false)
                .objectTypeId("0-1")
                .revisionId("revisionId")
                .updatedAt(OffsetDateTime.parse("2024-02-26T19:59:04.618+00:00"))
                .name("My example workfow")
                .uuid("my-test-workflow-01")
                .build()

        assertThat(apiFlowListing.id()).isEqualTo("101")
        assertThat(apiFlowListing.createdAt())
            .isEqualTo(OffsetDateTime.parse("2024-01-08T17:00:52.832+00:00"))
        assertThat(apiFlowListing.flowType()).isEqualTo("flowType")
        assertThat(apiFlowListing.isEnabled()).isEqualTo(false)
        assertThat(apiFlowListing.objectTypeId()).isEqualTo("0-1")
        assertThat(apiFlowListing.revisionId()).isEqualTo("revisionId")
        assertThat(apiFlowListing.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2024-02-26T19:59:04.618+00:00"))
        assertThat(apiFlowListing.name()).contains("My example workfow")
        assertThat(apiFlowListing.uuid()).contains("my-test-workflow-01")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val apiFlowListing =
            ApiFlowListing.builder()
                .id("101")
                .createdAt(OffsetDateTime.parse("2024-01-08T17:00:52.832+00:00"))
                .flowType("flowType")
                .isEnabled(false)
                .objectTypeId("0-1")
                .revisionId("revisionId")
                .updatedAt(OffsetDateTime.parse("2024-02-26T19:59:04.618+00:00"))
                .name("My example workfow")
                .uuid("my-test-workflow-01")
                .build()

        val roundtrippedApiFlowListing =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(apiFlowListing),
                jacksonTypeRef<ApiFlowListing>(),
            )

        assertThat(roundtrippedApiFlowListing).isEqualTo(apiFlowListing)
    }
}
