// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.lists

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ListSizeAndEditHistoryResponseTest {

    @Test
    fun create() {
        val listSizeAndEditHistoryResponse =
            ListSizeAndEditHistoryResponse.builder()
                .addEditHistory(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addSizeHistory(
                    ListSizeDataPoint.builder()
                        .size(0L)
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(listSizeAndEditHistoryResponse.editHistory())
            .containsExactly(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(listSizeAndEditHistoryResponse.sizeHistory())
            .containsExactly(
                ListSizeDataPoint.builder()
                    .size(0L)
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val listSizeAndEditHistoryResponse =
            ListSizeAndEditHistoryResponse.builder()
                .addEditHistory(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addSizeHistory(
                    ListSizeDataPoint.builder()
                        .size(0L)
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val roundtrippedListSizeAndEditHistoryResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(listSizeAndEditHistoryResponse),
                jacksonTypeRef<ListSizeAndEditHistoryResponse>(),
            )

        assertThat(roundtrippedListSizeAndEditHistoryResponse)
            .isEqualTo(listSizeAndEditHistoryResponse)
    }
}
