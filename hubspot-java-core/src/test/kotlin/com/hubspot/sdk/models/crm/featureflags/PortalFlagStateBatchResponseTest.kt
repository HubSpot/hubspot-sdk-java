// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.featureflags

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PortalFlagStateBatchResponseTest {

    @Test
    fun create() {
        val portalFlagStateBatchResponse =
            PortalFlagStateBatchResponse.builder()
                .addPortalFlagState(
                    PortalFlagStateResponse.builder()
                        .appId(0)
                        .flagName("flagName")
                        .flagState(PortalFlagStateResponse.FlagState.ABSENT)
                        .portalId(0)
                        .build()
                )
                .build()

        assertThat(portalFlagStateBatchResponse.portalFlagStates())
            .containsExactly(
                PortalFlagStateResponse.builder()
                    .appId(0)
                    .flagName("flagName")
                    .flagState(PortalFlagStateResponse.FlagState.ABSENT)
                    .portalId(0)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val portalFlagStateBatchResponse =
            PortalFlagStateBatchResponse.builder()
                .addPortalFlagState(
                    PortalFlagStateResponse.builder()
                        .appId(0)
                        .flagName("flagName")
                        .flagState(PortalFlagStateResponse.FlagState.ABSENT)
                        .portalId(0)
                        .build()
                )
                .build()

        val roundtrippedPortalFlagStateBatchResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(portalFlagStateBatchResponse),
                jacksonTypeRef<PortalFlagStateBatchResponse>(),
            )

        assertThat(roundtrippedPortalFlagStateBatchResponse).isEqualTo(portalFlagStateBatchResponse)
    }
}
