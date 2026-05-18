// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.pages.landingpages.abtest

import com.hubspot.sdk.models.cms.pages.AbTestRerunRequestVNext
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AbTestRerunLandingPageTestParamsTest {

    @Test
    fun create() {
        AbTestRerunLandingPageTestParams.builder()
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
            AbTestRerunLandingPageTestParams.builder()
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
