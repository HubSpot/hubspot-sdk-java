// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.webhooks.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JournalFetchResponseTest {

    @Test
    fun create() {
        val journalFetchResponse =
            JournalFetchResponse.builder()
                .currentOffset("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .url("url")
                .build()

        assertThat(journalFetchResponse.currentOffset())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(journalFetchResponse.expiresAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(journalFetchResponse.url()).isEqualTo("url")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val journalFetchResponse =
            JournalFetchResponse.builder()
                .currentOffset("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .url("url")
                .build()

        val roundtrippedJournalFetchResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(journalFetchResponse),
                jacksonTypeRef<JournalFetchResponse>(),
            )

        assertThat(roundtrippedJournalFetchResponse).isEqualTo(journalFetchResponse)
    }
}
