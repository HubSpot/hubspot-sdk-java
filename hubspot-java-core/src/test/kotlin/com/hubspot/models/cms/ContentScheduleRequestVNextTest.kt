// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContentScheduleRequestVNextTest {

    @Test
    fun create() {
        val contentScheduleRequestVNext =
            ContentScheduleRequestVNext.builder()
                .id("id")
                .publishDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(contentScheduleRequestVNext.id()).isEqualTo("id")
        assertThat(contentScheduleRequestVNext.publishDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val contentScheduleRequestVNext =
            ContentScheduleRequestVNext.builder()
                .id("id")
                .publishDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedContentScheduleRequestVNext =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(contentScheduleRequestVNext),
                jacksonTypeRef<ContentScheduleRequestVNext>(),
            )

        assertThat(roundtrippedContentScheduleRequestVNext).isEqualTo(contentScheduleRequestVNext)
    }
}
