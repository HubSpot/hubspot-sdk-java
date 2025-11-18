// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings

import com.hubspot_sdk.api.models.cms.mediabridge.EventVisibilityChange
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IntegratorSettingUpdateEventVisibilitySettingsParamsTest {

    @Test
    fun create() {
        IntegratorSettingUpdateEventVisibilitySettingsParams.builder()
            .appId(0)
            .eventVisibilityChange(
                EventVisibilityChange.builder()
                    .eventType(EventVisibilityChange.EventType.ALL)
                    .updatedAt(0L)
                    .showInReporting(true)
                    .showInTimeline(true)
                    .showInWorkflows(true)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            IntegratorSettingUpdateEventVisibilitySettingsParams.builder()
                .appId(0)
                .eventVisibilityChange(
                    EventVisibilityChange.builder()
                        .eventType(EventVisibilityChange.EventType.ALL)
                        .updatedAt(0L)
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            IntegratorSettingUpdateEventVisibilitySettingsParams.builder()
                .appId(0)
                .eventVisibilityChange(
                    EventVisibilityChange.builder()
                        .eventType(EventVisibilityChange.EventType.ALL)
                        .updatedAt(0L)
                        .showInReporting(true)
                        .showInTimeline(true)
                        .showInWorkflows(true)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                EventVisibilityChange.builder()
                    .eventType(EventVisibilityChange.EventType.ALL)
                    .updatedAt(0L)
                    .showInReporting(true)
                    .showInTimeline(true)
                    .showInWorkflows(true)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            IntegratorSettingUpdateEventVisibilitySettingsParams.builder()
                .appId(0)
                .eventVisibilityChange(
                    EventVisibilityChange.builder()
                        .eventType(EventVisibilityChange.EventType.ALL)
                        .updatedAt(0L)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                EventVisibilityChange.builder()
                    .eventType(EventVisibilityChange.EventType.ALL)
                    .updatedAt(0L)
                    .build()
            )
    }
}
