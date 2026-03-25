// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.marketing.events

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.models.marketing.events.listassociations.ListAssociationAssociateByExternalAccountParams
import com.hubspot_sdk.api.models.marketing.events.listassociations.ListAssociationAssociateParams
import com.hubspot_sdk.api.models.marketing.events.listassociations.ListAssociationDeleteByExternalAccountParams
import com.hubspot_sdk.api.models.marketing.events.listassociations.ListAssociationDeleteParams
import com.hubspot_sdk.api.models.marketing.events.listassociations.ListAssociationListByExternalAccountParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ListAssociationServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val listAssociationService = client.marketing().events().listAssociations()

        val collectionResponseWithTotalPublicList = listAssociationService.list("marketingEventId")

        collectionResponseWithTotalPublicList.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val listAssociationService = client.marketing().events().listAssociations()

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
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val listAssociationService = client.marketing().events().listAssociations()

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
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val listAssociationService = client.marketing().events().listAssociations()

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
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val listAssociationService = client.marketing().events().listAssociations()

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
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val listAssociationService = client.marketing().events().listAssociations()

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
