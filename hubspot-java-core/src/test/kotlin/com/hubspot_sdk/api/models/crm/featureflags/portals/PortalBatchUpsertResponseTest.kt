// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.featureflags.portals

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PortalBatchUpsertResponseTest {

    @Test
    fun create() {
        val portalBatchUpsertResponse =
            PortalBatchUpsertResponse.builder()
                .addPortalFlagState(
                    PortalBatchUpsertResponse.PortalFlagState.builder()
                        .appId(0)
                        .flagName("flagName")
                        .flagState(PortalBatchUpsertResponse.PortalFlagState.FlagState.OFF)
                        .portalId(0)
                        .build()
                )
                .build()

        assertThat(portalBatchUpsertResponse.portalFlagStates())
            .containsExactly(
                PortalBatchUpsertResponse.PortalFlagState.builder()
                    .appId(0)
                    .flagName("flagName")
                    .flagState(PortalBatchUpsertResponse.PortalFlagState.FlagState.OFF)
                    .portalId(0)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val portalBatchUpsertResponse =
            PortalBatchUpsertResponse.builder()
                .addPortalFlagState(
                    PortalBatchUpsertResponse.PortalFlagState.builder()
                        .appId(0)
                        .flagName("flagName")
                        .flagState(PortalBatchUpsertResponse.PortalFlagState.FlagState.OFF)
                        .portalId(0)
                        .build()
                )
                .build()

        val roundtrippedPortalBatchUpsertResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(portalBatchUpsertResponse),
                jacksonTypeRef<PortalBatchUpsertResponse>(),
            )

        assertThat(roundtrippedPortalBatchUpsertResponse).isEqualTo(portalBatchUpsertResponse)
    }
}
