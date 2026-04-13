// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.dealsplits.batch

import com.hubspot.models.BatchInputPublicObjectId
import com.hubspot.models.PublicObjectId
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchReadParamsTest {

    @Test
    fun create() {
        BatchReadParams.builder()
            .batchInputPublicObjectId(
                BatchInputPublicObjectId.builder()
                    .addInput(PublicObjectId.builder().id("id").build())
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            BatchReadParams.builder()
                .batchInputPublicObjectId(
                    BatchInputPublicObjectId.builder()
                        .addInput(PublicObjectId.builder().id("id").build())
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                BatchInputPublicObjectId.builder()
                    .addInput(PublicObjectId.builder().id("id").build())
                    .build()
            )
    }
}
