// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.dealsplits.batch

import com.hubspot.sdk.models.crm.dealsplits.PublicDealSplitInput
import com.hubspot.sdk.models.crm.dealsplits.PublicDealSplitsBatchCreateRequest
import com.hubspot.sdk.models.crm.dealsplits.PublicDealSplitsCreateRequest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchUpsertParamsTest {

    @Test
    fun create() {
        BatchUpsertParams.builder()
            .publicDealSplitsBatchCreateRequest(
                PublicDealSplitsBatchCreateRequest.builder()
                    .addInput(
                        PublicDealSplitsCreateRequest.builder()
                            .id(0L)
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
            BatchUpsertParams.builder()
                .publicDealSplitsBatchCreateRequest(
                    PublicDealSplitsBatchCreateRequest.builder()
                        .addInput(
                            PublicDealSplitsCreateRequest.builder()
                                .id(0L)
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
                            .id(0L)
                            .addSplit(
                                PublicDealSplitInput.builder().ownerId(0).percentage(0.0).build()
                            )
                            .build()
                    )
                    .build()
            )
    }
}
