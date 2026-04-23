// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.dealsplits

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicDealSplitsBatchCreateRequestTest {

    @Test
    fun create() {
        val publicDealSplitsBatchCreateRequest =
            PublicDealSplitsBatchCreateRequest.builder()
                .addInput(
                    PublicDealSplitsCreateRequest.builder()
                        .id(0L)
                        .addSplit(PublicDealSplitInput.builder().ownerId(0).percentage(0.0).build())
                        .build()
                )
                .build()

        assertThat(publicDealSplitsBatchCreateRequest.inputs())
            .containsExactly(
                PublicDealSplitsCreateRequest.builder()
                    .id(0L)
                    .addSplit(PublicDealSplitInput.builder().ownerId(0).percentage(0.0).build())
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicDealSplitsBatchCreateRequest =
            PublicDealSplitsBatchCreateRequest.builder()
                .addInput(
                    PublicDealSplitsCreateRequest.builder()
                        .id(0L)
                        .addSplit(PublicDealSplitInput.builder().ownerId(0).percentage(0.0).build())
                        .build()
                )
                .build()

        val roundtrippedPublicDealSplitsBatchCreateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicDealSplitsBatchCreateRequest),
                jacksonTypeRef<PublicDealSplitsBatchCreateRequest>(),
            )

        assertThat(roundtrippedPublicDealSplitsBatchCreateRequest)
            .isEqualTo(publicDealSplitsBatchCreateRequest)
    }
}
