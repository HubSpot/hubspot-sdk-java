// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.crm.objects.tickets

import com.hubspot.client.okhttp.HubSpotOkHttpClient
import com.hubspot.core.JsonValue
import com.hubspot.models.AssociationSpec
import com.hubspot.models.PublicObjectId
import com.hubspot.models.crm.objects.BatchInputSimplePublicObjectBatchInput
import com.hubspot.models.crm.objects.BatchInputSimplePublicObjectBatchInputForCreate
import com.hubspot.models.crm.objects.BatchInputSimplePublicObjectBatchInputUpsert
import com.hubspot.models.crm.objects.BatchInputSimplePublicObjectId
import com.hubspot.models.crm.objects.BatchReadInputSimplePublicObjectId
import com.hubspot.models.crm.objects.PublicAssociationsForObject
import com.hubspot.models.crm.objects.SimplePublicObjectBatchInput
import com.hubspot.models.crm.objects.SimplePublicObjectBatchInputForCreate
import com.hubspot.models.crm.objects.SimplePublicObjectBatchInputUpsert
import com.hubspot.models.crm.objects.SimplePublicObjectId
import com.hubspot.models.crm.objects.tickets.batch.BatchGetParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BatchServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val batchService = client.crm().objects().tickets().batch()

        val batchResponseSimplePublicObject =
            batchService.create(
                BatchInputSimplePublicObjectBatchInputForCreate.builder()
                    .addInput(
                        SimplePublicObjectBatchInputForCreate.builder()
                            .addAssociation(
                                PublicAssociationsForObject.builder()
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

        batchResponseSimplePublicObject.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val batchService = client.crm().objects().tickets().batch()

        val batchResponseSimplePublicObject =
            batchService.update(
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

        batchResponseSimplePublicObject.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val batchService = client.crm().objects().tickets().batch()

        batchService.delete(
            BatchInputSimplePublicObjectId.builder()
                .addInput(SimplePublicObjectId.builder().id("430001").build())
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val batchService = client.crm().objects().tickets().batch()

        val batchResponseSimplePublicObject =
            batchService.get(
                BatchGetParams.builder()
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

        batchResponseSimplePublicObject.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun upsert() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val batchService = client.crm().objects().tickets().batch()

        val batchResponseSimplePublicUpsertObject =
            batchService.upsert(
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

        batchResponseSimplePublicUpsertObject.validate()
    }
}
