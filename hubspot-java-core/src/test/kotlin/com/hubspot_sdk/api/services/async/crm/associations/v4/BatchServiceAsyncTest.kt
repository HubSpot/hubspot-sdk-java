// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.associations.v4

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
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
import com.hubspot_sdk.api.models.crm.associations.v4.batch.BatchCreateDefaultParams
import com.hubspot_sdk.api.models.crm.associations.v4.batch.BatchCreateParams
import com.hubspot_sdk.api.models.crm.associations.v4.batch.BatchDeleteLabelsParams
import com.hubspot_sdk.api.models.crm.associations.v4.batch.BatchDeleteParams
import com.hubspot_sdk.api.models.crm.associations.v4.batch.BatchGetParams
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
        val batchServiceAsync = client.crm().associations().v4().batch()

        val batchResponseLabelsBetweenObjectPairFuture =
            batchServiceAsync.create(
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

        val batchResponseLabelsBetweenObjectPair = batchResponseLabelsBetweenObjectPairFuture.get()
        batchResponseLabelsBetweenObjectPair.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val batchServiceAsync = client.crm().associations().v4().batch()

        val batchResponseVoidFuture =
            batchServiceAsync.delete(
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

        val batchResponseVoid = batchResponseVoidFuture.get()
        batchResponseVoid.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun createDefault() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val batchServiceAsync = client.crm().associations().v4().batch()

        val batchResponsePublicDefaultAssociationFuture =
            batchServiceAsync.createDefault(
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

        val batchResponsePublicDefaultAssociation =
            batchResponsePublicDefaultAssociationFuture.get()
        batchResponsePublicDefaultAssociation.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun deleteLabels() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val batchServiceAsync = client.crm().associations().v4().batch()

        val batchResponseVoidFuture =
            batchServiceAsync.deleteLabels(
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

        val batchResponseVoid = batchResponseVoidFuture.get()
        batchResponseVoid.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val batchServiceAsync = client.crm().associations().v4().batch()

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
