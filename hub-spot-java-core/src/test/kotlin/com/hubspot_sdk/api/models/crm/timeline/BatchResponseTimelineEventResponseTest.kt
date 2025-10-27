// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.timeline

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchResponseTimelineEventResponseTest {

    @Test
    fun create() {
        val batchResponseTimelineEventResponse =
            BatchResponseTimelineEventResponse.builder()
                .completedAt(OffsetDateTime.parse("2020-01-30T18:13:26.227559Z"))
                .addResult(
                    TimelineEventResponse.builder()
                        .id(
                            "petspot:1001298:art3mis-pup@petspot.com-6edaa73d-d734-404d-908f-74774d58ac2b"
                        )
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
                        .timestamp(OffsetDateTime.parse("2020-01-30T18:13:25.665Z"))
                        .utk("utk")
                        .build()
                )
                .addResult(
                    TimelineEventResponse.builder()
                        .id(
                            "petspot:1001298:pocket-tiger@petspot.com-0df6277b-6eba-4d1f-8c19-1994cbfaa4ca"
                        )
                        .eventTemplateId("1001298")
                        .objectType("contacts")
                        .tokens(
                            TimelineEventResponse.Tokens.builder()
                                .putAdditionalProperty("petAge", JsonValue.from("3"))
                                .putAdditionalProperty("petColor", JsonValue.from("yellow"))
                                .putAdditionalProperty("petName", JsonValue.from("Pocket"))
                                .build()
                        )
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
                        .objectId("28651")
                        .timelineIFrame(
                            TimelineEventIFrame.builder()
                                .headerLabel("Pocket Tiger")
                                .height(400)
                                .linkLabel("View Pocket")
                                .url("https://my.petspot.com/pets/Pocket")
                                .width(600)
                                .build()
                        )
                        .timestamp(OffsetDateTime.parse("2020-01-30T18:13:25.665Z"))
                        .utk("utk")
                        .build()
                )
                .startedAt(OffsetDateTime.parse("2020-01-30T18:13:24.974023Z"))
                .status(BatchResponseTimelineEventResponse.Status.COMPLETE)
                .links(
                    BatchResponseTimelineEventResponse.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(batchResponseTimelineEventResponse.completedAt())
            .isEqualTo(OffsetDateTime.parse("2020-01-30T18:13:26.227559Z"))
        assertThat(batchResponseTimelineEventResponse.results())
            .containsExactly(
                TimelineEventResponse.builder()
                    .id(
                        "petspot:1001298:art3mis-pup@petspot.com-6edaa73d-d734-404d-908f-74774d58ac2b"
                    )
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
                    .timestamp(OffsetDateTime.parse("2020-01-30T18:13:25.665Z"))
                    .utk("utk")
                    .build(),
                TimelineEventResponse.builder()
                    .id(
                        "petspot:1001298:pocket-tiger@petspot.com-0df6277b-6eba-4d1f-8c19-1994cbfaa4ca"
                    )
                    .eventTemplateId("1001298")
                    .objectType("contacts")
                    .tokens(
                        TimelineEventResponse.Tokens.builder()
                            .putAdditionalProperty("petAge", JsonValue.from("3"))
                            .putAdditionalProperty("petColor", JsonValue.from("yellow"))
                            .putAdditionalProperty("petName", JsonValue.from("Pocket"))
                            .build()
                    )
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
                    .objectId("28651")
                    .timelineIFrame(
                        TimelineEventIFrame.builder()
                            .headerLabel("Pocket Tiger")
                            .height(400)
                            .linkLabel("View Pocket")
                            .url("https://my.petspot.com/pets/Pocket")
                            .width(600)
                            .build()
                    )
                    .timestamp(OffsetDateTime.parse("2020-01-30T18:13:25.665Z"))
                    .utk("utk")
                    .build(),
            )
        assertThat(batchResponseTimelineEventResponse.startedAt())
            .isEqualTo(OffsetDateTime.parse("2020-01-30T18:13:24.974023Z"))
        assertThat(batchResponseTimelineEventResponse.status())
            .isEqualTo(BatchResponseTimelineEventResponse.Status.COMPLETE)
        assertThat(batchResponseTimelineEventResponse.links())
            .contains(
                BatchResponseTimelineEventResponse.Links.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(batchResponseTimelineEventResponse.requestedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchResponseTimelineEventResponse =
            BatchResponseTimelineEventResponse.builder()
                .completedAt(OffsetDateTime.parse("2020-01-30T18:13:26.227559Z"))
                .addResult(
                    TimelineEventResponse.builder()
                        .id(
                            "petspot:1001298:art3mis-pup@petspot.com-6edaa73d-d734-404d-908f-74774d58ac2b"
                        )
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
                        .timestamp(OffsetDateTime.parse("2020-01-30T18:13:25.665Z"))
                        .utk("utk")
                        .build()
                )
                .addResult(
                    TimelineEventResponse.builder()
                        .id(
                            "petspot:1001298:pocket-tiger@petspot.com-0df6277b-6eba-4d1f-8c19-1994cbfaa4ca"
                        )
                        .eventTemplateId("1001298")
                        .objectType("contacts")
                        .tokens(
                            TimelineEventResponse.Tokens.builder()
                                .putAdditionalProperty("petAge", JsonValue.from("3"))
                                .putAdditionalProperty("petColor", JsonValue.from("yellow"))
                                .putAdditionalProperty("petName", JsonValue.from("Pocket"))
                                .build()
                        )
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
                        .objectId("28651")
                        .timelineIFrame(
                            TimelineEventIFrame.builder()
                                .headerLabel("Pocket Tiger")
                                .height(400)
                                .linkLabel("View Pocket")
                                .url("https://my.petspot.com/pets/Pocket")
                                .width(600)
                                .build()
                        )
                        .timestamp(OffsetDateTime.parse("2020-01-30T18:13:25.665Z"))
                        .utk("utk")
                        .build()
                )
                .startedAt(OffsetDateTime.parse("2020-01-30T18:13:24.974023Z"))
                .status(BatchResponseTimelineEventResponse.Status.COMPLETE)
                .links(
                    BatchResponseTimelineEventResponse.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedBatchResponseTimelineEventResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchResponseTimelineEventResponse),
                jacksonTypeRef<BatchResponseTimelineEventResponse>(),
            )

        assertThat(roundtrippedBatchResponseTimelineEventResponse)
            .isEqualTo(batchResponseTimelineEventResponse)
    }
}
