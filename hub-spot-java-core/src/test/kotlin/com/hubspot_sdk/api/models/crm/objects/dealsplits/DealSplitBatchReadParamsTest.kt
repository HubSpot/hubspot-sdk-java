// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objects.dealsplits

import com.hubspot_sdk.api.models.BatchInputPublicObjectId
import com.hubspot_sdk.api.models.PublicObjectId
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DealSplitBatchReadParamsTest {

    @Test
    fun create() {
        DealSplitBatchReadParams.builder()
            .batchInputPublicObjectId(
                BatchInputPublicObjectId.builder()
                    .addInput(PublicObjectId.builder().id("37295").build())
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            DealSplitBatchReadParams.builder()
                .batchInputPublicObjectId(
                    BatchInputPublicObjectId.builder()
                        .addInput(PublicObjectId.builder().id("37295").build())
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                BatchInputPublicObjectId.builder()
                    .addInput(PublicObjectId.builder().id("37295").build())
                    .build()
            )
    }
}
