// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.featureflags.portals

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PortalUpdateResponseTest {

    @Test
    fun create() {
        val portalUpdateResponse =
            PortalUpdateResponse.builder()
                .appId(0)
                .flagName("flagName")
                .flagState(PortalUpdateResponse.FlagState.OFF)
                .portalId(0)
                .build()

        assertThat(portalUpdateResponse.appId()).isEqualTo(0)
        assertThat(portalUpdateResponse.flagName()).isEqualTo("flagName")
        assertThat(portalUpdateResponse.flagState()).isEqualTo(PortalUpdateResponse.FlagState.OFF)
        assertThat(portalUpdateResponse.portalId()).isEqualTo(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val portalUpdateResponse =
            PortalUpdateResponse.builder()
                .appId(0)
                .flagName("flagName")
                .flagState(PortalUpdateResponse.FlagState.OFF)
                .portalId(0)
                .build()

        val roundtrippedPortalUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(portalUpdateResponse),
                jacksonTypeRef<PortalUpdateResponse>(),
            )

        assertThat(roundtrippedPortalUpdateResponse).isEqualTo(portalUpdateResponse)
    }
}
