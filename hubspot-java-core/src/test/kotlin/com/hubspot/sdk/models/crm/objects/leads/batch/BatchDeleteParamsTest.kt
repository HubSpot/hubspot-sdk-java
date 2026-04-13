// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.objects.leads.batch

import com.hubspot.sdk.models.crm.objects.BatchInputSimplePublicObjectId
import com.hubspot.sdk.models.crm.objects.SimplePublicObjectId
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchDeleteParamsTest {

    @Test
    fun create() {
        BatchDeleteParams.builder()
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
            BatchDeleteParams.builder()
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
