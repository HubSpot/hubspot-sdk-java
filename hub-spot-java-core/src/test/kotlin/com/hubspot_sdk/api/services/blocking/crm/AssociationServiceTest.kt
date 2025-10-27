// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubSpotOkHttpClient
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
internal class AssociationServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val associationService = client.crm().associations()

        val batchResponsePublicAssociation =
            associationService.create(
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

        batchResponsePublicAssociation.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val associationService = client.crm().associations()

        associationService.delete(
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
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun read() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val associationService = client.crm().associations()

        val batchResponsePublicAssociationMulti =
            associationService.read(
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

        batchResponsePublicAssociationMulti.validate()
    }
}
