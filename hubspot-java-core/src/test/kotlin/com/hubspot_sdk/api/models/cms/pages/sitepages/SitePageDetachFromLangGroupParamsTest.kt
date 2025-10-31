// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.pages.sitepages

import com.hubspot_sdk.api.models.cms.DetachFromLangGroupRequestVNext
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SitePageDetachFromLangGroupParamsTest {

    @Test
    fun create() {
        SitePageDetachFromLangGroupParams.builder()
            .detachFromLangGroupRequestVNext(
                DetachFromLangGroupRequestVNext.builder().id("id").build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            SitePageDetachFromLangGroupParams.builder()
                .detachFromLangGroupRequestVNext(
                    DetachFromLangGroupRequestVNext.builder().id("id").build()
                )
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(DetachFromLangGroupRequestVNext.builder().id("id").build())
    }
}
