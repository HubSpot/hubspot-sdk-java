// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CrmObjectSnapshotBatchResponseTest {

    @Test
    fun create() {
        val crmObjectSnapshotBatchResponse =
            CrmObjectSnapshotBatchResponse.builder()
                .addSnapshotResponse(
                    CrmObjectSnapshotResponse.builder()
                        .objectId(0)
                        .objectTypeId("objectTypeId")
                        .portalId(0)
                        .snapshotStatusId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        assertThat(crmObjectSnapshotBatchResponse.snapshotResponses())
            .containsExactly(
                CrmObjectSnapshotResponse.builder()
                    .objectId(0)
                    .objectTypeId("objectTypeId")
                    .portalId(0)
                    .snapshotStatusId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val crmObjectSnapshotBatchResponse =
            CrmObjectSnapshotBatchResponse.builder()
                .addSnapshotResponse(
                    CrmObjectSnapshotResponse.builder()
                        .objectId(0)
                        .objectTypeId("objectTypeId")
                        .portalId(0)
                        .snapshotStatusId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        val roundtrippedCrmObjectSnapshotBatchResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(crmObjectSnapshotBatchResponse),
                jacksonTypeRef<CrmObjectSnapshotBatchResponse>(),
            )

        assertThat(roundtrippedCrmObjectSnapshotBatchResponse)
            .isEqualTo(crmObjectSnapshotBatchResponse)
    }
}
