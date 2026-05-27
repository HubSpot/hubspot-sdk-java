// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.webhooksjournal

import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot.sdk.models.CrmObjectSnapshotBatchRequest
import com.hubspot.sdk.models.CrmObjectSnapshotRequest
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SnapshotServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val snapshotServiceAsync = client.webhooksJournal().snapshots()

        val crmObjectSnapshotBatchResponseFuture =
            snapshotServiceAsync.create(
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

        val crmObjectSnapshotBatchResponse = crmObjectSnapshotBatchResponseFuture.get()
        crmObjectSnapshotBatchResponse.validate()
    }
}
