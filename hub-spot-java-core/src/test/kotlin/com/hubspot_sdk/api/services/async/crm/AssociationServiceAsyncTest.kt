// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot_sdk.api.models.BatchInputPublicObjectId
import com.hubspot_sdk.api.models.PublicObjectId
import com.hubspot_sdk.api.models.crm.associations.AssociationCreateParams
import com.hubspot_sdk.api.models.crm.associations.AssociationDeleteParams
import com.hubspot_sdk.api.models.crm.associations.AssociationReadParams
import com.hubspot_sdk.api.models.crm.associations.BatchInputPublicAssociation
import com.hubspot_sdk.api.models.crm.associations.PublicAssociation
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AssociationServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val associationServiceAsync = client.crm().associations()

        val batchResponsePublicAssociationFuture =
            associationServiceAsync.create(
                AssociationCreateParams.builder()
                    .fromObjectType("fromObjectType")
                    .toObjectType("toObjectType")
                    .batchInputPublicAssociation(
                        BatchInputPublicAssociation.builder()
                            .addInput(
                                PublicAssociation.builder()
                                    .from(PublicObjectId.builder().id("53628").build())
                                    .to(PublicObjectId.builder().id("12726").build())
                                    .type("contact_to_company")
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        val batchResponsePublicAssociation = batchResponsePublicAssociationFuture.get()
        batchResponsePublicAssociation.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val associationServiceAsync = client.crm().associations()

        val future =
            associationServiceAsync.delete(
                AssociationDeleteParams.builder()
                    .fromObjectType("fromObjectType")
                    .toObjectType("toObjectType")
                    .batchInputPublicAssociation(
                        BatchInputPublicAssociation.builder()
                            .addInput(
                                PublicAssociation.builder()
                                    .from(PublicObjectId.builder().id("53628").build())
                                    .to(PublicObjectId.builder().id("12726").build())
                                    .type("contact_to_company")
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun read() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val associationServiceAsync = client.crm().associations()

        val batchResponsePublicAssociationMultiFuture =
            associationServiceAsync.read(
                AssociationReadParams.builder()
                    .fromObjectType("fromObjectType")
                    .toObjectType("toObjectType")
                    .batchInputPublicObjectId(
                        BatchInputPublicObjectId.builder()
                            .addInput(PublicObjectId.builder().id("37295").build())
                            .build()
                    )
                    .build()
            )

        val batchResponsePublicAssociationMulti = batchResponsePublicAssociationMultiFuture.get()
        batchResponsePublicAssociationMulti.validate()
    }
}
