// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.lists

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import com.hubspot.sdk.models.NextPage
import com.hubspot.sdk.models.Paging
import com.hubspot.sdk.models.PreviousPage
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiCollectionResponseRecordListMembershipTest {

    @Test
    fun create() {
        val apiCollectionResponseRecordListMembership =
            ApiCollectionResponseRecordListMembership.builder()
                .addResult(
                    RecordListMembership.builder()
                        .firstAddedTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lastAddedTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .listId("listId")
                        .listVersion(0)
                        .isPublicList(true)
                        .build()
                )
                .paging(
                    Paging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
                        .prev(PreviousPage.builder().before("before").link("link").build())
                        .build()
                )
                .total(0L)
                .build()

        assertThat(apiCollectionResponseRecordListMembership.results())
            .containsExactly(
                RecordListMembership.builder()
                    .firstAddedTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .lastAddedTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .listId("listId")
                    .listVersion(0)
                    .isPublicList(true)
                    .build()
            )
        assertThat(apiCollectionResponseRecordListMembership.paging())
            .contains(
                Paging.builder()
                    .next(NextPage.builder().after("after").link("link").build())
                    .prev(PreviousPage.builder().before("before").link("link").build())
                    .build()
            )
        assertThat(apiCollectionResponseRecordListMembership.total()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val apiCollectionResponseRecordListMembership =
            ApiCollectionResponseRecordListMembership.builder()
                .addResult(
                    RecordListMembership.builder()
                        .firstAddedTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lastAddedTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .listId("listId")
                        .listVersion(0)
                        .isPublicList(true)
                        .build()
                )
                .paging(
                    Paging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
                        .prev(PreviousPage.builder().before("before").link("link").build())
                        .build()
                )
                .total(0L)
                .build()

        val roundtrippedApiCollectionResponseRecordListMembership =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(apiCollectionResponseRecordListMembership),
                jacksonTypeRef<ApiCollectionResponseRecordListMembership>(),
            )

        assertThat(roundtrippedApiCollectionResponseRecordListMembership)
            .isEqualTo(apiCollectionResponseRecordListMembership)
    }
}
