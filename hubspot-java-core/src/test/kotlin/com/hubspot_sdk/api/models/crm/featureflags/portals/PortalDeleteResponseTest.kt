// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.featureflags.portals

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PortalDeleteResponseTest {

    @Test
    fun create() {
        val portalDeleteResponse =
            PortalDeleteResponse.builder()
                .appId(0)
                .flagName("flagName")
                .flagState(PortalDeleteResponse.FlagState.OFF)
                .portalId(0)
                .build()

        assertThat(portalDeleteResponse.appId()).isEqualTo(0)
        assertThat(portalDeleteResponse.flagName()).isEqualTo("flagName")
        assertThat(portalDeleteResponse.flagState()).isEqualTo(PortalDeleteResponse.FlagState.OFF)
        assertThat(portalDeleteResponse.portalId()).isEqualTo(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val portalDeleteResponse =
            PortalDeleteResponse.builder()
                .appId(0)
                .flagName("flagName")
                .flagState(PortalDeleteResponse.FlagState.OFF)
                .portalId(0)
                .build()

        val roundtrippedPortalDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(portalDeleteResponse),
                jacksonTypeRef<PortalDeleteResponse>(),
            )

        assertThat(roundtrippedPortalDeleteResponse).isEqualTo(portalDeleteResponse)
    }
}
