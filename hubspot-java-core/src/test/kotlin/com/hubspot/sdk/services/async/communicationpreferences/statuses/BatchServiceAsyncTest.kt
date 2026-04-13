// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.communicationpreferences.statuses

import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot.sdk.models.BatchInputString
import com.hubspot.sdk.models.communicationpreferences.BatchInputPublicStatusRequest
import com.hubspot.sdk.models.communicationpreferences.PublicStatusRequest
import com.hubspot.sdk.models.communicationpreferences.statuses.batch.BatchGetUnsubscribeAllStatusesParams
import com.hubspot.sdk.models.communicationpreferences.statuses.batch.BatchReadParams
import com.hubspot.sdk.models.communicationpreferences.statuses.batch.BatchUnsubscribeAllParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BatchServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getUnsubscribeAllStatuses() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val batchServiceAsync = client.communicationPreferences().statuses().batch()

        val batchResponsePublicWideStatusBulkResponseFuture =
            batchServiceAsync.getUnsubscribeAllStatuses(
                BatchGetUnsubscribeAllStatusesParams.builder()
                    .channel(BatchGetUnsubscribeAllStatusesParams.Channel.EMAIL)
                    .businessUnitId(0L)
                    .batchInputString(BatchInputString.builder().addInput("string").build())
                    .build()
            )

        val batchResponsePublicWideStatusBulkResponse =
            batchResponsePublicWideStatusBulkResponseFuture.get()
        batchResponsePublicWideStatusBulkResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun read() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val batchServiceAsync = client.communicationPreferences().statuses().batch()

        val batchResponsePublicStatusBulkResponseFuture =
            batchServiceAsync.read(
                BatchReadParams.builder()
                    .channel(BatchReadParams.Channel.EMAIL)
                    .businessUnitId(0L)
                    .batchInputString(BatchInputString.builder().addInput("string").build())
                    .build()
            )

        val batchResponsePublicStatusBulkResponse =
            batchResponsePublicStatusBulkResponseFuture.get()
        batchResponsePublicStatusBulkResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun unsubscribeAll() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val batchServiceAsync = client.communicationPreferences().statuses().batch()

        val batchResponsePublicBulkOptOutFromAllResponseFuture =
            batchServiceAsync.unsubscribeAll(
                BatchUnsubscribeAllParams.builder()
                    .channel(BatchUnsubscribeAllParams.Channel.EMAIL)
                    .businessUnitId(0L)
                    .verbose(true)
                    .batchInputString(BatchInputString.builder().addInput("string").build())
                    .build()
            )

        val batchResponsePublicBulkOptOutFromAllResponse =
            batchResponsePublicBulkOptOutFromAllResponseFuture.get()
        batchResponsePublicBulkOptOutFromAllResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateStatuses() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val batchServiceAsync = client.communicationPreferences().statuses().batch()

        val batchResponsePublicStatusFuture =
            batchServiceAsync.updateStatuses(
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

        val batchResponsePublicStatus = batchResponsePublicStatusFuture.get()
        batchResponsePublicStatus.validate()
    }
}
