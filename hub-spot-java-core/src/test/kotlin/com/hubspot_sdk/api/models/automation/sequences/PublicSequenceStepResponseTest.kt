// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.sequences

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicSequenceStepResponseTest {

    @Test
    fun create() {
        val publicSequenceStepResponse =
            PublicSequenceStepResponse.builder()
                .id("id")
                .actionType("actionType")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .delayMillis(0)
                .stepOrder(0)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .emailPattern(
                    PublicEmailPatternResponse.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .templateId("templateId")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .threadEmailToStepOrder(0)
                        .build()
                )
                .taskPattern(
                    PublicTaskPatternResponse.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .taskPriority("taskPriority")
                        .taskType("taskType")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .notes("notes")
                        .queueId(0)
                        .subject("subject")
                        .templateId(0L)
                        .threadEmailToStepOrder(0)
                        .build()
                )
                .build()

        assertThat(publicSequenceStepResponse.id()).isEqualTo("id")
        assertThat(publicSequenceStepResponse.actionType()).isEqualTo("actionType")
        assertThat(publicSequenceStepResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(publicSequenceStepResponse.delayMillis()).isEqualTo(0)
        assertThat(publicSequenceStepResponse.stepOrder()).isEqualTo(0)
        assertThat(publicSequenceStepResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(publicSequenceStepResponse.emailPattern())
            .contains(
                PublicEmailPatternResponse.builder()
                    .id("id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .templateId("templateId")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .threadEmailToStepOrder(0)
                    .build()
            )
        assertThat(publicSequenceStepResponse.taskPattern())
            .contains(
                PublicTaskPatternResponse.builder()
                    .id("id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .taskPriority("taskPriority")
                    .taskType("taskType")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .notes("notes")
                    .queueId(0)
                    .subject("subject")
                    .templateId(0L)
                    .threadEmailToStepOrder(0)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicSequenceStepResponse =
            PublicSequenceStepResponse.builder()
                .id("id")
                .actionType("actionType")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .delayMillis(0)
                .stepOrder(0)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .emailPattern(
                    PublicEmailPatternResponse.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .templateId("templateId")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .threadEmailToStepOrder(0)
                        .build()
                )
                .taskPattern(
                    PublicTaskPatternResponse.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .taskPriority("taskPriority")
                        .taskType("taskType")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .notes("notes")
                        .queueId(0)
                        .subject("subject")
                        .templateId(0L)
                        .threadEmailToStepOrder(0)
                        .build()
                )
                .build()

        val roundtrippedPublicSequenceStepResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicSequenceStepResponse),
                jacksonTypeRef<PublicSequenceStepResponse>(),
            )

        assertThat(roundtrippedPublicSequenceStepResponse).isEqualTo(publicSequenceStepResponse)
    }
}
