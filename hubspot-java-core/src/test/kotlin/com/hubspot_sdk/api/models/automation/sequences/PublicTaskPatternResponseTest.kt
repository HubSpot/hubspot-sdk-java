// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.sequences

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicTaskPatternResponseTest {

    @Test
    fun create() {
        val publicTaskPatternResponse =
            PublicTaskPatternResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .taskPriority(PublicTaskPatternResponse.TaskPriority.HIGH)
                .taskType(PublicTaskPatternResponse.TaskType.CALL)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .notes("notes")
                .queueId(0)
                .subject("subject")
                .templateId(0L)
                .threadEmailToStepOrder(0)
                .build()

        assertThat(publicTaskPatternResponse.id()).isEqualTo("id")
        assertThat(publicTaskPatternResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(publicTaskPatternResponse.taskPriority())
            .isEqualTo(PublicTaskPatternResponse.TaskPriority.HIGH)
        assertThat(publicTaskPatternResponse.taskType())
            .isEqualTo(PublicTaskPatternResponse.TaskType.CALL)
        assertThat(publicTaskPatternResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(publicTaskPatternResponse.notes()).contains("notes")
        assertThat(publicTaskPatternResponse.queueId()).contains(0)
        assertThat(publicTaskPatternResponse.subject()).contains("subject")
        assertThat(publicTaskPatternResponse.templateId()).contains(0L)
        assertThat(publicTaskPatternResponse.threadEmailToStepOrder()).contains(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicTaskPatternResponse =
            PublicTaskPatternResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .taskPriority(PublicTaskPatternResponse.TaskPriority.HIGH)
                .taskType(PublicTaskPatternResponse.TaskType.CALL)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .notes("notes")
                .queueId(0)
                .subject("subject")
                .templateId(0L)
                .threadEmailToStepOrder(0)
                .build()

        val roundtrippedPublicTaskPatternResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicTaskPatternResponse),
                jacksonTypeRef<PublicTaskPatternResponse>(),
            )

        assertThat(roundtrippedPublicTaskPatternResponse).isEqualTo(publicTaskPatternResponse)
    }
}
