// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.sequences

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MeetingSettingsResponseTest {

    @Test
    fun create() {
        val meetingSettingsResponse =
            MeetingSettingsResponse.builder()
                .criteria(MeetingSettingsResponse.Criteria.ALL)
                .sellingStrategy(MeetingSettingsResponse.SellingStrategy.LEAD_BASED)
                .build()

        assertThat(meetingSettingsResponse.criteria())
            .isEqualTo(MeetingSettingsResponse.Criteria.ALL)
        assertThat(meetingSettingsResponse.sellingStrategy())
            .isEqualTo(MeetingSettingsResponse.SellingStrategy.LEAD_BASED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val meetingSettingsResponse =
            MeetingSettingsResponse.builder()
                .criteria(MeetingSettingsResponse.Criteria.ALL)
                .sellingStrategy(MeetingSettingsResponse.SellingStrategy.LEAD_BASED)
                .build()

        val roundtrippedMeetingSettingsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(meetingSettingsResponse),
                jacksonTypeRef<MeetingSettingsResponse>(),
            )

        assertThat(roundtrippedMeetingSettingsResponse).isEqualTo(meetingSettingsResponse)
    }
}
