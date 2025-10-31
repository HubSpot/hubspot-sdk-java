// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.timeline

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.models.crm.timeline.BatchInputTimelineEvent
import com.hubspot_sdk.api.models.crm.timeline.TimelineEvent
import com.hubspot_sdk.api.models.crm.timeline.TimelineEventIFrame
import com.hubspot_sdk.api.models.crm.timeline.events.EventGetDetailParams
import com.hubspot_sdk.api.models.crm.timeline.events.EventGetParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EventServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val eventServiceAsync = client.crm().timeline().events()

        val timelineEventResponseFuture =
            eventServiceAsync.create(
                TimelineEvent.builder()
                    .eventTemplateId("1001298")
                    .tokens(
                        TimelineEvent.Tokens.builder()
                            .putAdditionalProperty("petAge", JsonValue.from("string"))
                            .putAdditionalProperty("petColor", JsonValue.from("black"))
                            .putAdditionalProperty("petName", JsonValue.from("Art3mis"))
                            .build()
                    )
                    .id("id")
                    .domain("domain")
                    .email("art3mis-pup@petspot.com")
                    .extraData(
                        JsonValue.from(
                            mapOf(
                                "questions" to
                                    listOf(
                                        mapOf(
                                            "answer" to "Bark!",
                                            "question" to "Who's a good girl?",
                                        ),
                                        mapOf(
                                            "answer" to "Woof!",
                                            "question" to "Do you wanna go on a walk?",
                                        ),
                                    )
                            )
                        )
                    )
                    .objectId("objectId")
                    .timelineIFrame(
                        TimelineEventIFrame.builder()
                            .headerLabel("Art3mis dog")
                            .height(400)
                            .linkLabel("View Art3mis")
                            .url("https://my.petspot.com/pets/Art3mis")
                            .width(600)
                            .build()
                    )
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .utk("utk")
                    .build()
            )

        val timelineEventResponse = timelineEventResponseFuture.get()
        timelineEventResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun batchCreate() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val eventServiceAsync = client.crm().timeline().events()

        val future =
            eventServiceAsync.batchCreate(
                BatchInputTimelineEvent.builder()
                    .addInput(
                        TimelineEvent.builder()
                            .eventTemplateId("1001298")
                            .tokens(
                                TimelineEvent.Tokens.builder()
                                    .putAdditionalProperty("petAge", JsonValue.from("string"))
                                    .putAdditionalProperty("petColor", JsonValue.from("black"))
                                    .putAdditionalProperty("petName", JsonValue.from("Art3mis"))
                                    .build()
                            )
                            .id("id")
                            .domain("domain")
                            .email("art3mis-pup@petspot.com")
                            .extraData(
                                JsonValue.from(
                                    mapOf(
                                        "questions" to
                                            listOf(
                                                mapOf(
                                                    "answer" to "Bark!",
                                                    "question" to "Who's a good girl?",
                                                ),
                                                mapOf(
                                                    "answer" to "Woof!",
                                                    "question" to "Do you wanna go on a walk?",
                                                ),
                                            )
                                    )
                                )
                            )
                            .objectId("objectId")
                            .timelineIFrame(
                                TimelineEventIFrame.builder()
                                    .headerLabel("Art3mis dog")
                                    .height(400)
                                    .linkLabel("View Art3mis")
                                    .url("https://my.petspot.com/pets/Art3mis")
                                    .width(600)
                                    .build()
                            )
                            .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .utk("utk")
                            .build()
                    )
                    .addInput(
                        TimelineEvent.builder()
                            .eventTemplateId("1001298")
                            .tokens(
                                TimelineEvent.Tokens.builder()
                                    .putAdditionalProperty("petAge", JsonValue.from("string"))
                                    .putAdditionalProperty("petColor", JsonValue.from("yellow"))
                                    .putAdditionalProperty("petName", JsonValue.from("Pocket"))
                                    .build()
                            )
                            .id("id")
                            .domain("domain")
                            .email("pocket-tiger@petspot.com")
                            .extraData(
                                JsonValue.from(
                                    mapOf(
                                        "questions" to
                                            listOf(
                                                mapOf(
                                                    "answer" to "Purr...",
                                                    "question" to "Who's a good kitty?",
                                                ),
                                                mapOf(
                                                    "answer" to "Meow!",
                                                    "question" to "Will you stop playing with that?",
                                                ),
                                            )
                                    )
                                )
                            )
                            .objectId("objectId")
                            .timelineIFrame(
                                TimelineEventIFrame.builder()
                                    .headerLabel("Pocket Tiger")
                                    .height(400)
                                    .linkLabel("View Pocket")
                                    .url("https://my.petspot.com/pets/Pocket")
                                    .width(600)
                                    .build()
                            )
                            .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .utk("utk")
                            .build()
                    )
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val eventServiceAsync = client.crm().timeline().events()

        val timelineEventResponseFuture =
            eventServiceAsync.get(
                EventGetParams.builder()
                    .eventTemplateId("eventTemplateId")
                    .eventId("eventId")
                    .build()
            )

        val timelineEventResponse = timelineEventResponseFuture.get()
        timelineEventResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getDetail() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val eventServiceAsync = client.crm().timeline().events()

        val eventDetailFuture =
            eventServiceAsync.getDetail(
                EventGetDetailParams.builder()
                    .eventTemplateId("eventTemplateId")
                    .eventId("eventId")
                    .build()
            )

        val eventDetail = eventDetailFuture.get()
        eventDetail.validate()
    }
}
