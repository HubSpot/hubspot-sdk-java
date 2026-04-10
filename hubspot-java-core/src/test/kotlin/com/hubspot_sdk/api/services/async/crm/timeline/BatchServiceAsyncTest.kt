// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.timeline

import com.hubspot_sdk.api.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.models.crm.timeline.AppEventOccurrence
import com.hubspot_sdk.api.models.crm.timeline.BatchInputAppEventOccurrence
import com.hubspot_sdk.api.models.crm.timeline.TimelineEventIFrame
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BatchServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val batchServiceAsync = client.crm().timeline().batch()

        val batchResponseAppEventOccurrenceFuture =
            batchServiceAsync.create(
                BatchInputAppEventOccurrence.builder()
                    .addInput(
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
                    .build()
            )

        val batchResponseAppEventOccurrence = batchResponseAppEventOccurrenceFuture.get()
        batchResponseAppEventOccurrence.validate()
    }
}
