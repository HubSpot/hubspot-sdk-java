// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.featureflags

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FlagResponseTest {

    @Test
    fun create() {
        val flagResponse =
            FlagResponse.builder()
                .appId(0)
                .defaultState(FlagResponse.DefaultState.OFF)
                .flagName("flagName")
                .overrideState(FlagResponse.OverrideState.OFF)
                .build()

        assertThat(flagResponse.appId()).isEqualTo(0)
        assertThat(flagResponse.defaultState()).isEqualTo(FlagResponse.DefaultState.OFF)
        assertThat(flagResponse.flagName()).isEqualTo("flagName")
        assertThat(flagResponse.overrideState()).contains(FlagResponse.OverrideState.OFF)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val flagResponse =
            FlagResponse.builder()
                .appId(0)
                .defaultState(FlagResponse.DefaultState.OFF)
                .flagName("flagName")
                .overrideState(FlagResponse.OverrideState.OFF)
                .build()

        val roundtrippedFlagResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(flagResponse),
                jacksonTypeRef<FlagResponse>(),
            )

        assertThat(roundtrippedFlagResponse).isEqualTo(flagResponse)
    }
}
