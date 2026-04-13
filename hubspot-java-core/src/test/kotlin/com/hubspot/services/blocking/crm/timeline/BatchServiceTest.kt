// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.crm.timeline

import com.hubspot.client.okhttp.HubSpotOkHttpClient
import com.hubspot.core.JsonValue
import com.hubspot.models.crm.timeline.AppEventOccurrence
import com.hubspot.models.crm.timeline.BatchInputAppEventOccurrence
import com.hubspot.models.crm.timeline.TimelineEventIFrame
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BatchServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val batchService = client.crm().timeline().batch()

        val batchResponseAppEventOccurrence =
            batchService.create(
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

        batchResponseAppEventOccurrence.validate()
    }
}
