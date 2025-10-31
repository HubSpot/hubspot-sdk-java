// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.objects.partnerservices

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.models.crm.objects.partnerservices.associations.AssociationDeleteParams
import com.hubspot_sdk.api.models.crm.objects.partnerservices.associations.AssociationListParams
import com.hubspot_sdk.api.models.crm.objects.partnerservices.associations.AssociationUpdateParams
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
        val associationServiceAsync = client.crm().objects().partnerServices().associations()

        val simplePublicObjectWithAssociationsFuture =
            associationServiceAsync.update(
                AssociationUpdateParams.builder()
                    .partnerServiceId("partnerServiceId")
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
        val associationServiceAsync = client.crm().objects().partnerServices().associations()

        val pageFuture =
            associationServiceAsync.list(
                AssociationListParams.builder()
                    .partnerServiceId("partnerServiceId")
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
        val associationServiceAsync = client.crm().objects().partnerServices().associations()

        val future =
            associationServiceAsync.delete(
                AssociationDeleteParams.builder()
                    .partnerServiceId("partnerServiceId")
                    .toObjectType("toObjectType")
                    .toObjectId("toObjectId")
                    .associationType("associationType")
                    .build()
            )

        val response = future.get()
    }
}
