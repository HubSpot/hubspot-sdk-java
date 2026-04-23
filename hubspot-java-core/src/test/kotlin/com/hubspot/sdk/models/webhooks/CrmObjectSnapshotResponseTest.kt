// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CrmObjectSnapshotResponseTest {

    @Test
    fun create() {
        val crmObjectSnapshotResponse =
            CrmObjectSnapshotResponse.builder()
                .objectId(0L)
                .objectTypeId("objectTypeId")
                .portalId(0L)
                .snapshotStatusId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(crmObjectSnapshotResponse.objectId()).isEqualTo(0L)
        assertThat(crmObjectSnapshotResponse.objectTypeId()).isEqualTo("objectTypeId")
        assertThat(crmObjectSnapshotResponse.portalId()).isEqualTo(0L)
        assertThat(crmObjectSnapshotResponse.snapshotStatusId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val crmObjectSnapshotResponse =
            CrmObjectSnapshotResponse.builder()
                .objectId(0L)
                .objectTypeId("objectTypeId")
                .portalId(0L)
                .snapshotStatusId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedCrmObjectSnapshotResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(crmObjectSnapshotResponse),
                jacksonTypeRef<CrmObjectSnapshotResponse>(),
            )

        assertThat(roundtrippedCrmObjectSnapshotResponse).isEqualTo(crmObjectSnapshotResponse)
    }
}
