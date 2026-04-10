// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.scheduler.meetings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalCalenderMeetingEventResponseTest {

    @Test
    fun create() {
        val externalCalenderMeetingEventResponse =
            ExternalCalenderMeetingEventResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastUpdatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .properties(
                    ExternalCalendarMeetingEventResponseProperties.builder()
                        .hsEngagementSource(
                            ExternalCalendarMeetingEventResponseProperties.HsEngagementSource
                                .ACADEMY
                        )
                        .hsEngagementSourceId("hs_engagement_source_id")
                        .hsMeetingEndTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .hsMeetingOutcome("hs_meeting_outcome")
                        .hsMeetingStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .hsMeetingTitle("hs_meeting_title")
                        .hsTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .hsActivityType("hs_activity_type")
                        .addHsAttachmentId("string")
                        .addHsAttendeeOwnerId("string")
                        .hsIncludeDescriptionInReminder("hs_include_description_in_reminder")
                        .hsInternalMeetingNotes("hs_internal_meeting_notes")
                        .hsMeetingBody("hs_meeting_body")
                        .hsMeetingExternalUrl("hs_meeting_external_url")
                        .hsMeetingLocation("hs_meeting_location")
                        .hsMeetingLocationType(
                            ExternalCalendarMeetingEventResponseProperties.HsMeetingLocationType
                                .ADDRESS
                        )
                        .hsUniqueId("hs_unique_id")
                        .hubSpotOwnerId("hubspot_owner_id")
                        .build()
                )
                .build()

        assertThat(externalCalenderMeetingEventResponse.id()).isEqualTo("id")
        assertThat(externalCalenderMeetingEventResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(externalCalenderMeetingEventResponse.lastUpdatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(externalCalenderMeetingEventResponse.properties())
            .isEqualTo(
                ExternalCalendarMeetingEventResponseProperties.builder()
                    .hsEngagementSource(
                        ExternalCalendarMeetingEventResponseProperties.HsEngagementSource.ACADEMY
                    )
                    .hsEngagementSourceId("hs_engagement_source_id")
                    .hsMeetingEndTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .hsMeetingOutcome("hs_meeting_outcome")
                    .hsMeetingStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .hsMeetingTitle("hs_meeting_title")
                    .hsTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .hsActivityType("hs_activity_type")
                    .addHsAttachmentId("string")
                    .addHsAttendeeOwnerId("string")
                    .hsIncludeDescriptionInReminder("hs_include_description_in_reminder")
                    .hsInternalMeetingNotes("hs_internal_meeting_notes")
                    .hsMeetingBody("hs_meeting_body")
                    .hsMeetingExternalUrl("hs_meeting_external_url")
                    .hsMeetingLocation("hs_meeting_location")
                    .hsMeetingLocationType(
                        ExternalCalendarMeetingEventResponseProperties.HsMeetingLocationType.ADDRESS
                    )
                    .hsUniqueId("hs_unique_id")
                    .hubSpotOwnerId("hubspot_owner_id")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalCalenderMeetingEventResponse =
            ExternalCalenderMeetingEventResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastUpdatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .properties(
                    ExternalCalendarMeetingEventResponseProperties.builder()
                        .hsEngagementSource(
                            ExternalCalendarMeetingEventResponseProperties.HsEngagementSource
                                .ACADEMY
                        )
                        .hsEngagementSourceId("hs_engagement_source_id")
                        .hsMeetingEndTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .hsMeetingOutcome("hs_meeting_outcome")
                        .hsMeetingStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .hsMeetingTitle("hs_meeting_title")
                        .hsTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .hsActivityType("hs_activity_type")
                        .addHsAttachmentId("string")
                        .addHsAttendeeOwnerId("string")
                        .hsIncludeDescriptionInReminder("hs_include_description_in_reminder")
                        .hsInternalMeetingNotes("hs_internal_meeting_notes")
                        .hsMeetingBody("hs_meeting_body")
                        .hsMeetingExternalUrl("hs_meeting_external_url")
                        .hsMeetingLocation("hs_meeting_location")
                        .hsMeetingLocationType(
                            ExternalCalendarMeetingEventResponseProperties.HsMeetingLocationType
                                .ADDRESS
                        )
                        .hsUniqueId("hs_unique_id")
                        .hubSpotOwnerId("hubspot_owner_id")
                        .build()
                )
                .build()

        val roundtrippedExternalCalenderMeetingEventResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalCalenderMeetingEventResponse),
                jacksonTypeRef<ExternalCalenderMeetingEventResponse>(),
            )

        assertThat(roundtrippedExternalCalenderMeetingEventResponse)
            .isEqualTo(externalCalenderMeetingEventResponse)
    }
}
