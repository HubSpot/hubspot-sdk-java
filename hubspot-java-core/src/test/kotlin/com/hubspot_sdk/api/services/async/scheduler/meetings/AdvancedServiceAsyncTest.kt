// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.scheduler.meetings

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.models.AssociationSpec
import com.hubspot_sdk.api.models.PublicObjectId
import com.hubspot_sdk.api.models.scheduler.meetings.ExternalAssociationCreateRequest
import com.hubspot_sdk.api.models.scheduler.meetings.ExternalBookingFormField
import com.hubspot_sdk.api.models.scheduler.meetings.ExternalCalendarMeetingEventCreateProperties
import com.hubspot_sdk.api.models.scheduler.meetings.ExternalCalendarMeetingEventCreateRequest
import com.hubspot_sdk.api.models.scheduler.meetings.ExternalEmailReminderSchedule
import com.hubspot_sdk.api.models.scheduler.meetings.ExternalLegalConsentResponse
import com.hubspot_sdk.api.models.scheduler.meetings.ExternalMeetingBooking
import com.hubspot_sdk.api.models.scheduler.meetings.ExternalReminder
import com.hubspot_sdk.api.models.scheduler.meetings.advanced.AdvancedCreateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AdvancedServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val advancedServiceAsync = client.scheduler().meetings().advanced()

        val externalCalenderMeetingEventResponseFuture =
            advancedServiceAsync.create(
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
                                    .hsMeetingEndTime(
                                        OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                    )
                                    .hsMeetingOutcome("hs_meeting_outcome")
                                    .hsMeetingStartTime(
                                        OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                    )
                                    .hsMeetingTitle("hs_meeting_title")
                                    .hsTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .hubspotOwnerId("hubspot_owner_id")
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
            )

        val externalCalenderMeetingEventResponse = externalCalenderMeetingEventResponseFuture.get()
        externalCalenderMeetingEventResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun book() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val advancedServiceAsync = client.scheduler().meetings().advanced()

        val externalMeetingBookingResponseFuture =
            advancedServiceAsync.book(
                ExternalMeetingBooking.builder()
                    .duration(0L)
                    .email("email")
                    .firstName("firstName")
                    .addFormField(
                        ExternalBookingFormField.builder().name("name").value("value").build()
                    )
                    .lastName("lastName")
                    .addLegalConsentResponse(
                        ExternalLegalConsentResponse.builder()
                            .communicationTypeId("communicationTypeId")
                            .consented(true)
                            .build()
                    )
                    .addLikelyAvailableUserId("string")
                    .slug("slug")
                    .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .locale("locale")
                    .timezone("timezone")
                    .build()
            )

        val externalMeetingBookingResponse = externalMeetingBookingResponseFuture.get()
        externalMeetingBookingResponse.validate()
    }
}
