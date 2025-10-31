// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.featureflags.portals

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PortalBatchDeleteResponseTest {

    @Test
    fun create() {
        val portalBatchDeleteResponse =
            PortalBatchDeleteResponse.builder()
                .addPortalFlagState(
                    PortalBatchDeleteResponse.PortalFlagState.builder()
                        .appId(0)
                        .flagName("flagName")
                        .flagState(PortalBatchDeleteResponse.PortalFlagState.FlagState.OFF)
                        .portalId(0)
                        .build()
                )
                .build()

        assertThat(portalBatchDeleteResponse.portalFlagStates())
            .containsExactly(
                PortalBatchDeleteResponse.PortalFlagState.builder()
                    .appId(0)
                    .flagName("flagName")
                    .flagState(PortalBatchDeleteResponse.PortalFlagState.FlagState.OFF)
                    .portalId(0)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val portalBatchDeleteResponse =
            PortalBatchDeleteResponse.builder()
                .addPortalFlagState(
                    PortalBatchDeleteResponse.PortalFlagState.builder()
                        .appId(0)
                        .flagName("flagName")
                        .flagState(PortalBatchDeleteResponse.PortalFlagState.FlagState.OFF)
                        .portalId(0)
                        .build()
                )
                .build()

        val roundtrippedPortalBatchDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(portalBatchDeleteResponse),
                jacksonTypeRef<PortalBatchDeleteResponse>(),
            )

        assertThat(roundtrippedPortalBatchDeleteResponse).isEqualTo(portalBatchDeleteResponse)
    }
}
