// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.timeline

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.ErrorDetail
import com.hubspot_sdk.api.models.StandardError
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchResponseTimelineEventResponseWithErrorsTest {

    @Test
    fun create() {
        val batchResponseTimelineEventResponseWithErrors =
            BatchResponseTimelineEventResponseWithErrors.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addResult(
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
                        .timestamp(OffsetDateTime.parse("2020-01-30T18:37:15.569Z"))
                        .utk("utk")
                        .build()
                )
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(BatchResponseTimelineEventResponseWithErrors.Status.PENDING)
                .addError(
                    StandardError.builder()
                        .category("")
                        .context(
                            StandardError.Context.builder()
                                .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                                .build()
                        )
                        .addError(
                            ErrorDetail.builder()
                                .message("message")
                                .code("code")
                                .context(
                                    ErrorDetail.Context.builder()
                                        .putAdditionalProperty(
                                            "missingScopes",
                                            JsonValue.from(listOf("scope1", "scope2")),
                                        )
                                        .build()
                                )
                                .in_("in")
                                .subCategory("subCategory")
                                .build()
                        )
                        .links(
                            StandardError.Links.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .message("")
                        .status("")
                        .id("")
                        .subCategory(JsonValue.from(""))
                        .build()
                )
                .links(
                    BatchResponseTimelineEventResponseWithErrors.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .numErrors(0)
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(batchResponseTimelineEventResponseWithErrors.completedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchResponseTimelineEventResponseWithErrors.results())
            .containsExactly(
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
                    .timestamp(OffsetDateTime.parse("2020-01-30T18:37:15.569Z"))
                    .utk("utk")
                    .build()
            )
        assertThat(batchResponseTimelineEventResponseWithErrors.startedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchResponseTimelineEventResponseWithErrors.status())
            .isEqualTo(BatchResponseTimelineEventResponseWithErrors.Status.PENDING)
        assertThat(batchResponseTimelineEventResponseWithErrors.errors().getOrNull())
            .containsExactly(
                StandardError.builder()
                    .category("")
                    .context(
                        StandardError.Context.builder()
                            .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                            .build()
                    )
                    .addError(
                        ErrorDetail.builder()
                            .message("message")
                            .code("code")
                            .context(
                                ErrorDetail.Context.builder()
                                    .putAdditionalProperty(
                                        "missingScopes",
                                        JsonValue.from(listOf("scope1", "scope2")),
                                    )
                                    .build()
                            )
                            .in_("in")
                            .subCategory("subCategory")
                            .build()
                    )
                    .links(
                        StandardError.Links.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .message("")
                    .status("")
                    .id("")
                    .subCategory(JsonValue.from(""))
                    .build()
            )
        assertThat(batchResponseTimelineEventResponseWithErrors.links())
            .contains(
                BatchResponseTimelineEventResponseWithErrors.Links.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(batchResponseTimelineEventResponseWithErrors.numErrors()).contains(0)
        assertThat(batchResponseTimelineEventResponseWithErrors.requestedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchResponseTimelineEventResponseWithErrors =
            BatchResponseTimelineEventResponseWithErrors.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addResult(
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
                        .timestamp(OffsetDateTime.parse("2020-01-30T18:37:15.569Z"))
                        .utk("utk")
                        .build()
                )
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(BatchResponseTimelineEventResponseWithErrors.Status.PENDING)
                .addError(
                    StandardError.builder()
                        .category("")
                        .context(
                            StandardError.Context.builder()
                                .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                                .build()
                        )
                        .addError(
                            ErrorDetail.builder()
                                .message("message")
                                .code("code")
                                .context(
                                    ErrorDetail.Context.builder()
                                        .putAdditionalProperty(
                                            "missingScopes",
                                            JsonValue.from(listOf("scope1", "scope2")),
                                        )
                                        .build()
                                )
                                .in_("in")
                                .subCategory("subCategory")
                                .build()
                        )
                        .links(
                            StandardError.Links.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .message("")
                        .status("")
                        .id("")
                        .subCategory(JsonValue.from(""))
                        .build()
                )
                .links(
                    BatchResponseTimelineEventResponseWithErrors.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .numErrors(0)
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedBatchResponseTimelineEventResponseWithErrors =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchResponseTimelineEventResponseWithErrors),
                jacksonTypeRef<BatchResponseTimelineEventResponseWithErrors>(),
            )

        assertThat(roundtrippedBatchResponseTimelineEventResponseWithErrors)
            .isEqualTo(batchResponseTimelineEventResponseWithErrors)
    }
}
