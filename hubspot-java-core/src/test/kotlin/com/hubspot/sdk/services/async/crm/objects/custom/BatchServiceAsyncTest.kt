// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.crm.objects.custom

import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.models.AssociationSpec
import com.hubspot.sdk.models.PublicObjectId
import com.hubspot.sdk.models.crm.objects.BatchInputSimplePublicObjectBatchInput
import com.hubspot.sdk.models.crm.objects.BatchInputSimplePublicObjectBatchInputForCreate
import com.hubspot.sdk.models.crm.objects.BatchInputSimplePublicObjectBatchInputUpsert
import com.hubspot.sdk.models.crm.objects.BatchInputSimplePublicObjectId
import com.hubspot.sdk.models.crm.objects.BatchReadInputSimplePublicObjectId
import com.hubspot.sdk.models.crm.objects.PublicAssociationsForObject
import com.hubspot.sdk.models.crm.objects.SimplePublicObjectBatchInput
import com.hubspot.sdk.models.crm.objects.SimplePublicObjectBatchInputForCreate
import com.hubspot.sdk.models.crm.objects.SimplePublicObjectBatchInputUpsert
import com.hubspot.sdk.models.crm.objects.SimplePublicObjectId
import com.hubspot.sdk.models.crm.objects.custom.batch.BatchCreateParams
import com.hubspot.sdk.models.crm.objects.custom.batch.BatchDeleteParams
import com.hubspot.sdk.models.crm.objects.custom.batch.BatchGetParams
import com.hubspot.sdk.models.crm.objects.custom.batch.BatchUpdateParams
import com.hubspot.sdk.models.crm.objects.custom.batch.BatchUpsertParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BatchServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val batchServiceAsync = client.crm().objects().custom().batch()

        val batchResponseSimplePublicObjectFuture =
            batchServiceAsync.create(
                BatchCreateParams.builder()
                    .objectType("objectType")
                    .batchInputSimplePublicObjectBatchInputForCreate(
                        BatchInputSimplePublicObjectBatchInputForCreate.builder()
                            .addInput(
                                SimplePublicObjectBatchInputForCreate.builder()
                                    .addAssociation(
                                        PublicAssociationsForObject.builder()
                                            .to(PublicObjectId.builder().id("id").build())
                                            .addType(
                                                AssociationSpec.builder()
                                                    .associationCategory(
                                                        AssociationSpec.AssociationCategory
                                                            .HUBSPOT_DEFINED
                                                    )
                                                    .associationTypeId(0)
                                                    .build()
                                            )
                                            .build()
                                    )
                                    .properties(
                                        SimplePublicObjectBatchInputForCreate.Properties.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .objectWriteTraceId("objectWriteTraceId")
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        val batchResponseSimplePublicObject = batchResponseSimplePublicObjectFuture.get()
        batchResponseSimplePublicObject.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val batchServiceAsync = client.crm().objects().custom().batch()

        val batchResponseSimplePublicObjectFuture =
            batchServiceAsync.update(
                BatchUpdateParams.builder()
                    .objectType("objectType")
                    .batchInputSimplePublicObjectBatchInput(
                        BatchInputSimplePublicObjectBatchInput.builder()
                            .addInput(
                                SimplePublicObjectBatchInput.builder()
                                    .id("id")
                                    .properties(
                                        SimplePublicObjectBatchInput.Properties.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .idProperty("my_unique_property_name")
                                    .objectWriteTraceId("objectWriteTraceId")
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        val batchResponseSimplePublicObject = batchResponseSimplePublicObjectFuture.get()
        batchResponseSimplePublicObject.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val batchServiceAsync = client.crm().objects().custom().batch()

        val future =
            batchServiceAsync.delete(
                BatchDeleteParams.builder()
                    .objectType("objectType")
                    .batchInputSimplePublicObjectId(
                        BatchInputSimplePublicObjectId.builder()
                            .addInput(SimplePublicObjectId.builder().id("430001").build())
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
        val batchServiceAsync = client.crm().objects().custom().batch()

        val batchResponseSimplePublicObjectFuture =
            batchServiceAsync.get(
                BatchGetParams.builder()
                    .objectType("objectType")
                    .archived(true)
                    .batchReadInputSimplePublicObjectId(
                        BatchReadInputSimplePublicObjectId.builder()
                            .addInput(SimplePublicObjectId.builder().id("430001").build())
                            .addProperty("string")
                            .addPropertiesWithHistory("string")
                            .idProperty("idProperty")
                            .build()
                    )
                    .build()
            )

        val batchResponseSimplePublicObject = batchResponseSimplePublicObjectFuture.get()
        batchResponseSimplePublicObject.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun upsert() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val batchServiceAsync = client.crm().objects().custom().batch()

        val batchResponseSimplePublicUpsertObjectFuture =
            batchServiceAsync.upsert(
                BatchUpsertParams.builder()
                    .objectType("objectType")
                    .batchInputSimplePublicObjectBatchInputUpsert(
                        BatchInputSimplePublicObjectBatchInputUpsert.builder()
                            .addInput(
                                SimplePublicObjectBatchInputUpsert.builder()
                                    .id("id")
                                    .properties(
                                        SimplePublicObjectBatchInputUpsert.Properties.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .idProperty("idProperty")
                                    .objectWriteTraceId("objectWriteTraceId")
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        val batchResponseSimplePublicUpsertObject =
            batchResponseSimplePublicUpsertObjectFuture.get()
        batchResponseSimplePublicUpsertObject.validate()
    }
}
