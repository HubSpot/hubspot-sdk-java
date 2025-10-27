// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.marketing.subscriptions.v4

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot_sdk.api.models.BatchInputString
import com.hubspot_sdk.api.models.marketing.subscriptions.v4.BatchInputPublicStatusRequest
import com.hubspot_sdk.api.models.marketing.subscriptions.v4.PartialPublicStatusRequest
import com.hubspot_sdk.api.models.marketing.subscriptions.v4.PublicStatusRequest
import com.hubspot_sdk.api.models.marketing.subscriptions.v4.statuses.StatusBatchGetParams
import com.hubspot_sdk.api.models.marketing.subscriptions.v4.statuses.StatusBatchGetUnsubscribeAllStatusParams
import com.hubspot_sdk.api.models.marketing.subscriptions.v4.statuses.StatusBatchUnsubscribeAllParams
import com.hubspot_sdk.api.models.marketing.subscriptions.v4.statuses.StatusGetParams
import com.hubspot_sdk.api.models.marketing.subscriptions.v4.statuses.StatusGetUnsubscribeAllStatusParams
import com.hubspot_sdk.api.models.marketing.subscriptions.v4.statuses.StatusUnsubscribeAllParams
import com.hubspot_sdk.api.models.marketing.subscriptions.v4.statuses.StatusUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class StatusServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val statusServiceAsync = client.marketing().subscriptions().v4().statuses()

        val actionResponseWithResultsPublicStatusFuture =
            statusServiceAsync.update(
                StatusUpdateParams.builder()
                    .subscriberIdString("subscriberIdString")
                    .partialPublicStatusRequest(
                        PartialPublicStatusRequest.builder()
                            .channel(PartialPublicStatusRequest.Channel.EMAIL)
                            .statusState(PartialPublicStatusRequest.StatusState.SUBSCRIBED)
                            .subscriptionId(0L)
                            .legalBasis(
                                PartialPublicStatusRequest.LegalBasis.LEGITIMATE_INTEREST_PQL
                            )
                            .legalBasisExplanation("legalBasisExplanation")
                            .build()
                    )
                    .build()
            )

        val actionResponseWithResultsPublicStatus =
            actionResponseWithResultsPublicStatusFuture.get()
        actionResponseWithResultsPublicStatus.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun batchGet() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val statusServiceAsync = client.marketing().subscriptions().v4().statuses()

        val batchResponsePublicStatusBulkResponseFuture =
            statusServiceAsync.batchGet(
                StatusBatchGetParams.builder()
                    .channel(StatusBatchGetParams.Channel.EMAIL)
                    .businessUnitId(0L)
                    .batchInputString(BatchInputString.builder().addInput("string").build())
                    .build()
            )

        val batchResponsePublicStatusBulkResponse =
            batchResponsePublicStatusBulkResponseFuture.get()
        batchResponsePublicStatusBulkResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun batchGetUnsubscribeAllStatus() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val statusServiceAsync = client.marketing().subscriptions().v4().statuses()

        val batchResponsePublicWideStatusBulkResponseFuture =
            statusServiceAsync.batchGetUnsubscribeAllStatus(
                StatusBatchGetUnsubscribeAllStatusParams.builder()
                    .channel(StatusBatchGetUnsubscribeAllStatusParams.Channel.EMAIL)
                    .businessUnitId(0L)
                    .batchInputString(BatchInputString.builder().addInput("string").build())
                    .build()
            )

        val batchResponsePublicWideStatusBulkResponse =
            batchResponsePublicWideStatusBulkResponseFuture.get()
        batchResponsePublicWideStatusBulkResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun batchUnsubscribeAll() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val statusServiceAsync = client.marketing().subscriptions().v4().statuses()

        val batchResponsePublicBulkOptOutFromAllResponseFuture =
            statusServiceAsync.batchUnsubscribeAll(
                StatusBatchUnsubscribeAllParams.builder()
                    .channel(StatusBatchUnsubscribeAllParams.Channel.EMAIL)
                    .businessUnitId(0L)
                    .verbose(true)
                    .batchInputString(BatchInputString.builder().addInput("string").build())
                    .build()
            )

        val batchResponsePublicBulkOptOutFromAllResponse =
            batchResponsePublicBulkOptOutFromAllResponseFuture.get()
        batchResponsePublicBulkOptOutFromAllResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun batchUpdate() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val statusServiceAsync = client.marketing().subscriptions().v4().statuses()

        val batchResponsePublicStatusFuture =
            statusServiceAsync.batchUpdate(
                BatchInputPublicStatusRequest.builder()
                    .addInput(
                        PublicStatusRequest.builder()
                            .channel(PublicStatusRequest.Channel.EMAIL)
                            .statusState(PublicStatusRequest.StatusState.SUBSCRIBED)
                            .subscriberIdString("subscriberIdString")
                            .subscriptionId(0)
                            .legalBasis(PublicStatusRequest.LegalBasis.LEGITIMATE_INTEREST_PQL)
                            .legalBasisExplanation("legalBasisExplanation")
                            .build()
                    )
                    .build()
            )

        val batchResponsePublicStatus = batchResponsePublicStatusFuture.get()
        batchResponsePublicStatus.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val statusServiceAsync = client.marketing().subscriptions().v4().statuses()

        val actionResponseWithResultsPublicStatusFuture =
            statusServiceAsync.get(
                StatusGetParams.builder()
                    .subscriberIdString("subscriberIdString")
                    .channel(StatusGetParams.Channel.EMAIL)
                    .businessUnitId(0L)
                    .build()
            )

        val actionResponseWithResultsPublicStatus =
            actionResponseWithResultsPublicStatusFuture.get()
        actionResponseWithResultsPublicStatus.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getUnsubscribeAllStatus() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val statusServiceAsync = client.marketing().subscriptions().v4().statuses()

        val actionResponseWithResultsPublicWideStatusFuture =
            statusServiceAsync.getUnsubscribeAllStatus(
                StatusGetUnsubscribeAllStatusParams.builder()
                    .subscriberIdString("subscriberIdString")
                    .channel(StatusGetUnsubscribeAllStatusParams.Channel.EMAIL)
                    .businessUnitId(0L)
                    .verbose(true)
                    .build()
            )

        val actionResponseWithResultsPublicWideStatus =
            actionResponseWithResultsPublicWideStatusFuture.get()
        actionResponseWithResultsPublicWideStatus.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun unsubscribeAll() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val statusServiceAsync = client.marketing().subscriptions().v4().statuses()

        val actionResponseWithResultsPublicStatusFuture =
            statusServiceAsync.unsubscribeAll(
                StatusUnsubscribeAllParams.builder()
                    .subscriberIdString("subscriberIdString")
                    .channel(StatusUnsubscribeAllParams.Channel.EMAIL)
                    .businessUnitId(0L)
                    .verbose(true)
                    .build()
            )

        val actionResponseWithResultsPublicStatus =
            actionResponseWithResultsPublicStatusFuture.get()
        actionResponseWithResultsPublicStatus.validate()
    }
}
