// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.objects.partnerclients

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.models.crm.objects.partnerclients.associations.AssociationDeleteParams
import com.hubspot_sdk.api.models.crm.objects.partnerclients.associations.AssociationListParams
import com.hubspot_sdk.api.models.crm.objects.partnerclients.associations.AssociationUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AssociationServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val associationServiceAsync = client.crm().objects().partnerClients().associations()

        val simplePublicObjectWithAssociationsFuture =
            associationServiceAsync.update(
                AssociationUpdateParams.builder()
                    .partnerClientId("partnerClientId")
                    .toObjectType("toObjectType")
                    .toObjectId("toObjectId")
                    .associationType("associationType")
                    .build()
            )

        val simplePublicObjectWithAssociations = simplePublicObjectWithAssociationsFuture.get()
        simplePublicObjectWithAssociations.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val associationServiceAsync = client.crm().objects().partnerClients().associations()

        val pageFuture =
            associationServiceAsync.list(
                AssociationListParams.builder()
                    .partnerClientId("partnerClientId")
                    .toObjectType("toObjectType")
                    .build()
            )

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val associationServiceAsync = client.crm().objects().partnerClients().associations()

        val future =
            associationServiceAsync.delete(
                AssociationDeleteParams.builder()
                    .partnerClientId("partnerClientId")
                    .toObjectType("toObjectType")
                    .toObjectId("toObjectId")
                    .associationType("associationType")
                    .build()
            )

        val response = future.get()
    }
}
