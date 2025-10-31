// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.featureflags.portals

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PortalBatchUpsertParamsTest {

    @Test
    fun create() {
        PortalBatchUpsertParams.builder()
            .appId(0)
            .flagName("flagName")
            .addPortalState(
                PortalBatchUpsertParams.PortalState.builder()
                    .flagState(PortalBatchUpsertParams.PortalState.FlagState.OFF)
                    .portalId(0)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PortalBatchUpsertParams.builder()
                .appId(0)
                .flagName("flagName")
                .addPortalState(
                    PortalBatchUpsertParams.PortalState.builder()
                        .flagState(PortalBatchUpsertParams.PortalState.FlagState.OFF)
                        .portalId(0)
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        assertThat(params._pathParam(1)).isEqualTo("flagName")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            PortalBatchUpsertParams.builder()
                .appId(0)
                .flagName("flagName")
                .addPortalState(
                    PortalBatchUpsertParams.PortalState.builder()
                        .flagState(PortalBatchUpsertParams.PortalState.FlagState.OFF)
                        .portalId(0)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.portalStates())
            .containsExactly(
                PortalBatchUpsertParams.PortalState.builder()
                    .flagState(PortalBatchUpsertParams.PortalState.FlagState.OFF)
                    .portalId(0)
                    .build()
            )
    }
}
