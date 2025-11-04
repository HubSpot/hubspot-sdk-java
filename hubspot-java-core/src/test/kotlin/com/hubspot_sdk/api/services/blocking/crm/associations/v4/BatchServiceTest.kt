// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.associations.v4

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.models.AssociationSpec
import com.hubspot_sdk.api.models.PublicObjectId
import com.hubspot_sdk.api.models.crm.associations.v4.BatchInputPublicAssociationMultiArchive
import com.hubspot_sdk.api.models.crm.associations.v4.BatchInputPublicAssociationMultiPost
import com.hubspot_sdk.api.models.crm.associations.v4.BatchInputPublicDefaultAssociationMultiPost
import com.hubspot_sdk.api.models.crm.associations.v4.BatchInputPublicFetchAssociationsBatchRequest
import com.hubspot_sdk.api.models.crm.associations.v4.PublicAssociationMultiArchive
import com.hubspot_sdk.api.models.crm.associations.v4.PublicAssociationMultiPost
import com.hubspot_sdk.api.models.crm.associations.v4.PublicDefaultAssociationMultiPost
import com.hubspot_sdk.api.models.crm.associations.v4.PublicFetchAssociationsBatchRequest
import com.hubspot_sdk.api.models.crm.associations.v4.batch.BatchCreateDefaultParams
import com.hubspot_sdk.api.models.crm.associations.v4.batch.BatchCreateParams
import com.hubspot_sdk.api.models.crm.associations.v4.batch.BatchDeleteLabelsParams
import com.hubspot_sdk.api.models.crm.associations.v4.batch.BatchDeleteParams
import com.hubspot_sdk.api.models.crm.associations.v4.batch.BatchGetParams
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
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val batchService = client.crm().associations().v4().batch()

        val batchResponseLabelsBetweenObjectPair =
            batchService.create(
                BatchCreateParams.builder()
                    .fromObjectType("fromObjectType")
                    .toObjectType("toObjectType")
                    .batchInputPublicAssociationMultiPost(
                        BatchInputPublicAssociationMultiPost.builder()
                            .addInput(
                                PublicAssociationMultiPost.builder()
                                    .from(PublicObjectId.builder().id("37295").build())
                                    .to(PublicObjectId.builder().id("37295").build())
                                    .addType(
                                        AssociationSpec.builder()
                                            .associationCategory(
                                                AssociationSpec.AssociationCategory.HUBSPOT_DEFINED
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
    fun delete() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val batchService = client.crm().associations().v4().batch()

        val batchResponseVoid =
            batchService.delete(
                BatchDeleteParams.builder()
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
    fun createDefault() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val batchService = client.crm().associations().v4().batch()

        val batchResponsePublicDefaultAssociation =
            batchService.createDefault(
                BatchCreateDefaultParams.builder()
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
    fun deleteLabels() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val batchService = client.crm().associations().v4().batch()

        val batchResponseVoid =
            batchService.deleteLabels(
                BatchDeleteLabelsParams.builder()
                    .fromObjectType("fromObjectType")
                    .toObjectType("toObjectType")
                    .batchInputPublicAssociationMultiPost(
                        BatchInputPublicAssociationMultiPost.builder()
                            .addInput(
                                PublicAssociationMultiPost.builder()
                                    .from(PublicObjectId.builder().id("37295").build())
                                    .to(PublicObjectId.builder().id("37295").build())
                                    .addType(
                                        AssociationSpec.builder()
                                            .associationCategory(
                                                AssociationSpec.AssociationCategory.HUBSPOT_DEFINED
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
    fun get() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val batchService = client.crm().associations().v4().batch()

        val batchResponsePublicAssociationMultiWithLabel =
            batchService.get(
                BatchGetParams.builder()
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
