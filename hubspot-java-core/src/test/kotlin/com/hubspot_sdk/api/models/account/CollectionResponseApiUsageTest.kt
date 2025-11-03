// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.account

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.NextPage
import com.hubspot_sdk.api.models.PreviousPage
import com.hubspot_sdk.api.models.marketing.emails.EmailsPaging
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponseApiUsageTest {

    @Test
    fun create() {
        val collectionResponseApiUsage =
            CollectionResponseApiUsage.builder()
                .addResult(
                    ApiUsage.builder()
                        .collectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currentUsage(0)
                        .fetchStatus(ApiUsage.FetchStatus.SUCCESS)
                        .name("name")
                        .usageLimit(0)
                        .resetsAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .paging(
                    EmailsPaging.builder()
                        .next(NextPage.builder().after("").link("").build())
                        .prev(PreviousPage.builder().before("before").link("link").build())
                        .build()
                )
                .build()

        assertThat(collectionResponseApiUsage.results())
            .containsExactly(
                ApiUsage.builder()
                    .collectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .currentUsage(0)
                    .fetchStatus(ApiUsage.FetchStatus.SUCCESS)
                    .name("name")
                    .usageLimit(0)
                    .resetsAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(collectionResponseApiUsage.paging())
            .contains(
                EmailsPaging.builder()
                    .next(NextPage.builder().after("").link("").build())
                    .prev(PreviousPage.builder().before("before").link("link").build())
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionResponseApiUsage =
            CollectionResponseApiUsage.builder()
                .addResult(
                    ApiUsage.builder()
                        .collectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currentUsage(0)
                        .fetchStatus(ApiUsage.FetchStatus.SUCCESS)
                        .name("name")
                        .usageLimit(0)
                        .resetsAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .paging(
                    EmailsPaging.builder()
                        .next(NextPage.builder().after("").link("").build())
                        .prev(PreviousPage.builder().before("before").link("link").build())
                        .build()
                )
                .build()

        val roundtrippedCollectionResponseApiUsage =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(collectionResponseApiUsage),
                jacksonTypeRef<CollectionResponseApiUsage>(),
            )

        assertThat(roundtrippedCollectionResponseApiUsage).isEqualTo(collectionResponseApiUsage)
    }
}
