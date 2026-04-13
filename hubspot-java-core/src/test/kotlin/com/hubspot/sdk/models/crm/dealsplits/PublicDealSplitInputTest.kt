// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.dealsplits

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicDealSplitInputTest {

    @Test
    fun create() {
        val publicDealSplitInput = PublicDealSplitInput.builder().ownerId(0).percentage(0.0).build()

        assertThat(publicDealSplitInput.ownerId()).isEqualTo(0)
        assertThat(publicDealSplitInput.percentage()).isEqualTo(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicDealSplitInput = PublicDealSplitInput.builder().ownerId(0).percentage(0.0).build()

        val roundtrippedPublicDealSplitInput =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicDealSplitInput),
                jacksonTypeRef<PublicDealSplitInput>(),
            )

        assertThat(roundtrippedPublicDealSplitInput).isEqualTo(publicDealSplitInput)
    }
}
