// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.featureflags.apps

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AppGetResponseTest {

    @Test
    fun create() {
        val appGetResponse =
            AppGetResponse.builder()
                .appId(0)
                .defaultState(AppGetResponse.DefaultState.OFF)
                .flagName("flagName")
                .overrideState(AppGetResponse.OverrideState.OFF)
                .build()

        assertThat(appGetResponse.appId()).isEqualTo(0)
        assertThat(appGetResponse.defaultState()).isEqualTo(AppGetResponse.DefaultState.OFF)
        assertThat(appGetResponse.flagName()).isEqualTo("flagName")
        assertThat(appGetResponse.overrideState()).contains(AppGetResponse.OverrideState.OFF)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val appGetResponse =
            AppGetResponse.builder()
                .appId(0)
                .defaultState(AppGetResponse.DefaultState.OFF)
                .flagName("flagName")
                .overrideState(AppGetResponse.OverrideState.OFF)
                .build()

        val roundtrippedAppGetResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(appGetResponse),
                jacksonTypeRef<AppGetResponse>(),
            )

        assertThat(roundtrippedAppGetResponse).isEqualTo(appGetResponse)
    }
}
