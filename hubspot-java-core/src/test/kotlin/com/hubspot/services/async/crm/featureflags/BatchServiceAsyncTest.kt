// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.crm.featureflags

import com.hubspot.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot.models.crm.featureflags.BatchPortalEntry
import com.hubspot.models.crm.featureflags.PortalFlagStateBatchDeleteRequest
import com.hubspot.models.crm.featureflags.PortalFlagStateBatchPutRequest
import com.hubspot.models.crm.featureflags.batch.BatchDeleteParams
import com.hubspot.models.crm.featureflags.batch.BatchUpsertParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BatchServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val batchServiceAsync = client.crm().featureFlags().batch()

        val portalFlagStateBatchResponseFuture =
            batchServiceAsync.delete(
                BatchDeleteParams.builder()
                    .appId(0)
                    .flagName("flagName")
                    .portalFlagStateBatchDeleteRequest(
                        PortalFlagStateBatchDeleteRequest.builder().addPortalId(0).build()
                    )
                    .build()
            )

        val portalFlagStateBatchResponse = portalFlagStateBatchResponseFuture.get()
        portalFlagStateBatchResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun upsert() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val batchServiceAsync = client.crm().featureFlags().batch()

        val portalFlagStateBatchResponseFuture =
            batchServiceAsync.upsert(
                BatchUpsertParams.builder()
                    .appId(0)
                    .flagName("flagName")
                    .portalFlagStateBatchPutRequest(
                        PortalFlagStateBatchPutRequest.builder()
                            .addPortalState(
                                BatchPortalEntry.builder()
                                    .flagState(BatchPortalEntry.FlagState.ABSENT)
                                    .portalId(0)
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        val portalFlagStateBatchResponse = portalFlagStateBatchResponseFuture.get()
        portalFlagStateBatchResponse.validate()
    }
}
