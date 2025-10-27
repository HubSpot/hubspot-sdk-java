// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.associations.v4

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubSpotOkHttpClient
import com.hubspot_sdk.api.models.PublicObjectId
import com.hubspot_sdk.api.models.crm.associations.v4.AssociationSpec1
import com.hubspot_sdk.api.models.crm.associations.v4.BatchInputPublicAssociationMultiArchive
import com.hubspot_sdk.api.models.crm.associations.v4.BatchInputPublicAssociationMultiPost
import com.hubspot_sdk.api.models.crm.associations.v4.BatchInputPublicDefaultAssociationMultiPost
import com.hubspot_sdk.api.models.crm.associations.v4.BatchInputPublicFetchAssociationsBatchRequest
import com.hubspot_sdk.api.models.crm.associations.v4.PublicAssociationMultiArchive
import com.hubspot_sdk.api.models.crm.associations.v4.PublicAssociationMultiPost
import com.hubspot_sdk.api.models.crm.associations.v4.PublicDefaultAssociationMultiPost
import com.hubspot_sdk.api.models.crm.associations.v4.PublicFetchAssociationsBatchRequest
import com.hubspot_sdk.api.models.crm.associations.v4.batch.BatchBatchAssociateDefaultParams
import com.hubspot_sdk.api.models.crm.associations.v4.batch.BatchBatchCreateParams
import com.hubspot_sdk.api.models.crm.associations.v4.batch.BatchBatchDeleteLabelsParams
import com.hubspot_sdk.api.models.crm.associations.v4.batch.BatchBatchDeleteParams
import com.hubspot_sdk.api.models.crm.associations.v4.batch.BatchBatchReadParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BatchServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun batchAssociateDefault() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val batchService = client.crm().associations().v4().batch()

        val batchResponsePublicDefaultAssociation =
            batchService.batchAssociateDefault(
                BatchBatchAssociateDefaultParams.builder()
                    .fromObjectType("fromObjectType")
                    .toObjectType("toObjectType")
                    .batchInputPublicDefaultAssociationMultiPost(
                        BatchInputPublicDefaultAssociationMultiPost.builder()
                            .addInput(
                                PublicDefaultAssociationMultiPost.builder()
                                    .from(PublicObjectId.builder().id("37295").build())
                                    .to(PublicObjectId.builder().id("37295").build())
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        batchResponsePublicDefaultAssociation.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun batchCreate() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val batchService = client.crm().associations().v4().batch()

        val batchResponseLabelsBetweenObjectPair =
            batchService.batchCreate(
                BatchBatchCreateParams.builder()
                    .fromObjectType("fromObjectType")
                    .toObjectType("toObjectType")
                    .batchInputPublicAssociationMultiPost(
                        BatchInputPublicAssociationMultiPost.builder()
                            .addInput(
                                PublicAssociationMultiPost.builder()
                                    .from(PublicObjectId.builder().id("37295").build())
                                    .to(PublicObjectId.builder().id("37295").build())
                                    .addType(
                                        AssociationSpec1.builder()
                                            .associationCategory(
                                                AssociationSpec1.AssociationCategory.HUBSPOT_DEFINED
                                            )
                                            .associationTypeId(0)
                                            .build()
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        batchResponseLabelsBetweenObjectPair.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun batchDelete() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val batchService = client.crm().associations().v4().batch()

        val batchResponseVoid =
            batchService.batchDelete(
                BatchBatchDeleteParams.builder()
                    .fromObjectType("fromObjectType")
                    .toObjectType("toObjectType")
                    .batchInputPublicAssociationMultiArchive(
                        BatchInputPublicAssociationMultiArchive.builder()
                            .addInput(
                                PublicAssociationMultiArchive.builder()
                                    .from(PublicObjectId.builder().id("37295").build())
                                    .addTo(PublicObjectId.builder().id("37295").build())
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        batchResponseVoid.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun batchDeleteLabels() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val batchService = client.crm().associations().v4().batch()

        val batchResponseVoid =
            batchService.batchDeleteLabels(
                BatchBatchDeleteLabelsParams.builder()
                    .fromObjectType("fromObjectType")
                    .toObjectType("toObjectType")
                    .batchInputPublicAssociationMultiPost(
                        BatchInputPublicAssociationMultiPost.builder()
                            .addInput(
                                PublicAssociationMultiPost.builder()
                                    .from(PublicObjectId.builder().id("37295").build())
                                    .to(PublicObjectId.builder().id("37295").build())
                                    .addType(
                                        AssociationSpec1.builder()
                                            .associationCategory(
                                                AssociationSpec1.AssociationCategory.HUBSPOT_DEFINED
                                            )
                                            .associationTypeId(0)
                                            .build()
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        batchResponseVoid.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun batchRead() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val batchService = client.crm().associations().v4().batch()

        val batchResponsePublicAssociationMultiWithLabel =
            batchService.batchRead(
                BatchBatchReadParams.builder()
                    .fromObjectType("fromObjectType")
                    .toObjectType("toObjectType")
                    .batchInputPublicFetchAssociationsBatchRequest(
                        BatchInputPublicFetchAssociationsBatchRequest.builder()
                            .addInput(
                                PublicFetchAssociationsBatchRequest.builder()
                                    .id("id")
                                    .after("after")
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        batchResponsePublicAssociationMultiWithLabel.validate()
    }
}
