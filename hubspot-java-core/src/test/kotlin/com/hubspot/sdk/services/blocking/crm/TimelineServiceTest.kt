// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.crm

import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClient
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.models.crm.timeline.AppEventOccurrence
import com.hubspot.sdk.models.crm.timeline.ExternalAppEventResolutionRequest
import com.hubspot.sdk.models.crm.timeline.TimelineEventIFrame
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TimelineServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun createEvent() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val timelineService = client.crm().timeline()

        timelineService.createEvent(
            AppEventOccurrence.builder()
                .id("id")
                .eventTypeName("eventTypeName")
                .properties(
                    AppEventOccurrence.Properties.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .domain("domain")
                .email("email")
                .extraData(JsonValue.from(mapOf<String, Any>()))
                .objectId("objectId")
                .objectTypeFullyQualifiedName("objectTypeFullyQualifiedName")
                .timelineIFrame(
                    TimelineEventIFrame.builder()
                        .headerLabel("headerLabel")
                        .height(0)
                        .linkLabel("linkLabel")
                        .url("url")
                        .width(0)
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .utk("utk")
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createProjectType() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val timelineService = client.crm().timeline()

        val appEventResolutionResponse =
            timelineService.createProjectType(
                ExternalAppEventResolutionRequest.builder()
                    .developerSymbol("developerSymbol")
                    .projectName("projectName")
                    .build()
            )

        appEventResolutionResponse.validate()
    }
}
