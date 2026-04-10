// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.scheduler.meetings.advanced

import com.hubspot_sdk.api.core.http.QueryParams
import com.hubspot_sdk.api.models.AssociationSpec
import com.hubspot_sdk.api.models.PublicObjectId
import com.hubspot_sdk.api.models.scheduler.meetings.ExternalAssociationCreateRequest
import com.hubspot_sdk.api.models.scheduler.meetings.ExternalCalendarMeetingEventCreateProperties
import com.hubspot_sdk.api.models.scheduler.meetings.ExternalCalendarMeetingEventCreateRequest
import com.hubspot_sdk.api.models.scheduler.meetings.ExternalEmailReminderSchedule
import com.hubspot_sdk.api.models.scheduler.meetings.ExternalReminder
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AdvancedCreateParamsTest {

    @Test
    fun create() {
        AdvancedCreateParams.builder()
            .organizerUserId("organizerUserId")
            .externalCalendarMeetingEventCreateRequest(
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
                                    .timeUnit(ExternalReminder.TimeUnit.DAYS)
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
                            .hubSpotOwnerId("hubspot_owner_id")
                            .hsActivityType("hs_activity_type")
                            .addHsAttachmentId("string")
                            .addHsAttendeeOwnerId("string")
                            .hsInternalMeetingNotes("hs_internal_meeting_notes")
                            .hsMeetingBody("hs_meeting_body")
                            .hsMeetingLocation("hs_meeting_location")
                            .hsMeetingLocationType(
                                ExternalCalendarMeetingEventCreateProperties.HsMeetingLocationType
                                    .ADDRESS
                            )
                            .build()
                    )
                    .timezone("timezone")
                    .build()
            )
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            AdvancedCreateParams.builder()
                .organizerUserId("organizerUserId")
                .externalCalendarMeetingEventCreateRequest(
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
                                        .timeUnit(ExternalReminder.TimeUnit.DAYS)
                                        .build()
                                )
                                .shouldIncludeInviteDescription(true)
                                .build()
                        )
                        .properties(
                            ExternalCalendarMeetingEventCreateProperties.builder()
                                .hsMeetingEndTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .hsMeetingOutcome("hs_meeting_outcome")
                                .hsMeetingStartTime(
                                    OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                )
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
                                    ExternalCalendarMeetingEventCreateProperties
                                        .HsMeetingLocationType
                                        .ADDRESS
                                )
                                .build()
                        )
                        .timezone("timezone")
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("organizerUserId", "organizerUserId").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            AdvancedCreateParams.builder()
                .organizerUserId("organizerUserId")
                .externalCalendarMeetingEventCreateRequest(
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
                                        .timeUnit(ExternalReminder.TimeUnit.DAYS)
                                        .build()
                                )
                                .shouldIncludeInviteDescription(true)
                                .build()
                        )
                        .properties(
                            ExternalCalendarMeetingEventCreateProperties.builder()
                                .hsMeetingEndTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .hsMeetingOutcome("hs_meeting_outcome")
                                .hsMeetingStartTime(
                                    OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                )
                                .hsMeetingTitle("hs_meeting_title")
                                .hsTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .hubSpotOwnerId("hubspot_owner_id")
                                .build()
                        )
                        .timezone("timezone")
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("organizerUserId", "organizerUserId").build())
    }

    @Test
    fun body() {
        val params =
            AdvancedCreateParams.builder()
                .organizerUserId("organizerUserId")
                .externalCalendarMeetingEventCreateRequest(
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
                                        .timeUnit(ExternalReminder.TimeUnit.DAYS)
                                        .build()
                                )
                                .shouldIncludeInviteDescription(true)
                                .build()
                        )
                        .properties(
                            ExternalCalendarMeetingEventCreateProperties.builder()
                                .hsMeetingEndTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .hsMeetingOutcome("hs_meeting_outcome")
                                .hsMeetingStartTime(
                                    OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                )
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
                                    ExternalCalendarMeetingEventCreateProperties
                                        .HsMeetingLocationType
                                        .ADDRESS
                                )
                                .build()
                        )
                        .timezone("timezone")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
                                    .timeUnit(ExternalReminder.TimeUnit.DAYS)
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
                            .hubSpotOwnerId("hubspot_owner_id")
                            .hsActivityType("hs_activity_type")
                            .addHsAttachmentId("string")
                            .addHsAttendeeOwnerId("string")
                            .hsInternalMeetingNotes("hs_internal_meeting_notes")
                            .hsMeetingBody("hs_meeting_body")
                            .hsMeetingLocation("hs_meeting_location")
                            .hsMeetingLocationType(
                                ExternalCalendarMeetingEventCreateProperties.HsMeetingLocationType
                                    .ADDRESS
                            )
                            .build()
                    )
                    .timezone("timezone")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AdvancedCreateParams.builder()
                .organizerUserId("organizerUserId")
                .externalCalendarMeetingEventCreateRequest(
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
                                        .timeUnit(ExternalReminder.TimeUnit.DAYS)
                                        .build()
                                )
                                .shouldIncludeInviteDescription(true)
                                .build()
                        )
                        .properties(
                            ExternalCalendarMeetingEventCreateProperties.builder()
                                .hsMeetingEndTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .hsMeetingOutcome("hs_meeting_outcome")
                                .hsMeetingStartTime(
                                    OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                )
                                .hsMeetingTitle("hs_meeting_title")
                                .hsTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .hubSpotOwnerId("hubspot_owner_id")
                                .build()
                        )
                        .timezone("timezone")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
                                    .timeUnit(ExternalReminder.TimeUnit.DAYS)
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
                            .hubSpotOwnerId("hubspot_owner_id")
                            .build()
                    )
                    .timezone("timezone")
                    .build()
            )
    }
}
