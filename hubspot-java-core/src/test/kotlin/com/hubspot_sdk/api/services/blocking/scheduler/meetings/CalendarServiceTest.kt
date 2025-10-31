// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.scheduler.meetings

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.models.AssociationSpec
import com.hubspot_sdk.api.models.PublicObjectId
import com.hubspot_sdk.api.models.scheduler.meetings.ExternalAssociationCreateRequest
import com.hubspot_sdk.api.models.scheduler.meetings.ExternalCalendarMeetingEventCreateProperties
import com.hubspot_sdk.api.models.scheduler.meetings.ExternalCalendarMeetingEventCreateRequest
import com.hubspot_sdk.api.models.scheduler.meetings.ExternalEmailReminderSchedule
import com.hubspot_sdk.api.models.scheduler.meetings.ExternalReminder
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CalendarServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val calendarService = client.scheduler().meetings().calendar()

        val externalCalenderMeetingEventResponse =
            calendarService.create(
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
            )

        externalCalenderMeetingEventResponse.validate()
    }
}
