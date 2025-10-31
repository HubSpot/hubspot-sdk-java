// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.featureflags

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PortalFlagStateResponseTest {

    @Test
    fun create() {
        val portalFlagStateResponse =
            PortalFlagStateResponse.builder()
                .appId(0)
                .flagName("flagName")
                .flagState(PortalFlagStateResponse.FlagState.OFF)
                .portalId(0)
                .build()

        assertThat(portalFlagStateResponse.appId()).isEqualTo(0)
        assertThat(portalFlagStateResponse.flagName()).isEqualTo("flagName")
        assertThat(portalFlagStateResponse.flagState())
            .isEqualTo(PortalFlagStateResponse.FlagState.OFF)
        assertThat(portalFlagStateResponse.portalId()).isEqualTo(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val portalFlagStateResponse =
            PortalFlagStateResponse.builder()
                .appId(0)
                .flagName("flagName")
                .flagState(PortalFlagStateResponse.FlagState.OFF)
                .portalId(0)
                .build()

        val roundtrippedPortalFlagStateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(portalFlagStateResponse),
                jacksonTypeRef<PortalFlagStateResponse>(),
            )

        assertThat(roundtrippedPortalFlagStateResponse).isEqualTo(portalFlagStateResponse)
    }
}
