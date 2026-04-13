// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async

import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot.sdk.models.communicationpreferences.CommunicationPreferenceGenerateLinksParams
import com.hubspot.sdk.models.communicationpreferences.CommunicationPreferenceGetStatusesParams
import com.hubspot.sdk.models.communicationpreferences.CommunicationPreferenceGetUnsubscribeAllStatusParams
import com.hubspot.sdk.models.communicationpreferences.CommunicationPreferenceUnsubscribeAllParams
import com.hubspot.sdk.models.communicationpreferences.CommunicationPreferenceUpdateStatusParams
import com.hubspot.sdk.models.communicationpreferences.LinkGenerationRequest
import com.hubspot.sdk.models.communicationpreferences.PartialPublicStatusRequest
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CommunicationPreferenceServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun generateLinks() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val communicationPreferenceServiceAsync = client.communicationPreferences()

        val linkGenerationResponseFuture =
            communicationPreferenceServiceAsync.generateLinks(
                CommunicationPreferenceGenerateLinksParams.builder()
                    .channel(CommunicationPreferenceGenerateLinksParams.Channel.EMAIL)
                    .businessUnitId(0L)
                    .linkGenerationRequest(
                        LinkGenerationRequest.builder()
                            .subscriberIdString("subscriberIdString")
                            .language("language")
                            .subscriptionId(0L)
                            .build()
                    )
                    .build()
            )

        val linkGenerationResponse = linkGenerationResponseFuture.get()
        linkGenerationResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getStatuses() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val communicationPreferenceServiceAsync = client.communicationPreferences()

        val actionResponseWithResultsPublicStatusFuture =
            communicationPreferenceServiceAsync.getStatuses(
                CommunicationPreferenceGetStatusesParams.builder()
                    .subscriberIdString("subscriberIdString")
                    .channel(CommunicationPreferenceGetStatusesParams.Channel.EMAIL)
                    .businessUnitId(0L)
                    .build()
            )

        val actionResponseWithResultsPublicStatus =
            actionResponseWithResultsPublicStatusFuture.get()
        actionResponseWithResultsPublicStatus.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getUnsubscribeAllStatus() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val communicationPreferenceServiceAsync = client.communicationPreferences()

        val actionResponseWithResultsPublicWideStatusFuture =
            communicationPreferenceServiceAsync.getUnsubscribeAllStatus(
                CommunicationPreferenceGetUnsubscribeAllStatusParams.builder()
                    .subscriberIdString("subscriberIdString")
                    .channel(CommunicationPreferenceGetUnsubscribeAllStatusParams.Channel.EMAIL)
                    .businessUnitId(0L)
                    .verbose(true)
                    .build()
            )

        val actionResponseWithResultsPublicWideStatus =
            actionResponseWithResultsPublicWideStatusFuture.get()
        actionResponseWithResultsPublicWideStatus.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun unsubscribeAll() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val communicationPreferenceServiceAsync = client.communicationPreferences()

        val actionResponseWithResultsPublicStatusFuture =
            communicationPreferenceServiceAsync.unsubscribeAll(
                CommunicationPreferenceUnsubscribeAllParams.builder()
                    .subscriberIdString("subscriberIdString")
                    .channel(CommunicationPreferenceUnsubscribeAllParams.Channel.EMAIL)
                    .businessUnitId(0L)
                    .verbose(true)
                    .build()
            )

        val actionResponseWithResultsPublicStatus =
            actionResponseWithResultsPublicStatusFuture.get()
        actionResponseWithResultsPublicStatus.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateStatus() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val communicationPreferenceServiceAsync = client.communicationPreferences()

        val actionResponseWithResultsPublicStatusFuture =
            communicationPreferenceServiceAsync.updateStatus(
                CommunicationPreferenceUpdateStatusParams.builder()
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

        val actionResponseWithResultsPublicStatus =
            actionResponseWithResultsPublicStatusFuture.get()
        actionResponseWithResultsPublicStatus.validate()
    }
}
