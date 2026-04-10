// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.hubdb

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HubDbTableCloneRequestTest {

    @Test
    fun create() {
        val hubDbTableCloneRequest =
            HubDbTableCloneRequest.builder()
                .copyRows(true)
                .isHubSpotDefined(true)
                .newLabel("newLabel")
                .newName("newName")
                .build()

        assertThat(hubDbTableCloneRequest.copyRows()).isEqualTo(true)
        assertThat(hubDbTableCloneRequest.isHubSpotDefined()).isEqualTo(true)
        assertThat(hubDbTableCloneRequest.newLabel()).contains("newLabel")
        assertThat(hubDbTableCloneRequest.newName()).contains("newName")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val hubDbTableCloneRequest =
            HubDbTableCloneRequest.builder()
                .copyRows(true)
                .isHubSpotDefined(true)
                .newLabel("newLabel")
                .newName("newName")
                .build()

        val roundtrippedHubDbTableCloneRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(hubDbTableCloneRequest),
                jacksonTypeRef<HubDbTableCloneRequest>(),
            )

        assertThat(roundtrippedHubDbTableCloneRequest).isEqualTo(hubDbTableCloneRequest)
    }
}
