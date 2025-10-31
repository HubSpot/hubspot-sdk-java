// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.associations

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.models.BatchInputPublicObjectId
import com.hubspot_sdk.api.models.PublicObjectId
import com.hubspot_sdk.api.models.crm.associations.BatchInputPublicAssociation
import com.hubspot_sdk.api.models.crm.associations.PublicAssociation
import com.hubspot_sdk.api.models.crm.associations.batch.BatchCreateParams
import com.hubspot_sdk.api.models.crm.associations.batch.BatchDeleteParams
import com.hubspot_sdk.api.models.crm.associations.batch.BatchGetParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BatchServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val batchServiceAsync = client.crm().associations().batch()

        val batchResponsePublicAssociationFuture =
            batchServiceAsync.create(
                BatchCreateParams.builder()
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
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val batchServiceAsync = client.crm().associations().batch()

        val future =
            batchServiceAsync.delete(
                BatchDeleteParams.builder()
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
    fun get() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val batchServiceAsync = client.crm().associations().batch()

        val batchResponsePublicAssociationMultiFuture =
            batchServiceAsync.get(
                BatchGetParams.builder()
                    .fromObjectType("fromObjectType")
                    .toObjectType("toObjectType")
                    .batchInputPublicObjectId(
                        BatchInputPublicObjectId.builder()
                            .addInput(PublicObjectId.builder().id("id").build())
                            .build()
                    )
                    .build()
            )

        val batchResponsePublicAssociationMulti = batchResponsePublicAssociationMultiFuture.get()
        batchResponsePublicAssociationMulti.validate()
    }
}
