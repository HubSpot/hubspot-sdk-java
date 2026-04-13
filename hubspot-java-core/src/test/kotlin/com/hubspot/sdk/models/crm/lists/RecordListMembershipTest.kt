// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.lists

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RecordListMembershipTest {

    @Test
    fun create() {
        val recordListMembership =
            RecordListMembership.builder()
                .firstAddedTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastAddedTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .listId("listId")
                .listVersion(0)
                .isPublicList(true)
                .build()

        assertThat(recordListMembership.firstAddedTimestamp())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(recordListMembership.lastAddedTimestamp())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(recordListMembership.listId()).isEqualTo("listId")
        assertThat(recordListMembership.listVersion()).isEqualTo(0)
        assertThat(recordListMembership.isPublicList()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val recordListMembership =
            RecordListMembership.builder()
                .firstAddedTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastAddedTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .listId("listId")
                .listVersion(0)
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
