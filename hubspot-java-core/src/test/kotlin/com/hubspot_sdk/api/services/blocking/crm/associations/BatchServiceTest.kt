// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.associations

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.models.AssociationSpec
import com.hubspot_sdk.api.models.PublicObjectId
import com.hubspot_sdk.api.models.crm.associations.BatchInputPublicAssociationMultiArchive
import com.hubspot_sdk.api.models.crm.associations.BatchInputPublicAssociationMultiPost
import com.hubspot_sdk.api.models.crm.associations.BatchInputPublicDefaultAssociationMultiPost
import com.hubspot_sdk.api.models.crm.associations.BatchInputPublicFetchAssociationsBatchRequest
import com.hubspot_sdk.api.models.crm.associations.PublicAssociationMultiArchive
import com.hubspot_sdk.api.models.crm.associations.PublicAssociationMultiPost
import com.hubspot_sdk.api.models.crm.associations.PublicDefaultAssociationMultiPost
import com.hubspot_sdk.api.models.crm.associations.PublicFetchAssociationsBatchRequest
import com.hubspot_sdk.api.models.crm.associations.batch.BatchCreateDefaultParams
import com.hubspot_sdk.api.models.crm.associations.batch.BatchCreateParams
import com.hubspot_sdk.api.models.crm.associations.batch.BatchDeleteLabelsParams
import com.hubspot_sdk.api.models.crm.associations.batch.BatchDeleteParams
import com.hubspot_sdk.api.models.crm.associations.batch.BatchGetParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BatchServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val batchService = client.crm().associations().batch()

        val batchResponsePublicDefaultAssociation =
            batchService.create(
                BatchCreateParams.builder()
                    .fromObjectType("fromObjectType")
                    .fromObjectId("fromObjectId")
                    .toObjectType("toObjectType")
                    .toObjectId("toObjectId")
                    .build()
            )

        batchResponsePublicDefaultAssociation.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val batchService = client.crm().associations().batch()

        val batchResponseVoid =
            batchService.delete(
                BatchDeleteParams.builder()
                    .fromObjectType("fromObjectType")
                    .toObjectType("toObjectType")
                    .batchInputPublicAssociationMultiArchive(
                        BatchInputPublicAssociationMultiArchive.builder()
                            .addInput(
                                PublicAssociationMultiArchive.builder()
                                    .from(PublicObjectId.builder().id("id").build())
                                    .addTo(PublicObjectId.builder().id("id").build())
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        batchResponseVoid.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createDefault() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val batchService = client.crm().associations().batch()

        val batchResponsePublicDefaultAssociation =
            batchService.createDefault(
                BatchCreateDefaultParams.builder()
                    .fromObjectType("fromObjectType")
                    .toObjectType("toObjectType")
                    .batchInputPublicDefaultAssociationMultiPost(
                        BatchInputPublicDefaultAssociationMultiPost.builder()
                            .addInput(
                                PublicDefaultAssociationMultiPost.builder()
                                    .from(PublicObjectId.builder().id("id").build())
                                    .to(PublicObjectId.builder().id("id").build())
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        batchResponsePublicDefaultAssociation.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteLabels() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val batchService = client.crm().associations().batch()

        val batchResponseVoid =
            batchService.deleteLabels(
                BatchDeleteLabelsParams.builder()
                    .fromObjectType("fromObjectType")
                    .toObjectType("toObjectType")
                    .batchInputPublicAssociationMultiPost(
                        BatchInputPublicAssociationMultiPost.builder()
                            .addInput(
                                PublicAssociationMultiPost.builder()
                                    .from(PublicObjectId.builder().id("id").build())
                                    .to(PublicObjectId.builder().id("id").build())
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val batchService = client.crm().associations().batch()

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
