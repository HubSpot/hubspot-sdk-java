// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.scheduler.meetings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalCalendarMeetingEventResponsePropertiesTest {

    @Test
    fun create() {
        val externalCalendarMeetingEventResponseProperties =
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

        assertThat(externalCalendarMeetingEventResponseProperties.hsEngagementSource())
            .isEqualTo(ExternalCalendarMeetingEventResponseProperties.HsEngagementSource.ACADEMY)
        assertThat(externalCalendarMeetingEventResponseProperties.hsEngagementSourceId())
            .isEqualTo("hs_engagement_source_id")
        assertThat(externalCalendarMeetingEventResponseProperties.hsMeetingEndTime())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(externalCalendarMeetingEventResponseProperties.hsMeetingOutcome())
            .isEqualTo("hs_meeting_outcome")
        assertThat(externalCalendarMeetingEventResponseProperties.hsMeetingStartTime())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(externalCalendarMeetingEventResponseProperties.hsMeetingTitle())
            .isEqualTo("hs_meeting_title")
        assertThat(externalCalendarMeetingEventResponseProperties.hsTimestamp())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(externalCalendarMeetingEventResponseProperties.hsActivityType())
            .contains("hs_activity_type")
        assertThat(externalCalendarMeetingEventResponseProperties.hsAttachmentIds().getOrNull())
            .containsExactly("string")
        assertThat(externalCalendarMeetingEventResponseProperties.hsAttendeeOwnerIds().getOrNull())
            .containsExactly("string")
        assertThat(externalCalendarMeetingEventResponseProperties.hsIncludeDescriptionInReminder())
            .contains("hs_include_description_in_reminder")
        assertThat(externalCalendarMeetingEventResponseProperties.hsInternalMeetingNotes())
            .contains("hs_internal_meeting_notes")
        assertThat(externalCalendarMeetingEventResponseProperties.hsMeetingBody())
            .contains("hs_meeting_body")
        assertThat(externalCalendarMeetingEventResponseProperties.hsMeetingExternalUrl())
            .contains("hs_meeting_external_url")
        assertThat(externalCalendarMeetingEventResponseProperties.hsMeetingLocation())
            .contains("hs_meeting_location")
        assertThat(externalCalendarMeetingEventResponseProperties.hsMeetingLocationType())
            .contains(ExternalCalendarMeetingEventResponseProperties.HsMeetingLocationType.ADDRESS)
        assertThat(externalCalendarMeetingEventResponseProperties.hsUniqueId())
            .contains("hs_unique_id")
        assertThat(externalCalendarMeetingEventResponseProperties.hubSpotOwnerId())
            .contains("hubspot_owner_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalCalendarMeetingEventResponseProperties =
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

        val roundtrippedExternalCalendarMeetingEventResponseProperties =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalCalendarMeetingEventResponseProperties),
                jacksonTypeRef<ExternalCalendarMeetingEventResponseProperties>(),
            )

        assertThat(roundtrippedExternalCalendarMeetingEventResponseProperties)
            .isEqualTo(externalCalendarMeetingEventResponseProperties)
    }
}
