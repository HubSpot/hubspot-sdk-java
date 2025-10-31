// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objects.dealsplits

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DealSplitBatchUpsertParamsTest {

    @Test
    fun create() {
        DealSplitBatchUpsertParams.builder()
            .addInput(
                DealSplitBatchUpsertParams.Input.builder()
                    .id(0)
                    .addSplit(
                        DealSplitBatchUpsertParams.Input.Split.builder()
                            .ownerId(0)
                            .percentage(0.0)
                            .build()
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            DealSplitBatchUpsertParams.builder()
                .addInput(
                    DealSplitBatchUpsertParams.Input.builder()
                        .id(0)
                        .addSplit(
                            DealSplitBatchUpsertParams.Input.Split.builder()
                                .ownerId(0)
                                .percentage(0.0)
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.inputs())
            .containsExactly(
                DealSplitBatchUpsertParams.Input.builder()
                    .id(0)
                    .addSplit(
                        DealSplitBatchUpsertParams.Input.Split.builder()
                            .ownerId(0)
                            .percentage(0.0)
                            .build()
                    )
                    .build()
            )
    }
}
