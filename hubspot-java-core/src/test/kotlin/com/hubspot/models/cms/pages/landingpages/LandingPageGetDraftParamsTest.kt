// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms.pages.landingpages

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LandingPageGetDraftParamsTest {

    @Test
    fun create() {
        LandingPageGetDraftParams.builder().objectId("objectId").build()
    }

    @Test
    fun pathParams() {
        val params = LandingPageGetDraftParams.builder().objectId("objectId").build()

        assertThat(params._pathParam(0)).isEqualTo("objectId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
