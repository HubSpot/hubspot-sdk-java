// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.featureflags.apps

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AppUpdateParamsTest {

    @Test
    fun create() {
        AppUpdateParams.builder()
            .appId(0)
            .flagName("flagName")
            .defaultState(AppUpdateParams.DefaultState.OFF)
            .overrideState(AppUpdateParams.OverrideState.OFF)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AppUpdateParams.builder()
                .appId(0)
                .flagName("flagName")
                .defaultState(AppUpdateParams.DefaultState.OFF)
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
                .defaultState(AppUpdateParams.DefaultState.OFF)
                .overrideState(AppUpdateParams.OverrideState.OFF)
                .build()

        val body = params._body()

        assertThat(body.defaultState()).isEqualTo(AppUpdateParams.DefaultState.OFF)
        assertThat(body.overrideState()).contains(AppUpdateParams.OverrideState.OFF)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AppUpdateParams.builder()
                .appId(0)
                .flagName("flagName")
                .defaultState(AppUpdateParams.DefaultState.OFF)
                .build()

        val body = params._body()

        assertThat(body.defaultState()).isEqualTo(AppUpdateParams.DefaultState.OFF)
    }
}
