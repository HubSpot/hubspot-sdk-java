// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.pages.landingpages

import com.hubspot_sdk.api.models.AbTestCreateRequestVNext
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LandingPageCreateAbTestVariationParamsTest {

    @Test
    fun create() {
        LandingPageCreateAbTestVariationParams.builder()
            .abTestCreateRequestVNext(
                AbTestCreateRequestVNext.builder()
                    .contentId("contentId")
                    .variationName("variationName")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            LandingPageCreateAbTestVariationParams.builder()
                .abTestCreateRequestVNext(
                    AbTestCreateRequestVNext.builder()
                        .contentId("contentId")
                        .variationName("variationName")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                AbTestCreateRequestVNext.builder()
                    .contentId("contentId")
                    .variationName("variationName")
                    .build()
            )
    }
}
