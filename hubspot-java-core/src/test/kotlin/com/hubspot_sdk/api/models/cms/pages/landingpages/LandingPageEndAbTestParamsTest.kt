// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.pages.landingpages

import com.hubspot_sdk.api.models.cms.pages.AbTestEndRequestVNext
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LandingPageEndAbTestParamsTest {

    @Test
    fun create() {
        LandingPageEndAbTestParams.builder()
            .abTestEndRequestVNext(
                AbTestEndRequestVNext.builder().abTestId("abTestId").winnerId("winnerId").build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            LandingPageEndAbTestParams.builder()
                .abTestEndRequestVNext(
                    AbTestEndRequestVNext.builder()
                        .abTestId("abTestId")
                        .winnerId("winnerId")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                AbTestEndRequestVNext.builder().abTestId("abTestId").winnerId("winnerId").build()
            )
    }
}
