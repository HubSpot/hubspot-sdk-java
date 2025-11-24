// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.marketing.subscriptions.v4

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
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
internal class StatusServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val statusService = client.marketing().subscriptions().v4().statuses()

        val actionResponseWithResultsPublicStatus =
            statusService.update(
                StatusUpdateParams.builder()
                    .subscriberIdString("subscriberIdString")
                    .partialPublicStatusRequest(
                        PartialPublicStatusRequest.builder()
                            .channel(PartialPublicStatusRequest.Channel.EMAIL)
                            .statusState(PartialPublicStatusRequest.StatusState.NOT_SPECIFIED)
                            .subscriptionId(0L)
                            .legalBasis(PartialPublicStatusRequest.LegalBasis.CONSENT_WITH_NOTICE)
                            .legalBasisExplanation("legalBasisExplanation")
                            .build()
                    )
                    .build()
            )

        actionResponseWithResultsPublicStatus.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun batchGet() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val statusService = client.marketing().subscriptions().v4().statuses()

        val batchResponsePublicStatusBulkResponse =
            statusService.batchGet(
                StatusBatchGetParams.builder()
                    .channel(StatusBatchGetParams.Channel.EMAIL)
                    .businessUnitId(0L)
                    .batchInputString(BatchInputString.builder().addInput("string").build())
                    .build()
            )

        batchResponsePublicStatusBulkResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun batchGetUnsubscribeAllStatus() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val statusService = client.marketing().subscriptions().v4().statuses()

        val batchResponsePublicWideStatusBulkResponse =
            statusService.batchGetUnsubscribeAllStatus(
                StatusBatchGetUnsubscribeAllStatusParams.builder()
                    .channel(StatusBatchGetUnsubscribeAllStatusParams.Channel.EMAIL)
                    .businessUnitId(0L)
                    .batchInputString(BatchInputString.builder().addInput("string").build())
                    .build()
            )

        batchResponsePublicWideStatusBulkResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun batchUnsubscribeAll() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val statusService = client.marketing().subscriptions().v4().statuses()

        val batchResponsePublicBulkOptOutFromAllResponse =
            statusService.batchUnsubscribeAll(
                StatusBatchUnsubscribeAllParams.builder()
                    .channel(StatusBatchUnsubscribeAllParams.Channel.EMAIL)
                    .businessUnitId(0L)
                    .verbose(true)
                    .batchInputString(BatchInputString.builder().addInput("string").build())
                    .build()
            )

        batchResponsePublicBulkOptOutFromAllResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun batchUpdate() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val statusService = client.marketing().subscriptions().v4().statuses()

        val batchResponsePublicStatus =
            statusService.batchUpdate(
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

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val statusService = client.marketing().subscriptions().v4().statuses()

        val actionResponseWithResultsPublicStatus =
            statusService.get(
                StatusGetParams.builder()
                    .subscriberIdString("subscriberIdString")
                    .channel(StatusGetParams.Channel.EMAIL)
                    .businessUnitId(0L)
                    .build()
            )

        actionResponseWithResultsPublicStatus.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getUnsubscribeAllStatus() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val statusService = client.marketing().subscriptions().v4().statuses()

        val actionResponseWithResultsPublicWideStatus =
            statusService.getUnsubscribeAllStatus(
                StatusGetUnsubscribeAllStatusParams.builder()
                    .subscriberIdString("subscriberIdString")
                    .channel(StatusGetUnsubscribeAllStatusParams.Channel.EMAIL)
                    .businessUnitId(0L)
                    .verbose(true)
                    .build()
            )

        actionResponseWithResultsPublicWideStatus.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun unsubscribeAll() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val statusService = client.marketing().subscriptions().v4().statuses()

        val actionResponseWithResultsPublicStatus =
            statusService.unsubscribeAll(
                StatusUnsubscribeAllParams.builder()
                    .subscriberIdString("subscriberIdString")
                    .channel(StatusUnsubscribeAllParams.Channel.EMAIL)
                    .businessUnitId(0L)
                    .verbose(true)
                    .build()
            )

        actionResponseWithResultsPublicStatus.validate()
    }
}
