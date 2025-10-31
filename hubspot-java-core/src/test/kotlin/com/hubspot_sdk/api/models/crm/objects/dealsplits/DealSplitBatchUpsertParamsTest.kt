// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objects.dealsplits

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DealSplitBatchUpsertParamsTest {

    @Test
    fun create() {
        DealSplitBatchUpsertParams.builder()
            .publicDealSplitsBatchCreateRequest(
                PublicDealSplitsBatchCreateRequest.builder()
                    .addInput(
                        PublicDealSplitsCreateRequest.builder()
                            .id(0)
                            .addSplit(
                                PublicDealSplitInput.builder().ownerId(0).percentage(0.0).build()
                            )
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
                .publicDealSplitsBatchCreateRequest(
                    PublicDealSplitsBatchCreateRequest.builder()
                        .addInput(
                            PublicDealSplitsCreateRequest.builder()
                                .id(0)
                                .addSplit(
                                    PublicDealSplitInput.builder()
                                        .ownerId(0)
                                        .percentage(0.0)
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PublicDealSplitsBatchCreateRequest.builder()
                    .addInput(
                        PublicDealSplitsCreateRequest.builder()
                            .id(0)
                            .addSplit(
                                PublicDealSplitInput.builder().ownerId(0).percentage(0.0).build()
                            )
                            .build()
                    )
                    .build()
            )
    }
}
