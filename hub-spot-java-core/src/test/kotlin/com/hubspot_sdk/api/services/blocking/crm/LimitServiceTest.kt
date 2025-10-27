// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubSpotOkHttpClient
import com.hubspot_sdk.api.models.crm.limits.LimitGetAssociationLabelLimitsParams
import com.hubspot_sdk.api.models.crm.limits.LimitGetAssociationRecordsLimitsByObjectTypeParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LimitServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun getAssociationLabelLimits() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val limitService = client.crm().limits()

        val collectionResponseAssociationLabelLimitResponseNoPaging =
            limitService.getAssociationLabelLimits(
                LimitGetAssociationLabelLimitsParams.builder()
                    .fromObjectTypeId("fromObjectTypeId")
                    .toObjectTypeId("toObjectTypeId")
                    .build()
            )

        collectionResponseAssociationLabelLimitResponseNoPaging.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getAssociationRecordsLimitsByObjectType() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val limitService = client.crm().limits()

        val associationRecordLimitResponse =
            limitService.getAssociationRecordsLimitsByObjectType(
                LimitGetAssociationRecordsLimitsByObjectTypeParams.builder()
                    .fromObjectTypeId("fromObjectTypeId")
                    .toObjectTypeId("toObjectTypeId")
                    .build()
            )

        associationRecordLimitResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getAssociationRecordsLimitsFromObjects() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val limitService = client.crm().limits()

        val collectionResponseObjectTypeNearOrAtAssociationLimitNoPaging =
            limitService.getAssociationRecordsLimitsFromObjects()

        collectionResponseObjectTypeNearOrAtAssociationLimitNoPaging.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getAssociationRecordsLimitsToObjects() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val limitService = client.crm().limits()

        val collectionResponseObjectTypeNearOrAtAssociationLimitNoPaging =
            limitService.getAssociationRecordsLimitsToObjects("fromObjectTypeId")

        collectionResponseObjectTypeNearOrAtAssociationLimitNoPaging.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getCalculatedPropertyLimits() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val limitService = client.crm().limits()

        val calculatedPropertyLimitResponse = limitService.getCalculatedPropertyLimits()

        calculatedPropertyLimitResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getCustomObjectTypeLimits() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val limitService = client.crm().limits()

        val customObjectLimitResponse = limitService.getCustomObjectTypeLimits()

        customObjectLimitResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getCustomPropertyLimits() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val limitService = client.crm().limits()

        val customPropertyLimitResponse = limitService.getCustomPropertyLimits()

        customPropertyLimitResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getPipelineLimits() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val limitService = client.crm().limits()

        val pipelineLimitResponse = limitService.getPipelineLimits()

        pipelineLimitResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getRecordLimits() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val limitService = client.crm().limits()

        val recordLimitResponse = limitService.getRecordLimits()

        recordLimitResponse.validate()
    }
}
