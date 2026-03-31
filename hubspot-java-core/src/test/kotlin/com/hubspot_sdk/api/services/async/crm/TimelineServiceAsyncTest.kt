// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.models.crm.timeline.AppEventOccurrence
import com.hubspot_sdk.api.models.crm.timeline.ExternalAppEventResolutionRequest
import com.hubspot_sdk.api.models.crm.timeline.TimelineEventIFrame
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TimelineServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun createEvent() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val timelineServiceAsync = client.crm().timeline()

        val future =
            timelineServiceAsync.createEvent(
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

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createProjectType() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val timelineServiceAsync = client.crm().timeline()

        val appEventResolutionResponseFuture =
            timelineServiceAsync.createProjectType(
                ExternalAppEventResolutionRequest.builder()
                    .developerSymbol("developerSymbol")
                    .projectName("projectName")
                    .build()
            )

        val appEventResolutionResponse = appEventResolutionResponseFuture.get()
        appEventResolutionResponse.validate()
    }
}
