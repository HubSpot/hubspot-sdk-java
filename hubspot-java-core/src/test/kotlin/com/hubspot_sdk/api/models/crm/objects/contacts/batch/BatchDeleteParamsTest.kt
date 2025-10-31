// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objects.contacts.batch

import com.hubspot_sdk.api.models.crm.BatchInputSimplePublicObjectId
import com.hubspot_sdk.api.models.crm.SimplePublicObjectId
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchDeleteParamsTest {

    @Test
    fun create() {
        BatchDeleteParams.builder()
            .batchInputSimplePublicObjectId(
                BatchInputSimplePublicObjectId.builder()
                    .addInput(SimplePublicObjectId.builder().id("id").build())
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
                        .addInput(SimplePublicObjectId.builder().id("id").build())
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                BatchInputSimplePublicObjectId.builder()
                    .addInput(SimplePublicObjectId.builder().id("id").build())
                    .build()
            )
    }
}
