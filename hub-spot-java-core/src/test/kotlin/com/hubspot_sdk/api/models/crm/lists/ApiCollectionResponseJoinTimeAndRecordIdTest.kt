// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.lists

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.NextPage
import com.hubspot_sdk.api.models.PreviousPage
import com.hubspot_sdk.api.models.marketing.emails.Paging
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiCollectionResponseJoinTimeAndRecordIdTest {

    @Test
    fun create() {
        val apiCollectionResponseJoinTimeAndRecordId =
            ApiCollectionResponseJoinTimeAndRecordId.builder()
                .addResult(
                    JoinTimeAndRecordId.builder()
                        .membershipTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .recordId("recordId")
                        .build()
                )
                .paging(
                    Paging.builder()
                        .next(NextPage.builder().after("").link("").build())
                        .prev(PreviousPage.builder().before("before").link("link").build())
                        .build()
                )
                .total(0L)
                .build()

        assertThat(apiCollectionResponseJoinTimeAndRecordId.results())
            .containsExactly(
                JoinTimeAndRecordId.builder()
                    .membershipTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .recordId("recordId")
                    .build()
            )
        assertThat(apiCollectionResponseJoinTimeAndRecordId.paging())
            .contains(
                Paging.builder()
                    .next(NextPage.builder().after("").link("").build())
                    .prev(PreviousPage.builder().before("before").link("link").build())
                    .build()
            )
        assertThat(apiCollectionResponseJoinTimeAndRecordId.total()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val apiCollectionResponseJoinTimeAndRecordId =
            ApiCollectionResponseJoinTimeAndRecordId.builder()
                .addResult(
                    JoinTimeAndRecordId.builder()
                        .membershipTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .recordId("recordId")
                        .build()
                )
                .paging(
                    Paging.builder()
                        .next(NextPage.builder().after("").link("").build())
                        .prev(PreviousPage.builder().before("before").link("link").build())
                        .build()
                )
                .total(0L)
                .build()

        val roundtrippedApiCollectionResponseJoinTimeAndRecordId =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(apiCollectionResponseJoinTimeAndRecordId),
                jacksonTypeRef<ApiCollectionResponseJoinTimeAndRecordId>(),
            )

        assertThat(roundtrippedApiCollectionResponseJoinTimeAndRecordId)
            .isEqualTo(apiCollectionResponseJoinTimeAndRecordId)
    }
}
