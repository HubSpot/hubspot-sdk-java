// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.scheduler.meetings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.AssociationSpec
import com.hubspot_sdk.api.models.PublicObjectId
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalCalendarMeetingEventCreateRequestTest {

    @Test
    fun create() {
        val externalCalendarMeetingEventCreateRequest =
            ExternalCalendarMeetingEventCreateRequest.builder()
                .addAssociation(
                    ExternalAssociationCreateRequest.builder()
                        .to(PublicObjectId.builder().id("id").build())
                        .addType(
                            AssociationSpec.builder()
                                .associationCategory(
                                    AssociationSpec.AssociationCategory.HUBSPOT_DEFINED
                                )
                                .associationTypeId(0)
                                .build()
                        )
                        .build()
                )
                .emailReminderSchedule(
                    ExternalEmailReminderSchedule.builder()
                        .addReminder(
                            ExternalReminder.builder()
                                .numberOfTimeUnits(0)
                                .timeUnit("timeUnit")
                                .build()
                        )
                        .shouldIncludeInviteDescription(true)
                        .build()
                )
                .properties(
                    ExternalCalendarMeetingEventCreateProperties.builder()
                        .hsMeetingEndTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .hsMeetingOutcome("hs_meeting_outcome")
                        .hsMeetingStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .hsMeetingTitle("hs_meeting_title")
                        .hsTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .hsActivityType("hs_activity_type")
                        .addHsAttachmentId("string")
                        .addHsAttendeeOwnerId("string")
                        .hsInternalMeetingNotes("hs_internal_meeting_notes")
                        .hsMeetingBody("hs_meeting_body")
                        .hsMeetingLocation("hs_meeting_location")
                        .hsMeetingLocationType("hs_meeting_location_type")
                        .hubspotOwnerId("hubspot_owner_id")
                        .build()
                )
                .timezone("timezone")
                .build()

        assertThat(externalCalendarMeetingEventCreateRequest.associations())
            .containsExactly(
                ExternalAssociationCreateRequest.builder()
                    .to(PublicObjectId.builder().id("id").build())
                    .addType(
                        AssociationSpec.builder()
                            .associationCategory(
                                AssociationSpec.AssociationCategory.HUBSPOT_DEFINED
                            )
                            .associationTypeId(0)
                            .build()
                    )
                    .build()
            )
        assertThat(externalCalendarMeetingEventCreateRequest.emailReminderSchedule())
            .isEqualTo(
                ExternalEmailReminderSchedule.builder()
                    .addReminder(
                        ExternalReminder.builder().numberOfTimeUnits(0).timeUnit("timeUnit").build()
                    )
                    .shouldIncludeInviteDescription(true)
                    .build()
            )
        assertThat(externalCalendarMeetingEventCreateRequest.properties())
            .isEqualTo(
                ExternalCalendarMeetingEventCreateProperties.builder()
                    .hsMeetingEndTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .hsMeetingOutcome("hs_meeting_outcome")
                    .hsMeetingStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .hsMeetingTitle("hs_meeting_title")
                    .hsTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .hsActivityType("hs_activity_type")
                    .addHsAttachmentId("string")
                    .addHsAttendeeOwnerId("string")
                    .hsInternalMeetingNotes("hs_internal_meeting_notes")
                    .hsMeetingBody("hs_meeting_body")
                    .hsMeetingLocation("hs_meeting_location")
                    .hsMeetingLocationType("hs_meeting_location_type")
                    .hubspotOwnerId("hubspot_owner_id")
                    .build()
            )
        assertThat(externalCalendarMeetingEventCreateRequest.timezone()).isEqualTo("timezone")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalCalendarMeetingEventCreateRequest =
            ExternalCalendarMeetingEventCreateRequest.builder()
                .addAssociation(
                    ExternalAssociationCreateRequest.builder()
                        .to(PublicObjectId.builder().id("id").build())
                        .addType(
                            AssociationSpec.builder()
                                .associationCategory(
                                    AssociationSpec.AssociationCategory.HUBSPOT_DEFINED
                                )
                                .associationTypeId(0)
                                .build()
                        )
                        .build()
                )
                .emailReminderSchedule(
                    ExternalEmailReminderSchedule.builder()
                        .addReminder(
                            ExternalReminder.builder()
                                .numberOfTimeUnits(0)
                                .timeUnit("timeUnit")
                                .build()
                        )
                        .shouldIncludeInviteDescription(true)
                        .build()
                )
                .properties(
                    ExternalCalendarMeetingEventCreateProperties.builder()
                        .hsMeetingEndTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .hsMeetingOutcome("hs_meeting_outcome")
                        .hsMeetingStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .hsMeetingTitle("hs_meeting_title")
                        .hsTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .hsActivityType("hs_activity_type")
                        .addHsAttachmentId("string")
                        .addHsAttendeeOwnerId("string")
                        .hsInternalMeetingNotes("hs_internal_meeting_notes")
                        .hsMeetingBody("hs_meeting_body")
                        .hsMeetingLocation("hs_meeting_location")
                        .hsMeetingLocationType("hs_meeting_location_type")
                        .hubspotOwnerId("hubspot_owner_id")
                        .build()
                )
                .timezone("timezone")
                .build()

        val roundtrippedExternalCalendarMeetingEventCreateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalCalendarMeetingEventCreateRequest),
                jacksonTypeRef<ExternalCalendarMeetingEventCreateRequest>(),
            )

        assertThat(roundtrippedExternalCalendarMeetingEventCreateRequest)
            .isEqualTo(externalCalendarMeetingEventCreateRequest)
    }
}
