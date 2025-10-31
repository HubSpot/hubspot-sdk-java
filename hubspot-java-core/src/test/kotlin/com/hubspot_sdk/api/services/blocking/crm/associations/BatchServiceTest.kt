// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.associations

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
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
internal class BatchServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val batchService = client.crm().associations().batch()

        val batchResponsePublicAssociation =
            batchService.create(
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

        batchResponsePublicAssociation.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val batchService = client.crm().associations().batch()

        batchService.delete(
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
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val batchService = client.crm().associations().batch()

        val batchResponsePublicAssociationMulti =
            batchService.get(
                BatchGetParams.builder()
                    .fromObjectType("fromObjectType")
                    .toObjectType("toObjectType")
                    .batchInputPublicObjectId(
                        BatchInputPublicObjectId.builder()
                            .addInput(PublicObjectId.builder().id("37295").build())
                            .build()
                    )
                    .build()
            )

        batchResponsePublicAssociationMulti.validate()
    }
}
