// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.lists

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RecordIdWithMembershipsTest {

    @Test
    fun create() {
        val recordIdWithMemberships =
            RecordIdWithMemberships.builder()
                .objectTypeId("objectTypeId")
                .recordId("recordId")
                .addRecordListMembership(
                    RecordListMembership.builder()
                        .firstAddedTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lastAddedTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .listId("listId")
                        .listVersion(0)
                        .isPublicList(true)
                        .build()
                )
                .build()

        assertThat(recordIdWithMemberships.objectTypeId()).isEqualTo("objectTypeId")
        assertThat(recordIdWithMemberships.recordId()).isEqualTo("recordId")
        assertThat(recordIdWithMemberships.recordListMemberships())
            .containsExactly(
                RecordListMembership.builder()
                    .firstAddedTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .lastAddedTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .listId("listId")
                    .listVersion(0)
                    .isPublicList(true)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val recordIdWithMemberships =
            RecordIdWithMemberships.builder()
                .objectTypeId("objectTypeId")
                .recordId("recordId")
                .addRecordListMembership(
                    RecordListMembership.builder()
                        .firstAddedTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lastAddedTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .listId("listId")
                        .listVersion(0)
                        .isPublicList(true)
                        .build()
                )
                .build()

        val roundtrippedRecordIdWithMemberships =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(recordIdWithMemberships),
                jacksonTypeRef<RecordIdWithMemberships>(),
            )

        assertThat(roundtrippedRecordIdWithMemberships).isEqualTo(recordIdWithMemberships)
    }
}
