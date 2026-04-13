// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.communicationpreferences.statuses

import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClient
import com.hubspot.sdk.models.BatchInputString
import com.hubspot.sdk.models.communicationpreferences.BatchInputPublicStatusRequest
import com.hubspot.sdk.models.communicationpreferences.PublicStatusRequest
import com.hubspot.sdk.models.communicationpreferences.statuses.batch.BatchGetUnsubscribeAllStatusesParams
import com.hubspot.sdk.models.communicationpreferences.statuses.batch.BatchReadParams
import com.hubspot.sdk.models.communicationpreferences.statuses.batch.BatchUnsubscribeAllParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BatchServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getUnsubscribeAllStatuses() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val batchService = client.communicationPreferences().statuses().batch()

        val batchResponsePublicWideStatusBulkResponse =
            batchService.getUnsubscribeAllStatuses(
                BatchGetUnsubscribeAllStatusesParams.builder()
                    .channel(BatchGetUnsubscribeAllStatusesParams.Channel.EMAIL)
                    .businessUnitId(0L)
                    .batchInputString(BatchInputString.builder().addInput("string").build())
                    .build()
            )

        batchResponsePublicWideStatusBulkResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun read() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val batchService = client.communicationPreferences().statuses().batch()

        val batchResponsePublicStatusBulkResponse =
            batchService.read(
                BatchReadParams.builder()
                    .channel(BatchReadParams.Channel.EMAIL)
                    .businessUnitId(0L)
                    .batchInputString(BatchInputString.builder().addInput("string").build())
                    .build()
            )

        batchResponsePublicStatusBulkResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun unsubscribeAll() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val batchService = client.communicationPreferences().statuses().batch()

        val batchResponsePublicBulkOptOutFromAllResponse =
            batchService.unsubscribeAll(
                BatchUnsubscribeAllParams.builder()
                    .channel(BatchUnsubscribeAllParams.Channel.EMAIL)
                    .businessUnitId(0L)
                    .verbose(true)
                    .batchInputString(BatchInputString.builder().addInput("string").build())
                    .build()
            )

        batchResponsePublicBulkOptOutFromAllResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateStatuses() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val batchService = client.communicationPreferences().statuses().batch()

        val batchResponsePublicStatus =
            batchService.updateStatuses(
                BatchInputPublicStatusRequest.builder()
                    .addInput(
                        PublicStatusRequest.builder()
                            .channel(PublicStatusRequest.Channel.EMAIL)
                            .statusState(PublicStatusRequest.StatusState.NOT_SPECIFIED)
                            .subscriberIdString("subscriberIdString")
                            .subscriptionId(0)
                            .legalBasis(PublicStatusRequest.LegalBasis.CONSENT_WITH_NOTICE)
                            .legalBasisExplanation("legalBasisExplanation")
                            .build()
                    )
                    .build()
            )

        batchResponsePublicStatus.validate()
    }
}
