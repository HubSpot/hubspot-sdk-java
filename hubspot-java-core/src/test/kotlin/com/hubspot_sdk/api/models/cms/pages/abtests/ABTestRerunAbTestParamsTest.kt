// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.pages.abtests

import com.hubspot_sdk.api.models.cms.pages.AbTestRerunRequestVNext
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ABTestRerunAbTestParamsTest {

    @Test
    fun create() {
        ABTestRerunAbTestParams.builder()
            .abTestRerunRequestVNext(
                AbTestRerunRequestVNext.builder()
                    .abTestId("abTestId")
                    .variationId("variationId")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            ABTestRerunAbTestParams.builder()
                .abTestRerunRequestVNext(
                    AbTestRerunRequestVNext.builder()
                        .abTestId("abTestId")
                        .variationId("variationId")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                AbTestRerunRequestVNext.builder()
                    .abTestId("abTestId")
                    .variationId("variationId")
                    .build()
            )
    }
}
