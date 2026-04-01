// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.associations

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
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

internal class BatchServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val batchServiceAsync = client.crm().associations().batch()

        val batchResponsePublicDefaultAssociationFuture =
            batchServiceAsync.create(
                BatchCreateParams.builder()
                    .fromObjectType("fromObjectType")
                    .fromObjectId("fromObjectId")
                    .toObjectType("toObjectType")
                    .toObjectId("toObjectId")
                    .build()
            )

        val batchResponsePublicDefaultAssociation =
            batchResponsePublicDefaultAssociationFuture.get()
        batchResponsePublicDefaultAssociation.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
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
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
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
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
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
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
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
