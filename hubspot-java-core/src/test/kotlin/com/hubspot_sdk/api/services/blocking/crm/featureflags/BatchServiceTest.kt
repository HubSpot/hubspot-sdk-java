// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.featureflags

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.models.crm.featureflags.BatchPortalEntry
import com.hubspot_sdk.api.models.crm.featureflags.PortalFlagStateBatchDeleteRequest
import com.hubspot_sdk.api.models.crm.featureflags.PortalFlagStateBatchPutRequest
import com.hubspot_sdk.api.models.crm.featureflags.batch.BatchDeleteParams
import com.hubspot_sdk.api.models.crm.featureflags.batch.BatchUpsertParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BatchServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val batchService = client.crm().featureFlags().batch()

        val portalFlagStateBatchResponse =
            batchService.delete(
                BatchDeleteParams.builder()
                    .appId(0)
                    .flagName("flagName")
                    .portalFlagStateBatchDeleteRequest(
                        PortalFlagStateBatchDeleteRequest.builder().addPortalId(0).build()
                    )
                    .build()
            )

        portalFlagStateBatchResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun upsert() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val batchService = client.crm().featureFlags().batch()

        val portalFlagStateBatchResponse =
            batchService.upsert(
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

        portalFlagStateBatchResponse.validate()
    }
}
