// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.timeline

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TimelineEventResponseTest {

    @Test
    fun create() {
        val timelineEventResponse =
            TimelineEventResponse.builder()
                .id("petspot:1001298:art3mis-pup@petspot.com-004-invalid")
                .eventTemplateId("1001298")
                .objectType("contacts")
                .tokens(
                    TimelineEventResponse.Tokens.builder()
                        .putAdditionalProperty("petAge", JsonValue.from("3"))
                        .putAdditionalProperty("petColor", JsonValue.from("black"))
                        .putAdditionalProperty("petName", JsonValue.from("Art3mis"))
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
                .objectId("28001")
                .timelineIFrame(
                    TimelineEventIFrame.builder()
                        .headerLabel("Art3mis dog")
                        .height(400)
                        .linkLabel("View Art3mis")
                        .url("https://my.petspot.com/pets/Art3mis")
                        .width(600)
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2020-01-30T18:37:15.569Z"))
                .utk("utk")
                .build()

        assertThat(timelineEventResponse.id())
            .isEqualTo("petspot:1001298:art3mis-pup@petspot.com-004-invalid")
        assertThat(timelineEventResponse.eventTemplateId()).isEqualTo("1001298")
        assertThat(timelineEventResponse.objectType()).isEqualTo("contacts")
        assertThat(timelineEventResponse.tokens())
            .isEqualTo(
                TimelineEventResponse.Tokens.builder()
                    .putAdditionalProperty("petAge", JsonValue.from("3"))
                    .putAdditionalProperty("petColor", JsonValue.from("black"))
                    .putAdditionalProperty("petName", JsonValue.from("Art3mis"))
                    .build()
            )
        assertThat(timelineEventResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(timelineEventResponse.domain()).contains("domain")
        assertThat(timelineEventResponse.email()).contains("art3mis-pup@petspot.com")
        assertThat(timelineEventResponse._extraData())
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
        assertThat(timelineEventResponse.objectId()).contains("28001")
        assertThat(timelineEventResponse.timelineIFrame())
            .contains(
                TimelineEventIFrame.builder()
                    .headerLabel("Art3mis dog")
                    .height(400)
                    .linkLabel("View Art3mis")
                    .url("https://my.petspot.com/pets/Art3mis")
                    .width(600)
                    .build()
            )
        assertThat(timelineEventResponse.timestamp())
            .contains(OffsetDateTime.parse("2020-01-30T18:37:15.569Z"))
        assertThat(timelineEventResponse.utk()).contains("utk")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val timelineEventResponse =
            TimelineEventResponse.builder()
                .id("petspot:1001298:art3mis-pup@petspot.com-004-invalid")
                .eventTemplateId("1001298")
                .objectType("contacts")
                .tokens(
                    TimelineEventResponse.Tokens.builder()
                        .putAdditionalProperty("petAge", JsonValue.from("3"))
                        .putAdditionalProperty("petColor", JsonValue.from("black"))
                        .putAdditionalProperty("petName", JsonValue.from("Art3mis"))
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
                .objectId("28001")
                .timelineIFrame(
                    TimelineEventIFrame.builder()
                        .headerLabel("Art3mis dog")
                        .height(400)
                        .linkLabel("View Art3mis")
                        .url("https://my.petspot.com/pets/Art3mis")
                        .width(600)
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2020-01-30T18:37:15.569Z"))
                .utk("utk")
                .build()

        val roundtrippedTimelineEventResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(timelineEventResponse),
                jacksonTypeRef<TimelineEventResponse>(),
            )

        assertThat(roundtrippedTimelineEventResponse).isEqualTo(timelineEventResponse)
    }
}
