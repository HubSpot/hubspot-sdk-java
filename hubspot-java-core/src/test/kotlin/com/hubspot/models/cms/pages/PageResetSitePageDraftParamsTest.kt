// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms.pages

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PageResetSitePageDraftParamsTest {

    @Test
    fun create() {
        PageResetSitePageDraftParams.builder().objectId("objectId").build()
    }

    @Test
    fun pathParams() {
        val params = PageResetSitePageDraftParams.builder().objectId("objectId").build()

        assertThat(params._pathParam(0)).isEqualTo("objectId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
