// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.timeline

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TimelineEventTest {

    @Test
    fun create() {
        val timelineEvent =
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
                                    mapOf("answer" to "Bark!", "question" to "Who's a good girl?"),
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

        assertThat(timelineEvent.eventTemplateId()).isEqualTo("1001298")
        assertThat(timelineEvent.tokens())
            .isEqualTo(
                TimelineEvent.Tokens.builder()
                    .putAdditionalProperty("petAge", JsonValue.from("string"))
                    .putAdditionalProperty("petColor", JsonValue.from("black"))
                    .putAdditionalProperty("petName", JsonValue.from("Art3mis"))
                    .build()
            )
        assertThat(timelineEvent.id()).contains("id")
        assertThat(timelineEvent.domain()).contains("domain")
        assertThat(timelineEvent.email()).contains("art3mis-pup@petspot.com")
        assertThat(timelineEvent._extraData())
            .isEqualTo(
                JsonValue.from(
                    mapOf(
                        "questions" to
                            listOf(
                                mapOf("answer" to "Bark!", "question" to "Who's a good girl?"),
                                mapOf(
                                    "answer" to "Woof!",
                                    "question" to "Do you wanna go on a walk?",
                                ),
                            )
                    )
                )
            )
        assertThat(timelineEvent.objectId()).contains("objectId")
        assertThat(timelineEvent.timelineIFrame())
            .contains(
                TimelineEventIFrame.builder()
                    .headerLabel("Art3mis dog")
                    .height(400)
                    .linkLabel("View Art3mis")
                    .url("https://my.petspot.com/pets/Art3mis")
                    .width(600)
                    .build()
            )
        assertThat(timelineEvent.timestamp())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(timelineEvent.utk()).contains("utk")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val timelineEvent =
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
                                    mapOf("answer" to "Bark!", "question" to "Who's a good girl?"),
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

        val roundtrippedTimelineEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(timelineEvent),
                jacksonTypeRef<TimelineEvent>(),
            )

        assertThat(roundtrippedTimelineEvent).isEqualTo(timelineEvent)
    }
}
