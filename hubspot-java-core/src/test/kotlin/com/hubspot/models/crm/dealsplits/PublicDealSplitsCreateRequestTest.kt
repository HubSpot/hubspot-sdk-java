// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.dealsplits

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicDealSplitsCreateRequestTest {

    @Test
    fun create() {
        val publicDealSplitsCreateRequest =
            PublicDealSplitsCreateRequest.builder()
                .id(0)
                .addSplit(PublicDealSplitInput.builder().ownerId(0).percentage(0.0).build())
                .build()

        assertThat(publicDealSplitsCreateRequest.id()).isEqualTo(0)
        assertThat(publicDealSplitsCreateRequest.splits())
            .containsExactly(PublicDealSplitInput.builder().ownerId(0).percentage(0.0).build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicDealSplitsCreateRequest =
            PublicDealSplitsCreateRequest.builder()
                .id(0)
                .addSplit(PublicDealSplitInput.builder().ownerId(0).percentage(0.0).build())
                .build()

        val roundtrippedPublicDealSplitsCreateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicDealSplitsCreateRequest),
                jacksonTypeRef<PublicDealSplitsCreateRequest>(),
            )

        assertThat(roundtrippedPublicDealSplitsCreateRequest)
            .isEqualTo(publicDealSplitsCreateRequest)
    }
}
