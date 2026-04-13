// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ValueWithTimestampTest {

    @Test
    fun create() {
        val valueWithTimestamp =
            ValueWithTimestamp.builder()
                .sourceType("sourceType")
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .value("value")
                .sourceId("sourceId")
                .sourceLabel("sourceLabel")
                .updatedByUserId(0)
                .build()

        assertThat(valueWithTimestamp.sourceType()).isEqualTo("sourceType")
        assertThat(valueWithTimestamp.timestamp())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(valueWithTimestamp.value()).isEqualTo("value")
        assertThat(valueWithTimestamp.sourceId()).contains("sourceId")
        assertThat(valueWithTimestamp.sourceLabel()).contains("sourceLabel")
        assertThat(valueWithTimestamp.updatedByUserId()).contains(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val valueWithTimestamp =
            ValueWithTimestamp.builder()
                .sourceType("sourceType")
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .value("value")
                .sourceId("sourceId")
                .sourceLabel("sourceLabel")
                .updatedByUserId(0)
                .build()

        val roundtrippedValueWithTimestamp =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(valueWithTimestamp),
                jacksonTypeRef<ValueWithTimestamp>(),
            )

        assertThat(roundtrippedValueWithTimestamp).isEqualTo(valueWithTimestamp)
    }
}
