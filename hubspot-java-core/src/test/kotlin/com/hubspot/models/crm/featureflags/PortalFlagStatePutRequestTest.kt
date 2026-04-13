// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.featureflags

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PortalFlagStatePutRequestTest {

    @Test
    fun create() {
        val portalFlagStatePutRequest =
            PortalFlagStatePutRequest.builder()
                .flagState(PortalFlagStatePutRequest.FlagState.ABSENT)
                .build()

        assertThat(portalFlagStatePutRequest.flagState())
            .isEqualTo(PortalFlagStatePutRequest.FlagState.ABSENT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val portalFlagStatePutRequest =
            PortalFlagStatePutRequest.builder()
                .flagState(PortalFlagStatePutRequest.FlagState.ABSENT)
                .build()

        val roundtrippedPortalFlagStatePutRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(portalFlagStatePutRequest),
                jacksonTypeRef<PortalFlagStatePutRequest>(),
            )

        assertThat(roundtrippedPortalFlagStatePutRequest).isEqualTo(portalFlagStatePutRequest)
    }
}
