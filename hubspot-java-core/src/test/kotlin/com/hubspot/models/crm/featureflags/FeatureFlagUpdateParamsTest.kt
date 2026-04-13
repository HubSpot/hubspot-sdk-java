// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.featureflags

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FeatureFlagUpdateParamsTest {

    @Test
    fun create() {
        FeatureFlagUpdateParams.builder()
            .appId(0)
            .flagName("flagName")
            .flagPutRequest(
                FlagPutRequest.builder()
                    .defaultState(FlagPutRequest.DefaultState.ABSENT)
                    .overrideState(FlagPutRequest.OverrideState.ABSENT)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            FeatureFlagUpdateParams.builder()
                .appId(0)
                .flagName("flagName")
                .flagPutRequest(
                    FlagPutRequest.builder()
                        .defaultState(FlagPutRequest.DefaultState.ABSENT)
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
            FeatureFlagUpdateParams.builder()
                .appId(0)
                .flagName("flagName")
                .flagPutRequest(
                    FlagPutRequest.builder()
                        .defaultState(FlagPutRequest.DefaultState.ABSENT)
                        .overrideState(FlagPutRequest.OverrideState.ABSENT)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                FlagPutRequest.builder()
                    .defaultState(FlagPutRequest.DefaultState.ABSENT)
                    .overrideState(FlagPutRequest.OverrideState.ABSENT)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            FeatureFlagUpdateParams.builder()
                .appId(0)
                .flagName("flagName")
                .flagPutRequest(
                    FlagPutRequest.builder()
                        .defaultState(FlagPutRequest.DefaultState.ABSENT)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                FlagPutRequest.builder().defaultState(FlagPutRequest.DefaultState.ABSENT).build()
            )
    }
}
