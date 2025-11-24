// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.objects.projects

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.models.crm.objects.projects.associations.AssociationDeleteParams
import com.hubspot_sdk.api.models.crm.objects.projects.associations.AssociationListParams
import com.hubspot_sdk.api.models.crm.objects.projects.associations.AssociationUpdateParams
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
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val associationServiceAsync = client.crm().objects().projects().associations()

        val simplePublicObjectWithAssociationsFuture =
            associationServiceAsync.update(
                AssociationUpdateParams.builder()
                    .projectId("projectId")
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
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val associationServiceAsync = client.crm().objects().projects().associations()

        val pageFuture =
            associationServiceAsync.list(
                AssociationListParams.builder()
                    .projectId("projectId")
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
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val associationServiceAsync = client.crm().objects().projects().associations()

        val future =
            associationServiceAsync.delete(
                AssociationDeleteParams.builder()
                    .projectId("projectId")
                    .toObjectType("toObjectType")
                    .toObjectId("toObjectId")
                    .associationType("associationType")
                    .build()
            )

        val response = future.get()
    }
}
