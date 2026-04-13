// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.marketing.marketingevents

import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClient
import com.hubspot.sdk.models.marketing.marketingevents.listassociations.ListAssociationAssociateByExternalAccountParams
import com.hubspot.sdk.models.marketing.marketingevents.listassociations.ListAssociationAssociateParams
import com.hubspot.sdk.models.marketing.marketingevents.listassociations.ListAssociationDeleteByExternalAccountParams
import com.hubspot.sdk.models.marketing.marketingevents.listassociations.ListAssociationDeleteParams
import com.hubspot.sdk.models.marketing.marketingevents.listassociations.ListAssociationListByExternalAccountParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ListAssociationServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val listAssociationService = client.marketing().marketingEvents().listAssociations()

        val collectionResponseWithTotalPublicList = listAssociationService.list("marketingEventId")

        collectionResponseWithTotalPublicList.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val listAssociationService = client.marketing().marketingEvents().listAssociations()

        listAssociationService.delete(
            ListAssociationDeleteParams.builder()
                .marketingEventId("marketingEventId")
                .listId("listId")
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun associate() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val listAssociationService = client.marketing().marketingEvents().listAssociations()

        listAssociationService.associate(
            ListAssociationAssociateParams.builder()
                .marketingEventId("marketingEventId")
                .listId("listId")
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun associateByExternalAccount() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val listAssociationService = client.marketing().marketingEvents().listAssociations()

        listAssociationService.associateByExternalAccount(
            ListAssociationAssociateByExternalAccountParams.builder()
                .externalAccountId("externalAccountId")
                .externalEventId("externalEventId")
                .listId("listId")
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteByExternalAccount() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val listAssociationService = client.marketing().marketingEvents().listAssociations()

        listAssociationService.deleteByExternalAccount(
            ListAssociationDeleteByExternalAccountParams.builder()
                .externalAccountId("externalAccountId")
                .externalEventId("externalEventId")
                .listId("listId")
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listByExternalAccount() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val listAssociationService = client.marketing().marketingEvents().listAssociations()

        val collectionResponseWithTotalPublicList =
            listAssociationService.listByExternalAccount(
                ListAssociationListByExternalAccountParams.builder()
                    .externalAccountId("externalAccountId")
                    .externalEventId("externalEventId")
                    .build()
            )

        collectionResponseWithTotalPublicList.validate()
    }
}
