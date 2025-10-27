// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.pages.sitepages

import com.hubspot_sdk.api.models.cms.pages.AbTestEndRequestVNext
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SitePageEndAbTestParamsTest {

    @Test
    fun create() {
        SitePageEndAbTestParams.builder()
            .abTestEndRequestVNext(
                AbTestEndRequestVNext.builder().abTestId("abTestId").winnerId("winnerId").build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            SitePageEndAbTestParams.builder()
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
