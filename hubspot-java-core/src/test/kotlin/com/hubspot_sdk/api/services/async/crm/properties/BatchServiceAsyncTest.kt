// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.properties

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.models.BatchInputPropertyCreate
import com.hubspot_sdk.api.models.BatchInputPropertyName
import com.hubspot_sdk.api.models.BatchReadInputPropertyName
import com.hubspot_sdk.api.models.OptionInput
import com.hubspot_sdk.api.models.PropertyCreate
import com.hubspot_sdk.api.models.PropertyName
import com.hubspot_sdk.api.models.crm.properties.batch.BatchCreateParams
import com.hubspot_sdk.api.models.crm.properties.batch.BatchDeleteParams
import com.hubspot_sdk.api.models.crm.properties.batch.BatchGetParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BatchServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val batchServiceAsync = client.crm().properties().batch()

        val batchResponsePropertyFuture =
            batchServiceAsync.create(
                BatchCreateParams.builder()
                    .objectType("objectType")
                    .batchInputPropertyCreate(
                        BatchInputPropertyCreate.builder()
                            .addInput(
                                PropertyCreate.builder()
                                    .fieldType(PropertyCreate.FieldType.BOOLEANCHECKBOX)
                                    .groupName("groupName")
                                    .label("label")
                                    .name("name")
                                    .type(PropertyCreate.Type.BOOL)
                                    .calculationFormula("calculationFormula")
                                    .dataSensitivity(
                                        PropertyCreate.DataSensitivity.HIGHLY_SENSITIVE
                                    )
                                    .description("description")
                                    .displayOrder(0)
                                    .externalOptions(true)
                                    .formField(true)
                                    .hasUniqueValue(true)
                                    .hidden(true)
                                    .addOption(
                                        OptionInput.builder()
                                            .displayOrder(0)
                                            .hidden(true)
                                            .label("label")
                                            .value("value")
                                            .description("description")
                                            .build()
                                    )
                                    .referencedObjectType("referencedObjectType")
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        val batchResponseProperty = batchResponsePropertyFuture.get()
        batchResponseProperty.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val batchServiceAsync = client.crm().properties().batch()

        val future =
            batchServiceAsync.delete(
                BatchDeleteParams.builder()
                    .objectType("objectType")
                    .batchInputPropertyName(
                        BatchInputPropertyName.builder()
                            .addInput(PropertyName.builder().name("name").build())
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
        val batchServiceAsync = client.crm().properties().batch()

        val batchResponsePropertyFuture =
            batchServiceAsync.get(
                BatchGetParams.builder()
                    .objectType("objectType")
                    .locale("locale")
                    .batchReadInputPropertyName(
                        BatchReadInputPropertyName.builder()
                            .archived(true)
                            .dataSensitivity(
                                BatchReadInputPropertyName.DataSensitivity.HIGHLY_SENSITIVE
                            )
                            .addInput(PropertyName.builder().name("name").build())
                            .build()
                    )
                    .build()
            )

        val batchResponseProperty = batchResponsePropertyFuture.get()
        batchResponseProperty.validate()
    }
}
