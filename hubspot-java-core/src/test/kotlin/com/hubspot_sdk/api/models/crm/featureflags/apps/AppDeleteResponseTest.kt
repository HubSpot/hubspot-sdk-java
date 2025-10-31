// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.featureflags.apps

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AppDeleteResponseTest {

    @Test
    fun create() {
        val appDeleteResponse =
            AppDeleteResponse.builder()
                .appId(0)
                .defaultState(AppDeleteResponse.DefaultState.OFF)
                .flagName("flagName")
                .overrideState(AppDeleteResponse.OverrideState.OFF)
                .build()

        assertThat(appDeleteResponse.appId()).isEqualTo(0)
        assertThat(appDeleteResponse.defaultState()).isEqualTo(AppDeleteResponse.DefaultState.OFF)
        assertThat(appDeleteResponse.flagName()).isEqualTo("flagName")
        assertThat(appDeleteResponse.overrideState()).contains(AppDeleteResponse.OverrideState.OFF)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val appDeleteResponse =
            AppDeleteResponse.builder()
                .appId(0)
                .defaultState(AppDeleteResponse.DefaultState.OFF)
                .flagName("flagName")
                .overrideState(AppDeleteResponse.OverrideState.OFF)
                .build()

        val roundtrippedAppDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(appDeleteResponse),
                jacksonTypeRef<AppDeleteResponse>(),
            )

        assertThat(roundtrippedAppDeleteResponse).isEqualTo(appDeleteResponse)
    }
}
