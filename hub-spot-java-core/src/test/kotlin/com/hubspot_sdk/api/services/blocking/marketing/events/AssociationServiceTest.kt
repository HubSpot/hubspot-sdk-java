// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.marketing.events

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubSpotOkHttpClient
import com.hubspot_sdk.api.models.marketing.events.associations.AssociationAssociateByExternalAccountParams
import com.hubspot_sdk.api.models.marketing.events.associations.AssociationAssociateParams
import com.hubspot_sdk.api.models.marketing.events.associations.AssociationDeleteByExternalAccountParams
import com.hubspot_sdk.api.models.marketing.events.associations.AssociationDeleteParams
import com.hubspot_sdk.api.models.marketing.events.associations.AssociationListByExternalAccountParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AssociationServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val associationService = client.marketing().events().associations()

        val collectionResponseWithTotalPublicListNoPaging =
            associationService.list("marketingEventId")

        collectionResponseWithTotalPublicListNoPaging.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val associationService = client.marketing().events().associations()

        associationService.delete(
            AssociationDeleteParams.builder()
                .marketingEventId("marketingEventId")
                .listId("listId")
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun associate() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val associationService = client.marketing().events().associations()

        associationService.associate(
            AssociationAssociateParams.builder()
                .marketingEventId("marketingEventId")
                .listId("listId")
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun associateByExternalAccount() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val associationService = client.marketing().events().associations()

        associationService.associateByExternalAccount(
            AssociationAssociateByExternalAccountParams.builder()
                .externalAccountId("externalAccountId")
                .externalEventId("externalEventId")
                .listId("listId")
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun deleteByExternalAccount() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val associationService = client.marketing().events().associations()

        associationService.deleteByExternalAccount(
            AssociationDeleteByExternalAccountParams.builder()
                .externalAccountId("externalAccountId")
                .externalEventId("externalEventId")
                .listId("listId")
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listByExternalAccount() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val associationService = client.marketing().events().associations()

        val collectionResponseWithTotalPublicListNoPaging =
            associationService.listByExternalAccount(
                AssociationListByExternalAccountParams.builder()
                    .externalAccountId("externalAccountId")
                    .externalEventId("externalEventId")
                    .build()
            )

        collectionResponseWithTotalPublicListNoPaging.validate()
    }
}
