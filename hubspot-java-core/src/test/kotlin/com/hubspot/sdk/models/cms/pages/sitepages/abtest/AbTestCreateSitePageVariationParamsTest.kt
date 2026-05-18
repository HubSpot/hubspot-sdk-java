// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.pages.sitepages.abtest

import com.hubspot.sdk.models.AbTestCreateRequestVNext
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AbTestCreateSitePageVariationParamsTest {

    @Test
    fun create() {
        AbTestCreateSitePageVariationParams.builder()
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
            AbTestCreateSitePageVariationParams.builder()
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
