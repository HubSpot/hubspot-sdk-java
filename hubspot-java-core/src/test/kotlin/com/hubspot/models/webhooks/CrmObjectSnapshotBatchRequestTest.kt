// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CrmObjectSnapshotBatchRequestTest {

    @Test
    fun create() {
        val crmObjectSnapshotBatchRequest =
            CrmObjectSnapshotBatchRequest.builder()
                .addSnapshotRequest(
                    CrmObjectSnapshotRequest.builder()
                        .objectId(0)
                        .objectTypeId("objectTypeId")
                        .portalId(0)
                        .addProperty("string")
                        .build()
                )
                .build()

        assertThat(crmObjectSnapshotBatchRequest.snapshotRequests())
            .containsExactly(
                CrmObjectSnapshotRequest.builder()
                    .objectId(0)
                    .objectTypeId("objectTypeId")
                    .portalId(0)
                    .addProperty("string")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val crmObjectSnapshotBatchRequest =
            CrmObjectSnapshotBatchRequest.builder()
                .addSnapshotRequest(
                    CrmObjectSnapshotRequest.builder()
                        .objectId(0)
                        .objectTypeId("objectTypeId")
                        .portalId(0)
                        .addProperty("string")
                        .build()
                )
                .build()

        val roundtrippedCrmObjectSnapshotBatchRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(crmObjectSnapshotBatchRequest),
                jacksonTypeRef<CrmObjectSnapshotBatchRequest>(),
            )

        assertThat(roundtrippedCrmObjectSnapshotBatchRequest)
            .isEqualTo(crmObjectSnapshotBatchRequest)
    }
}
