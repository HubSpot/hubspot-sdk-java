// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.marketing.marketingevents.settings

import com.hubspot.models.marketing.marketingevents.EventDetailSettingsUrl
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SettingCreateOrUpdateParamsTest {

    @Test
    fun create() {
        SettingCreateOrUpdateParams.builder()
            .appId(0)
            .eventDetailSettingsUrl(
                EventDetailSettingsUrl.builder().eventDetailsUrl("eventDetailsUrl").build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SettingCreateOrUpdateParams.builder()
                .appId(0)
                .eventDetailSettingsUrl(
                    EventDetailSettingsUrl.builder().eventDetailsUrl("eventDetailsUrl").build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            SettingCreateOrUpdateParams.builder()
                .appId(0)
                .eventDetailSettingsUrl(
                    EventDetailSettingsUrl.builder().eventDetailsUrl("eventDetailsUrl").build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(EventDetailSettingsUrl.builder().eventDetailsUrl("eventDetailsUrl").build())
    }
}
