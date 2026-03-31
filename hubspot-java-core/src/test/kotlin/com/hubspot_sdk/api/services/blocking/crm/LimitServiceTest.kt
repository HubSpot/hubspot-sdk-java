// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.models.crm.limits.LimitGetAssociationLabelLimitsParams
import com.hubspot_sdk.api.models.crm.limits.LimitGetAssociationRecordsLimitsByObjectTypeParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class LimitServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getAssociationLabelLimits() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun getAssociationRecordsLimitsByObjectType() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun getAssociationRecordsLimitsFromObjects() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val limitService = client.crm().limits()

        val collectionResponseObjectTypeNearOrAtAssociationLimitNoPaging =
            limitService.getAssociationRecordsLimitsFromObjects()

        collectionResponseObjectTypeNearOrAtAssociationLimitNoPaging.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getAssociationRecordsLimitsToObjects() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val limitService = client.crm().limits()

        val collectionResponseObjectTypeNearOrAtAssociationLimitNoPaging =
            limitService.getAssociationRecordsLimitsToObjects("fromObjectTypeId")

        collectionResponseObjectTypeNearOrAtAssociationLimitNoPaging.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getCalculatedPropertyLimits() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val limitService = client.crm().limits()

        val calculatedPropertyLimitResponse = limitService.getCalculatedPropertyLimits()

        calculatedPropertyLimitResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getCustomObjectTypeLimits() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val limitService = client.crm().limits()

        val customObjectLimitResponse = limitService.getCustomObjectTypeLimits()

        customObjectLimitResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getCustomPropertyLimits() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val limitService = client.crm().limits()

        val customPropertyLimitResponse = limitService.getCustomPropertyLimits()

        customPropertyLimitResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getPipelineLimits() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val limitService = client.crm().limits()

        val pipelineLimitResponse = limitService.getPipelineLimits()

        pipelineLimitResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getRecordLimits() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val limitService = client.crm().limits()

        val recordLimitResponse = limitService.getRecordLimits()

        recordLimitResponse.validate()
    }
}
