// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.featureflags.apps

import com.hubspot_sdk.api.models.crm.featureflags.FlagPutRequest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AppUpdateParamsTest {

    @Test
    fun create() {
        AppUpdateParams.builder()
            .appId(0)
            .flagName("flagName")
            .flagPutRequest(
                FlagPutRequest.builder()
                    .defaultState(FlagPutRequest.DefaultState.OFF)
                    .overrideState(FlagPutRequest.OverrideState.OFF)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AppUpdateParams.builder()
                .appId(0)
                .flagName("flagName")
                .flagPutRequest(
                    FlagPutRequest.builder().defaultState(FlagPutRequest.DefaultState.OFF).build()
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
            AppUpdateParams.builder()
                .appId(0)
                .flagName("flagName")
                .flagPutRequest(
                    FlagPutRequest.builder()
                        .defaultState(FlagPutRequest.DefaultState.OFF)
                        .overrideState(FlagPutRequest.OverrideState.OFF)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                FlagPutRequest.builder()
                    .defaultState(FlagPutRequest.DefaultState.OFF)
                    .overrideState(FlagPutRequest.OverrideState.OFF)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AppUpdateParams.builder()
                .appId(0)
                .flagName("flagName")
                .flagPutRequest(
                    FlagPutRequest.builder().defaultState(FlagPutRequest.DefaultState.OFF).build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                FlagPutRequest.builder().defaultState(FlagPutRequest.DefaultState.OFF).build()
            )
    }
}
