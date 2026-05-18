// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.pages.sitepages.abtest

import com.hubspot.sdk.models.cms.pages.AbTestEndRequestVNext
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AbTestEndSitePageTestParamsTest {

    @Test
    fun create() {
        AbTestEndSitePageTestParams.builder()
            .abTestEndRequestVNext(
                AbTestEndRequestVNext.builder().abTestId("abTestId").winnerId("winnerId").build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            AbTestEndSitePageTestParams.builder()
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
