// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.featureflags.apps

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AppListPortalsResponseTest {

    @Test
    fun create() {
        val appListPortalsResponse =
            AppListPortalsResponse.builder()
                .addPortalFlagState(
                    AppListPortalsResponse.PortalFlagState.builder()
                        .appId(0)
                        .flagName("flagName")
                        .flagState(AppListPortalsResponse.PortalFlagState.FlagState.OFF)
                        .portalId(0)
                        .build()
                )
                .build()

        assertThat(appListPortalsResponse.portalFlagStates())
            .containsExactly(
                AppListPortalsResponse.PortalFlagState.builder()
                    .appId(0)
                    .flagName("flagName")
                    .flagState(AppListPortalsResponse.PortalFlagState.FlagState.OFF)
                    .portalId(0)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val appListPortalsResponse =
            AppListPortalsResponse.builder()
                .addPortalFlagState(
                    AppListPortalsResponse.PortalFlagState.builder()
                        .appId(0)
                        .flagName("flagName")
                        .flagState(AppListPortalsResponse.PortalFlagState.FlagState.OFF)
                        .portalId(0)
                        .build()
                )
                .build()

        val roundtrippedAppListPortalsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(appListPortalsResponse),
                jacksonTypeRef<AppListPortalsResponse>(),
            )

        assertThat(roundtrippedAppListPortalsResponse).isEqualTo(appListPortalsResponse)
    }
}
