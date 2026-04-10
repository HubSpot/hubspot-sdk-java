// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.scheduler.meetings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalCalendarMeetingEventCreatePropertiesTest {

    @Test
    fun create() {
        val externalCalendarMeetingEventCreateProperties =
            ExternalCalendarMeetingEventCreateProperties.builder()
                .hsMeetingEndTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .hsMeetingOutcome("hs_meeting_outcome")
                .hsMeetingStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .hsMeetingTitle("hs_meeting_title")
                .hsTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .hubSpotOwnerId("hubspot_owner_id")
                .hsActivityType("hs_activity_type")
                .addHsAttachmentId("string")
                .addHsAttendeeOwnerId("string")
                .hsInternalMeetingNotes("hs_internal_meeting_notes")
                .hsMeetingBody("hs_meeting_body")
                .hsMeetingLocation("hs_meeting_location")
                .hsMeetingLocationType(
                    ExternalCalendarMeetingEventCreateProperties.HsMeetingLocationType.ADDRESS
                )
                .build()

        assertThat(externalCalendarMeetingEventCreateProperties.hsMeetingEndTime())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(externalCalendarMeetingEventCreateProperties.hsMeetingOutcome())
            .isEqualTo("hs_meeting_outcome")
        assertThat(externalCalendarMeetingEventCreateProperties.hsMeetingStartTime())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(externalCalendarMeetingEventCreateProperties.hsMeetingTitle())
            .isEqualTo("hs_meeting_title")
        assertThat(externalCalendarMeetingEventCreateProperties.hsTimestamp())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(externalCalendarMeetingEventCreateProperties.hubSpotOwnerId())
            .isEqualTo("hubspot_owner_id")
        assertThat(externalCalendarMeetingEventCreateProperties.hsActivityType())
            .contains("hs_activity_type")
        assertThat(externalCalendarMeetingEventCreateProperties.hsAttachmentIds().getOrNull())
            .containsExactly("string")
        assertThat(externalCalendarMeetingEventCreateProperties.hsAttendeeOwnerIds().getOrNull())
            .containsExactly("string")
        assertThat(externalCalendarMeetingEventCreateProperties.hsInternalMeetingNotes())
            .contains("hs_internal_meeting_notes")
        assertThat(externalCalendarMeetingEventCreateProperties.hsMeetingBody())
            .contains("hs_meeting_body")
        assertThat(externalCalendarMeetingEventCreateProperties.hsMeetingLocation())
            .contains("hs_meeting_location")
        assertThat(externalCalendarMeetingEventCreateProperties.hsMeetingLocationType())
            .contains(ExternalCalendarMeetingEventCreateProperties.HsMeetingLocationType.ADDRESS)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalCalendarMeetingEventCreateProperties =
            ExternalCalendarMeetingEventCreateProperties.builder()
                .hsMeetingEndTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .hsMeetingOutcome("hs_meeting_outcome")
                .hsMeetingStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .hsMeetingTitle("hs_meeting_title")
                .hsTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .hubSpotOwnerId("hubspot_owner_id")
                .hsActivityType("hs_activity_type")
                .addHsAttachmentId("string")
                .addHsAttendeeOwnerId("string")
                .hsInternalMeetingNotes("hs_internal_meeting_notes")
                .hsMeetingBody("hs_meeting_body")
                .hsMeetingLocation("hs_meeting_location")
                .hsMeetingLocationType(
                    ExternalCalendarMeetingEventCreateProperties.HsMeetingLocationType.ADDRESS
                )
                .build()

        val roundtrippedExternalCalendarMeetingEventCreateProperties =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalCalendarMeetingEventCreateProperties),
                jacksonTypeRef<ExternalCalendarMeetingEventCreateProperties>(),
            )

        assertThat(roundtrippedExternalCalendarMeetingEventCreateProperties)
            .isEqualTo(externalCalendarMeetingEventCreateProperties)
    }
}
