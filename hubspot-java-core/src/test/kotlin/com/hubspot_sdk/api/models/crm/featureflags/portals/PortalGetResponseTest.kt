// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.featureflags.portals

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PortalGetResponseTest {

    @Test
    fun create() {
        val portalGetResponse =
            PortalGetResponse.builder()
                .appId(0)
                .flagName("flagName")
                .flagState(PortalGetResponse.FlagState.OFF)
                .portalId(0)
                .build()

        assertThat(portalGetResponse.appId()).isEqualTo(0)
        assertThat(portalGetResponse.flagName()).isEqualTo("flagName")
        assertThat(portalGetResponse.flagState()).isEqualTo(PortalGetResponse.FlagState.OFF)
        assertThat(portalGetResponse.portalId()).isEqualTo(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val portalGetResponse =
            PortalGetResponse.builder()
                .appId(0)
                .flagName("flagName")
                .flagState(PortalGetResponse.FlagState.OFF)
                .portalId(0)
                .build()

        val roundtrippedPortalGetResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(portalGetResponse),
                jacksonTypeRef<PortalGetResponse>(),
            )

        assertThat(roundtrippedPortalGetResponse).isEqualTo(portalGetResponse)
    }
}
