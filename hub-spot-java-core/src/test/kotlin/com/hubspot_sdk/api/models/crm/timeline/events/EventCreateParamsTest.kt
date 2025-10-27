// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.timeline.events

import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.models.crm.timeline.TimelineEvent
import com.hubspot_sdk.api.models.crm.timeline.TimelineEventIFrame
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventCreateParamsTest {

    @Test
    fun create() {
        EventCreateParams.builder()
            .timelineEvent(
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
            .build()
    }

    @Test
    fun body() {
        val params =
            EventCreateParams.builder()
                .timelineEvent(
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
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            EventCreateParams.builder()
                .timelineEvent(
                    TimelineEvent.builder()
                        .eventTemplateId("1001298")
                        .tokens(
                            TimelineEvent.Tokens.builder()
                                .putAdditionalProperty("petAge", JsonValue.from("string"))
                                .putAdditionalProperty("petColor", JsonValue.from("black"))
                                .putAdditionalProperty("petName", JsonValue.from("Art3mis"))
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                TimelineEvent.builder()
                    .eventTemplateId("1001298")
                    .tokens(
                        TimelineEvent.Tokens.builder()
                            .putAdditionalProperty("petAge", JsonValue.from("string"))
                            .putAdditionalProperty("petColor", JsonValue.from("black"))
                            .putAdditionalProperty("petName", JsonValue.from("Art3mis"))
                            .build()
                    )
                    .build()
            )
    }
}
