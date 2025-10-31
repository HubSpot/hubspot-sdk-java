// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.featureflags

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FlagPutRequestTest {

    @Test
    fun create() {
        val flagPutRequest =
            FlagPutRequest.builder()
                .defaultState(FlagPutRequest.DefaultState.OFF)
                .overrideState(FlagPutRequest.OverrideState.OFF)
                .build()

        assertThat(flagPutRequest.defaultState()).isEqualTo(FlagPutRequest.DefaultState.OFF)
        assertThat(flagPutRequest.overrideState()).contains(FlagPutRequest.OverrideState.OFF)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val flagPutRequest =
            FlagPutRequest.builder()
                .defaultState(FlagPutRequest.DefaultState.OFF)
                .overrideState(FlagPutRequest.OverrideState.OFF)
                .build()

        val roundtrippedFlagPutRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(flagPutRequest),
                jacksonTypeRef<FlagPutRequest>(),
            )

        assertThat(roundtrippedFlagPutRequest).isEqualTo(flagPutRequest)
    }
}
