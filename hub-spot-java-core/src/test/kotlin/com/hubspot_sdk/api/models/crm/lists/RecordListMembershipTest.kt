// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.lists

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RecordListMembershipTest {

    @Test
    fun create() {
        val recordListMembership =
            RecordListMembership.builder()
                .firstAddedTimestamp(OffsetDateTime.parse("2023-06-28T22:00:15.001Z"))
                .lastAddedTimestamp(OffsetDateTime.parse("2023-09-28T22:03:17.998Z"))
                .listId("listId")
                .listVersion(2)
                .isPublicList(true)
                .build()

        assertThat(recordListMembership.firstAddedTimestamp())
            .isEqualTo(OffsetDateTime.parse("2023-06-28T22:00:15.001Z"))
        assertThat(recordListMembership.lastAddedTimestamp())
            .isEqualTo(OffsetDateTime.parse("2023-09-28T22:03:17.998Z"))
        assertThat(recordListMembership.listId()).isEqualTo("listId")
        assertThat(recordListMembership.listVersion()).isEqualTo(2)
        assertThat(recordListMembership.isPublicList()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val recordListMembership =
            RecordListMembership.builder()
                .firstAddedTimestamp(OffsetDateTime.parse("2023-06-28T22:00:15.001Z"))
                .lastAddedTimestamp(OffsetDateTime.parse("2023-09-28T22:03:17.998Z"))
                .listId("listId")
                .listVersion(2)
                .isPublicList(true)
                .build()

        val roundtrippedRecordListMembership =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(recordListMembership),
                jacksonTypeRef<RecordListMembership>(),
            )

        assertThat(roundtrippedRecordListMembership).isEqualTo(recordListMembership)
    }
}
