// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.webhooksjournal

import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClient
import com.hubspot.sdk.models.CrmObjectSnapshotBatchRequest
import com.hubspot.sdk.models.CrmObjectSnapshotRequest
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SnapshotServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val snapshotService = client.webhooksJournal().snapshots()

        val crmObjectSnapshotBatchResponse =
            snapshotService.create(
                CrmObjectSnapshotBatchRequest.builder()
                    .addSnapshotRequest(
                        CrmObjectSnapshotRequest.builder()
                            .objectId(0L)
                            .objectTypeId("objectTypeId")
                            .portalId(0L)
                            .addProperty("string")
                            .build()
                    )
                    .build()
            )

        crmObjectSnapshotBatchResponse.validate()
    }
}
