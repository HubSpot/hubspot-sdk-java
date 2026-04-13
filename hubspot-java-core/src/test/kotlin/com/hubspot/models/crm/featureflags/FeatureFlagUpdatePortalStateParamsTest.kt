// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.featureflags

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FeatureFlagUpdatePortalStateParamsTest {

    @Test
    fun create() {
        FeatureFlagUpdatePortalStateParams.builder()
            .appId(0)
            .flagName("flagName")
            .portalId(0)
            .portalFlagStatePutRequest(
                PortalFlagStatePutRequest.builder()
                    .flagState(PortalFlagStatePutRequest.FlagState.ABSENT)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            FeatureFlagUpdatePortalStateParams.builder()
                .appId(0)
                .flagName("flagName")
                .portalId(0)
                .portalFlagStatePutRequest(
                    PortalFlagStatePutRequest.builder()
                        .flagState(PortalFlagStatePutRequest.FlagState.ABSENT)
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        assertThat(params._pathParam(1)).isEqualTo("flagName")
        assertThat(params._pathParam(2)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(3)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            FeatureFlagUpdatePortalStateParams.builder()
                .appId(0)
                .flagName("flagName")
                .portalId(0)
                .portalFlagStatePutRequest(
                    PortalFlagStatePutRequest.builder()
                        .flagState(PortalFlagStatePutRequest.FlagState.ABSENT)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PortalFlagStatePutRequest.builder()
                    .flagState(PortalFlagStatePutRequest.FlagState.ABSENT)
                    .build()
            )
    }
}
