// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.JsonValue
import com.hubspot.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchResponseJournalFetchResponseTest {

    @Test
    fun create() {
        val batchResponseJournalFetchResponse =
            BatchResponseJournalFetchResponse.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addResult(
                    JournalFetchResponse.builder()
                        .currentOffset("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .url("url")
                        .build()
                )
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(BatchResponseJournalFetchResponse.Status.CANCELED)
                .links(
                    BatchResponseJournalFetchResponse.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(batchResponseJournalFetchResponse.completedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchResponseJournalFetchResponse.results())
            .containsExactly(
                JournalFetchResponse.builder()
                    .currentOffset("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .url("url")
                    .build()
            )
        assertThat(batchResponseJournalFetchResponse.startedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchResponseJournalFetchResponse.status())
            .isEqualTo(BatchResponseJournalFetchResponse.Status.CANCELED)
        assertThat(batchResponseJournalFetchResponse.links())
            .contains(
                BatchResponseJournalFetchResponse.Links.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(batchResponseJournalFetchResponse.requestedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchResponseJournalFetchResponse =
            BatchResponseJournalFetchResponse.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addResult(
                    JournalFetchResponse.builder()
                        .currentOffset("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .url("url")
                        .build()
                )
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(BatchResponseJournalFetchResponse.Status.CANCELED)
                .links(
                    BatchResponseJournalFetchResponse.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedBatchResponseJournalFetchResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchResponseJournalFetchResponse),
                jacksonTypeRef<BatchResponseJournalFetchResponse>(),
            )

        assertThat(roundtrippedBatchResponseJournalFetchResponse)
            .isEqualTo(batchResponseJournalFetchResponse)
    }
}
