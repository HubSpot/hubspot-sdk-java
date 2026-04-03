// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.marketing.marketingevents

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.models.marketing.marketingevents.listassociations.ListAssociationAssociateByExternalAccountParams
import com.hubspot_sdk.api.models.marketing.marketingevents.listassociations.ListAssociationAssociateParams
import com.hubspot_sdk.api.models.marketing.marketingevents.listassociations.ListAssociationDeleteByExternalAccountParams
import com.hubspot_sdk.api.models.marketing.marketingevents.listassociations.ListAssociationDeleteParams
import com.hubspot_sdk.api.models.marketing.marketingevents.listassociations.ListAssociationListByExternalAccountParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ListAssociationServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val listAssociationServiceAsync = client.marketing().marketingEvents().listAssociations()

        val collectionResponseWithTotalPublicListFuture =
            listAssociationServiceAsync.list("marketingEventId")

        val collectionResponseWithTotalPublicList =
            collectionResponseWithTotalPublicListFuture.get()
        collectionResponseWithTotalPublicList.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val listAssociationServiceAsync = client.marketing().marketingEvents().listAssociations()

        val future =
            listAssociationServiceAsync.delete(
                ListAssociationDeleteParams.builder()
                    .marketingEventId("marketingEventId")
                    .listId("listId")
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun associate() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val listAssociationServiceAsync = client.marketing().marketingEvents().listAssociations()

        val future =
            listAssociationServiceAsync.associate(
                ListAssociationAssociateParams.builder()
                    .marketingEventId("marketingEventId")
                    .listId("listId")
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun associateByExternalAccount() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val listAssociationServiceAsync = client.marketing().marketingEvents().listAssociations()

        val future =
            listAssociationServiceAsync.associateByExternalAccount(
                ListAssociationAssociateByExternalAccountParams.builder()
                    .externalAccountId("externalAccountId")
                    .externalEventId("externalEventId")
                    .listId("listId")
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteByExternalAccount() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val listAssociationServiceAsync = client.marketing().marketingEvents().listAssociations()

        val future =
            listAssociationServiceAsync.deleteByExternalAccount(
                ListAssociationDeleteByExternalAccountParams.builder()
                    .externalAccountId("externalAccountId")
                    .externalEventId("externalEventId")
                    .listId("listId")
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listByExternalAccount() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val listAssociationServiceAsync = client.marketing().marketingEvents().listAssociations()

        val collectionResponseWithTotalPublicListFuture =
            listAssociationServiceAsync.listByExternalAccount(
                ListAssociationListByExternalAccountParams.builder()
                    .externalAccountId("externalAccountId")
                    .externalEventId("externalEventId")
                    .build()
            )

        val collectionResponseWithTotalPublicList =
            collectionResponseWithTotalPublicListFuture.get()
        collectionResponseWithTotalPublicList.validate()
    }
}
