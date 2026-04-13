// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.featureflags

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FlagPutRequestTest {

    @Test
    fun create() {
        val flagPutRequest =
            FlagPutRequest.builder()
                .defaultState(FlagPutRequest.DefaultState.ABSENT)
                .overrideState(FlagPutRequest.OverrideState.ABSENT)
                .build()

        assertThat(flagPutRequest.defaultState()).isEqualTo(FlagPutRequest.DefaultState.ABSENT)
        assertThat(flagPutRequest.overrideState()).contains(FlagPutRequest.OverrideState.ABSENT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val flagPutRequest =
            FlagPutRequest.builder()
                .defaultState(FlagPutRequest.DefaultState.ABSENT)
                .overrideState(FlagPutRequest.OverrideState.ABSENT)
                .build()

        val roundtrippedFlagPutRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(flagPutRequest),
                jacksonTypeRef<FlagPutRequest>(),
            )

        assertThat(roundtrippedFlagPutRequest).isEqualTo(flagPutRequest)
    }
}
