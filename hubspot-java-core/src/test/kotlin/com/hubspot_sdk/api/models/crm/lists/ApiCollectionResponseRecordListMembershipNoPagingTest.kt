// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.lists

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiCollectionResponseRecordListMembershipNoPagingTest {

    @Test
    fun create() {
        val apiCollectionResponseRecordListMembershipNoPaging =
            ApiCollectionResponseRecordListMembershipNoPaging.builder()
                .addResult(
                    RecordListMembership.builder()
                        .listId("listId")
                        .listVersion(2)
                        .firstAddedTimestamp(OffsetDateTime.parse("2023-06-28T22:00:15.001Z"))
                        .isPublicList(true)
                        .lastAddedTimestamp(OffsetDateTime.parse("2023-09-28T22:03:17.998Z"))
                        .build()
                )
                .total(0L)
                .build()

        assertThat(apiCollectionResponseRecordListMembershipNoPaging.results())
            .containsExactly(
                RecordListMembership.builder()
                    .listId("listId")
                    .listVersion(2)
                    .firstAddedTimestamp(OffsetDateTime.parse("2023-06-28T22:00:15.001Z"))
                    .isPublicList(true)
                    .lastAddedTimestamp(OffsetDateTime.parse("2023-09-28T22:03:17.998Z"))
                    .build()
            )
        assertThat(apiCollectionResponseRecordListMembershipNoPaging.total()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val apiCollectionResponseRecordListMembershipNoPaging =
            ApiCollectionResponseRecordListMembershipNoPaging.builder()
                .addResult(
                    RecordListMembership.builder()
                        .listId("listId")
                        .listVersion(2)
                        .firstAddedTimestamp(OffsetDateTime.parse("2023-06-28T22:00:15.001Z"))
                        .isPublicList(true)
                        .lastAddedTimestamp(OffsetDateTime.parse("2023-09-28T22:03:17.998Z"))
                        .build()
                )
                .total(0L)
                .build()

        val roundtrippedApiCollectionResponseRecordListMembershipNoPaging =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(apiCollectionResponseRecordListMembershipNoPaging),
                jacksonTypeRef<ApiCollectionResponseRecordListMembershipNoPaging>(),
            )

        assertThat(roundtrippedApiCollectionResponseRecordListMembershipNoPaging)
            .isEqualTo(apiCollectionResponseRecordListMembershipNoPaging)
    }
}
