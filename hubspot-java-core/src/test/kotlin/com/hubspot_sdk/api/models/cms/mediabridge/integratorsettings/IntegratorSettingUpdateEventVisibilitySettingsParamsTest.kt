// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IntegratorSettingUpdateEventVisibilitySettingsParamsTest {

    @Test
    fun create() {
        IntegratorSettingUpdateEventVisibilitySettingsParams.builder()
            .appId("appId")
            .eventType(IntegratorSettingUpdateEventVisibilitySettingsParams.EventType.ALL)
            .updatedAt(0L)
            .showInReporting(true)
            .showInTimeline(true)
            .showInWorkflows(true)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            IntegratorSettingUpdateEventVisibilitySettingsParams.builder()
                .appId("appId")
                .eventType(IntegratorSettingUpdateEventVisibilitySettingsParams.EventType.ALL)
                .updatedAt(0L)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("appId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            IntegratorSettingUpdateEventVisibilitySettingsParams.builder()
                .appId("appId")
                .eventType(IntegratorSettingUpdateEventVisibilitySettingsParams.EventType.ALL)
                .updatedAt(0L)
                .showInReporting(true)
                .showInTimeline(true)
                .showInWorkflows(true)
                .build()

        val body = params._body()

        assertThat(body.eventType())
            .isEqualTo(IntegratorSettingUpdateEventVisibilitySettingsParams.EventType.ALL)
        assertThat(body.updatedAt()).isEqualTo(0L)
        assertThat(body.showInReporting()).contains(true)
        assertThat(body.showInTimeline()).contains(true)
        assertThat(body.showInWorkflows()).contains(true)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            IntegratorSettingUpdateEventVisibilitySettingsParams.builder()
                .appId("appId")
                .eventType(IntegratorSettingUpdateEventVisibilitySettingsParams.EventType.ALL)
                .updatedAt(0L)
                .build()

        val body = params._body()

        assertThat(body.eventType())
            .isEqualTo(IntegratorSettingUpdateEventVisibilitySettingsParams.EventType.ALL)
        assertThat(body.updatedAt()).isEqualTo(0L)
    }
}
