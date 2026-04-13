// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.extensions.calling

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallingUpdateSettingsParamsTest {

    @Test
    fun create() {
        CallingUpdateSettingsParams.builder()
            .appId(0)
            .settingsPatchRequest(
                SettingsPatchRequest.builder()
                    .height(0)
                    .isReady(true)
                    .name("name")
                    .supportsCustomObjects(true)
                    .supportsInboundCalling(true)
                    .url("url")
                    .usesCallingWindow(true)
                    .usesRemote(true)
                    .width(0)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CallingUpdateSettingsParams.builder()
                .appId(0)
                .settingsPatchRequest(SettingsPatchRequest.builder().build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CallingUpdateSettingsParams.builder()
                .appId(0)
                .settingsPatchRequest(
                    SettingsPatchRequest.builder()
                        .height(0)
                        .isReady(true)
                        .name("name")
                        .supportsCustomObjects(true)
                        .supportsInboundCalling(true)
                        .url("url")
                        .usesCallingWindow(true)
                        .usesRemote(true)
                        .width(0)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                SettingsPatchRequest.builder()
                    .height(0)
                    .isReady(true)
                    .name("name")
                    .supportsCustomObjects(true)
                    .supportsInboundCalling(true)
                    .url("url")
                    .usesCallingWindow(true)
                    .usesRemote(true)
                    .width(0)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CallingUpdateSettingsParams.builder()
                .appId(0)
                .settingsPatchRequest(SettingsPatchRequest.builder().build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(SettingsPatchRequest.builder().build())
    }
}
