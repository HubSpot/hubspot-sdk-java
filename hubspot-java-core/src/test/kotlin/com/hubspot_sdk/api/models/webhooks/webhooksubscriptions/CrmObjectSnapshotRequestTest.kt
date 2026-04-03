// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.webhooks.webhooksubscriptions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CrmObjectSnapshotRequestTest {

    @Test
    fun create() {
        val crmObjectSnapshotRequest =
            CrmObjectSnapshotRequest.builder()
                .objectId(0)
                .objectTypeId("objectTypeId")
                .portalId(0)
                .addProperty("string")
                .build()

        assertThat(crmObjectSnapshotRequest.objectId()).isEqualTo(0)
        assertThat(crmObjectSnapshotRequest.objectTypeId()).isEqualTo("objectTypeId")
        assertThat(crmObjectSnapshotRequest.portalId()).isEqualTo(0)
        assertThat(crmObjectSnapshotRequest.properties()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val crmObjectSnapshotRequest =
            CrmObjectSnapshotRequest.builder()
                .objectId(0)
                .objectTypeId("objectTypeId")
                .portalId(0)
                .addProperty("string")
                .build()

        val roundtrippedCrmObjectSnapshotRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(crmObjectSnapshotRequest),
                jacksonTypeRef<CrmObjectSnapshotRequest>(),
            )

        assertThat(roundtrippedCrmObjectSnapshotRequest).isEqualTo(crmObjectSnapshotRequest)
    }
}
