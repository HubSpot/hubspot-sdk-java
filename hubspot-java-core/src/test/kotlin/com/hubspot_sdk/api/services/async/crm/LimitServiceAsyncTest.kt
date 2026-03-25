// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.models.crm.limits.LimitGetAssociationLabelLimitsParams
import com.hubspot_sdk.api.models.crm.limits.LimitGetAssociationRecordsLimitsByObjectTypeParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class LimitServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getAssociationLabelLimits() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val limitServiceAsync = client.crm().limits()

        val collectionResponseAssociationLabelLimitResponseNoPagingFuture =
            limitServiceAsync.getAssociationLabelLimits(
                LimitGetAssociationLabelLimitsParams.builder()
                    .fromObjectTypeId("fromObjectTypeId")
                    .toObjectTypeId("toObjectTypeId")
                    .build()
            )

        val collectionResponseAssociationLabelLimitResponseNoPaging =
            collectionResponseAssociationLabelLimitResponseNoPagingFuture.get()
        collectionResponseAssociationLabelLimitResponseNoPaging.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getAssociationRecordsLimitsByObjectType() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val limitServiceAsync = client.crm().limits()

        val associationRecordLimitResponseFuture =
            limitServiceAsync.getAssociationRecordsLimitsByObjectType(
                LimitGetAssociationRecordsLimitsByObjectTypeParams.builder()
                    .fromObjectTypeId("fromObjectTypeId")
                    .toObjectTypeId("toObjectTypeId")
                    .build()
            )

        val associationRecordLimitResponse = associationRecordLimitResponseFuture.get()
        associationRecordLimitResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getAssociationRecordsLimitsFromObjects() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val limitServiceAsync = client.crm().limits()

        val collectionResponseObjectTypeNearOrAtAssociationLimitNoPagingFuture =
            limitServiceAsync.getAssociationRecordsLimitsFromObjects()

        val collectionResponseObjectTypeNearOrAtAssociationLimitNoPaging =
            collectionResponseObjectTypeNearOrAtAssociationLimitNoPagingFuture.get()
        collectionResponseObjectTypeNearOrAtAssociationLimitNoPaging.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getAssociationRecordsLimitsToObjects() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val limitServiceAsync = client.crm().limits()

        val collectionResponseObjectTypeNearOrAtAssociationLimitNoPagingFuture =
            limitServiceAsync.getAssociationRecordsLimitsToObjects("fromObjectTypeId")

        val collectionResponseObjectTypeNearOrAtAssociationLimitNoPaging =
            collectionResponseObjectTypeNearOrAtAssociationLimitNoPagingFuture.get()
        collectionResponseObjectTypeNearOrAtAssociationLimitNoPaging.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getCalculatedPropertyLimits() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val limitServiceAsync = client.crm().limits()

        val calculatedPropertyLimitResponseFuture = limitServiceAsync.getCalculatedPropertyLimits()

        val calculatedPropertyLimitResponse = calculatedPropertyLimitResponseFuture.get()
        calculatedPropertyLimitResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getCustomObjectTypeLimits() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val limitServiceAsync = client.crm().limits()

        val customObjectLimitResponseFuture = limitServiceAsync.getCustomObjectTypeLimits()

        val customObjectLimitResponse = customObjectLimitResponseFuture.get()
        customObjectLimitResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getCustomPropertyLimits() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val limitServiceAsync = client.crm().limits()

        val customPropertyLimitResponseFuture = limitServiceAsync.getCustomPropertyLimits()

        val customPropertyLimitResponse = customPropertyLimitResponseFuture.get()
        customPropertyLimitResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getPipelineLimits() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val limitServiceAsync = client.crm().limits()

        val pipelineLimitResponseFuture = limitServiceAsync.getPipelineLimits()

        val pipelineLimitResponse = pipelineLimitResponseFuture.get()
        pipelineLimitResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getRecordLimits() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val limitServiceAsync = client.crm().limits()

        val recordLimitResponseFuture = limitServiceAsync.getRecordLimits()

        val recordLimitResponse = recordLimitResponseFuture.get()
        recordLimitResponse.validate()
    }
}
