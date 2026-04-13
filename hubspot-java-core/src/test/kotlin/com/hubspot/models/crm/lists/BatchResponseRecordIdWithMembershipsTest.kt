// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.lists

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.JsonValue
import com.hubspot.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchResponseRecordIdWithMembershipsTest {

    @Test
    fun create() {
        val batchResponseRecordIdWithMemberships =
            BatchResponseRecordIdWithMemberships.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addResult(
                    RecordIdWithMemberships.builder()
                        .objectTypeId("objectTypeId")
                        .recordId("recordId")
                        .addRecordListMembership(
                            RecordListMembership.builder()
                                .firstAddedTimestamp(
                                    OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                )
                                .lastAddedTimestamp(
                                    OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                )
                                .listId("listId")
                                .listVersion(0)
                                .isPublicList(true)
                                .build()
                        )
                        .build()
                )
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(BatchResponseRecordIdWithMemberships.Status.CANCELED)
                .links(
                    BatchResponseRecordIdWithMemberships.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(batchResponseRecordIdWithMemberships.completedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchResponseRecordIdWithMemberships.results())
            .containsExactly(
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
            )
        assertThat(batchResponseRecordIdWithMemberships.startedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchResponseRecordIdWithMemberships.status())
            .isEqualTo(BatchResponseRecordIdWithMemberships.Status.CANCELED)
        assertThat(batchResponseRecordIdWithMemberships.links())
            .contains(
                BatchResponseRecordIdWithMemberships.Links.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(batchResponseRecordIdWithMemberships.requestedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchResponseRecordIdWithMemberships =
            BatchResponseRecordIdWithMemberships.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addResult(
                    RecordIdWithMemberships.builder()
                        .objectTypeId("objectTypeId")
                        .recordId("recordId")
                        .addRecordListMembership(
                            RecordListMembership.builder()
                                .firstAddedTimestamp(
                                    OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                )
                                .lastAddedTimestamp(
                                    OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                )
                                .listId("listId")
                                .listVersion(0)
                                .isPublicList(true)
                                .build()
                        )
                        .build()
                )
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(BatchResponseRecordIdWithMemberships.Status.CANCELED)
                .links(
                    BatchResponseRecordIdWithMemberships.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedBatchResponseRecordIdWithMemberships =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchResponseRecordIdWithMemberships),
                jacksonTypeRef<BatchResponseRecordIdWithMemberships>(),
            )

        assertThat(roundtrippedBatchResponseRecordIdWithMemberships)
            .isEqualTo(batchResponseRecordIdWithMemberships)
    }
}
