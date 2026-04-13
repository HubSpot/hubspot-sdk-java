// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.extensions.videoconferencing

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VideoConferencingUpdateParamsTest {

    @Test
    fun create() {
        VideoConferencingUpdateParams.builder()
            .appId(0)
            .externalSettings(
                ExternalSettings.builder()
                    .createMeetingUrl("createMeetingUrl")
                    .deleteMeetingUrl("deleteMeetingUrl")
                    .fetchAccountsUri("fetchAccountsUri")
                    .updateMeetingUrl("updateMeetingUrl")
                    .userVerifyUrl("userVerifyUrl")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            VideoConferencingUpdateParams.builder()
                .appId(0)
                .externalSettings(
                    ExternalSettings.builder().createMeetingUrl("createMeetingUrl").build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            VideoConferencingUpdateParams.builder()
                .appId(0)
                .externalSettings(
                    ExternalSettings.builder()
                        .createMeetingUrl("createMeetingUrl")
                        .deleteMeetingUrl("deleteMeetingUrl")
                        .fetchAccountsUri("fetchAccountsUri")
                        .updateMeetingUrl("updateMeetingUrl")
                        .userVerifyUrl("userVerifyUrl")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                ExternalSettings.builder()
                    .createMeetingUrl("createMeetingUrl")
                    .deleteMeetingUrl("deleteMeetingUrl")
                    .fetchAccountsUri("fetchAccountsUri")
                    .updateMeetingUrl("updateMeetingUrl")
                    .userVerifyUrl("userVerifyUrl")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            VideoConferencingUpdateParams.builder()
                .appId(0)
                .externalSettings(
                    ExternalSettings.builder().createMeetingUrl("createMeetingUrl").build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(ExternalSettings.builder().createMeetingUrl("createMeetingUrl").build())
    }
}
