// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.account

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponseApiUsageNoPagingTest {

    @Test
    fun create() {
        val collectionResponseApiUsageNoPaging =
            CollectionResponseApiUsageNoPaging.builder()
                .addResult(
                    ApiUsage.builder()
                        .collectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currentUsage(0)
                        .fetchStatus(ApiUsage.FetchStatus.CACHED)
                        .name("name")
                        .usageLimit(0)
                        .resetsAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(collectionResponseApiUsageNoPaging.results())
            .containsExactly(
                ApiUsage.builder()
                    .collectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .currentUsage(0)
                    .fetchStatus(ApiUsage.FetchStatus.CACHED)
                    .name("name")
                    .usageLimit(0)
                    .resetsAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionResponseApiUsageNoPaging =
            CollectionResponseApiUsageNoPaging.builder()
                .addResult(
                    ApiUsage.builder()
                        .collectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currentUsage(0)
                        .fetchStatus(ApiUsage.FetchStatus.CACHED)
                        .name("name")
                        .usageLimit(0)
                        .resetsAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val roundtrippedCollectionResponseApiUsageNoPaging =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(collectionResponseApiUsageNoPaging),
                jacksonTypeRef<CollectionResponseApiUsageNoPaging>(),
            )

        assertThat(roundtrippedCollectionResponseApiUsageNoPaging)
            .isEqualTo(collectionResponseApiUsageNoPaging)
    }
}
