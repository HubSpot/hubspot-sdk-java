// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms.pages.abtests

import com.hubspot.models.AbTestCreateRequestVNext
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ABTestCreateSitePageVariationParamsTest {

    @Test
    fun create() {
        ABTestCreateSitePageVariationParams.builder()
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
            ABTestCreateSitePageVariationParams.builder()
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
