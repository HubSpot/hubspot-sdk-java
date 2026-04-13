// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.lists

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ListSizeDataPointTest {

    @Test
    fun create() {
        val listSizeDataPoint =
            ListSizeDataPoint.builder()
                .size(0)
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(listSizeDataPoint.size()).isEqualTo(0)
        assertThat(listSizeDataPoint.timestamp())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val listSizeDataPoint =
            ListSizeDataPoint.builder()
                .size(0)
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedListSizeDataPoint =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(listSizeDataPoint),
                jacksonTypeRef<ListSizeDataPoint>(),
            )

        assertThat(roundtrippedListSizeDataPoint).isEqualTo(listSizeDataPoint)
    }
}
