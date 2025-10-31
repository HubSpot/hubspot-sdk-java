// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IntegratorSettingUpdateEventVisibilitySettingsResponseTest {

    @Test
    fun create() {
        val integratorSettingUpdateEventVisibilitySettingsResponse =
            IntegratorSettingUpdateEventVisibilitySettingsResponse.builder()
                .eventType(IntegratorSettingUpdateEventVisibilitySettingsResponse.EventType.ALL)
                .updatedAt(0L)
                .showInReporting(true)
                .showInTimeline(true)
                .showInWorkflows(true)
                .build()

        assertThat(integratorSettingUpdateEventVisibilitySettingsResponse.eventType())
            .isEqualTo(IntegratorSettingUpdateEventVisibilitySettingsResponse.EventType.ALL)
        assertThat(integratorSettingUpdateEventVisibilitySettingsResponse.updatedAt()).isEqualTo(0L)
        assertThat(integratorSettingUpdateEventVisibilitySettingsResponse.showInReporting())
            .contains(true)
        assertThat(integratorSettingUpdateEventVisibilitySettingsResponse.showInTimeline())
            .contains(true)
        assertThat(integratorSettingUpdateEventVisibilitySettingsResponse.showInWorkflows())
            .contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val integratorSettingUpdateEventVisibilitySettingsResponse =
            IntegratorSettingUpdateEventVisibilitySettingsResponse.builder()
                .eventType(IntegratorSettingUpdateEventVisibilitySettingsResponse.EventType.ALL)
                .updatedAt(0L)
                .showInReporting(true)
                .showInTimeline(true)
                .showInWorkflows(true)
                .build()

        val roundtrippedIntegratorSettingUpdateEventVisibilitySettingsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(
                    integratorSettingUpdateEventVisibilitySettingsResponse
                ),
                jacksonTypeRef<IntegratorSettingUpdateEventVisibilitySettingsResponse>(),
            )

        assertThat(roundtrippedIntegratorSettingUpdateEventVisibilitySettingsResponse)
            .isEqualTo(integratorSettingUpdateEventVisibilitySettingsResponse)
    }
}
