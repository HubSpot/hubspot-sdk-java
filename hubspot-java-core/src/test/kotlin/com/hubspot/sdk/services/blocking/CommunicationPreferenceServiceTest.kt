// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking

import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClient
import com.hubspot.sdk.models.communicationpreferences.CommunicationPreferenceGenerateLinksParams
import com.hubspot.sdk.models.communicationpreferences.CommunicationPreferenceGetStatusesParams
import com.hubspot.sdk.models.communicationpreferences.CommunicationPreferenceGetUnsubscribeAllStatusParams
import com.hubspot.sdk.models.communicationpreferences.CommunicationPreferenceUnsubscribeAllParams
import com.hubspot.sdk.models.communicationpreferences.CommunicationPreferenceUpdateStatusParams
import com.hubspot.sdk.models.communicationpreferences.LinkGenerationRequest
import com.hubspot.sdk.models.communicationpreferences.PartialPublicStatusRequest
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CommunicationPreferenceServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun generateLinks() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val communicationPreferenceService = client.communicationPreferences()

        val linkGenerationResponse =
            communicationPreferenceService.generateLinks(
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

        linkGenerationResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getStatuses() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val communicationPreferenceService = client.communicationPreferences()

        val actionResponseWithResultsPublicStatus =
            communicationPreferenceService.getStatuses(
                CommunicationPreferenceGetStatusesParams.builder()
                    .subscriberIdString("subscriberIdString")
                    .channel(CommunicationPreferenceGetStatusesParams.Channel.EMAIL)
                    .businessUnitId(0L)
                    .build()
            )

        actionResponseWithResultsPublicStatus.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getUnsubscribeAllStatus() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val communicationPreferenceService = client.communicationPreferences()

        val actionResponseWithResultsPublicWideStatus =
            communicationPreferenceService.getUnsubscribeAllStatus(
                CommunicationPreferenceGetUnsubscribeAllStatusParams.builder()
                    .subscriberIdString("subscriberIdString")
                    .channel(CommunicationPreferenceGetUnsubscribeAllStatusParams.Channel.EMAIL)
                    .businessUnitId(0L)
                    .verbose(true)
                    .build()
            )

        actionResponseWithResultsPublicWideStatus.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun unsubscribeAll() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val communicationPreferenceService = client.communicationPreferences()

        val actionResponseWithResultsPublicStatus =
            communicationPreferenceService.unsubscribeAll(
                CommunicationPreferenceUnsubscribeAllParams.builder()
                    .subscriberIdString("subscriberIdString")
                    .channel(CommunicationPreferenceUnsubscribeAllParams.Channel.EMAIL)
                    .businessUnitId(0L)
                    .verbose(true)
                    .build()
            )

        actionResponseWithResultsPublicStatus.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateStatus() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val communicationPreferenceService = client.communicationPreferences()

        val actionResponseWithResultsPublicStatus =
            communicationPreferenceService.updateStatus(
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

        actionResponseWithResultsPublicStatus.validate()
    }
}
