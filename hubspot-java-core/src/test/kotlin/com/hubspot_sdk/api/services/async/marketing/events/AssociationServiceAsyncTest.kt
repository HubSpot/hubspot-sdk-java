// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.marketing.events

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.models.marketing.events.associations.AssociationAssociateByExternalAccountParams
import com.hubspot_sdk.api.models.marketing.events.associations.AssociationAssociateParams
import com.hubspot_sdk.api.models.marketing.events.associations.AssociationDeleteByExternalAccountParams
import com.hubspot_sdk.api.models.marketing.events.associations.AssociationDeleteParams
import com.hubspot_sdk.api.models.marketing.events.associations.AssociationListByExternalAccountParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AssociationServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val associationServiceAsync = client.marketing().events().associations()

        val collectionResponseWithTotalPublicListNoPagingFuture =
            associationServiceAsync.list("marketingEventId")

        val collectionResponseWithTotalPublicListNoPaging =
            collectionResponseWithTotalPublicListNoPagingFuture.get()
        collectionResponseWithTotalPublicListNoPaging.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val associationServiceAsync = client.marketing().events().associations()

        val future =
            associationServiceAsync.delete(
                AssociationDeleteParams.builder()
                    .marketingEventId("marketingEventId")
                    .listId("listId")
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun associate() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val associationServiceAsync = client.marketing().events().associations()

        val future =
            associationServiceAsync.associate(
                AssociationAssociateParams.builder()
                    .marketingEventId("marketingEventId")
                    .listId("listId")
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun associateByExternalAccount() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val associationServiceAsync = client.marketing().events().associations()

        val future =
            associationServiceAsync.associateByExternalAccount(
                AssociationAssociateByExternalAccountParams.builder()
                    .externalAccountId("externalAccountId")
                    .externalEventId("externalEventId")
                    .listId("listId")
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun deleteByExternalAccount() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val associationServiceAsync = client.marketing().events().associations()

        val future =
            associationServiceAsync.deleteByExternalAccount(
                AssociationDeleteByExternalAccountParams.builder()
                    .externalAccountId("externalAccountId")
                    .externalEventId("externalEventId")
                    .listId("listId")
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listByExternalAccount() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val associationServiceAsync = client.marketing().events().associations()

        val collectionResponseWithTotalPublicListNoPagingFuture =
            associationServiceAsync.listByExternalAccount(
                AssociationListByExternalAccountParams.builder()
                    .externalAccountId("externalAccountId")
                    .externalEventId("externalEventId")
                    .build()
            )

        val collectionResponseWithTotalPublicListNoPaging =
            collectionResponseWithTotalPublicListNoPagingFuture.get()
        collectionResponseWithTotalPublicListNoPaging.validate()
    }
}
