// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objects.invoices

import com.hubspot_sdk.api.models.crm.objects.BatchInputSimplePublicObjectId
import com.hubspot_sdk.api.models.crm.objects.SimplePublicObjectId
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvoiceDeleteParamsTest {

    @Test
    fun create() {
        InvoiceDeleteParams.builder()
            .batchInputSimplePublicObjectId(
                BatchInputSimplePublicObjectId.builder()
                    .addInput(SimplePublicObjectId.builder().id("430001").build())
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            InvoiceDeleteParams.builder()
                .batchInputSimplePublicObjectId(
                    BatchInputSimplePublicObjectId.builder()
                        .addInput(SimplePublicObjectId.builder().id("430001").build())
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                BatchInputSimplePublicObjectId.builder()
                    .addInput(SimplePublicObjectId.builder().id("430001").build())
                    .build()
            )
    }
}
