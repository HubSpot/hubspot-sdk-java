// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IntegratorSettingGetEventVisibilitySettingsResponseTest {

    @Test
    fun create() {
        val integratorSettingGetEventVisibilitySettingsResponse =
            IntegratorSettingGetEventVisibilitySettingsResponse.builder()
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addVisibilitySetting(
                    IntegratorSettingGetEventVisibilitySettingsResponse.VisibilitySetting.builder()
                        .eventType(
                            IntegratorSettingGetEventVisibilitySettingsResponse.VisibilitySetting
                                .EventType
                                .ALL
                        )
                        .updatedAt(0L)
                        .showInReporting(true)
                        .showInTimeline(true)
                        .showInWorkflows(true)
                        .build()
                )
                .build()

        assertThat(integratorSettingGetEventVisibilitySettingsResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(integratorSettingGetEventVisibilitySettingsResponse.visibilitySettings())
            .containsExactly(
                IntegratorSettingGetEventVisibilitySettingsResponse.VisibilitySetting.builder()
                    .eventType(
                        IntegratorSettingGetEventVisibilitySettingsResponse.VisibilitySetting
                            .EventType
                            .ALL
                    )
                    .updatedAt(0L)
                    .showInReporting(true)
                    .showInTimeline(true)
                    .showInWorkflows(true)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val integratorSettingGetEventVisibilitySettingsResponse =
            IntegratorSettingGetEventVisibilitySettingsResponse.builder()
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addVisibilitySetting(
                    IntegratorSettingGetEventVisibilitySettingsResponse.VisibilitySetting.builder()
                        .eventType(
                            IntegratorSettingGetEventVisibilitySettingsResponse.VisibilitySetting
                                .EventType
                                .ALL
                        )
                        .updatedAt(0L)
                        .showInReporting(true)
                        .showInTimeline(true)
                        .showInWorkflows(true)
                        .build()
                )
                .build()

        val roundtrippedIntegratorSettingGetEventVisibilitySettingsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(integratorSettingGetEventVisibilitySettingsResponse),
                jacksonTypeRef<IntegratorSettingGetEventVisibilitySettingsResponse>(),
            )

        assertThat(roundtrippedIntegratorSettingGetEventVisibilitySettingsResponse)
            .isEqualTo(integratorSettingGetEventVisibilitySettingsResponse)
    }
}
