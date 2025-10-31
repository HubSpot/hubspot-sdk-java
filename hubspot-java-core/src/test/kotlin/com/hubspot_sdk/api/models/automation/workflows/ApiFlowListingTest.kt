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
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .flowType("flowType")
                .isEnabled(true)
                .objectTypeId("objectTypeId")
                .revisionId("revisionId")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .uuid("uuid")
                .build()

        assertThat(apiFlowListing.id()).isEqualTo("id")
        assertThat(apiFlowListing.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(apiFlowListing.flowType()).isEqualTo("flowType")
        assertThat(apiFlowListing.isEnabled()).isEqualTo(true)
        assertThat(apiFlowListing.objectTypeId()).isEqualTo("objectTypeId")
        assertThat(apiFlowListing.revisionId()).isEqualTo("revisionId")
        assertThat(apiFlowListing.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(apiFlowListing.name()).contains("name")
        assertThat(apiFlowListing.uuid()).contains("uuid")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val apiFlowListing =
            ApiFlowListing.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .flowType("flowType")
                .isEnabled(true)
                .objectTypeId("objectTypeId")
                .revisionId("revisionId")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .uuid("uuid")
                .build()

        val roundtrippedApiFlowListing =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(apiFlowListing),
                jacksonTypeRef<ApiFlowListing>(),
            )

        assertThat(roundtrippedApiFlowListing).isEqualTo(apiFlowListing)
    }
}
