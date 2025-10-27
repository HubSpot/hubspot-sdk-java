// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.timeline

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchInputTimelineEventTest {

    @Test
    fun create() {
        val batchInputTimelineEvent =
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

        assertThat(batchInputTimelineEvent.inputs())
            .containsExactly(
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
                    .build(),
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
                    .build(),
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchInputTimelineEvent =
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

        val roundtrippedBatchInputTimelineEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchInputTimelineEvent),
                jacksonTypeRef<BatchInputTimelineEvent>(),
            )

        assertThat(roundtrippedBatchInputTimelineEvent).isEqualTo(batchInputTimelineEvent)
    }
}
