// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.pages.landingpages

import com.hubspot_sdk.api.models.cms.DetachFromLangGroupRequestVNext
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LandingPageDetachFromLangGroupParamsTest {

    @Test
    fun create() {
        LandingPageDetachFromLangGroupParams.builder()
            .detachFromLangGroupRequestVNext(
                DetachFromLangGroupRequestVNext.builder().id("id").build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            LandingPageDetachFromLangGroupParams.builder()
                .detachFromLangGroupRequestVNext(
                    DetachFromLangGroupRequestVNext.builder().id("id").build()
                )
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(DetachFromLangGroupRequestVNext.builder().id("id").build())
    }
}
