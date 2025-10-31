// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.featureflags.apps

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AppUpdateResponseTest {

    @Test
    fun create() {
        val appUpdateResponse =
            AppUpdateResponse.builder()
                .appId(0)
                .defaultState(AppUpdateResponse.DefaultState.OFF)
                .flagName("flagName")
                .overrideState(AppUpdateResponse.OverrideState.OFF)
                .build()

        assertThat(appUpdateResponse.appId()).isEqualTo(0)
        assertThat(appUpdateResponse.defaultState()).isEqualTo(AppUpdateResponse.DefaultState.OFF)
        assertThat(appUpdateResponse.flagName()).isEqualTo("flagName")
        assertThat(appUpdateResponse.overrideState()).contains(AppUpdateResponse.OverrideState.OFF)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val appUpdateResponse =
            AppUpdateResponse.builder()
                .appId(0)
                .defaultState(AppUpdateResponse.DefaultState.OFF)
                .flagName("flagName")
                .overrideState(AppUpdateResponse.OverrideState.OFF)
                .build()

        val roundtrippedAppUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(appUpdateResponse),
                jacksonTypeRef<AppUpdateResponse>(),
            )

        assertThat(roundtrippedAppUpdateResponse).isEqualTo(appUpdateResponse)
    }
}
