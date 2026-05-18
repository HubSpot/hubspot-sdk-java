// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.crm.associations

import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot.sdk.models.AssociationSpec
import com.hubspot.sdk.models.PublicObjectId
import com.hubspot.sdk.models.crm.BatchInputPublicAssociationMultiArchive
import com.hubspot.sdk.models.crm.BatchInputPublicAssociationMultiPost
import com.hubspot.sdk.models.crm.BatchInputPublicDefaultAssociationMultiPost
import com.hubspot.sdk.models.crm.BatchInputPublicFetchAssociationsBatchRequest
import com.hubspot.sdk.models.crm.PublicAssociationMultiArchive
import com.hubspot.sdk.models.crm.PublicAssociationMultiPost
import com.hubspot.sdk.models.crm.PublicDefaultAssociationMultiPost
import com.hubspot.sdk.models.crm.PublicFetchAssociationsBatchRequest
import com.hubspot.sdk.models.crm.associations.batch.BatchCreateDefaultParams
import com.hubspot.sdk.models.crm.associations.batch.BatchCreateParams
import com.hubspot.sdk.models.crm.associations.batch.BatchDeleteLabelsParams
import com.hubspot.sdk.models.crm.associations.batch.BatchDeleteParams
import com.hubspot.sdk.models.crm.associations.batch.BatchGetParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BatchServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val batchServiceAsync = client.crm().associations().batch()

        val batchResponseLabelsBetweenObjectPairFuture =
            batchServiceAsync.create(
                BatchCreateParams.builder()
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

        val batchResponseLabelsBetweenObjectPair = batchResponseLabelsBetweenObjectPairFuture.get()
        batchResponseLabelsBetweenObjectPair.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val batchServiceAsync = client.crm().associations().batch()

        val future =
            batchServiceAsync.delete(
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

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createDefault() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val batchServiceAsync = client.crm().associations().batch()

        val batchResponsePublicDefaultAssociationFuture =
            batchServiceAsync.createDefault(
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

        val batchResponsePublicDefaultAssociation =
            batchResponsePublicDefaultAssociationFuture.get()
        batchResponsePublicDefaultAssociation.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteLabels() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val batchServiceAsync = client.crm().associations().batch()

        val future =
            batchServiceAsync.deleteLabels(
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

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val batchServiceAsync = client.crm().associations().batch()

        val batchResponsePublicAssociationMultiWithLabelFuture =
            batchServiceAsync.get(
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

        val batchResponsePublicAssociationMultiWithLabel =
            batchResponsePublicAssociationMultiWithLabelFuture.get()
        batchResponsePublicAssociationMultiWithLabel.validate()
    }
}
