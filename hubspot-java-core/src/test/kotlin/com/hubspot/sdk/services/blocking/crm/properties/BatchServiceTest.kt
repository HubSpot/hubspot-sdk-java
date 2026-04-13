// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.crm.properties

import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClient
import com.hubspot.sdk.models.BatchInputPropertyName
import com.hubspot.sdk.models.BatchReadInputPropertyName
import com.hubspot.sdk.models.OptionInput
import com.hubspot.sdk.models.PropertyName
import com.hubspot.sdk.models.crm.properties.BatchInputPropertyCreate
import com.hubspot.sdk.models.crm.properties.PropertyCreate
import com.hubspot.sdk.models.crm.properties.batch.BatchCreateParams
import com.hubspot.sdk.models.crm.properties.batch.BatchDeleteParams
import com.hubspot.sdk.models.crm.properties.batch.BatchGetParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BatchServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val batchService = client.crm().properties().batch()

        val batchResponseProperty =
            batchService.create(
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
                                    .currencyPropertyName("currencyPropertyName")
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
                                    .showCurrencySymbol(true)
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        batchResponseProperty.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val batchService = client.crm().properties().batch()

        batchService.delete(
            BatchDeleteParams.builder()
                .objectType("objectType")
                .batchInputPropertyName(
                    BatchInputPropertyName.builder()
                        .addInput(PropertyName.builder().name("name").build())
                        .build()
                )
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val batchService = client.crm().properties().batch()

        val batchResponseProperty =
            batchService.get(
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

        batchResponseProperty.validate()
    }
}
